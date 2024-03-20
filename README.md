<div align="center">

[![Visit Visier](./header.png)](https://visier.com)

# [Visier](https://visier.com)

Visier APIs for generating authentication tokens

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Visier&serviceName=Authentication&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>visier-authentication-java-sdk</artifactId>
  <version>22222222.99201.1200</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:visier-authentication-java-sdk:22222222.99201.1200"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/visier-authentication-java-sdk-22222222.99201.1200.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierAuthentication;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    VisierAuthentication client = new VisierAuthentication(configuration);
    String username = "username_example";
    String password = "password_example";
    try {
      String result = client
              .authentication
              .aSIDTokenAuthentication()
              .username(username)
              .password(password)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#aSIDTokenAuthentication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .authentication
              .aSIDTokenAuthentication()
              .username(username)
              .password(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#aSIDTokenAuthentication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://vanity.api.visier.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**aSIDTokenAuthentication**](docs/AuthenticationApi.md#aSIDTokenAuthentication) | **POST** /v1/admin/visierSecureToken | 
*AuthenticationApi* | [**oAuth2Authorize**](docs/AuthenticationApi.md#oAuth2Authorize) | **GET** /v1/auth/oauth2/authorize | 
*AuthenticationApi* | [**oAuth2Token**](docs/AuthenticationApi.md#oAuth2Token) | **POST** /v1/auth/oauth2/token | 
*AuthenticationApi* | [**ticketAuthentication**](docs/AuthenticationApi.md#ticketAuthentication) | **POST** /v1/admin/visierSecureTicket | 


## Documentation for Models

 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [Status](docs/Status.md)
 - [TokenRequestBody](docs/TokenRequestBody.md)
 - [TokenResponse](docs/TokenResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
