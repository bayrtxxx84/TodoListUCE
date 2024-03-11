package com.torresb.examen.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.torresb.examen.R
import com.torresb.examen.ui.TaskEntity
import com.torresb.examen.databinding.ItemsListLayoutBinding


class TaskAdapterDiffUtil(
    private val onDelete: (Int) -> Unit,
    private val onComplete: (Int) -> Unit
) :
    ListAdapter<TaskEntity, TaskAdapterDiffUtil.UsersVH>(DiffUtilUsersCallBack) {

    class UsersVH(view: View) : RecyclerView.ViewHolder(view) {

        private var binding: ItemsListLayoutBinding = ItemsListLayoutBinding.bind(view)

        fun render(
            item: TaskEntity,
            onclickDelete: (Int) -> Unit,
            onSelectItem: (Int) -> Unit
        ) {

            binding.btnDelete.setOnClickListener {
                onclickDelete(item.id)
            }

            binding.btnClose.setOnClickListener {
                onSelectItem(item.id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersVH {
        val inflater = LayoutInflater.from(parent.context)
        return UsersVH(inflater.inflate(R.layout.items_list_layout, parent, false))
    }

    override fun onBindViewHolder(holder: UsersVH, position: Int) {
        holder.render(getItem(position), onDelete, onComplete)
    }

}

private object DiffUtilUsersCallBack : DiffUtil.ItemCallback<TaskEntity>() {
    override fun areItemsTheSame(oldItem: TaskEntity, newItem: TaskEntity): Boolean {
        return (oldItem.id == newItem.id)
    }

    override fun areContentsTheSame(oldItem: TaskEntity, newItem: TaskEntity): Boolean {
        return (oldItem == newItem)
    }

}
