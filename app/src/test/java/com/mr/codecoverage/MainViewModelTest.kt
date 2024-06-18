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
}