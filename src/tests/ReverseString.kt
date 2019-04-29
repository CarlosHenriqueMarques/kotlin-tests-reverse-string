package exercise

import java.lang.StringBuilder

/*
Return String using String Build
 */
fun reverseSB(str: String) : String{
        return StringBuilder(str).reverse().toString()
    }

/*
Return String using loop
 */
    fun reverseLP(str: String) : String{
        var stringReverse = StringBuilder()
        var contador = str.length -1

        while (contador >= 0){
            stringReverse.append(str[contador])
            contador--
        }
        return stringReverse.toString()
    }
/*
Return String using String
*/
    fun reverseString(str: String): String{
        return str.reversed()
    }
