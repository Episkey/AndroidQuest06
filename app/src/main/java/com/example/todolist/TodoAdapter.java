package com.example.todolist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.todolist.R;
import com.example.todolist.Todo;

import java.util.List;

public class TodoAdapter extends ArrayAdapter<Todo> {


    public TodoAdapter(Context context, List<Todo> todoList) {
        super(context, 0, todoList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Todo item = getItem(position);

        if (null == convertView) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_todo, parent, false);
        }

        TextView textTodo = convertView.findViewById(R.id.tvtodo);
        TextView textDate = convertView.findViewById(R.id.tvDate);

        textTodo.setText(item.getDescription());
        textDate.setText(item.getDate());

        return convertView;
    }
}

