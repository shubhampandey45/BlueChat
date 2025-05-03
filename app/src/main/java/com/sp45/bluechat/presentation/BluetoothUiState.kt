package com.sp45.bluechat.presentation

import com.sp45.bluechat.domain.chat.BluetoothDevice

data class BluetoothUiState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevice: List<BluetoothDevice> = emptyList()
)