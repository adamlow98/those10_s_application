package com.thosesapplication.app.modules.menusetting.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thosesapplication.app.modules.menusetting.`data`.model.MenuSettingModel
import org.koin.core.KoinComponent

class MenuSettingVM : ViewModel(), KoinComponent {
  val menuSettingModel: MutableLiveData<MenuSettingModel> = MutableLiveData(MenuSettingModel())

  var navArguments: Bundle? = null
}
