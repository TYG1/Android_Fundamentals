package com.georgegebretensai;

        import com.georgegebretensai.TaskCollection;
        import com.georgegebretensai.TaskView;

public class Main {
    public static void main(String[] args) {
        TaskCollection collection = new TaskCollection();
        TaskView view = new TaskView(collection);
        view.run();
    }
}

