// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloWorld.proto

package com.testproject.grpc.echo;

public final class HelloWorld {
  private HelloWorld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_testproject_grpc_echo_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_testproject_grpc_echo_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_testproject_grpc_echo_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_testproject_grpc_echo_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_testproject_grpc_echo_Responses_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_testproject_grpc_echo_Responses_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_testproject_grpc_echo_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_testproject_grpc_echo_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_testproject_grpc_echo_Greeting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_testproject_grpc_echo_Greeting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_testproject_grpc_echo_Persons_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_testproject_grpc_echo_Persons_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020HelloWorld.proto\022\031com.testproject.grpc" +
      ".echo\"\033\n\007Address\022\020\n\010hostname\030\001 \001(\t\"0\n\010Re" +
      "sponse\022\016\n\006status\030\001 \001(\t\022\024\n\014responseTime\030\002" +
      " \001(\t\"C\n\tResponses\0226\n\taddresses\030\001 \003(\0132#.c" +
      "om.testproject.grpc.echo.Response\"/\n\006Per" +
      "son\022\022\n\nfirst_name\030\001 \001(\t\022\021\n\tlast_name\030\002 \001" +
      "(\t\"\033\n\010Greeting\022\017\n\007message\030\001 \001(\t\"=\n\007Perso" +
      "ns\0222\n\007persons\030\001 \003(\0132!.com.testproject.gr" +
      "pc.echo.Person2\220\002\n\017EchoTestService\022R\n\010sa" +
      "yHello\022!.com.testproject.grpc.echo.Perso" +
      "n\032#.com.testproject.grpc.echo.Greeting\022X" +
      "\n\rsayHelloToAll\022\".com.testproject.grpc.e" +
      "cho.Persons\032#.com.testproject.grpc.echo." +
      "Greeting\022O\n\004echo\022\".com.testproject.grpc." +
      "echo.Address\032#.com.testproject.grpc.echo" +
      ".Response2\312\001\n\024EchoTestServiceAsync\022Y\n\rsa" +
      "yHelloAsync\022!.com.testproject.grpc.echo." +
      "Person\032#.com.testproject.grpc.echo.Greet" +
      "ing(\001\022W\n\techoAsync\022\".com.testproject.grp" +
      "c.echo.Address\032$.com.testproject.grpc.ec" +
      "ho.Responses(\001B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_testproject_grpc_echo_Address_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_testproject_grpc_echo_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_testproject_grpc_echo_Address_descriptor,
        new java.lang.String[] { "Hostname", });
    internal_static_com_testproject_grpc_echo_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_testproject_grpc_echo_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_testproject_grpc_echo_Response_descriptor,
        new java.lang.String[] { "Status", "ResponseTime", });
    internal_static_com_testproject_grpc_echo_Responses_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_testproject_grpc_echo_Responses_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_testproject_grpc_echo_Responses_descriptor,
        new java.lang.String[] { "Addresses", });
    internal_static_com_testproject_grpc_echo_Person_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_testproject_grpc_echo_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_testproject_grpc_echo_Person_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_com_testproject_grpc_echo_Greeting_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_testproject_grpc_echo_Greeting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_testproject_grpc_echo_Greeting_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_testproject_grpc_echo_Persons_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_testproject_grpc_echo_Persons_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_testproject_grpc_echo_Persons_descriptor,
        new java.lang.String[] { "Persons", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}