package com.moez.QKSMS.dagger

import com.moez.QKSMS.receiver.MarkSeenReceiver
import com.moez.QKSMS.receiver.MessageSentReceiver
import com.moez.QKSMS.receiver.SmsReceiver
import com.moez.QKSMS.ui.conversations.ConversationAdapter
import com.moez.QKSMS.ui.conversations.ConversationListViewModel
import com.moez.QKSMS.ui.messages.MessageAdapter
import com.moez.QKSMS.ui.messages.MessageListActivity
import com.moez.QKSMS.ui.messages.MessageListViewModel
import com.moez.QKSMS.util.NotificationManager
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(receiver: SmsReceiver)
    fun inject(receiver: MessageSentReceiver)
    fun inject(receiver: MarkSeenReceiver)

    fun inject(activity: MessageListActivity)

    fun inject(viewModel: ConversationListViewModel)
    fun inject(viewModel: MessageListViewModel)

    fun inject(adapter: MessageAdapter)
    fun inject(adapter: ConversationAdapter)

    fun inject(manager: NotificationManager)

}