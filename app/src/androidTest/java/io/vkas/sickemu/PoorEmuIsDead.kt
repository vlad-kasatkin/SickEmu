package io.vkas.sickemu

import android.support.test.InstrumentationRegistry
import android.support.test.uiautomator.UiDevice
import org.junit.Assert.assertTrue
import org.junit.Test

class PoorEmuIsDead {
    @Test
    fun isItDead1() {
        Thread.sleep(2000)

        sleepDevice()
        wakeDevice()

        assertTrue(true)
    }

    @Test
    fun isItDead2() {
        Thread.sleep(2000)

        sleepDevice()
        wakeDevice()

        assertTrue(true)
    }

    @Test
    fun isItDead3() {
        Thread.sleep(2000)

        sleepDevice()
        wakeDevice()

        assertTrue(true)
    }

    @Test
    fun isItDead4() {
        Thread.sleep(2000)

        sleepDevice()
        wakeDevice()

        assertTrue(true)
    }

    @Test
    fun isItDead5() {
        Thread.sleep(2000)

        sleepDevice()
        wakeDevice()

        assertTrue(true)
    }

    private fun sleepDevice() {
        val instance = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        instance.sleep()
        instance.waitForIdle()
        Thread.sleep(2000)
    }

    private fun wakeDevice() {
        val instance = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        instance.wakeUp()
        instance.waitForIdle()
        instance.pressKeyCode(82)
        instance.waitForIdle()
    }
}