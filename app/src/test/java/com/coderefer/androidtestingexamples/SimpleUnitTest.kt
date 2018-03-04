package com.coderefer.androidtestingexamples

import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.junit.Before



/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
class SimpleUnitTest {
    lateinit var  activity: MainActivity
    @Before
    fun setup() {
        // Convenience method to run MainActivity through the Activity Lifecycle methods:
        // onCreate(...) => onStart() => onPostCreate(...) => onResume()
        activity = Robolectric.setupActivity(MainActivity::class.java)
    }

    @Test
    fun buttonText(){
//        val textView = activity.findViewById(R.id.textView) as TextView
        activity.button.performClick()
        assertEquals(activity.textView.text,"hello")

    }
}
