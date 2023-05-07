package film

class Film1 : Film {
    override val judul: String = "KKN di Pondok Labu"
    override val genre: String = "Horror"
    override val durasi: Int = 90

    override fun getjudul():String{
        return this.judul
    }

    override fun getgenre():String{
        return this.genre
    }

    override fun getdurasi(): String {
        return durasi.toString()
    }

}