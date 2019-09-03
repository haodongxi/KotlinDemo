package com.example.haodongsheng.kotlintest

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.bottomnavigation.LabelVisibilityMode
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.*
import android.support.design.internal.BottomNavigationItemView
import java.lang.reflect.Array.setBoolean
import java.lang.reflect.AccessibleObject.setAccessible
import android.support.design.internal.BottomNavigationMenuView


class MainActivity : AppCompatActivity() {


    var dataList:MutableList<String> = mutableListOf(
            "德玛西亚",
            "诺克萨斯",
            "弗雷尔卓德",
            "艾欧尼亚",
            "比尔吉沃特",
            "暗影岛"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        val test:String = "kotlin"
//        println("this is my ${test}")
//

//*********        anko test
        linearLayout {
            orientation = LinearLayout.VERTICAL
            editText().lparams(
                    width = dip(300),
                    height = wrapContent
            )
            button("test"){
                onClick {

                }
            }.lparams(
                    width = matchParent,
                    height = wrapContent
            )
        }

//*********

//********* listviev
//        for (i in 1..30){
//            dataList.add("沙漠皇帝"+i)
//        }
//        initView()


//*******bottomnavigationbar
//        initNav()
//        bnv.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_LABELED
//        bnv.itemIconTintList = null
    }


    @SuppressLint("RestrictedApi")
    fun initNav() {
        try {
            //在这里为什么使用getChildAt(0)，的线索可以在BottomNavigationMenuView的构造方法中找到线索
            val menuView = bnv.getChildAt(0) as BottomNavigationMenuView
            menuView.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED)
            menuView.buildMenuView()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

//    fun initView(){
//       var adpter = LoLAdapter(this,dataList)
//        lv.adapter =  adpter
//    }

    override fun onStart() {
        super.onStart()
        println("start")
    }

    override fun onResume() {
        super.onResume()
        println("onresume")
    }

    override fun onPause() {
        super.onPause()
        println("onpause")
    }
    override fun onStop() {
        super.onStop()
        print("onstop")
    }

     override fun onDestroy() {
        super.onDestroy()
        println("onDestory")
    }
}
