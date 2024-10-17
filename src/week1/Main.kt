package week1

fun main() {
    val tugas = 75
    val uts = 80
    val uas = 82

    val total = tugas + uts + uas
    println("jumlah nilai $total")

    val nilai = total/3
    println("rata-rata $nilai")

    if(nilai in 75.. 100) {
        println("grade: 'A'status : lulus")
    }else if (nilai in 65 .. 74 ) {
        println("grade: 'B'status : lulus ")
    }else if (nilai in 55 .. 64 ) {
        println("grade: 'C'status : lulus ")
    }else if  (nilai in 45 .. 54) {
        println("grade: 'D'status : lulus ")
    }else {
        println("grade : 'E'status : tidak lulus ")
    }
}







