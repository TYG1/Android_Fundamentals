package com.georgegebretensai;



        import com.georgegebretensai.Task;
        import java.util.LinkedList;
        import java.util.List;

public class TaskCollection {
    private List<Task> tasks = new LinkedList<Task>();

    TaskCollection() {
    }

    private Task createTask(String name, String description, int priority) {
        return new Task(name, description, priority);
    }

    public void addTask(String name, String description, int priority) {
        this.tasks.add(this.createTask(name, description, priority));
    }

    public void removeTask(int index) {
        if (this.tasks.size() > index) {
            this.tasks.remove(index);
        }
    }

    public void updateTask(int index, String name, String description, int priority) {
        this.tasks.set(index, this.createTask(name, description, priority));
    }

    public List<Task> getTasks() {
        return this.tasks;
    }

    public List<Task> getTasks(int priorty) {
        LinkedList<Task> matchedTasks = new LinkedList<Task>();
        for (Task task : this.tasks) {
            if (task.getPriority() != priorty) continue;
            matchedTasks.add(task);
        }
        return matchedTasks;
    }
}

