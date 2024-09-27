fun main(args: Array<String>) {
    // Null safety
    // The !! operator
    var maybeNumber: Int? = 15
    // Pastikan maybeNumber tidak null sebelum menggunakan !!
    println(maybeNumber?.times(2) ?: "maybeNumber adalah null")

    maybeNumber = null
    // Pengecekan null menggunakan operator safe call ?. atau alternatif dengan elvis operator
    println(maybeNumber?.times(2) ?: "maybeNumber adalah null")
}
