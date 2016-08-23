package in.codekamp.audioplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mSongRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSongRV = (RecyclerView)findViewById(R.id.songlist);

        mSongRV.setLayoutManager(new LinearLayoutManager(this));

        mSongRV.setAdapter(new SongRVAdapter(this));
    }
}
