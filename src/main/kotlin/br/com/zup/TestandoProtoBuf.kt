package br.com.zup

import java.io.FileInputStream
import java.io.FileOutputStream

fun main() {
    val request = FuncionarioRequest.newBuilder()
        .setNome("Carol")
        .setCpf("111.111.111-11")
        .setAtivo(true)
        .setSalario(2000.00)
        .setCargo(Cargo.DEV)
        .addEnderecos(
            FuncionarioRequest.Endereco.newBuilder()
                .setLogradouro("Rua")
                .setCep("00000-000")
                .setComplemento("Casa 20")
                .build()
        )
        .build()

    println(request)

    //Transformamos o request em um formato que será trafegado na rede
    //Escrevemos o objeto
    request.writeTo(FileOutputStream("funcionario-request.bin"))

    //Lemos o objeto
    val request2 = FuncionarioRequest.newBuilder().mergeFrom(FileInputStream("funcionario-request.bin"))

    request2.setCargo(Cargo.GERENTE)
    println(request2)
}