    package exercise

    import org.junit.Assert
    import org.junit.Test

    class ReversStringTest {


        @Test fun testUsingSB(){
            Assert.assertEquals("bs solrac", reverseSB("carlos sb"))
        }

        @Test fun testUsingLoop(){
            Assert.assertEquals("pl solrac",reverseLP("carlos lp"))
        }

        @Test fun testUsingString(){
            Assert.assertEquals("gnirts solrac",reverseString("carlos string"))
        }
    }