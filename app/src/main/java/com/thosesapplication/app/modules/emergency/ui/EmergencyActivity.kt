package com.thosesapplication.app.modules.emergency.ui

import androidx.activity.viewModels
import com.thosesapplication.app.R
import com.thosesapplication.app.appcomponents.base.BaseActivity
import com.thosesapplication.app.databinding.ActivityEmergencyBinding
import com.thosesapplication.app.modules.emergency.`data`.viewmodel.EmergencyVM
import com.thosesapplication.app.modules.mainpage.ui.MainPageActivity
import kotlin.String
import kotlin.Unit

class EmergencyActivity : BaseActivity<ActivityEmergencyBinding>(R.layout.activity_emergency) {
  private val viewModel: EmergencyVM by viewModels<EmergencyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.emergencyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBacktomainpag.setOnClickListener {
      val destIntent = MainPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = MainPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EMERGENCY_ACTIVITY"

  }
}
