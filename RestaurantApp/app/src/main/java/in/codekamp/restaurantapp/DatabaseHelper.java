package in.codekamp.restaurantapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by cerebro on 13/09/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, "RestaurantAppDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL( "CREATE TABLE `todo` (\n" +
                "\t`_id`\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "\t`title`\tTEXT,\n" +
                "\t`completed`\tINTEGER DEFAULT 0\n" +
                ");" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVer, int newVer) {

    }
}
