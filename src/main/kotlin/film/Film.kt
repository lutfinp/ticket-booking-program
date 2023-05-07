package film

interface Film {
    val judul : String
    val genre : String
    val durasi : Int

    fun getjudul():String
    fun getgenre():String
    fun getdurasi():String
}