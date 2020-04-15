package com.sti.taxation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_admin_pending.*

class ApproveAdminActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_approve_admin)
        val arrayList = ArrayList<AdminApproveModel>()

        arrayList.add(AdminApproveModel("Application","Application",R.drawable.building1))
        arrayList.add(AdminApproveModel("Application","Application",R.drawable.building1))
        arrayList.add(AdminApproveModel("Application","Application",R.drawable.building1))
        arrayList.add(AdminApproveModel("Application","Application",R.drawable.building1))
        arrayList.add(AdminApproveModel("Application","Application",R.drawable.building1))

        val adminApproveAdapter = AdminApproveAdapter(arrayList,this)

        adminrecylcerView.layoutManager = LinearLayoutManager(this)
        adminrecylcerView.adapter = adminApproveAdapter

    }
}
