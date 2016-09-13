
package in.codekamp.restaurantapp;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("euid")
    @Expose
    private String euid;
    @SerializedName("email_type")
    @Expose
    private String emailType;
    @SerializedName("ip_signup")
    @Expose
    private Object ipSignup;
    @SerializedName("timestamp_signup")
    @Expose
    private Object timestampSignup;
    @SerializedName("ip_opt")
    @Expose
    private String ipOpt;
    @SerializedName("timestamp_opt")
    @Expose
    private String timestampOpt;
    @SerializedName("member_rating")
    @Expose
    private Integer memberRating;
    @SerializedName("info_changed")
    @Expose
    private String infoChanged;
    @SerializedName("web_id")
    @Expose
    private Integer webId;
    @SerializedName("leid")
    @Expose
    private Integer leid;
    @SerializedName("language")
    @Expose
    private Object language;
    @SerializedName("list_id")
    @Expose
    private String listId;
    @SerializedName("list_name")
    @Expose
    private String listName;
    @SerializedName("merges")
    @Expose
    private Merges merges;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("is_gmonkey")
    @Expose
    private Boolean isGmonkey;
    @SerializedName("lists")
    @Expose
    private List<Object> lists = new ArrayList<Object>();
    @SerializedName("static_segments")
    @Expose
    private List<Object> staticSegments = new ArrayList<Object>();
    @SerializedName("notes")
    @Expose
    private List<Object> notes = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The euid
     */
    public String getEuid() {
        return euid;
    }

    /**
     * 
     * @param euid
     *     The euid
     */
    public void setEuid(String euid) {
        this.euid = euid;
    }

    /**
     * 
     * @return
     *     The emailType
     */
    public String getEmailType() {
        return emailType;
    }

    /**
     * 
     * @param emailType
     *     The email_type
     */
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    /**
     * 
     * @return
     *     The ipSignup
     */
    public Object getIpSignup() {
        return ipSignup;
    }

    /**
     * 
     * @param ipSignup
     *     The ip_signup
     */
    public void setIpSignup(Object ipSignup) {
        this.ipSignup = ipSignup;
    }

    /**
     * 
     * @return
     *     The timestampSignup
     */
    public Object getTimestampSignup() {
        return timestampSignup;
    }

    /**
     * 
     * @param timestampSignup
     *     The timestamp_signup
     */
    public void setTimestampSignup(Object timestampSignup) {
        this.timestampSignup = timestampSignup;
    }

    /**
     * 
     * @return
     *     The ipOpt
     */
    public String getIpOpt() {
        return ipOpt;
    }

    /**
     * 
     * @param ipOpt
     *     The ip_opt
     */
    public void setIpOpt(String ipOpt) {
        this.ipOpt = ipOpt;
    }

    /**
     * 
     * @return
     *     The timestampOpt
     */
    public String getTimestampOpt() {
        return timestampOpt;
    }

    /**
     * 
     * @param timestampOpt
     *     The timestamp_opt
     */
    public void setTimestampOpt(String timestampOpt) {
        this.timestampOpt = timestampOpt;
    }

    /**
     * 
     * @return
     *     The memberRating
     */
    public Integer getMemberRating() {
        return memberRating;
    }

    /**
     * 
     * @param memberRating
     *     The member_rating
     */
    public void setMemberRating(Integer memberRating) {
        this.memberRating = memberRating;
    }

    /**
     * 
     * @return
     *     The infoChanged
     */
    public String getInfoChanged() {
        return infoChanged;
    }

    /**
     * 
     * @param infoChanged
     *     The info_changed
     */
    public void setInfoChanged(String infoChanged) {
        this.infoChanged = infoChanged;
    }

    /**
     * 
     * @return
     *     The webId
     */
    public Integer getWebId() {
        return webId;
    }

    /**
     * 
     * @param webId
     *     The web_id
     */
    public void setWebId(Integer webId) {
        this.webId = webId;
    }

    /**
     * 
     * @return
     *     The leid
     */
    public Integer getLeid() {
        return leid;
    }

    /**
     * 
     * @param leid
     *     The leid
     */
    public void setLeid(Integer leid) {
        this.leid = leid;
    }

    /**
     * 
     * @return
     *     The language
     */
    public Object getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(Object language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The listId
     */
    public String getListId() {
        return listId;
    }

    /**
     * 
     * @param listId
     *     The list_id
     */
    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * 
     * @return
     *     The listName
     */
    public String getListName() {
        return listName;
    }

    /**
     * 
     * @param listName
     *     The list_name
     */
    public void setListName(String listName) {
        this.listName = listName;
    }

    /**
     * 
     * @return
     *     The merges
     */
    public Merges getMerges() {
        return merges;
    }

    /**
     * 
     * @param merges
     *     The merges
     */
    public void setMerges(Merges merges) {
        this.merges = merges;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The isGmonkey
     */
    public Boolean getIsGmonkey() {
        return isGmonkey;
    }

    /**
     * 
     * @param isGmonkey
     *     The is_gmonkey
     */
    public void setIsGmonkey(Boolean isGmonkey) {
        this.isGmonkey = isGmonkey;
    }

    /**
     * 
     * @return
     *     The lists
     */
    public List<Object> getLists() {
        return lists;
    }

    /**
     * 
     * @param lists
     *     The lists
     */
    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    /**
     * 
     * @return
     *     The staticSegments
     */
    public List<Object> getStaticSegments() {
        return staticSegments;
    }

    /**
     * 
     * @param staticSegments
     *     The static_segments
     */
    public void setStaticSegments(List<Object> staticSegments) {
        this.staticSegments = staticSegments;
    }

    /**
     * 
     * @return
     *     The notes
     */
    public List<Object> getNotes() {
        return notes;
    }

    /**
     * 
     * @param notes
     *     The notes
     */
    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

}
