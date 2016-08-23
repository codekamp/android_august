package in.codekamp.kidsapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class TableActivity extends AppCompatActivity {

    private static final String EXTRA_TABLE_OF = "qwerty";
    private static final String EXTRA_TABLE_UPTO = "asdfgh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Intent intent = getIntent();

        int tableOf = intent.getIntExtra(EXTRA_TABLE_OF, 0);
        int tableUpto = intent.getIntExtra(EXTRA_TABLE_UPTO, 0);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.table_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TableRecyclerViewAdapter(this, tableOf, tableUpto));


    }

    public static Intent createNewIntent(Context context, int tableOf, int tableUpto) {
        Intent intent = new Intent(context, TableActivity.class);
        intent.putExtra(EXTRA_TABLE_OF, tableOf);
        intent.putExtra(EXTRA_TABLE_UPTO, tableUpto);
        return intent;
    }
}
