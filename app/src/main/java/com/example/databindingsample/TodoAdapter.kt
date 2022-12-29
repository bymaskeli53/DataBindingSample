package com.example.databindingsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.databindingsample.databinding.ItemTodoBinding


class TodoAdapter(val todoList: List<Todo>) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {


    inner class TodoViewHolder(val binding: ItemTodoBinding): ViewHolder(binding.root) {}



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemTodoBinding>(inflater,R.layout.item_todo,parent,false)
        return TodoViewHolder(binding)


    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.todo = todoList[position]

    }

    override fun getItemCount(): Int {
       return todoList.size
    }
}



