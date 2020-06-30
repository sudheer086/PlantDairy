package com.sri.sp.myplantdairy.service

import androidx.lifecycle.MutableLiveData
import com.sri.sp.myplantdairy.dto.Plant

class PlantService {

    fun fetchPlants(plantName: String): MutableLiveData<ArrayList<Plant>> {
        return MutableLiveData<ArrayList<Plant>>()
    }
}