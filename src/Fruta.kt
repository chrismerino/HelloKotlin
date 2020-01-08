class Fruta (color: String, sabor: String, precio: Int, frescura: Int){

    var color: String = ""
    var sabor: String = ""
    var precio: Int = 0
    var frescura: Int = 0


    init {
        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.frescura = frescura
    }


    fun pudrirse(): Int{
        frescura = frescura -20
        return frescura
    }

    fun mostrarFrescura(): String{

        var text: String = ""
        when (frescura){

            100 -> text = "La frescura es 100%"
            80 -> text = "La frescura es 80%"
            60 -> text = "La frescura es 60%"
            40 -> text = "La frescura es 40%"
            20 -> text = "La frescura es 20%"
            0 -> text = "La fruta esta podrida"

        }
        return text
    }

}