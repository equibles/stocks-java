# PerformanceApi

All URIs are relative to *https://api.equibles.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](PerformanceApi.md#list) | **GET** /stocks/performance/list | Lists the performance for a given stock.

<a name="list"></a>
# **list**
> PerformanceResponse list(fullTicker)

Lists the performance for a given stock.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.PerformanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

PerformanceApi apiInstance = new PerformanceApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock. Example: AAPL.XNAS
try {
    PerformanceResponse result = apiInstance.list(fullTicker);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullTicker** | **String**| The fully qualified ticker of the stock. Example: AAPL.XNAS |

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

