package in.codekamp.restaurantapp;

import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<FetchMemebersResponse> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MailChimpService mailChimpService = Service.getMailChimpService();

        Call<FetchMemebersResponse> call = mailChimpService.fetchMembers("c13207fa3226b6a6b6aca1f7fa856efd-us11", "47734f63e3");

        call.enqueue(this);

        Log.d("CodeKamp", "Hello world!");

        DatabaseHelper helper = new DatabaseHelper(this);

        SQLiteDatabase database = helper.getWritableDatabase();
        database.execSQL("INSERT into xyz");
    }

    @Override
    public void onResponse(Call<FetchMemebersResponse> call, Response<FetchMemebersResponse> response) {
        FetchMemebersResponse res = response.body();
        List<Contact> contacts = res.getContacts();

        Log.d("CodeKamp", contacts.get(0).getEmail());
        Log.d("CodeKamp", contacts.get(0).getName());
    }

    @Override
    public void onFailure(Call<FetchMemebersResponse> call, Throwable t) {
        Log.d("CodeKamp", "Failed with message " + t.getMessage());
    }
}
