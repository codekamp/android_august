
package in.codekamp.restaurantapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Merges {

    @SerializedName("EMAIL")
    @Expose
    private String eMAIL;
    @SerializedName("FNAME")
    @Expose
    private String fNAME;
    @SerializedName("LNAME")
    @Expose
    private String lNAME;

    /**
     * 
     * @return
     *     The eMAIL
     */
    public String getEMAIL() {
        return eMAIL;
    }

    /**
     * 
     * @param eMAIL
     *     The EMAIL
     */
    public void setEMAIL(String eMAIL) {
        this.eMAIL = eMAIL;
    }

    /**
     * 
     * @return
     *     The fNAME
     */
    public String getFNAME() {
        return fNAME;
    }

    /**
     * 
     * @param fNAME
     *     The FNAME
     */
    public void setFNAME(String fNAME) {
        this.fNAME = fNAME;
    }

    /**
     * 
     * @return
     *     The lNAME
     */
    public String getLNAME() {
        return lNAME;
    }

    /**
     * 
     * @param lNAME
     *     The LNAME
     */
    public void setLNAME(String lNAME) {
        this.lNAME = lNAME;
    }

}
