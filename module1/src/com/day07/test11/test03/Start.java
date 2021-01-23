package com.day07.test11.test03;

public class Start {
    private Task task;

    public Start() {
    }

    public Start(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
    public void run(){
        task.task();
    }
}
