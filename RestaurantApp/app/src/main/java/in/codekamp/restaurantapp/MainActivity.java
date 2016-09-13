package in.codekamp.restaurantapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://us11.api.mailchimp.com/2.0/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        MailchimpService service = retrofit.create(MailchimpService.class);


        Call<ListResponse> call = service.fetchLists("c13207fa3226b6a6b6aca1f7fa856efd-us11");

        call.enqueue(new Callback<ListResponse>() {
            @Override
            public void onResponse(Call<ListResponse> call, Response<ListResponse> response) {
                List<MailchimpList> list = response.body().getData();

                Log.d("CodeKamp", list.get(0).getName());
                Log.d("CodeKamp", Integer.toString(list.get(0).getStats().getMemberCount()));

            }

            @Override
            public void onFailure(Call<ListResponse> call, Throwable t) {
                Log.d("CodeKamp", "on failure called " + t.getMessage());
            }
        });

        Call<MemberResponse> call1 = service.fetchContacts("c13207fa3226b6a6b6aca1f7fa856efd-us11", "47734f63e3");

        call1.enqueue(new Callback<MemberResponse>() {
            @Override
            public void onResponse(Call<MemberResponse> call, Response<MemberResponse> response) {

                List<Contact> list = response.body().getContacts();

                Log.d("CodeKamp", "Contact email is " + list.get(1).getEmail());
                Log.d("CodeKamp", "Contact name is " + list.get(1).getMerges().getFNAME());
            }

            @Override
            public void onFailure(Call<MemberResponse> call, Throwable t) {
                Log.d("CodeKamp", "on failure called " + t.getMessage());
            }
        });
    }
}
