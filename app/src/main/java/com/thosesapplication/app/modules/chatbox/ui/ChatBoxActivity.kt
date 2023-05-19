package com.thosesapplication.app.modules.chatbox.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.thosesapplication.app.R
import com.thosesapplication.app.appcomponents.base.BaseActivity
import com.thosesapplication.app.databinding.ActivityChatBoxBinding
import com.thosesapplication.app.modules.chatbox.`data`.viewmodel.ChatBoxVM
import com.thosesapplication.app.modules.notification.ui.NotificationActivity
import kotlin.String
import kotlin.Unit

class ChatBoxActivity : BaseActivity<ActivityChatBoxBinding>(R.layout.activity_chat_box) {
  private val viewModel: ChatBoxVM by viewModels<ChatBoxVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatBoxVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHAT_BOX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatBoxActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
