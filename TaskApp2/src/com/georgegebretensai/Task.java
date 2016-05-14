package com.georgegebretensai;

/**
 * Created by George on 5/13/16.
 */
public class Task {
    private String name;
    private String description;
    private int priority;

    Task(String name, String description, int priority) {
        this.setName(name);
        this.setDescription(description);
        this.setPriority(priority);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        this.priority = priority < 0 ? 0 : (priority > 5 ? 5 : priority);
    }
}

