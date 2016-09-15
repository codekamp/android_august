package in.codekamp.restaurantapp;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by cerebro on 15/09/16.
 */
public class TodoCursor extends CursorWrapper {

    public TodoCursor(Cursor cursor) {
        super(cursor);
    }

    public ToDo getToDo() {
        int idIndex = this.getColumnIndex("_id");
        int titleIndex = this.getColumnIndex("title");
        int completedIndex = this.getColumnIndex("completed");

        String title = this.getString(titleIndex);
        int completed = this.getInt(completedIndex);
        int id = this.getInt(idIndex);

        return new ToDo(id, title, completed);
    }
}
