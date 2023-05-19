package com.thosesapplication.app.modules.menu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.viewModels
import com.thosesapplication.app.R
import com.thosesapplication.app.appcomponents.base.BaseActivity
import com.thosesapplication.app.databinding.ActivityMenuBinding
import com.thosesapplication.app.modules.capture.ui.CaptureActivity
import com.thosesapplication.app.modules.mainpage.ui.MainPageActivity
import com.thosesapplication.app.modules.menu.`data`.viewmodel.MenuVM
import com.thosesapplication.app.modules.menusetting.ui.MenuSettingActivity
import com.thosesapplication.app.modules.notification.ui.NotificationActivity
import com.thosesapplication.app.modules.patients.ui.PatientsActivity
import kotlin.String
import kotlin.Unit

class MenuActivity : BaseActivity<ActivityMenuBinding>(R.layout.activity_menu) {
  private val viewModel: MenuVM by viewModels<MenuVM>()

  private lateinit var dashButton: LinearLayout
  private lateinit var camButton: LinearLayout
  private lateinit var patientsButton: LinearLayout
  private lateinit var notifButton: LinearLayout
  private lateinit var menuButton: LinearLayout

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSettings.setOnClickListener {
      val destIntent = MenuSettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowrightFour.setOnClickListener {
      val destIntent = MenuSettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    dashButton = findViewById(R.id.linearDashboard)
    dashButton.setOnClickListener{
      val destIntent = MainPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    camButton = findViewById(R.id.linearCapture)
    camButton.setOnClickListener{
      val destIntent = CaptureActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    patientsButton = findViewById(R.id.linearPatients)
    patientsButton.setOnClickListener{
      val destIntent = PatientsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    notifButton = findViewById(R.id.linearNotification)
    notifButton.setOnClickListener{
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    menuButton = findViewById(R.id.linearMenu)
    menuButton.setOnClickListener {
      val destIntent = MenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
