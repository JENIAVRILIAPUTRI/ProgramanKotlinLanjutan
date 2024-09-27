fun main(args: Array<String>) {
    var maybeNumber: Int? = 15
    maybeNumber = null
    // Perlu melakukan pengecekan apakah maybeNumber tidak null sebelum mengalikan
    println(maybeNumber?.times(2) ?: "Nilai maybeNumber adalah null")

    var s1 = "Hello"
    var s2: String? = "World"
    // s1 tidak nullable, jadi aman untuk langsung mengakses .length
    println(s1.length)
    // Perlu melakukan pengecekan null untuk s2
    println(s2?.length ?: "Nilai s2 adalah null")
}
