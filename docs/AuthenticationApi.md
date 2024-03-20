# AuthenticationApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aSIDTokenAuthentication**](AuthenticationApi.md#aSIDTokenAuthentication) | **POST** /v1/admin/visierSecureToken |  |
| [**oAuth2Authorize**](AuthenticationApi.md#oAuth2Authorize) | **GET** /v1/auth/oauth2/authorize |  |
| [**oAuth2Token**](AuthenticationApi.md#oAuth2Token) | **POST** /v1/auth/oauth2/token |  |
| [**ticketAuthentication**](AuthenticationApi.md#ticketAuthentication) | **POST** /v1/admin/visierSecureTicket |  |


<a name="aSIDTokenAuthentication"></a>
# **aSIDTokenAuthentication**
> String aSIDTokenAuthentication(authenticationRequest).username(username).password(password).execute();



Generate a Visier authentication token

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticationRequest** | [**AuthenticationRequest**](AuthenticationRequest.md)| Authentication token request body | |
| **username** | **String**|  | [optional] |
| **password** | **String**|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authentication token response |  -  |
| **0** | Default error response |  -  |

<a name="oAuth2Authorize"></a>
# **oAuth2Authorize**
> Status oAuth2Authorize(responseType, clientId).redirectUri(redirectUri).scope(scope).execute();



Initiate an OAuth2 authorization code flow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierAuthentication;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    VisierAuthentication client = new VisierAuthentication(configuration);
    String responseType = "responseType_example"; // The response type. Must be `code`.
    String clientId = "clientId_example"; // The ID of the pre-registered client application.
    String redirectUri = "redirectUri_example"; // The optional URI to redirect to after authorization.
    String scope = "scope_example"; // The OAuth 2.0 scope of the authorization request. Defaults to `read`.
    try {
      Status result = client
              .authentication
              .oAuth2Authorize(responseType, clientId)
              .redirectUri(redirectUri)
              .scope(scope)
              .execute();
      System.out.println(result);
      System.out.println(result.getCode());
      System.out.println(result.getMessage());
      System.out.println(result.getDetails());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#oAuth2Authorize");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Status> response = client
              .authentication
              .oAuth2Authorize(responseType, clientId)
              .redirectUri(redirectUri)
              .scope(scope)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#oAuth2Authorize");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseType** | **String**| The response type. Must be &#x60;code&#x60;. | |
| **clientId** | **String**| The ID of the pre-registered client application. | |
| **redirectUri** | **String**| The optional URI to redirect to after authorization. | [optional] |
| **scope** | **String**| The OAuth 2.0 scope of the authorization request. Defaults to &#x60;read&#x60;. | [optional] |

### Return type

[**Status**](Status.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **3XX** | Redirect to authorization page. |  -  |
| **0** | Default error response |  -  |

<a name="oAuth2Token"></a>
# **oAuth2Token**
> String oAuth2Token(tokenRequestBody).grantType(grantType).clientId(clientId).redirectUri(redirectUri).code(code).username(username).password(password).asidToken(asidToken).execute();



Generate a JSON Web Token (JWT) for the specified user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierAuthentication;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP basic authorization: BasicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    VisierAuthentication client = new VisierAuthentication(configuration);
    String grantType = "grantType_example"; // The grant type. Supported values: - `authorization_code`: The authorization code grant type. - `password`: The password grant type. - `urn:visier:params:oauth:grant-type:asid-token`: The ASID token grant type.
    String clientId = "clientId_example"; // The ID of the pre-registered client application.
    String redirectUri = "redirectUri_example"; // The optional URI to redirect to after authorization.
    String code = "code_example"; // The authorization code. Applicable only for authorization code grant type.
    String username = "username_example"; // The username of the user to authenticate. Applicable only for password grant type.
    String password = "password_example"; // The password of the user to authenticate. Applicable only for password grant type.
    String asidToken = "asidToken_example"; // The ASID token. Applicable only for ASID token grant type.
    try {
      String result = client
              .authentication
              .oAuth2Token()
              .grantType(grantType)
              .clientId(clientId)
              .redirectUri(redirectUri)
              .code(code)
              .username(username)
              .password(password)
              .asidToken(asidToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#oAuth2Token");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .authentication
              .oAuth2Token()
              .grantType(grantType)
              .clientId(clientId)
              .redirectUri(redirectUri)
              .code(code)
              .username(username)
              .password(password)
              .asidToken(asidToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#oAuth2Token");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tokenRequestBody** | [**TokenRequestBody**](TokenRequestBody.md)|  | |
| **grantType** | **String**| The grant type. Supported values: - &#x60;authorization_code&#x60;: The authorization code grant type. - &#x60;password&#x60;: The password grant type. - &#x60;urn:visier:params:oauth:grant-type:asid-token&#x60;: The ASID token grant type. | [optional] |
| **clientId** | **String**| The ID of the pre-registered client application. | [optional] |
| **redirectUri** | **String**| The optional URI to redirect to after authorization. | [optional] |
| **code** | **String**| The authorization code. Applicable only for authorization code grant type. | [optional] |
| **username** | **String**| The username of the user to authenticate. Applicable only for password grant type. | [optional] |
| **password** | **String**| The password of the user to authenticate. Applicable only for password grant type. | [optional] |
| **asidToken** | **String**| The ASID token. Applicable only for ASID token grant type. | [optional] |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/jwt

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JWT response |  -  |
| **0** | Default error response |  -  |

<a name="ticketAuthentication"></a>
# **ticketAuthentication**
> String ticketAuthentication(authenticationRequest).username(username).password(password).execute();



Generate a legacy Visier secure ticket

### Example
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
              .ticketAuthentication()
              .username(username)
              .password(password)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#ticketAuthentication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .authentication
              .ticketAuthentication()
              .username(username)
              .password(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#ticketAuthentication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticationRequest** | [**AuthenticationRequest**](AuthenticationRequest.md)| Secure ticket request body | |
| **username** | **String**|  | [optional] |
| **password** | **String**|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secure ticket response |  -  |
| **0** | Default error response |  -  |

