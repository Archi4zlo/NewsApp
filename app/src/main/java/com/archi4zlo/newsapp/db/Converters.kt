package com.archi4zlo.newsapp.db

import androidx.room.TypeConverter
import com.archi4zlo.newsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}