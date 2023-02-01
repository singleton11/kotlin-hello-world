import kotlin.test.Test
import kotlin.test.assertEquals

class LibraryTest {
    @Test
    fun test() {
        val a = 5
        val b = -2

        val result = aPlusB(a, b)

        assertEquals(result, 3)
    }
}
