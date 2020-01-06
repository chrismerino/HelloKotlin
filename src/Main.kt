

    fun main(){

        print("Hello Kotlin")

        serie()
    }

    fun serie(){

        var numeroUno = 0
        var numeroDos = 1
        var sumaTotal: Int? = null

        for (i in 1 .. 18) {
            sumaTotal = numeroUno + numeroDos
            println("$sumaTotal")
            numeroDos++
            numeroUno++
        }

    }