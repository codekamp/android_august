package in.codekamp.audioplayer;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by cerebro on 16/08/16.
 */
public class SongViewHolder extends RecyclerView.ViewHolder {

    public TextView titleTextView;
    public TextView durationTextView;

    public SongViewHolder(View itemView) {
        super(itemView);

        titleTextView = (TextView)itemView.findViewById(R.id.title_textview);
        durationTextView = (TextView)itemView.findViewById(R.id.duration_textview);
    }
}
