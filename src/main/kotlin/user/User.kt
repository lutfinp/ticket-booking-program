package user

import bioskop.FIKMall
import bioskop.FikesMall
import bioskop.FisipMall
import film.Film1
import film.Film2
import film.Film3
import java.util.Scanner

data class User(var nama: String) {
    private val reader = Scanner(System.`in`)
    private var pilih: Int? = null
    private val dafHarga = mutableListOf<Int>()
    private var total = 0
    private var flag: Int? = null
    var flag1 = 0
    fun pilihapa() {
        try {
            do {
                println("Hallo $nama")
                println("Selamat Datang di LayarKaca21, Mau Nonton Apa Hari Ini???")
                println("Pilihan Bioskop")
                println("1. FIK Mall")
                println("2. Fisip Mall")
                println("3. Fikes Mall")
                println("Masukkan bioskop yang anda inginkan")
                var pilBioskop: Int = reader.nextInt()
                if (pilBioskop == 1) {
                    println("Daftar Film")
                    println("1. KKN di Desa Pondok Labu")
                    println("2. The Amajing Sapidermen")
                    println("3. Dilan 2022")
                    println("Masukkan film yang anda inginkan")
                    var pilFilm: Int = reader.nextInt()
                    if (pilFilm == 1) {
                        println("Masukkan Jumlah Kursi yang Ingin dibooking")
                        var kursi: Int = reader.nextInt()
                        println("Ingin Menonton di Studio berapa? (1-4)")
                        var studio: Int = reader.nextInt()
                        var a = FIKMall(kursi, studio)
                        var b = Film1()
                        a.getpilKursi()
                        a.getpilStudio()
                        a.harga *= kursi
                        dafHarga.add(a.harga)
                        flag1 = flag ?: 1
                        println("Film yang anda pilih ${b.getjudul()}")
                        println("Dengan genre ${b.getgenre()}")
                        println("Dengan durasi ${b.getdurasi()} menit")
                    } else if (pilFilm == 2) {
                        println("Masukkan Jumlah Kursi yang Ingin dibooking")
                        var kursi: Int = reader.nextInt()
                        println("Ingin Menonton di Studio berapa? (1-4)")
                        var studio: Int = reader.nextInt()
                        var a = FIKMall(kursi, studio)
                        var b = Film2()
                        a.getpilKursi()
                        a.getpilStudio()
                        a.harga *= kursi
                        dafHarga.add(a.harga)
                        flag1 = flag ?: 1
                        println("Film yang anda pilih ${b.getjudul()}")
                        println("Dengan genre ${b.getgenre()}")
                        println("Dengan durasi ${b.getdurasi()} menit")
                    } else {
                        println("Masukkan Jumlah Kursi yang Ingin dibooking")
                        var kursi: Int = reader.nextInt()
                        println("Ingin Menonton di Studio berapa? (1-4)")
                        var studio: Int = reader.nextInt()
                        var a = FIKMall(kursi, studio)
                        var b = Film3()
                        a.getpilKursi()
                        a.getpilStudio()
                        a.harga *= kursi
                        dafHarga.add(a.harga)
                        flag1 = flag ?: 1
                        println("Film yang anda pilih ${b.getjudul()}")
                        println("Dengan genre ${b.getgenre()}")
                        println("Dengan durasi ${b.getdurasi()} menit")
                    }
                } else if (pilBioskop == 2) {
                    println("Daftar Film")
                    println("1. KKN di Desa Pondok Labu")
                    println("2. The Amajing Sapidermen")
                    println("3. Dilan 2022")
                    println("Masukkan film yang anda inginkan")
                    var pilFilm: Int = reader.nextInt()
                    if (pilFilm == 1) {
                        println("Masukkan Jumlah Kursi yang Ingin dibooking")
                        var kursi: Int = reader.nextInt()
                        println("Ingin Menonton di Studio berapa? (1-4)")
                        var studio: Int = reader.nextInt()
                        var a = FisipMall(kursi, studio)
                        var b = Film1()
                        a.getpilKursi()
                        a.getpilStudio()
                        a.harga *= kursi
                        dafHarga.add(a.harga)
                        flag1 = flag ?: 1
                        println("Film yang anda pilih ${b.getjudul()}")
                        println("Dengan genre ${b.getgenre()}")
                        println("Dengan durasi ${b.getdurasi()} menit")
                    } else if (pilFilm == 2) {
                        println("Masukkan Jumlah Kursi yang Ingin dibooking")
                        var kursi: Int = reader.nextInt()
                        println("Ingin Menonton di Studio berapa? (1-4)")
                        var studio: Int = reader.nextInt()
                        var a = FisipMall(kursi, studio)
                        var b = Film2()
                        a.getpilKursi()
                        a.getpilStudio()
                        a.harga *= kursi
                        dafHarga.add(a.harga)
                        flag1 = flag ?: 1
                        println("Film yang anda pilih ${b.getjudul()}")
                        println("Dengan genre ${b.getgenre()}")
                        println("Dengan durasi ${b.getdurasi()} menit")
                    } else {
                        println("Masukkan Jumlah Kursi yang Ingin dibooking")
                        var kursi: Int = reader.nextInt()
                        println("Ingin Menonton di Studio berapa? (1-4)")
                        var studio: Int = reader.nextInt()
                        var a = FisipMall(kursi, studio)
                        var b = Film3()
                        a.getpilKursi()
                        a.getpilStudio()
                        a.harga *= kursi
                        dafHarga.add(a.harga)
                        flag1 = flag ?: 1
                        println("Film yang anda pilih ${b.getjudul()}")
                        println("Dengan genre ${b.getgenre()}")
                        println("Dengan durasi ${b.getdurasi()} menit")
                    }
                } else {
                    println("Daftar Film")
                    println("1. KKN di Desa Pondok Labu")
                    println("2. The Amajing Sapidermen")
                    println("3. Dilan 2022")
                    println("Masukkan film yang anda inginkan")
                    var pilFilm: Int = reader.nextInt()
                    if (pilFilm == 1) {
                        println("Masukkan Jumlah Kursi yang Ingin dibooking")
                        var kursi: Int = reader.nextInt()
                        println("Ingin Menonton di Studio berapa? (1-4)")
                        var studio: Int = reader.nextInt()
                        var a = FikesMall(kursi, studio)
                        var b = Film1()
                        a.getpilKursi()
                        a.getpilStudio()
                        a.harga *= kursi
                        dafHarga.add(a.harga)
                        flag1 = flag ?: 1
                        println("Film yang anda pilih ${b.getjudul()}")
                        println("Dengan genre ${b.getgenre()}")
                        println("Dengan durasi ${b.getdurasi()} menit")
                    } else if (pilFilm == 2) {
                        println("Masukkan Jumlah Kursi yang Ingin dibooking")
                        var kursi: Int = reader.nextInt()
                        println("Ingin Menonton di Studio berapa? (1-4)")
                        var studio: Int = reader.nextInt()
                        var a = FikesMall(kursi, studio)
                        var b = Film2()
                        a.getpilKursi()
                        a.getpilStudio()
                        a.harga *= kursi
                        dafHarga.add(a.harga)
                        flag1 = flag ?: 1
                        println("Film yang anda pilih ${b.getjudul()}")
                        println("Dengan genre ${b.getgenre()}")
                        println("Dengan durasi ${b.getdurasi()} menit")
                    } else {
                        println("Masukkan Jumlah Kursi yang Ingin dibooking")
                        var kursi: Int = reader.nextInt()
                        println("Ingin Menonton di Studio berapa? (1-4)")
                        var studio: Int = reader.nextInt()
                        var a = FikesMall(kursi, studio)
                        var b = Film3()
                        a.getpilKursi()
                        a.getpilStudio()
                        a.harga *= kursi
                        dafHarga.add(a.harga)
                        flag1 = flag ?: 1
                        println("Film yang anda pilih ${b.getjudul()}")
                        println("Dengan genre ${b.getgenre()}")
                        println("Dengan durasi ${b.getdurasi()} menit")
                    }
                }
                println("Apakah ingin booking lagi?")
                println("1. ya")
                println("2. tidak")
                println("Masukkan Pilihan Anda")
                pilih = reader.nextInt()
            } while (pilih == 1)
        } catch (e: Exception) {
            println("Maaf Terjadi Kesalahan")
        }
        if (flag1 == 1) {
            for (i in dafHarga) {
                total += i
            }
            println("Total harga booking = Rp $total ")
        }
    }
}