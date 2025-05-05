package com.sp45.bluechat.domain.chat

data class BluetoothMessage (
    val message: String,
    val senderName: String,
    val isFromLocalUser: Boolean
)