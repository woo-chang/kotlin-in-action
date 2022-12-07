package Chapter04.nested

class Outer {

    inner class Inner {
        fun getOuterReference(): Outer {
            return this@Outer
        }
    }
}