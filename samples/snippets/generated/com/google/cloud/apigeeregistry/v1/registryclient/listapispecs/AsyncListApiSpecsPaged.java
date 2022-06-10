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

// [START apigeeregistry_v1_generated_registryclient_listapispecs_paged_async]
import com.google.cloud.apigeeregistry.v1.ApiSpec;
import com.google.cloud.apigeeregistry.v1.ApiVersionName;
import com.google.cloud.apigeeregistry.v1.ListApiSpecsRequest;
import com.google.cloud.apigeeregistry.v1.ListApiSpecsResponse;
import com.google.cloud.apigeeregistry.v1.RegistryClient;
import com.google.common.base.Strings;

public class AsyncListApiSpecsPaged {

  public static void main(String[] args) throws Exception {
    asyncListApiSpecsPaged();
  }

  public static void asyncListApiSpecsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RegistryClient registryClient = RegistryClient.create()) {
      ListApiSpecsRequest request =
          ListApiSpecsRequest.newBuilder()
              .setParent(
                  ApiVersionName.of("[PROJECT]", "[LOCATION]", "[API]", "[VERSION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      while (true) {
        ListApiSpecsResponse response = registryClient.listApiSpecsCallable().call(request);
        for (ApiSpec element : response.getApiSpecsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END apigeeregistry_v1_generated_registryclient_listapispecs_paged_async]
