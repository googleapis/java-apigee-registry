/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.apigeeregistry.v1.samples;

// [START apigeeregistry_v1_generated_registryclient_listartifacts_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.apigeeregistry.v1.Artifact;
import com.google.cloud.apigeeregistry.v1.ListArtifactsRequest;
import com.google.cloud.apigeeregistry.v1.LocationName;
import com.google.cloud.apigeeregistry.v1.RegistryClient;

public class AsyncListArtifacts {

  public static void main(String[] args) throws Exception {
    asyncListArtifacts();
  }

  public static void asyncListArtifacts() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RegistryClient registryClient = RegistryClient.create()) {
      ListArtifactsRequest request =
          ListArtifactsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      ApiFuture<Artifact> future = registryClient.listArtifactsPagedCallable().futureCall(request);
      // Do something.
      for (Artifact element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END apigeeregistry_v1_generated_registryclient_listartifacts_async]
