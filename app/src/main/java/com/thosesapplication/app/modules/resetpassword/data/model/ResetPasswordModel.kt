package com.thosesapplication.app.modules.resetpassword.`data`.model

import com.thosesapplication.app.R
import com.thosesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_reset_password)

)
