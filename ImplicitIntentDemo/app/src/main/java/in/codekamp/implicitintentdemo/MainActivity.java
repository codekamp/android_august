package in.codekamp.implicitintentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void share(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.addCategory(Intent.CATEGORY_DEFAULT);

        Intent chooserIntent = Intent.createChooser(intent, "CodeKamp choose to share");

        startActivity(chooserIntent);


    }
}
