package com.hinade.fleetfix.model.usuario

enum class TipoUsuario(val nome: String) {
    MOTORISTA("Motorista"),
    MECANICO("Mecânico");

    companion object {
        fun from(nomeTipo: String): TipoUsuario? {
            return TipoUsuario.entries.firstOrNull { it.nome == nomeTipo }
        }
    }

}