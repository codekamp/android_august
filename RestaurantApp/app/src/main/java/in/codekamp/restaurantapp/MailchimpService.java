package in.codekamp.restaurantapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by cerebro on 10/09/16.
 */
public interface MailchimpService {

    @GET("lists/list")
    Call<ListResponse> fetchLists(@Query("apikey") String apiKey);

    @GET("lists/members")
    Call<MemberResponse> fetchContacts(@Query("apikey") String apiKey, @Query("id") String listId);
}
