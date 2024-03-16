package com.ne.muslimprayers.qiblafinder.data.model

data class SalahModel(
    val time: String,
    var isAlarmOn: Boolean
) {
    companion object {
        val EMPTY = SalahModel("_", false)
    }
}