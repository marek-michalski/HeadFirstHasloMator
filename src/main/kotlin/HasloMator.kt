fun main(args: Array<String>){
    val wordArray1 = arrayOf("24/7", "wielowarstowy", "biznesowy", "dynamiczny", "wszechobecny")
    val wordArray2 = arrayOf("wspomagany", "wzmocniony", "wizjonerski", "sfokusowany")
    val wordArray3 = arrayOf("proces", "paradygmat", "program", "portal", "model")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)

    //dodatkowa funkcja
    val index = arrayOf(1,3,4,2)
    var fruit = arrayOf("Jablko", "Banan","Wisnie", "Jagody", "Granat")
    var x =0
    var y: Int
    while (x < 4) {
        y = index[x]
        println("Owoc = ${fruit[y]}")
        x += 1
    }
}