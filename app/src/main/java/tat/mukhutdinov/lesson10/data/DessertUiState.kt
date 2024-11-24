package tat.mukhutdinov.lesson10.data

import androidx.annotation.DrawableRes
import tat.mukhutdinov.lesson10.data.Datasource.dessertList

data class DessertUiState (
    val revenue: Int = 0,
    val dessertsSold: Int = 0,
    val currentDessertIndex: Int = 0,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId
)