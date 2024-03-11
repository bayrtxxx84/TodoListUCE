package com.torresb.examen.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.torresb.examen.R
import com.torresb.examen.databinding.FragmentListBinding
import com.torresb.examen.ui.adapters.TaskAdapterDiffUtil


class FragmentList : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var adapter: TaskAdapterDiffUtil

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        adapter = TaskAdapterDiffUtil({ onDelete(it) }, { onComplete(it) })
        binding =
            FragmentListBinding
                .bind(inflater.inflate(R.layout.fragment_list, container, false))
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        //"Descomentar cada método cuando este implementado"
        //initListeners()
        //initRecyclerView()

    }

    private fun initRecyclerView() {
        TODO("Método que se ejecuta para iniciar el recyclerView")
    }


    private fun onComplete(id: Int) {
        TODO("Método que se ejecuta cuando la tarea es completada")
    }


    private fun onDelete(id: Int) {
        TODO("Método que se ejecuta cuando la tarea es borrada")
    }


    private fun initListeners() {
        TODO("Método que se ejecuta para paso al otro fragment")
    }
}