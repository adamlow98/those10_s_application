package com.thosesapplication.app.modules.capture.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thosesapplication.app.modules.capture.`data`.model.CaptureModel
import org.koin.core.KoinComponent

class CaptureVM : ViewModel(), KoinComponent {
  val captureModel: MutableLiveData<CaptureModel> = MutableLiveData(CaptureModel())

  var navArguments: Bundle? = null
}
