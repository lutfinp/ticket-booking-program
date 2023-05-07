package film

class Film2 : Film {
    override val judul: String = "The Amajing Sapiderman"
    override val genre: String = "Action"
    override val durasi: Int = 100

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