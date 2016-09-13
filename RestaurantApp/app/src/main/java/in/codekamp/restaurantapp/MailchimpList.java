
package in.codekamp.restaurantapp;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MailchimpList {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("web_id")
    @Expose
    private Integer webId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("use_awesomebar")
    @Expose
    private Boolean useAwesomebar;
    @SerializedName("default_from_name")
    @Expose
    private String defaultFromName;
    @SerializedName("default_from_email")
    @Expose
    private String defaultFromEmail;
    @SerializedName("default_subject")
    @Expose
    private String defaultSubject;
    @SerializedName("default_language")
    @Expose
    private String defaultLanguage;
    @SerializedName("subscribe_url_short")
    @Expose
    private String subscribeUrlShort;
    @SerializedName("subscribe_url_long")
    @Expose
    private String subscribeUrlLong;
    @SerializedName("beamer_address")
    @Expose
    private String beamerAddress;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("modules")
    @Expose
    private List<Object> modules = new ArrayList<Object>();

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
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The dateCreated
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * 
     * @param dateCreated
     *     The date_created
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * 
     * @return
     *     The useAwesomebar
     */
    public Boolean getUseAwesomebar() {
        return useAwesomebar;
    }

    /**
     * 
     * @param useAwesomebar
     *     The use_awesomebar
     */
    public void setUseAwesomebar(Boolean useAwesomebar) {
        this.useAwesomebar = useAwesomebar;
    }

    /**
     * 
     * @return
     *     The defaultFromName
     */
    public String getDefaultFromName() {
        return defaultFromName;
    }

    /**
     * 
     * @param defaultFromName
     *     The default_from_name
     */
    public void setDefaultFromName(String defaultFromName) {
        this.defaultFromName = defaultFromName;
    }

    /**
     * 
     * @return
     *     The defaultFromEmail
     */
    public String getDefaultFromEmail() {
        return defaultFromEmail;
    }

    /**
     * 
     * @param defaultFromEmail
     *     The default_from_email
     */
    public void setDefaultFromEmail(String defaultFromEmail) {
        this.defaultFromEmail = defaultFromEmail;
    }

    /**
     * 
     * @return
     *     The defaultSubject
     */
    public String getDefaultSubject() {
        return defaultSubject;
    }

    /**
     * 
     * @param defaultSubject
     *     The default_subject
     */
    public void setDefaultSubject(String defaultSubject) {
        this.defaultSubject = defaultSubject;
    }

    /**
     * 
     * @return
     *     The defaultLanguage
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * 
     * @param defaultLanguage
     *     The default_language
     */
    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    /**
     * 
     * @return
     *     The subscribeUrlShort
     */
    public String getSubscribeUrlShort() {
        return subscribeUrlShort;
    }

    /**
     * 
     * @param subscribeUrlShort
     *     The subscribe_url_short
     */
    public void setSubscribeUrlShort(String subscribeUrlShort) {
        this.subscribeUrlShort = subscribeUrlShort;
    }

    /**
     * 
     * @return
     *     The subscribeUrlLong
     */
    public String getSubscribeUrlLong() {
        return subscribeUrlLong;
    }

    /**
     * 
     * @param subscribeUrlLong
     *     The subscribe_url_long
     */
    public void setSubscribeUrlLong(String subscribeUrlLong) {
        this.subscribeUrlLong = subscribeUrlLong;
    }

    /**
     * 
     * @return
     *     The beamerAddress
     */
    public String getBeamerAddress() {
        return beamerAddress;
    }

    /**
     * 
     * @param beamerAddress
     *     The beamer_address
     */
    public void setBeamerAddress(String beamerAddress) {
        this.beamerAddress = beamerAddress;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The visibility
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The modules
     */
    public List<Object> getModules() {
        return modules;
    }

    /**
     * 
     * @param modules
     *     The modules
     */
    public void setModules(List<Object> modules) {
        this.modules = modules;
    }

}
