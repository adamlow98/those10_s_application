package com.thosesapplication.app.modules.mainpage.`data`.model

import com.thosesapplication.app.R
import com.thosesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MainPageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt29april2023: String? = MyApp.getInstance().resources.getString(R.string.lbl_29_april_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt30april2023: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_april_2023)

)
