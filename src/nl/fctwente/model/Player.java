package nl.fctwente.model;

public class Player {

    private long id;
    private String name;
    private int goals;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setName(String name) {
        this.name = name;
    }
}
