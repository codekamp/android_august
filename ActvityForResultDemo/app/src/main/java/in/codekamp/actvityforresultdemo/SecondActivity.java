package in.codekamp.actvityforresultdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public static Intent createNewIntent(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);

        return intent;
    }

    public void delhi(View view) {
        Intent intent = getIntent();
        intent.putExtra("city", "delhi");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void ghaziabad(View view) {
        Intent intent = new Intent();
        intent.putExtra("city", "delhi");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void cancel(View view) {
        Intent intent = new Intent();
        setResult(Activity.RESULT_CANCELED, intent);
        finish();
    }
}
