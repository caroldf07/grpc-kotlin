package br.com.zup

import com.google.protobuf.Timestamp
import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import java.time.LocalDateTime
import java.time.ZoneId

//Subindo servidor gRPC
fun main() {
    val server = ServerBuilder
        .forPort(50051)
        .addService(FuncionarioEndPoint())
        .build()
    server.start()
    //Usamos o await para que o servidor fique rodando, caso contrário ele desliga sozinho
    server.awaitTermination()
}

//Como o service é uma classe abstrata, nós fazemos a implementação dela para chamá-la no servidor
class FuncionarioEndPoint : FuncionarioServiceGrpc.FuncionarioServiceImplBase() {
    override fun cadastrar(request: FuncionarioRequest?, responseObserver: StreamObserver<FuncionarioResponse>?) {
        val nome = request?.nome
        val instant = LocalDateTime.now().atZone(ZoneId.of("UTC")).toInstant()
        val criadoEm = Timestamp.newBuilder()
            .setSeconds(instant.epochSecond)
            .setNanos(instant.nano)
            .build()

        val response = FuncionarioResponse.newBuilder()
            .setNome(nome)
            .setCriadoEm(criadoEm)
            .build()

        responseObserver?.onNext(response)
        responseObserver?.onCompleted()
    }

}