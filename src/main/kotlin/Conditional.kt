fun main() {
    val isSamboGuilty = true

    //if else
    if (isSamboGuilty) {
        println("He will be jailed")
    } else {
        println("no comment")
    }
    //another example
    // if (isSamboGuilty) println("He will be jailed") else println("no comment")

    val lamaTahanan = if (isSamboGuilty) 50 else 0
    println("Masa Tahanan Sambo: $lamaTahanan Tahun")

    //switch case
    val num = 7

    val hasil = when {
        num > 0 -> "Positive"
        num < 0 -> "Negative"
        else -> "Zero"
    }
    println(hasil)
}