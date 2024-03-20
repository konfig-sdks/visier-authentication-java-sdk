

# TokenRequestBody

Token request body definition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grantType** | **String** | The grant type. Supported values: - &#x60;authorization_code&#x60;: The authorization code grant type. - &#x60;password&#x60;: The password grant type. - &#x60;urn:visier:params:oauth:grant-type:asid-token&#x60;: The ASID token grant type. |  [optional] |
|**clientId** | **String** | The ID of the pre-registered client application. |  [optional] |
|**redirectUri** | **String** | The optional URI to redirect to after authorization. |  [optional] |
|**code** | **String** | The authorization code. Applicable only for authorization code grant type. |  [optional] |
|**username** | **String** | The username of the user to authenticate. Applicable only for password grant type. |  [optional] |
|**password** | **String** | The password of the user to authenticate. Applicable only for password grant type. |  [optional] |
|**asidToken** | **String** | The ASID token. Applicable only for ASID token grant type. |  [optional] |



