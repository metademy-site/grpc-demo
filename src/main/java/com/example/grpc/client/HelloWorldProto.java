// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.example.grpc.client;

public final class HelloWorldProto {
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HelloRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HelloRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HelloReply_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HelloReply_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\020helloworld.proto\"\034\n\014HelloRequest\022\014\n\004na" +
                        "me\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007message\030\001 \001(\t2" +
                        "2\n\006Simple\022(\n\010SayHello\022\r.HelloRequest\032\013.H" +
                        "elloReply\"\000B,\n\027com.example.grpc.clientB\017" +
                        "HelloWorldProtoP\001b\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        });
        internal_static_HelloRequest_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_HelloRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_HelloRequest_descriptor,
                new java.lang.String[]{"Name",});
        internal_static_HelloReply_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_HelloReply_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_HelloReply_descriptor,
                new java.lang.String[]{"Message",});
    }
    private HelloWorldProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    // @@protoc_insertion_point(outer_class_scope)
}
