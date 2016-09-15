package in.codekamp.restaurantapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 15/09/16.
 */
public class ToDoService {
    private DatabaseHelper helper;

    public ToDoService(Context context) {
        this.helper = new DatabaseHelper(context);
    }

    public List<ToDo> query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy) {
        SQLiteDatabase db = this.helper.getReadableDatabase();

        Cursor cursor = db.query(table, columns, selection, selectionArgs, groupBy, having, orderBy);

        List<ToDo> toDos = new ArrayList<>();
        while(cursor.moveToNext()) {
            int idIndex = cursor.getColumnIndex("_id");
            int titleIndex = cursor.getColumnIndex("title");
            int completedIndex = cursor.getColumnIndex("completed");

            String title = cursor.getString(titleIndex);
            int completed = cursor.getInt(completedIndex);
            int id = cursor.getInt(idIndex);

            toDos.add(new ToDo(id, title, completed));
        }

        return toDos;
    }
}
