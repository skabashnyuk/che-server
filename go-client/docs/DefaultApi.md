# \DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/skabashniuk/Che/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddCheService**](DefaultApi.md#AddCheService) | **Post** /service | Create a new CheService
[**AddFeature**](DefaultApi.md#AddFeature) | **Post** /feature | Create a new CheFeature
[**DeleteFeatureByNameAndVersion**](DefaultApi.md#DeleteFeatureByNameAndVersion) | **Delete** /feature/{name}/{version} | Removes CheFeature by name and version
[**DeleteServiceByNameAndVersion**](DefaultApi.md#DeleteServiceByNameAndVersion) | **Delete** /service/{name}/{version} | Removes CheService by name and version
[**GetServiceByIdList**](DefaultApi.md#GetServiceByIdList) | **Get** /service | Searches CheService by list of ids
[**GetServiceByNameAndVersion**](DefaultApi.md#GetServiceByNameAndVersion) | **Get** /service/{name}/{version} | Get CheService by name and version
[**SearchFeatureByListOfId**](DefaultApi.md#SearchFeatureByListOfId) | **Get** /feature | Searches CheFeature by list of ids
[**SearchFeatureByNameAndVersion**](DefaultApi.md#SearchFeatureByNameAndVersion) | **Get** /feature/{name}/{version} | Get CheFeature by name and version


# **AddCheService**
> CheService AddCheService(optional)
Create a new CheService

Create a new CheService

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cheServiceItem** | [**CheService**](CheService.md)| CheFeature item to add | 

### Return type

[**CheService**](CheService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-yaml
 - **Accept**: application/json, application/x-yaml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AddFeature**
> CheFeature AddFeature(optional)
Create a new CheFeature

Create a new CheFeature

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cheFeatureItem** | [**CheFeature**](CheFeature.md)| CheFeature item to add | 

### Return type

[**CheFeature**](CheFeature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-yaml
 - **Accept**: application/json, application/x-yaml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteFeatureByNameAndVersion**
> DeleteFeatureByNameAndVersion(name, version)
Removes CheFeature by name and version

Removes CheFeature by name and version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **name** | **string**| CheFeature name. | 
  **version** | **string**| CheFeature version. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-yaml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteServiceByNameAndVersion**
> DeleteServiceByNameAndVersion(name, version)
Removes CheService by name and version

Removes CheService by name and version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **name** | **string**| Service name. | 
  **version** | **string**| Service version. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-yaml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetServiceByIdList**
> []CheService GetServiceByIdList(id)
Searches CheService by list of ids

Searches  CheService by list of ids, example ?id=io.typefox.theia-ide.che-service:1.2.3&org.eclipse.che.svn:4.2.3

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **id** | [**[]string**](string.md)| list if CheService ids. | 

### Return type

[**[]CheService**](CheService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-yaml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetServiceByNameAndVersion**
> CheService GetServiceByNameAndVersion(name, version)
Get CheService by name and version

Get CheService by name and version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **name** | **string**| CheService name. | 
  **version** | **string**| CheService version. | 

### Return type

[**CheService**](CheService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-yaml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SearchFeatureByListOfId**
> []CheFeature SearchFeatureByListOfId(id)
Searches CheFeature by list of ids

Searches CheFeature by list of ids. For example, ?id=io.typefox.theia-ide.che-service:1.2.3&org.eclipse.che.svn:4.2

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **id** | [**[]string**](string.md)| list if CheService ids. | 

### Return type

[**[]CheFeature**](CheFeature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-yaml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SearchFeatureByNameAndVersion**
> CheFeature SearchFeatureByNameAndVersion(name, version)
Get CheFeature by name and version

Get CheFeature by name and version

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **name** | **string**| CheFeature name. | 
  **version** | **string**| CheFeature version. | 

### Return type

[**CheFeature**](CheFeature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-yaml, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

