package com.example.kts_android_09_2021.db.enteties

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = LikedPhotosContract.TABLE_NAME
)
data class LikedPhotosEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = LikedPhotosContract.Columns.ID)
    val id: String,

    @ColumnInfo(name = LikedPhotosContract.Columns.USERNAME)
    val userName: String,

    @ColumnInfo(name = LikedPhotosContract.Columns.AVATAR_URL)
    val avatarUrl: String,

    @ColumnInfo(name = LikedPhotosContract.Columns.IMAGE_URL)
    val imageUrl: String
)