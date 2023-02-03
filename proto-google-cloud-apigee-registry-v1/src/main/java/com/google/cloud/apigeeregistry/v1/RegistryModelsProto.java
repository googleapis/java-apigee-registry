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
// source: google/cloud/apigeeregistry/v1/registry_models.proto

package com.google.cloud.apigeeregistry.v1;

public final class RegistryModelsProto {
  private RegistryModelsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_Api_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_Api_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_Api_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_Api_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_Api_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_Api_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_ApiVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_ApiVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_ApiVersion_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_ApiVersion_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_ApiVersion_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_ApiVersion_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_ApiSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_ApiSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_ApiSpec_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_ApiSpec_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_ApiSpec_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_ApiSpec_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_apigeeregistry_v1_Artifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_apigeeregistry_v1_Artifact_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/apigeeregistry/v1/registr"
          + "y_models.proto\022\036google.cloud.apigeeregis"
          + "try.v1\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032\037google/proto"
          + "buf/timestamp.proto\"\251\005\n\003Api\022\014\n\004name\030\001 \001("
          + "\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013description\030\003"
          + " \001(\t\0224\n\013create_time\030\004 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\0224\n\013update_time\030\005 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\022\024\n\014avai"
          + "lability\030\006 \001(\t\022J\n\023recommended_version\030\007 "
          + "\001(\tB-\372A*\n(apigeeregistry.googleapis.com/"
          + "ApiVersion\022P\n\026recommended_deployment\030\010 \001"
          + "(\tB0\372A-\n+apigeeregistry.googleapis.com/A"
          + "piDeployment\022?\n\006labels\030\t \003(\0132/.google.cl"
          + "oud.apigeeregistry.v1.Api.LabelsEntry\022I\n"
          + "\013annotations\030\n \003(\01324.google.cloud.apigee"
          + "registry.v1.Api.AnnotationsEntry\032-\n\013Labe"
          + "lsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032"
          + "2\n\020AnnotationsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu"
          + "e\030\002 \001(\t:\0028\001:Z\352AW\n!apigeeregistry.googlea"
          + "pis.com/Api\0222projects/{project}/location"
          + "s/{location}/apis/{api}\"\263\004\n\nApiVersion\022\014"
          + "\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013de"
          + "scription\030\003 \001(\t\0224\n\013create_time\030\004 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\0224\n\013update_"
          + "time\030\005 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\022\r\n\005state\030\006 \001(\t\022F\n\006labels\030\007 \003(\01326.goo"
          + "gle.cloud.apigeeregistry.v1.ApiVersion.L"
          + "abelsEntry\022P\n\013annotations\030\010 \003(\0132;.google"
          + ".cloud.apigeeregistry.v1.ApiVersion.Anno"
          + "tationsEntry\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\t:\0028\001\0322\n\020AnnotationsEntry\022"
          + "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:t\352Aq\n(ap"
          + "igeeregistry.googleapis.com/ApiVersion\022E"
          + "projects/{project}/locations/{location}/"
          + "apis/{api}/versions/{version}\"\360\005\n\007ApiSpe"
          + "c\022\014\n\004name\030\001 \001(\t\022\020\n\010filename\030\002 \001(\t\022\023\n\013des"
          + "cription\030\003 \001(\t\022\033\n\013revision_id\030\004 \001(\tB\006\340A\005"
          + "\340A\003\0224\n\013create_time\030\005 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\022=\n\024revision_create_tim"
          + "e\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\022=\n\024revision_update_time\030\007 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022\021\n\tmime_type\030\010 \001"
          + "(\t\022\027\n\nsize_bytes\030\t \001(\005B\003\340A\003\022\021\n\004hash\030\n \001("
          + "\tB\003\340A\003\022\022\n\nsource_uri\030\013 \001(\t\022\025\n\010contents\030\014"
          + " \001(\014B\003\340A\004\022C\n\006labels\030\016 \003(\01323.google.cloud"
          + ".apigeeregistry.v1.ApiSpec.LabelsEntry\022M"
          + "\n\013annotations\030\017 \003(\01328.google.cloud.apige"
          + "eregistry.v1.ApiSpec.AnnotationsEntry\032-\n"
          + "\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t"
          + ":\0028\001\0322\n\020AnnotationsEntry\022\013\n\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:~\352A{\n%apigeeregistry.go"
          + "ogleapis.com/ApiSpec\022Rprojects/{project}"
          + "/locations/{location}/apis/{api}/version"
          + "s/{version}/specs/{spec}\"\312\006\n\rApiDeployme"
          + "nt\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\023"
          + "\n\013description\030\003 \001(\t\022\033\n\013revision_id\030\004 \001(\t"
          + "B\006\340A\005\340A\003\0224\n\013create_time\030\005 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\022=\n\024revision_creat"
          + "e_time\030\006 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\022=\n\024revision_update_time\030\007 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\022E\n\021api_spec"
          + "_revision\030\010 \001(\tB*\372A\'\n%apigeeregistry.goo"
          + "gleapis.com/ApiSpec\022\024\n\014endpoint_uri\030\t \001("
          + "\t\022\034\n\024external_channel_uri\030\n \001(\t\022\031\n\021inten"
          + "ded_audience\030\013 \001(\t\022\027\n\017access_guidance\030\014 "
          + "\001(\t\022I\n\006labels\030\016 \003(\01329.google.cloud.apige"
          + "eregistry.v1.ApiDeployment.LabelsEntry\022S"
          + "\n\013annotations\030\017 \003(\0132>.google.cloud.apige"
          + "eregistry.v1.ApiDeployment.AnnotationsEn"
          + "try\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001\0322\n\020AnnotationsEntry\022\013\n\003key\030\001 "
          + "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:}\352Az\n+apigeeregis"
          + "try.googleapis.com/ApiDeployment\022Kprojec"
          + "ts/{project}/locations/{location}/apis/{"
          + "api}/deployments/{deployment}\"\267\005\n\010Artifa"
          + "ct\022\014\n\004name\030\001 \001(\t\0224\n\013create_time\030\002 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0224\n\013update"
          + "_time\030\003 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\022\021\n\tmime_type\030\004 \001(\t\022\027\n\nsize_bytes\030\005 "
          + "\001(\005B\003\340A\003\022\021\n\004hash\030\006 \001(\tB\003\340A\003\022\025\n\010contents\030"
          + "\007 \001(\014B\003\340A\004:\332\003\352A\326\003\n&apigeeregistry.google"
          + "apis.com/Artifact\022<projects/{project}/lo"
          + "cations/{location}/artifacts/{artifact}\022"
          + "Gprojects/{project}/locations/{location}"
          + "/apis/{api}/artifacts/{artifact}\022Zprojec"
          + "ts/{project}/locations/{location}/apis/{"
          + "api}/versions/{version}/artifacts/{artif"
          + "act}\022gprojects/{project}/locations/{loca"
          + "tion}/apis/{api}/versions/{version}/spec"
          + "s/{spec}/artifacts/{artifact}\022`projects/"
          + "{project}/locations/{location}/apis/{api"
          + "}/deployments/{deployment}/artifacts/{ar"
          + "tifact}B\355\001\n\"com.google.cloud.apigeeregis"
          + "try.v1B\023RegistryModelsProtoP\001ZJcloud.goo"
          + "gle.com/go/apigeeregistry/apiv1/apigeere"
          + "gistrypb;apigeeregistrypb\252\002\036Google.Cloud"
          + ".ApigeeRegistry.V1\312\002\036Google\\Cloud\\Apigee"
          + "Registry\\V1\352\002!Google::Cloud::ApigeeRegis"
          + "try::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_apigeeregistry_v1_Api_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_apigeeregistry_v1_Api_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_Api_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "CreateTime",
              "UpdateTime",
              "Availability",
              "RecommendedVersion",
              "RecommendedDeployment",
              "Labels",
              "Annotations",
            });
    internal_static_google_cloud_apigeeregistry_v1_Api_LabelsEntry_descriptor =
        internal_static_google_cloud_apigeeregistry_v1_Api_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_apigeeregistry_v1_Api_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_Api_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_apigeeregistry_v1_Api_AnnotationsEntry_descriptor =
        internal_static_google_cloud_apigeeregistry_v1_Api_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_apigeeregistry_v1_Api_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_Api_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_apigeeregistry_v1_ApiVersion_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_apigeeregistry_v1_ApiVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_ApiVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "CreateTime",
              "UpdateTime",
              "State",
              "Labels",
              "Annotations",
            });
    internal_static_google_cloud_apigeeregistry_v1_ApiVersion_LabelsEntry_descriptor =
        internal_static_google_cloud_apigeeregistry_v1_ApiVersion_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_apigeeregistry_v1_ApiVersion_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_ApiVersion_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_apigeeregistry_v1_ApiVersion_AnnotationsEntry_descriptor =
        internal_static_google_cloud_apigeeregistry_v1_ApiVersion_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_apigeeregistry_v1_ApiVersion_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_ApiVersion_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_apigeeregistry_v1_ApiSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_apigeeregistry_v1_ApiSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_ApiSpec_descriptor,
            new java.lang.String[] {
              "Name",
              "Filename",
              "Description",
              "RevisionId",
              "CreateTime",
              "RevisionCreateTime",
              "RevisionUpdateTime",
              "MimeType",
              "SizeBytes",
              "Hash",
              "SourceUri",
              "Contents",
              "Labels",
              "Annotations",
            });
    internal_static_google_cloud_apigeeregistry_v1_ApiSpec_LabelsEntry_descriptor =
        internal_static_google_cloud_apigeeregistry_v1_ApiSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_apigeeregistry_v1_ApiSpec_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_ApiSpec_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_apigeeregistry_v1_ApiSpec_AnnotationsEntry_descriptor =
        internal_static_google_cloud_apigeeregistry_v1_ApiSpec_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_apigeeregistry_v1_ApiSpec_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_ApiSpec_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "RevisionId",
              "CreateTime",
              "RevisionCreateTime",
              "RevisionUpdateTime",
              "ApiSpecRevision",
              "EndpointUri",
              "ExternalChannelUri",
              "IntendedAudience",
              "AccessGuidance",
              "Labels",
              "Annotations",
            });
    internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_LabelsEntry_descriptor =
        internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_AnnotationsEntry_descriptor =
        internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_ApiDeployment_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_apigeeregistry_v1_Artifact_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_apigeeregistry_v1_Artifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_apigeeregistry_v1_Artifact_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "MimeType", "SizeBytes", "Hash", "Contents",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}