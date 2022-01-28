# SectorsApi

All URIs are relative to *https://api.equibles.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](SectorsApi.md#list) | **GET** /stocks/sectors/list | Lists all the sectors.
[**searchStocks**](SectorsApi.md#searchStocks) | **GET** /stocks/sectors/searchstocks | Lists and the stock in a given sector/industry.

<a name="list"></a>
# **list**
> SectorsResponse list()

Lists all the sectors.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.SectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

SectorsApi apiInstance = new SectorsApi();
try {
    SectorsResponse result = apiInstance.list();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SectorsApi#list");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SectorsResponse**](SectorsResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="searchStocks"></a>
# **searchStocks**
> FinancialAssetsResponse searchStocks(sectorName, industryName)

Lists and the stock in a given sector/industry.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.SectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

SectorsApi apiInstance = new SectorsApi();
String sectorName = "sectorName_example"; // String | The name of the sector to use as filter.
String industryName = "industryName_example"; // String | The name of the industry to use as filter.
try {
    FinancialAssetsResponse result = apiInstance.searchStocks(sectorName, industryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SectorsApi#searchStocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sectorName** | **String**| The name of the sector to use as filter. | [optional]
 **industryName** | **String**| The name of the industry to use as filter. | [optional]

### Return type

[**FinancialAssetsResponse**](FinancialAssetsResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

