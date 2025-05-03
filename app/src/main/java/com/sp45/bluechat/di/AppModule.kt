package com.sp45.bluechat.di

import android.content.Context
import com.sp45.bluechat.data.chat.AndroidBluetoothController
import com.sp45.bluechat.domain.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context: Context): BluetoothController{
        return AndroidBluetoothController(context)
    }
}