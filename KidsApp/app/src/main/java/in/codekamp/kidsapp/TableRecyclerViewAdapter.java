package in.codekamp.kidsapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cerebro on 23/08/16.
 */
public class TableRecyclerViewAdapter extends RecyclerView.Adapter<TableViewHolder> {

    private int mTableOf;
    private int mTableUpto;
    private Context mContext;

    public TableRecyclerViewAdapter(Context context, int tableOf, int tableUpto) {
        mContext = context;
        mTableOf = tableOf;
        mTableUpto = tableUpto;
    }

    @Override
    public TableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.table_row, parent, false);

        return new TableViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TableViewHolder holder, int position) {
        int multiplier = position + 1;
        int result = mTableOf * multiplier;
        TextView textView = (TextView) holder.itemView;
        textView.setText(mTableOf + " X " + multiplier + " = " + result);

    }

    @Override
    public int getItemCount() {
        return mTableUpto;
    }
}
