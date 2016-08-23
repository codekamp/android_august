package in.codekamp.kidsapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;


/**
 * Created by cerebro on 23/08/16.
 */
public class TableViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TableViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
    }
}
