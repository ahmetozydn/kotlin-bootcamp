package com.example.kotlinbootcamp.assignments

class Assignment2 {



}
fun question1(kenarSayisi: Int): Int {
    if (kenarSayisi < 3) {
        throw IllegalArgumentException("Kenar sayısı 3'ten küçük olamaz.")
    }

    val icAcilarToplami = (kenarSayisi - 2) * 180
    return icAcilarToplami
}

fun question2(gunSayisi: Int): Int {
    val calismaSaatUcreti = 10
    val mesaiSaatUcreti = 20
    val calismaSaatLimiti = 160

    if (gunSayisi <= 0) {
        throw IllegalArgumentException("Gün sayısı geçersiz.")
    }

    val calismaSaatToplami = gunSayisi * 8

    return if (calismaSaatToplami <= calismaSaatLimiti) {
        calismaSaatToplami * calismaSaatUcreti
    } else {
        val normalSaatler = calismaSaatLimiti * calismaSaatUcreti
        val mesaiSaatler = (calismaSaatToplami - calismaSaatLimiti) * mesaiSaatUcreti
        normalSaatler + mesaiSaatler
    }
}

fun question3(kotaMiktariGB: Int): Double {
    val baslangicUcret = 100.0
    val ekGBUcret = 4.0

    if (kotaMiktariGB < 0) {
        throw IllegalArgumentException("Kota miktarı geçersiz.")
    }

    return when {
        kotaMiktariGB <= 50 -> baslangicUcret
        else -> baslangicUcret + (kotaMiktariGB - 50) * ekGBUcret
    }
}

fun question4(celsius: Double): Double {
    val fahrenheit = celsius * 1.8 + 32.0
    return fahrenheit
}

fun question5(uzunKenar: Double, kisaKenar: Double): Double {
    val cevre = 2 * (uzunKenar + kisaKenar)
    return cevre
}

fun main() {

        println("ic acilar toplami : ${question1(4)}")
        println("mesaili maas ücreti : ${question2(21)}")
        println("kotalı fatura hesapla : ${question3(51)}")
        println("celcius convertor : ${question4(32.0)}")
        println("perimeter of rectangle : ${question5(32.0,12.0)}")
        println("factorial : ${question6(5)}")
        println("a times in the word : ${question7("ahmet ahmet")}")
}

fun question6( int : Int) : Any{ // recursive approach
    if( int<0){
        return "number cannot less than 0"
    }else if (int == 1 || int == 0){
        return 1
    }else{
       return int.times(question6(int -1 ) as Int)
    }
}

fun question7(kelime: String): Int {
    var aHarfSayisi = 0

    for (harf in kelime) {
        if (harf == 'a' || harf == 'A') {
            aHarfSayisi++
        }
    }

    return aHarfSayisi
}
