package com.mr.codecoverage

import org.junit.Assert
import org.junit.Test

class MainViewModelTest {

    private val viewModel = MainViewModel()

    @Test
    fun testValidate() {
        val actual = viewModel.validate("admin")
        Assert.assertTrue(actual)
    }
    @Test
    fun testVerifyAccess(){
        val actual = viewModel.verifyAccess("super-admin")
        Assert.assertTrue(actual)
    }
}