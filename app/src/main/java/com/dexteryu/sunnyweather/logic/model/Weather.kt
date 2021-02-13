package com.dexteryu.sunnyweather.logic.model

import com.dexteryu.sunnyweather.logic.model.DailyResponse
import com.dexteryu.sunnyweather.logic.model.RealtimeResponse

data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)