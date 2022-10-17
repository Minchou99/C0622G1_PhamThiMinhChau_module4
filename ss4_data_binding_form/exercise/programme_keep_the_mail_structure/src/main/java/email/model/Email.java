package email.model;

public class Email {
    private int id;
    private String language;
    private String pageSize;
    private String spamsFilter;
    private String signature;

    public Email() {
    }

    public Email(int id, String language, String page, String spam, String signature) {
        this.id = id;
        this.language = language;
        this.pageSize = page;
        this.spamsFilter = spam;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(String spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
