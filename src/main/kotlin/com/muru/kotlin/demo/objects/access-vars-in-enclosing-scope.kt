package com.muru.kotlin.demo.objects

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComponent

fun main() {

}

fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    // The code in object expressions can access variables from the enclosing scope
    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }

        override fun mouseEntered(e: MouseEvent) {
            enterCount++
        }
    })
    // ...
}