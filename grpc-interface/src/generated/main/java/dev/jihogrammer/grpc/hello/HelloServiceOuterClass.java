// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package dev.jihogrammer.grpc.hello;

public final class HelloServiceOuterClass {
  private HelloServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HelloService.proto\"\034\n\014HelloRequest\022\014\n\004" +
      "name\030\001 \001(\t\" \n\rHelloResponse\022\017\n\007message\030\001" +
      " \001(\t26\n\014HelloService\022&\n\005hello\022\r.HelloReq" +
      "uest\032\016.HelloResponseB\036\n\032dev.jihogrammer." +
      "grpc.helloP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}