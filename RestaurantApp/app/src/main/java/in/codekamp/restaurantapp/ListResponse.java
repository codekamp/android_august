package in.codekamp.restaurantapp;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListResponse {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("data")
    @Expose
    private List<MailchimpList> data = new ArrayList<MailchimpList>();
    @SerializedName("errors")
    @Expose
    private List<Object> errors = new ArrayList<Object>();

    /**
     *
     * @return
     * The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     *
     * @return
     * The data
     */
    public List<MailchimpList> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<MailchimpList> data) {
        this.data = data;
    }

    /**
     *
     * @return
     * The errors
     */
    public List<Object> getErrors() {
        return errors;
    }

    /**
     *
     * @param errors
     * The errors
     */
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

}