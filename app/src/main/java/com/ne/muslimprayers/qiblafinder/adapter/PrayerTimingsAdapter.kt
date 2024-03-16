package com.ne.muslimprayers.qiblafinder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ne.muslimprayers.qiblafinder.R
import com.ne.muslimprayers.qiblafinder.data.model.SalahModel
import com.ne.muslimprayers.qiblafinder.data.model.SalahTime
import com.ne.muslimprayers.qiblafinder.databinding.PrayerLayoutBinding
import com.ne.muslimprayers.qiblafinder.interfaces.PrayerAlarmListener
import com.ne.muslimprayers.qiblafinder.utils.Utils.getScheduleName

class PrayerTimingsAdapter(
    private val listSalahModel: List<SalahModel>,
    private val salahTime: SalahTime,
    private val showAlarmImage: Boolean,
    private val listener: PrayerAlarmListener
) : RecyclerView.Adapter<PrayerTimingsAdapter.PrayerTimingsViewHolder>() {

    class PrayerTimingsViewHolder(view: View) : RecyclerView.ViewHolder(view)

    private lateinit var binding: PrayerLayoutBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrayerTimingsViewHolder {
        binding = PrayerLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PrayerTimingsViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: PrayerTimingsViewHolder, position: Int) {
        val prayer = listSalahModel[position]
            binding.tvTime.text = prayer.time
            if (showAlarmImage) {
                binding.ivSound.visibility = VISIBLE
                binding.ivSound.setImageResource(
                    if (prayer.isAlarmOn) R.drawable.ic_sound_on else R.drawable.ic_sound_off
                )

                binding.ivSound.setOnClickListener {
                    binding.ivSound.setImageResource(
                        if (prayer.isAlarmOn) R.drawable.ic_sound_on else R.drawable.ic_sound_off
                    )
                    listener.setAlarm(position, prayer)
                }
            }
            when (position) {
                0 -> binding.bgView.setBackgroundResource(R.drawable.fajr_bg)
                1 -> binding.bgView.setBackgroundResource(R.drawable.duhr_bg)
                2 -> binding.bgView.setBackgroundResource(R.drawable.asr_bg)
                3 -> binding.bgView.setBackgroundResource(R.drawable.magrib_bg)
                4 -> binding.bgView.setBackgroundResource(R.drawable.isha_bg)
            }

            binding.tvTimeName.text = getScheduleName(salahTime, prayer)
    }

    override fun getItemCount(): Int = listSalahModel.size
}