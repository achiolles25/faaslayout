package com.sti.taxation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adminrow1.view.*

class AdminAdapter(val arrayList: ArrayList<AdminModel>,val context:Context) :
    RecyclerView.Adapter<AdminAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(adminModel: AdminModel){
            itemView.transactionnumber.text = adminModel.transactionnumber
            itemView.adminimage.setImageResource(adminModel.adminimage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.adminrow1,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
       return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener{
            if(position==0){
                Toast.makeText(
                    context,
                    "You clicked new application",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position==1){
                Toast.makeText(
                    context,
                    "You clicked new application",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position==2){
                Toast.makeText(
                    context,
                    "You clicked new application",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position==3){
                Toast.makeText(
                    context,
                    "You clicked new application",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position==4){
                Toast.makeText(
                    context,
                    "You clicked new application",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}