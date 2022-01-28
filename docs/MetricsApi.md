# MetricsApi

All URIs are relative to *https://api.equibles.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**priceToEarnings**](MetricsApi.md#priceToEarnings) | **GET** /stocks/metrics/pricetoearnings | Get the price to earnings ratio over time for this stock.

<a name="priceToEarnings"></a>
# **priceToEarnings**
> MetricNullablePointsResponse priceToEarnings(fullTicker, page, pageSize)

Get the price to earnings ratio over time for this stock.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

MetricsApi apiInstance = new MetricsApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock. Example: AAPL.XNAS
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 1000; // Integer | The number of elements in each page. Max value: 1000.
try {
    MetricNullablePointsResponse result = apiInstance.priceToEarnings(fullTicker, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#priceToEarnings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullTicker** | **String**| The fully qualified ticker of the stock. Example: AAPL.XNAS |
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 1000. | [optional] [default to 1000]

### Return type

[**MetricNullablePointsResponse**](MetricNullablePointsResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

