package Chapter02.color

import Chapter02.color.Color.*

fun getMood(color: Color) =
    when (color) {
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }

fun mix(color1: Color, color2: Color) =
    when (setOf(color1, color2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main() {
    println(getMood(RED))
    println(mix(RED, YELLOW))
}