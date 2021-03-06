# Container

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Image** | **string** | Docker image name | [default to null]
**Env** | [**[]EnvVar**](EnvVar.md) | List of environment variables to set in the container. Cannot be updated. | [optional] [default to null]
**Resources** | [***ResourceRequirements**](ResourceRequirements.md) | Compute Resources required by this container. | [optional] [default to null]
**Commands** | [**[]Command**](Command.md) | List of container commands | [optional] [default to null]
**Servers** | [**[]Server**](Server.md) | List of container servers | [optional] [default to null]
**Volumes** | [**[]Volume**](Volume.md) | List of container volumes | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


