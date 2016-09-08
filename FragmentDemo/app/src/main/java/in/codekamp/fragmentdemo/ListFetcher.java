package in.codekamp.fragmentdemo;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cerebro on 03/09/16.
 */
public class ListFetcher extends AsyncTask<String, Void, List<MailChimpList>> {


    private ListFetcherListner listner;

    public ListFetcher(ListFetcherListner listner) {
        this.listner = listner;
    }

    @Override
    protected List<MailChimpList> doInBackground(String... keys) {

        String apiKey = keys[0];
        String listId = keys[1];


        try {
            URL url = new URL("https://us11.api.mailchimp.com/2.0/lists/members?apikey="+apiKey+"&id="+listId);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStream stream = url.openStream();

            Reader reader = new InputStreamReader(stream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String output = "";
            while (true) {
                String nextLine = bufferedReader.readLine();
                if(nextLine == null) {
                    break;
                }
                output = output + nextLine;
            }

            JSONObject jsonObject = new JSONObject(output);


            JSONArray dataArray = jsonObject.getJSONArray("data");

            List<MailChimpList> list = new LinkedList<>();

            for (int i = 0; i< dataArray.length(); i++) {
                JSONObject listObject = (JSONObject) dataArray.get(i);

                String id = listObject.getString("id");
                String name = listObject.getString("name");
                JSONObject stats = listObject.getJSONObject("stats");
                int memeberCount = stats.getInt("member_count");

                MailChimpList mailChimpList = new MailChimpList(id, name, memeberCount);
                list.add(mailChimpList);

            }

            return list;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(List<MailChimpList> mailChimpLists) {
        super.onPostExecute(mailChimpLists);

        Log.d("CodeKamp", "name of first list is " + mailChimpLists.get(0).name);
        Log.d("CodeKamp", "id of first list is " + mailChimpLists.get(0).id);
        Log.d("CodeKamp", "members count of first list is " + mailChimpLists.get(0).memberCount);

        listner.listFetched(mailChimpLists);
    }

    public interface ListFetcherListner {
        public void listFetched(List<MailChimpList> list);
    }
}
