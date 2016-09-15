package in.codekamp.restaurantapp;

/**
 * Created by cerebro on 15/09/16.
 */
public class ToDo {
    private int id;
    private String title;
    private int completed;

    public ToDo(int id, String title, int completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }
}
