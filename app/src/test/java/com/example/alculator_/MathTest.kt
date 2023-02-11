package com.example.alculator_

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MathTest {
    private var math:Math? = null
    @Before
    fun before(){
        math = Math()
    }
    @Test
    fun add(){
       Assert.assertEquals("4",math?.add("2","2"))
    }

    @Test(expected = ArithmeticException::class)
    fun divide(){
        math?.divide("10","2")
    }

    @Test
    fun minus(){
        Assert.assertEquals("3",math?.add("5","2"))
    }

    @Test
    fun multiply(){
        Assert.assertEquals("24",math?.add("12","2"))
    }

    @After
    fun after(){
        math = null
    }
}