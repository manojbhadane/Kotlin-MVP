package com.manojbhadane.kotlinmvpdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by manoj.bhadane on 26-09-2017.
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        init()
    }

    protected abstract fun getLayoutResId(): Int
    protected abstract fun init()
}