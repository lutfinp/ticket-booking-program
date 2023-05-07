package main

import user.User
import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)
    println("Selamat Datang di Program Pemesanan Tiket Bioskop")
    println("Silahkan Masukkan Nama Anda")
    val nama: String = reader.nextLine()
    val a = User(nama)
    a.pilihapa()
    println("Terimakasih Sudah Memesan di Program Pemesanan Tiket Bioskop")
}