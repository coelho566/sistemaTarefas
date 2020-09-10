package br.com.unicesumar.models;

public class Assignment {

    private Integer id;
    private String status;
    private String title;
    private String description;
    private User user;

    public Assignment(){}

    public Assignment(Integer id, String status, String title, String description, User user) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
