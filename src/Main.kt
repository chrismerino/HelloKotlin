

    fun main(){


        fibonacciSequence()
    }

    fun fibonacciSequence(){

        var numberA = 0
        var numberB = 1
        var total = 0

        for (i in 1 .. 18) {


            total = numberA + numberB
            println(total)
            numberA = numberB
            numberB = total

        }
    }