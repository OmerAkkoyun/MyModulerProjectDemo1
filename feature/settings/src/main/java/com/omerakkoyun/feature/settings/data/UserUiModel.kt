package com.omerakkoyun.feature.settings.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
* Created by Omer AKKOYUN on 2.04.2026.
*/
@Parcelize
data class UserUiModel(
    val id: String,
    val name: String
) : Parcelable