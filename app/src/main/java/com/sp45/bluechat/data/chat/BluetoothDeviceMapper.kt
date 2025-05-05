package com.sp45.bluechat.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.sp45.bluechat.domain.chat.BluetoothDeviceDomain


@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}