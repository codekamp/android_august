package in.codekamp.restaurantapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by cerebro on 13/09/16.
 */
public interface MailChimpService {

    @GET("lists/members")
    public Call<FetchMemebersResponse> fetchMembers(@Query("apikey") String apiKey, @Query("id") String listId);
}
