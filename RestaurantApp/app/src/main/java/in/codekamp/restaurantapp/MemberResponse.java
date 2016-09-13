
package in.codekamp.restaurantapp;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemberResponse {

    @SerializedName("total")
    @Expose
    private Integer total;

    @SerializedName("data")
    @Expose
    private List<Contact> contacts = new ArrayList<Contact>();


    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
