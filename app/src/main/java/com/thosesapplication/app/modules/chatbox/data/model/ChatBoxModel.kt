package com.thosesapplication.app.modules.chatbox.`data`.model

import com.thosesapplication.app.R
import com.thosesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatBoxModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrSteven: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_steven)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_how_are_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiStevenhow: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_steven_how)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTypeamessage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_type_a_message)

)
