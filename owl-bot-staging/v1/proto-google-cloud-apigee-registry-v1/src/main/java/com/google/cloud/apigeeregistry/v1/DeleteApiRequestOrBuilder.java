// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

public interface DeleteApiRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.DeleteApiRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the API to delete.
   * Format: projects/&#42;&#47;locations/&#42;&#47;apis/&#42;
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the API to delete.
   * Format: projects/&#42;&#47;locations/&#42;&#47;apis/&#42;
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
