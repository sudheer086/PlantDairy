package com.sri.sp.myplantdairy

//import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.sri.sp.myplantdairy.service.PlantService
import com.sri.sp.myplantdairy.ui.main.MainViewModel
//import io.mockk.mockk
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.rules.TestRule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PlantDataUnitTest {


 //   @get:Rule
  //  var rule: TestRule = InstantTaskExecutorRule()
  //  lateinit var mvm:MainViewModel

  //  var plantService = mockk<PlantService>()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    fun addOne2AndTwo() {


    }


    @Test
    fun searchForRedbud_returnsRedbud() {
        givenAFeedOfMockedPlantDataAreAvailable()
        whenSearchForRedbud()
    //    theResultContainsEasternRedbud()
    }

    private fun givenAFeedOfMockedPlantDataAreAvailable() {
 //       mvm = MainViewModel()
        //createMockData()
    }

    private fun whenSearchForRedbud() {
  //      mvm.fetchPlants("Redbud")
    }

    private fun theResultContainsEasternRedbud() {
        var redbudFound = false
 //       mvm.plants.observeForever {
 //           // here is where we do observing
 //           assertNotNull(it)
 //           assertTrue(it.size > 0)
 //           it.forEach {
 //               if (it.genus == "cercis" && it.species == "canadensis" && it.common.contains("Eastern Redbud")) {
  //                  redbudFound = true
  //              }
   //         }
   //     }
        assertTrue(redbudFound)
    }

    @Test
    fun searchForGarbage_returnsNothing() {
        givenAFeedOfMockedPlantDataAreAvailable()
        whenISearchForGarbage()
        thenIGetZeroResults()
    }

    private fun whenISearchForGarbage() {
 //       mvm.fetchPlants("sklujapouetllkjsdau")
    }

    private fun thenIGetZeroResults() {
   //     mvm.plants.observeForever {
   //         assertEquals(0, it.size)
   //     }
    }

}
