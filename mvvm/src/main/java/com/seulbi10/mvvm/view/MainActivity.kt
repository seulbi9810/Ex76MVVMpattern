package com.seulbi10.mvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.seulbi10.mvvm.R
import com.seulbi10.mvvm.databinding.ActivityMainBinding
import com.seulbi10.mvvm.viewmodel.ItemViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //# view역할 : 화면을 만드는 작업 코드
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )

        //# xml의 <data>영역에 만든 변수(vm)에 값을 대입
        binding.vm= ItemViewModel(this)

    }
}