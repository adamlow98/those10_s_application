package com.thosesapplication.app.modules.welcomepage.`data`.model

import com.thosesapplication.app.R
import com.thosesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_increase_your_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_accuracy_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPainRate: String? = MyApp.getInstance().resources.getString(R.string.lbl_pain_rate)

)
