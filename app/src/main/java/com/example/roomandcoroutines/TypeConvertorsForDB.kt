package com.example.roomandcoroutines

import androidx.room.TypeConverter
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class TypeConvertorsForDB {
    @TypeConverter
    fun convertDateToString(date: Date): String{
        return date.toString()
    }

    @TypeConverter
    fun convertStringToDate(stringDate: String): Date{
        var formatter: DateFormat = SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
        var date: Date = formatter.parse(stringDate)
        return date
    }
}