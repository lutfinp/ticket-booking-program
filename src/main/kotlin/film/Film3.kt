package film

class Film3 : Film {
    override val judul: String = "Dilan 2022"
    override val genre: String = "Romance"
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