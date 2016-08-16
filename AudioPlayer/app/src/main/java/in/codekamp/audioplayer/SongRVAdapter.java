package in.codekamp.audioplayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cerebro on 16/08/16.
 */
public class SongRVAdapter extends RecyclerView.Adapter<SongViewHolder> {


    private Context context;

    public SongRVAdapter(Context context) {
        this.context = context;
    }


    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Log.d("CodeKamp", "onCreateViewHolder called");

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.song_info_row, parent, false);

        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        Log.d("CodeKamp", "onBindViewHolder called for position " + position);
        holder.titleTextView.setText("Song number " + position);
        holder.durationTextView.setText("00:" + position);
    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
