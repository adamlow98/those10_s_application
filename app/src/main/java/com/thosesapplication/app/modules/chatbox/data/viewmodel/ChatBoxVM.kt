package com.thosesapplication.app.modules.chatbox.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thosesapplication.app.modules.chatbox.`data`.model.ChatBoxModel
import org.koin.core.KoinComponent

class ChatBoxVM : ViewModel(), KoinComponent {
  val chatBoxModel: MutableLiveData<ChatBoxModel> = MutableLiveData(ChatBoxModel())

  var navArguments: Bundle? = null
}
