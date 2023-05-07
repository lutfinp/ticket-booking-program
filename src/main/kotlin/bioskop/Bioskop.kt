package bioskop

open class Bioskop(pilKursi: Int,
                   pilStudio: Int){
    var pilKursi = pilKursi
    var pilStudio = pilStudio
    var jumKursi = 10
    var harga = 30000

    open fun getpilKursi(){
        if(pilKursi<jumKursi) {
            println("Anda memilih kursi sebanyak $pilKursi buah")
            jumKursi -=pilKursi
        }
        else{
            println("Kursi hanya tersedia $jumKursi buah")
        }
    }

    open fun getpilStudio(){
        println("Anda memilih Studio $pilStudio")
    }
}


