package in.codekamp.webandlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by cerebro on 01/10/16.
 */

public class MyListViewAdapter extends BaseAdapter {

    List<Song> mSongs;

    public MyListViewAdapter(List<Song> songs) {
        this.mSongs = songs;
    }


    @Override
    public int getCount() {
        return mSongs.size();
    }

    @Override
    public Object getItem(int position) {
        return mSongs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mSongs.get(position).id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Song songToBeDisplayed = mSongs.get(position);

        if(convertView == null) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            convertView = inflater.inflate(R.layout.activity_main, parent);
        }

        ((TextView)convertView).setText(songToBeDisplayed.title);

        return convertView;
    }
}
