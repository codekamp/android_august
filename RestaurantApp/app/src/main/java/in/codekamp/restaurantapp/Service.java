package in.codekamp.restaurantapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by cerebro on 13/09/16.
 */
public class Service {

    public static MailChimpService getMailChimpService() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://us11.api.mailchimp.com/2.0/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(MailChimpService.class);
    }
}
