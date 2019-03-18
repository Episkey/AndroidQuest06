package com.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //arrayList
        Todo course = new Todo("faire les courses", "04/07/18");
        Todo menage = new Todo("faire le menage", "08/12/19");
        Todo repassage = new Todo("faire le repassage", "25/09/18");

        List<Todo> todoList = new ArrayList<>();
        todoList.add(course);
        todoList.add(menage);
        todoList.add(repassage);

        ListView listDefine = findViewById(R.id.lw);
        TodoAdapter adapter = new TodoAdapter(MainActivity.this, todoList);
        listDefine.setAdapter(adapter);

    }
}
