package br.com.deciomontanhani.githubapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("/users/{nome}")
    fun buscarUsuario(@Path("nome") nomeUsuario: String): Call<Usuario>
}