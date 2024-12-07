package ma.projet.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: CompteService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CompteServiceGrpc {

  private CompteServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "CompteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.SearchComptesByDateRequest,
      ma.projet.grpc.stubs.SearchComptesByDateResponse> getSearchComptesByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchComptesByDate",
      requestType = ma.projet.grpc.stubs.SearchComptesByDateRequest.class,
      responseType = ma.projet.grpc.stubs.SearchComptesByDateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.SearchComptesByDateRequest,
      ma.projet.grpc.stubs.SearchComptesByDateResponse> getSearchComptesByDateMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.SearchComptesByDateRequest, ma.projet.grpc.stubs.SearchComptesByDateResponse> getSearchComptesByDateMethod;
    if ((getSearchComptesByDateMethod = CompteServiceGrpc.getSearchComptesByDateMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getSearchComptesByDateMethod = CompteServiceGrpc.getSearchComptesByDateMethod) == null) {
          CompteServiceGrpc.getSearchComptesByDateMethod = getSearchComptesByDateMethod =
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.SearchComptesByDateRequest, ma.projet.grpc.stubs.SearchComptesByDateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchComptesByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.SearchComptesByDateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.SearchComptesByDateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("SearchComptesByDate"))
              .build();
        }
      }
    }
    return getSearchComptesByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetSummaryRequest,
      ma.projet.grpc.stubs.GetSummaryResponse> getGetSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSummary",
      requestType = ma.projet.grpc.stubs.GetSummaryRequest.class,
      responseType = ma.projet.grpc.stubs.GetSummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetSummaryRequest,
      ma.projet.grpc.stubs.GetSummaryResponse> getGetSummaryMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetSummaryRequest, ma.projet.grpc.stubs.GetSummaryResponse> getGetSummaryMethod;
    if ((getGetSummaryMethod = CompteServiceGrpc.getGetSummaryMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetSummaryMethod = CompteServiceGrpc.getGetSummaryMethod) == null) {
          CompteServiceGrpc.getGetSummaryMethod = getGetSummaryMethod =
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetSummaryRequest, ma.projet.grpc.stubs.GetSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetSummaryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("GetSummary"))
              .build();
        }
      }
    }
    return getGetSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetAllComptesRequest,
      ma.projet.grpc.stubs.GetAllComptesResponse> getAllComptesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllComptes",
      requestType = ma.projet.grpc.stubs.GetAllComptesRequest.class,
      responseType = ma.projet.grpc.stubs.GetAllComptesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetAllComptesRequest,
      ma.projet.grpc.stubs.GetAllComptesResponse> getAllComptesMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetAllComptesRequest, ma.projet.grpc.stubs.GetAllComptesResponse> getAllComptesMethod;
    if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
          CompteServiceGrpc.getAllComptesMethod = getAllComptesMethod =
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetAllComptesRequest, ma.projet.grpc.stubs.GetAllComptesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllComptes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetAllComptesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetAllComptesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("AllComptes"))
              .build();
        }
      }
    }
    return getAllComptesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetCompteByIdRequest,
      ma.projet.grpc.stubs.GetCompteByIdResponse> getCompteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompteById",
      requestType = ma.projet.grpc.stubs.GetCompteByIdRequest.class,
      responseType = ma.projet.grpc.stubs.GetCompteByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetCompteByIdRequest,
      ma.projet.grpc.stubs.GetCompteByIdResponse> getCompteByIdMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetCompteByIdRequest, ma.projet.grpc.stubs.GetCompteByIdResponse> getCompteByIdMethod;
    if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
          CompteServiceGrpc.getCompteByIdMethod = getCompteByIdMethod =
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetCompteByIdRequest, ma.projet.grpc.stubs.GetCompteByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetCompteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetCompteByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("CompteById"))
              .build();
        }
      }
    }
    return getCompteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetTotalSoldeRequest,
      ma.projet.grpc.stubs.GetTotalSoldeResponse> getTotalSoldeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalSolde",
      requestType = ma.projet.grpc.stubs.GetTotalSoldeRequest.class,
      responseType = ma.projet.grpc.stubs.GetTotalSoldeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetTotalSoldeRequest,
      ma.projet.grpc.stubs.GetTotalSoldeResponse> getTotalSoldeMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetTotalSoldeRequest, ma.projet.grpc.stubs.GetTotalSoldeResponse> getTotalSoldeMethod;
    if ((getTotalSoldeMethod = CompteServiceGrpc.getTotalSoldeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getTotalSoldeMethod = CompteServiceGrpc.getTotalSoldeMethod) == null) {
          CompteServiceGrpc.getTotalSoldeMethod = getTotalSoldeMethod =
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetTotalSoldeRequest, ma.projet.grpc.stubs.GetTotalSoldeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalSolde"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetTotalSoldeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetTotalSoldeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("TotalSolde"))
              .build();
        }
      }
    }
    return getTotalSoldeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.SaveCompteRequest,
      ma.projet.grpc.stubs.SaveCompteResponse> getSaveCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveCompte",
      requestType = ma.projet.grpc.stubs.SaveCompteRequest.class,
      responseType = ma.projet.grpc.stubs.SaveCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.SaveCompteRequest,
      ma.projet.grpc.stubs.SaveCompteResponse> getSaveCompteMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.SaveCompteRequest, ma.projet.grpc.stubs.SaveCompteResponse> getSaveCompteMethod;
    if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
          CompteServiceGrpc.getSaveCompteMethod = getSaveCompteMethod =
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.SaveCompteRequest, ma.projet.grpc.stubs.SaveCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.SaveCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.SaveCompteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("SaveCompte"))
              .build();
        }
      }
    }
    return getSaveCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.DeleteCompteRequest,
      ma.projet.grpc.stubs.DeleteCompteResponse> getDeleteCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCompte",
      requestType = ma.projet.grpc.stubs.DeleteCompteRequest.class,
      responseType = ma.projet.grpc.stubs.DeleteCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.DeleteCompteRequest,
      ma.projet.grpc.stubs.DeleteCompteResponse> getDeleteCompteMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.DeleteCompteRequest, ma.projet.grpc.stubs.DeleteCompteResponse> getDeleteCompteMethod;
    if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
          CompteServiceGrpc.getDeleteCompteMethod = getDeleteCompteMethod =
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.DeleteCompteRequest, ma.projet.grpc.stubs.DeleteCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.DeleteCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.DeleteCompteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("DeleteCompte"))
              .build();
        }
      }
    }
    return getDeleteCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetComptesByTypeRequest,
      ma.projet.grpc.stubs.GetComptesByTypeResponse> getGetComptesByTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComptesByType",
      requestType = ma.projet.grpc.stubs.GetComptesByTypeRequest.class,
      responseType = ma.projet.grpc.stubs.GetComptesByTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetComptesByTypeRequest,
      ma.projet.grpc.stubs.GetComptesByTypeResponse> getGetComptesByTypeMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetComptesByTypeRequest, ma.projet.grpc.stubs.GetComptesByTypeResponse> getGetComptesByTypeMethod;
    if ((getGetComptesByTypeMethod = CompteServiceGrpc.getGetComptesByTypeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetComptesByTypeMethod = CompteServiceGrpc.getGetComptesByTypeMethod) == null) {
          CompteServiceGrpc.getGetComptesByTypeMethod = getGetComptesByTypeMethod =
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetComptesByTypeRequest, ma.projet.grpc.stubs.GetComptesByTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetComptesByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetComptesByTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetComptesByTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("GetComptesByType"))
              .build();
        }
      }
    }
    return getGetComptesByTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompteServiceStub>() {
        @java.lang.Override
        public CompteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompteServiceStub(channel, callOptions);
        }
      };
    return CompteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompteServiceBlockingStub>() {
        @java.lang.Override
        public CompteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompteServiceBlockingStub(channel, callOptions);
        }
      };
    return CompteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CompteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CompteServiceFutureStub>() {
        @java.lang.Override
        public CompteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CompteServiceFutureStub(channel, callOptions);
        }
      };
    return CompteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void searchComptesByDate(ma.projet.grpc.stubs.SearchComptesByDateRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.SearchComptesByDateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchComptesByDateMethod(), responseObserver);
    }

    /**
     */
    default void getSummary(ma.projet.grpc.stubs.GetSummaryRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetSummaryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSummaryMethod(), responseObserver);
    }

    /**
     */
    default void allComptes(ma.projet.grpc.stubs.GetAllComptesRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetAllComptesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllComptesMethod(), responseObserver);
    }

    /**
     */
    default void compteById(ma.projet.grpc.stubs.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetCompteByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompteByIdMethod(), responseObserver);
    }

    /**
     */
    default void totalSolde(ma.projet.grpc.stubs.GetTotalSoldeRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetTotalSoldeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalSoldeMethod(), responseObserver);
    }

    /**
     */
    default void saveCompte(ma.projet.grpc.stubs.SaveCompteRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.SaveCompteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveCompteMethod(), responseObserver);
    }

    /**
     */
    default void deleteCompte(ma.projet.grpc.stubs.DeleteCompteRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.DeleteCompteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCompteMethod(), responseObserver);
    }

    /**
     */
    default void getComptesByType(ma.projet.grpc.stubs.GetComptesByTypeRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetComptesByTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetComptesByTypeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CompteService.
   */
  public static abstract class CompteServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CompteServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CompteService.
   */
  public static final class CompteServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CompteServiceStub> {
    private CompteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompteServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchComptesByDate(ma.projet.grpc.stubs.SearchComptesByDateRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.SearchComptesByDateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchComptesByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSummary(ma.projet.grpc.stubs.GetSummaryRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetSummaryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allComptes(ma.projet.grpc.stubs.GetAllComptesRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetAllComptesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void compteById(ma.projet.grpc.stubs.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetCompteByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalSolde(ma.projet.grpc.stubs.GetTotalSoldeRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetTotalSoldeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalSoldeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCompte(ma.projet.grpc.stubs.SaveCompteRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.SaveCompteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCompte(ma.projet.grpc.stubs.DeleteCompteRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.DeleteCompteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getComptesByType(ma.projet.grpc.stubs.GetComptesByTypeRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetComptesByTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetComptesByTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CompteService.
   */
  public static final class CompteServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CompteServiceBlockingStub> {
    private CompteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.projet.grpc.stubs.SearchComptesByDateResponse searchComptesByDate(ma.projet.grpc.stubs.SearchComptesByDateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchComptesByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.grpc.stubs.GetSummaryResponse getSummary(ma.projet.grpc.stubs.GetSummaryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSummaryMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.grpc.stubs.GetAllComptesResponse allComptes(ma.projet.grpc.stubs.GetAllComptesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllComptesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.grpc.stubs.GetCompteByIdResponse compteById(ma.projet.grpc.stubs.GetCompteByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.grpc.stubs.GetTotalSoldeResponse totalSolde(ma.projet.grpc.stubs.GetTotalSoldeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalSoldeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.grpc.stubs.SaveCompteResponse saveCompte(ma.projet.grpc.stubs.SaveCompteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveCompteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.grpc.stubs.DeleteCompteResponse deleteCompte(ma.projet.grpc.stubs.DeleteCompteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCompteMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.grpc.stubs.GetComptesByTypeResponse getComptesByType(ma.projet.grpc.stubs.GetComptesByTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetComptesByTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CompteService.
   */
  public static final class CompteServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CompteServiceFutureStub> {
    private CompteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CompteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.SearchComptesByDateResponse> searchComptesByDate(
        ma.projet.grpc.stubs.SearchComptesByDateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchComptesByDateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetSummaryResponse> getSummary(
        ma.projet.grpc.stubs.GetSummaryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSummaryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetAllComptesResponse> allComptes(
        ma.projet.grpc.stubs.GetAllComptesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetCompteByIdResponse> compteById(
        ma.projet.grpc.stubs.GetCompteByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetTotalSoldeResponse> totalSolde(
        ma.projet.grpc.stubs.GetTotalSoldeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalSoldeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.SaveCompteResponse> saveCompte(
        ma.projet.grpc.stubs.SaveCompteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.DeleteCompteResponse> deleteCompte(
        ma.projet.grpc.stubs.DeleteCompteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetComptesByTypeResponse> getComptesByType(
        ma.projet.grpc.stubs.GetComptesByTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetComptesByTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_COMPTES_BY_DATE = 0;
  private static final int METHODID_GET_SUMMARY = 1;
  private static final int METHODID_ALL_COMPTES = 2;
  private static final int METHODID_COMPTE_BY_ID = 3;
  private static final int METHODID_TOTAL_SOLDE = 4;
  private static final int METHODID_SAVE_COMPTE = 5;
  private static final int METHODID_DELETE_COMPTE = 6;
  private static final int METHODID_GET_COMPTES_BY_TYPE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_COMPTES_BY_DATE:
          serviceImpl.searchComptesByDate((ma.projet.grpc.stubs.SearchComptesByDateRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.SearchComptesByDateResponse>) responseObserver);
          break;
        case METHODID_GET_SUMMARY:
          serviceImpl.getSummary((ma.projet.grpc.stubs.GetSummaryRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetSummaryResponse>) responseObserver);
          break;
        case METHODID_ALL_COMPTES:
          serviceImpl.allComptes((ma.projet.grpc.stubs.GetAllComptesRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetAllComptesResponse>) responseObserver);
          break;
        case METHODID_COMPTE_BY_ID:
          serviceImpl.compteById((ma.projet.grpc.stubs.GetCompteByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetCompteByIdResponse>) responseObserver);
          break;
        case METHODID_TOTAL_SOLDE:
          serviceImpl.totalSolde((ma.projet.grpc.stubs.GetTotalSoldeRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetTotalSoldeResponse>) responseObserver);
          break;
        case METHODID_SAVE_COMPTE:
          serviceImpl.saveCompte((ma.projet.grpc.stubs.SaveCompteRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.SaveCompteResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMPTE:
          serviceImpl.deleteCompte((ma.projet.grpc.stubs.DeleteCompteRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.DeleteCompteResponse>) responseObserver);
          break;
        case METHODID_GET_COMPTES_BY_TYPE:
          serviceImpl.getComptesByType((ma.projet.grpc.stubs.GetComptesByTypeRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetComptesByTypeResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSearchComptesByDateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.projet.grpc.stubs.SearchComptesByDateRequest,
              ma.projet.grpc.stubs.SearchComptesByDateResponse>(
                service, METHODID_SEARCH_COMPTES_BY_DATE)))
        .addMethod(
          getGetSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.projet.grpc.stubs.GetSummaryRequest,
              ma.projet.grpc.stubs.GetSummaryResponse>(
                service, METHODID_GET_SUMMARY)))
        .addMethod(
          getAllComptesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.projet.grpc.stubs.GetAllComptesRequest,
              ma.projet.grpc.stubs.GetAllComptesResponse>(
                service, METHODID_ALL_COMPTES)))
        .addMethod(
          getCompteByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.projet.grpc.stubs.GetCompteByIdRequest,
              ma.projet.grpc.stubs.GetCompteByIdResponse>(
                service, METHODID_COMPTE_BY_ID)))
        .addMethod(
          getTotalSoldeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.projet.grpc.stubs.GetTotalSoldeRequest,
              ma.projet.grpc.stubs.GetTotalSoldeResponse>(
                service, METHODID_TOTAL_SOLDE)))
        .addMethod(
          getSaveCompteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.projet.grpc.stubs.SaveCompteRequest,
              ma.projet.grpc.stubs.SaveCompteResponse>(
                service, METHODID_SAVE_COMPTE)))
        .addMethod(
          getDeleteCompteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.projet.grpc.stubs.DeleteCompteRequest,
              ma.projet.grpc.stubs.DeleteCompteResponse>(
                service, METHODID_DELETE_COMPTE)))
        .addMethod(
          getGetComptesByTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.projet.grpc.stubs.GetComptesByTypeRequest,
              ma.projet.grpc.stubs.GetComptesByTypeResponse>(
                service, METHODID_GET_COMPTES_BY_TYPE)))
        .build();
  }

  private static abstract class CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.projet.grpc.stubs.CompteServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompteService");
    }
  }

  private static final class CompteServiceFileDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier {
    CompteServiceFileDescriptorSupplier() {}
  }

  private static final class CompteServiceMethodDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CompteServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CompteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteServiceFileDescriptorSupplier())
              .addMethod(getSearchComptesByDateMethod())
              .addMethod(getGetSummaryMethod())
              .addMethod(getAllComptesMethod())
              .addMethod(getCompteByIdMethod())
              .addMethod(getTotalSoldeMethod())
              .addMethod(getSaveCompteMethod())
              .addMethod(getDeleteCompteMethod())
              .addMethod(getGetComptesByTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
