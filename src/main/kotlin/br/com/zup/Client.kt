package br.com.zup

import io.grpc.ManagedChannelBuilder

fun main() {

    //Qual o canal que iremos consumir a informação
    val channel = ManagedChannelBuilder
        .forAddress("localhost", 50051)
        .usePlaintext()
        .build()

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

    val client = FuncionarioServiceGrpc.newBlockingStub(channel)

    val response = client.cadastrar(request)
    println(response)

}