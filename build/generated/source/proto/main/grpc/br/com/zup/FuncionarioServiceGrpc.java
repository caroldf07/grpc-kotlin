package br.com.zup;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: grpcKotlin.proto")
public final class FuncionarioServiceGrpc {

  private FuncionarioServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.FuncionarioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.FuncionarioRequest,
      br.com.zup.FuncionarioResponse> getCadastrarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cadastrar",
      requestType = br.com.zup.FuncionarioRequest.class,
      responseType = br.com.zup.FuncionarioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.FuncionarioRequest,
      br.com.zup.FuncionarioResponse> getCadastrarMethod() {
    io.grpc.MethodDescriptor<br.com.zup.FuncionarioRequest, br.com.zup.FuncionarioResponse> getCadastrarMethod;
    if ((getCadastrarMethod = FuncionarioServiceGrpc.getCadastrarMethod) == null) {
      synchronized (FuncionarioServiceGrpc.class) {
        if ((getCadastrarMethod = FuncionarioServiceGrpc.getCadastrarMethod) == null) {
          FuncionarioServiceGrpc.getCadastrarMethod = getCadastrarMethod =
              io.grpc.MethodDescriptor.<br.com.zup.FuncionarioRequest, br.com.zup.FuncionarioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cadastrar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.FuncionarioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.FuncionarioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FuncionarioServiceMethodDescriptorSupplier("cadastrar"))
              .build();
        }
      }
    }
    return getCadastrarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FuncionarioServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FuncionarioServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FuncionarioServiceStub>() {
        @java.lang.Override
        public FuncionarioServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FuncionarioServiceStub(channel, callOptions);
        }
      };
    return FuncionarioServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FuncionarioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FuncionarioServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FuncionarioServiceBlockingStub>() {
        @java.lang.Override
        public FuncionarioServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FuncionarioServiceBlockingStub(channel, callOptions);
        }
      };
    return FuncionarioServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FuncionarioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FuncionarioServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FuncionarioServiceFutureStub>() {
        @java.lang.Override
        public FuncionarioServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FuncionarioServiceFutureStub(channel, callOptions);
        }
      };
    return FuncionarioServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FuncionarioServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *RPC realiza a função, no caso cadastrar onde envia Funcionario e retorna a Resposta
     * </pre>
     */
    public void cadastrar(br.com.zup.FuncionarioRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.FuncionarioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCadastrarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCadastrarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.FuncionarioRequest,
                br.com.zup.FuncionarioResponse>(
                  this, METHODID_CADASTRAR)))
          .build();
    }
  }

  /**
   */
  public static final class FuncionarioServiceStub extends io.grpc.stub.AbstractAsyncStub<FuncionarioServiceStub> {
    private FuncionarioServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FuncionarioServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FuncionarioServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *RPC realiza a função, no caso cadastrar onde envia Funcionario e retorna a Resposta
     * </pre>
     */
    public void cadastrar(br.com.zup.FuncionarioRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.FuncionarioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCadastrarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FuncionarioServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FuncionarioServiceBlockingStub> {
    private FuncionarioServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FuncionarioServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FuncionarioServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *RPC realiza a função, no caso cadastrar onde envia Funcionario e retorna a Resposta
     * </pre>
     */
    public br.com.zup.FuncionarioResponse cadastrar(br.com.zup.FuncionarioRequest request) {
      return blockingUnaryCall(
          getChannel(), getCadastrarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FuncionarioServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FuncionarioServiceFutureStub> {
    private FuncionarioServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FuncionarioServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FuncionarioServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *RPC realiza a função, no caso cadastrar onde envia Funcionario e retorna a Resposta
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.FuncionarioResponse> cadastrar(
        br.com.zup.FuncionarioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCadastrarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CADASTRAR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FuncionarioServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FuncionarioServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CADASTRAR:
          serviceImpl.cadastrar((br.com.zup.FuncionarioRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.FuncionarioResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FuncionarioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FuncionarioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.GrpcKotlin.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FuncionarioService");
    }
  }

  private static final class FuncionarioServiceFileDescriptorSupplier
      extends FuncionarioServiceBaseDescriptorSupplier {
    FuncionarioServiceFileDescriptorSupplier() {}
  }

  private static final class FuncionarioServiceMethodDescriptorSupplier
      extends FuncionarioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FuncionarioServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FuncionarioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FuncionarioServiceFileDescriptorSupplier())
              .addMethod(getCadastrarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
