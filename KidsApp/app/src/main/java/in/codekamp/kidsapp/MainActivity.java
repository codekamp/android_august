package in.codekamp.kidsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mOfEditText;
    private EditText mUptoEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOfEditText = (EditText)findViewById(R.id.table_of);
        mUptoEditText = (EditText)findViewById(R.id.table_upto);

    }

    public void submit(View view) {
        int tableOf = Integer.parseInt(mOfEditText.getText().toString());
        int tableUpto = Integer.parseInt(mUptoEditText.getText().toString());


        Intent intent = TableActivity.createNewIntent(this, tableOf, tableUpto);
        startActivity(intent);
    }
}
