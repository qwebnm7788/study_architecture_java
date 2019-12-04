package com.ex.study_architecture_java;

import androidx.annotation.NonNull;

class TasksPresenter implements TasksContract.Presenter {

    private final TasksContract.View mTasksView;

    public TasksPresenter(@NonNull TasksContract.View tasksView) {
        mTasksView = tasksView;

        mTasksView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
