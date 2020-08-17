package com.srn.androidstarterproject.Extension

fun String.isEmail(): Boolean = android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
