/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/apigeeregistry/v1/provisioning_service.proto

package com.google.cloud.apigeeregistry.v1;

public final class ProvisioningServiceProto {
  private ProvisioningServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_Instance_Config_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_Instance_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/apigeeregistry/v1/provisi"
          + "oning_service.proto\022\036google.cloud.apigee"
          + "registry.v1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032#google/longrunning/operations.pr"
          + "oto\032\037google/protobuf/timestamp.proto\"\255\001\n"
          + "\025CreateInstanceRequest\0229\n\006parent\030\001 \001(\tB)"
          + "\340A\002\372A#\n!locations.googleapis.com/Locatio"
          + "n\022\030\n\013instance_id\030\002 \001(\tB\003\340A\002\022?\n\010instance\030"
          + "\003 \001(\0132(.google.cloud.apigeeregistry.v1.I"
          + "nstanceB\003\340A\002\"U\n\025DeleteInstanceRequest\022<\n"
          + "\004name\030\001 \001(\tB.\340A\002\372A(\n&apigeeregistry.goog"
          + "leapis.com/Instance\"R\n\022GetInstanceReques"
          + "t\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n&apigeeregistry."
          + "googleapis.com/Instance\"\335\001\n\021OperationMet"
          + "adata\022/\n\013create_time\030\001 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022,\n\010end_time\030\002 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022\016\n\006target\030\003 \001(\t\022\014\n\004"
          + "verb\030\004 \001(\t\022\026\n\016status_message\030\005 \001(\t\022\036\n\026ca"
          + "ncellation_requested\030\006 \001(\010\022\023\n\013api_versio"
          + "n\030\007 \001(\t\"\302\004\n\010Instance\022\014\n\004name\030\001 \001(\t\0224\n\013cr"
          + "eate_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\022B\n\005state\030\004 \001(\0162.."
          + "google.cloud.apigeeregistry.v1.Instance."
          + "StateB\003\340A\003\022\032\n\rstate_message\030\005 \001(\tB\003\340A\003\022D"
          + "\n\006config\030\006 \001(\0132/.google.cloud.apigeeregi"
          + "stry.v1.Instance.ConfigB\003\340A\002\032;\n\006Config\022\025"
          + "\n\010location\030\001 \001(\tB\003\340A\003\022\032\n\rcmek_key_name\030\002"
          + " \001(\tB\003\340A\002\"n\n\005State\022\025\n\021STATE_UNSPECIFIED\020"
          + "\000\022\014\n\010INACTIVE\020\001\022\014\n\010CREATING\020\002\022\n\n\006ACTIVE\020"
          + "\003\022\014\n\010UPDATING\020\004\022\014\n\010DELETING\020\005\022\n\n\006FAILED\020"
          + "\006:i\352Af\n&apigeeregistry.googleapis.com/In"
          + "stance\022<projects/{project}/locations/{lo"
          + "cation}/instances/{instance}2\311\005\n\014Provisi"
          + "oning\022\345\001\n\016CreateInstance\0225.google.cloud."
          + "apigeeregistry.v1.CreateInstanceRequest\032"
          + "\035.google.longrunning.Operation\"}\202\323\344\223\0029\"-"
          + "/v1/{parent=projects/*/locations/*}/inst"
          + "ances:\010instance\332A\033parent,instance,instan"
          + "ce_id\312A\035\n\010Instance\022\021OperationMetadata\022\321\001"
          + "\n\016DeleteInstance\0225.google.cloud.apigeere"
          + "gistry.v1.DeleteInstanceRequest\032\035.google"
          + ".longrunning.Operation\"i\202\323\344\223\002/*-/v1/{nam"
          + "e=projects/*/locations/*/instances/*}\332A\004"
          + "name\312A*\n\025google.protobuf.Empty\022\021Operatio"
          + "nMetadata\022\251\001\n\013GetInstance\0222.google.cloud"
          + ".apigeeregistry.v1.GetInstanceRequest\032(."
          + "google.cloud.apigeeregistry.v1.Instance\""
          + "<\202\323\344\223\002/\022-/v1/{name=projects/*/locations/"
          + "*/instances/*}\332A\004name\032Q\312A\035apigeeregistry"
          + ".googleapis.com\322A.https://www.googleapis"
          + ".com/auth/cloud-platformB\362\001\n\"com.google."
          + "cloud.apigeeregistry.v1B\030ProvisioningSer"
          + "viceProtoP\001ZJcloud.google.com/go/apigeer"
          + "egistry/apiv1/apigeeregistrypb;apigeereg"
          + "istrypb\252\002\036Google.Cloud.ApigeeRegistry.V1"
          + "\312\002\036Google\\Cloud\\ApigeeRegistry\\V1\352\002!Goog"
          + "le::Cloud::ApigeeRegistry::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_apigeeregistry_v1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_apigeeregistry_v1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance",
            });
    internal_static_google_cloud_apigeeregistry_v1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_apigeeregistry_v1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_apigeeregistry_v1_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_apigeeregistry_v1_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_apigeeregistry_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_apigeeregistry_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "CancellationRequested",
              "ApiVersion",
            });
    internal_static_google_cloud_apigeeregistry_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_apigeeregistry_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "State", "StateMessage", "Config",
            });
    internal_static_google_cloud_apigeeregistry_v1_Instance_Config_descriptor =
        internal_static_google_cloud_apigeeregistry_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_apigeeregistry_v1_Instance_Config_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_Instance_Config_descriptor,
            new java.lang.String[] {
              "Location", "CmekKeyName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
