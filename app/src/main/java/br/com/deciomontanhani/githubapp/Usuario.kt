package br.com.deciomontanhani.githubapp

import com.google.gson.annotations.SerializedName

data class Usuario (
    @SerializedName("name")
    var nome: String,

    @SerializedName("avatar_url")
    var avatarUrl: String
)