package com.thosesapplication.app.modules.loginpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.thosesapplication.app.R
import com.thosesapplication.app.appcomponents.base.BaseActivity
import com.thosesapplication.app.databinding.ActivityLoginPageBinding
import com.thosesapplication.app.modules.keyboard.ui.KeyboardActivity
import com.thosesapplication.app.modules.loginpage.`data`.viewmodel.LoginPageVM
import com.thosesapplication.app.modules.mainpage.ui.MainPageActivity
import com.thosesapplication.app.modules.signuppage.ui.SignUpPageActivity
import com.thosesapplication.app.modules.welcomepage.ui.WelcomePageActivity
import kotlin.String
import kotlin.Unit

class LoginPageActivity : BaseActivity<ActivityLoginPageBinding>(R.layout.activity_login_page) {
  private val viewModel: LoginPageVM by viewModels<LoginPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPageVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = WelcomePageActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnPassword.setOnClickListener {
        val destIntent = KeyboardActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnUserNameuserNumber.setOnClickListener {
        val destIntent = KeyboardActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnCreateAccount.setOnClickListener {
        val destIntent = SignUpPageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnLogInOne.setOnClickListener {
        val destIntent = MainPageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_PAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginPageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
