//package com.example.haodongsheng.kotlintest
//
//import android.content.Context
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseAdapter
//import android.widget.TextView
//
//class LoLAdapter(var mcontext:Context,var myList:List<String>):BaseAdapter() {
//
//    override fun getCount(): Int {
//        return myList.size?:0
//    }
//
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        var holder: TestViewHolder
//        var v: View
//        if (convertView == null) {
//            v = View.inflate(mcontext, R.layout.item, null)
//            holder = TestViewHolder(v)
//            v.tag = holder
//        } else {
//            v = convertView
//            holder = v.tag as TestViewHolder
//        }
//        holder.str.text = myList[position]
//        return v
//
//    }
//
//    override fun getItemId(position: Int): Long {
//        return position.toLong()
//    }
//
//    override fun getItem(position: Int): Any {
//        return myList.get(position)
//    }
//
//    inner class TestViewHolder(var viewItem: View) {
//        var str: TextView = viewItem.str as TextView
//    }
//
//
//}