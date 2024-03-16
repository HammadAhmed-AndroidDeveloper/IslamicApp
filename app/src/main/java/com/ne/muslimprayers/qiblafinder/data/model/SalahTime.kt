package com.ne.muslimprayers.qiblafinder.data.model

data class SalahTime(
    val fajr: SalahModel,
    val dhuhr: SalahModel,
    val asr: SalahModel,
    val maghrib: SalahModel,
    val isha: SalahModel
) {
    companion object {
        val EMPTY = SalahTime(
            SalahModel.EMPTY,
            SalahModel.EMPTY,
            SalahModel.EMPTY,
            SalahModel.EMPTY,
            SalahModel.EMPTY
        )
    }
}