package bioskop

class FIKMall (pilKursi: Int, pilStudio: Int) : Bioskop(pilKursi, pilStudio){
    override fun getpilKursi(){
        if(pilKursi<jumKursi) {
            println("Anda memilih kursi sebanyak $pilKursi buah")
            jumKursi -=pilKursi
        }
        else{
            println("Kursi hanya tersedia $jumKursi buah")
        }
    }

    override fun getpilStudio(){
        println("Anda memilih Studio $pilStudio")
    }
}