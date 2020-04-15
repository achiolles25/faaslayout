package com.sti.taxation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_admin_pending.*

class AdminPending : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_pending)

        val arrayList = ArrayList<AdminModel>()
        arrayList.add(AdminModel("Application",R.drawable.building1))
        arrayList.add(AdminModel("Application",R.drawable.building1))
        arrayList.add(AdminModel("Application",R.drawable.building1))
        arrayList.add(AdminModel("Application",R.drawable.building1))
        arrayList.add(AdminModel("Application",R.drawable.building1))

        val adminAdapter = AdminAdapter(arrayList,this)

        adminrecylcerView.layoutManager = LinearLayoutManager(this)
        adminrecylcerView.adapter = adminAdapter
    }
}
