package com.sp45.bluechat.data.chat

import com.sp45.bluechat.domain.chat.BluetoothMessage

fun String.toBluetoothMessage(isFromLocalUser: Boolean): BluetoothMessage{
    val name = substringBeforeLast("#")
    val message = substringAfterLast("#")
    return BluetoothMessage(
        message = message,
        senderName = name,
        isFromLocalUser = isFromLocalUser
    )
}

fun BluetoothMessage.toByteArray(): ByteArray{
    return "$senderName#$message".encodeToByteArray()
}