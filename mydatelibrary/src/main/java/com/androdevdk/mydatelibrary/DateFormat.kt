package com.androdevdk.mydatelibrary


import java.sql.Time
import java.text.SimpleDateFormat
import java.util.*

public class DateFormat {
    companion object {
        fun changeFormat(date:Date):String {
            val simpleDateFormat = SimpleDateFormat("EEEE, dd-MMM-yyyy hh-mm-ss a")
            val dateTime = simpleDateFormat.format(date)
            return dateTime
        }
    }
}
