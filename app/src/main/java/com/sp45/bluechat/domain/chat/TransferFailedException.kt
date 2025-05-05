package com.sp45.bluechat.domain.chat

import java.io.IOException

class TransferFailedException: IOException("Reading incoming data failed") {
}