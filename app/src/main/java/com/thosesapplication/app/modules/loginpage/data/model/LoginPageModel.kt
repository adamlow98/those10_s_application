package com.thosesapplication.app.modules.loginpage.`data`.model

import com.thosesapplication.app.R
import com.thosesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgetyourpas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forget_your_pas)

)
