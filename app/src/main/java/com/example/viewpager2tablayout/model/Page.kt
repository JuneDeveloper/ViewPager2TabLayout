package com.example.viewpager2tablayout.model

import java.io.Serializable

class Page(val name:String,val url: String):Serializable {

    companion object{
        val pages = mutableListOf(
            Page("Новости","https://ria.ru/"),
            Page("Фильмы","https://bot.filmhd1080.sbs/"),
            Page("Музыка","https://music.yandex.ru/home"),
            Page("Радио","https://www.radiorecord.ru/"),
            Page("Игры","https://yandex.ru/games/")
        )
    }
}