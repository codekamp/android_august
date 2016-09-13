package in.codekamp.restaurantapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by cerebro on 13/09/16.
 */
public class Contact {
    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("id")
    @Expose
    private String id;


    @SerializedName("merges")
    @Expose
    private Merges merges;


    private class Merges {
        @SerializedName("FNAME")
        @Expose
        public String name;
    }

    public void setMerges(Merges merges) {
        this.merges = merges;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return merges.name;
    }

    public void setName(String name) {
        merges.name = name;
    }
}
