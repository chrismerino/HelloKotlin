

    fun main(){


        var color: String = "Rojo"
        var sabor: String = "Dulce"
        var precio:Int = 4
        var frescura: Int = 100
        var manzana = Fruta(color, sabor, precio, frescura)

        println("El color de la Manzana es ${manzana.color}")
        manzana.pudrirse()
        println(manzana.mostrarFrescura())



        // fibonacciSequence()
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