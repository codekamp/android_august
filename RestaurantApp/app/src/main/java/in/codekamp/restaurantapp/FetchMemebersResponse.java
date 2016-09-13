package in.codekamp.restaurantapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cerebro on 13/09/16.
 */
public class FetchMemebersResponse {
    @SerializedName("total")
    @Expose
    private int count;

    @SerializedName("data")
    @Expose
    private List<Contact> contacts = new LinkedList<>();


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
