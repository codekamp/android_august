package in.codekamp.webandlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    private ListView mListView;

    // ButterKnife tutorial
    // http://craftedcourses.io/all-about-butter-knife-part-1/

    // News app API
    // news.vaetas.com/stories?page=1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView)findViewById(R.id.web_view);

        mWebView.loadData("<h1>Hello world!</h1>", "text/html", "UTF-8");

        mListView = (ListView)findViewById(R.id.list_view);

        String[] names = {"Suresh", "Ramesh", "Rishikesh", "Dharmesh", "Dharmesh", "Ramesh", "Suresh"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        mListView.setAdapter(arrayAdapter);

    }
}
