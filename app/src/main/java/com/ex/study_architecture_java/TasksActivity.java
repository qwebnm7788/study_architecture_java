package com.ex.study_architecture_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TasksActivity extends AppCompatActivity {

    private TasksPresenter mTasksPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks_act);


        TasksFragment tasksFragment = (TasksFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (tasksFragment == null) {
            // Create the fragment
            tasksFragment = new TasksFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.contentFrame, tasksFragment).commit();
        }

        mTasksPresenter = new TasksPresenter(tasksFragment);
    }
}