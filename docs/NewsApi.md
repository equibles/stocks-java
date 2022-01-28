# NewsApi

All URIs are relative to *https://api.equibles.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](NewsApi.md#list) | **GET** /stocks/news/list | Get the latest news for this stock.
[**publishers**](NewsApi.md#publishers) | **GET** /stocks/news/publishers | Get all the available news publishers.

<a name="list"></a>
# **list**
> NewsResponse list(fullTicker, publisherName, page, pageSize)

Get the latest news for this stock.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.NewsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

NewsApi apiInstance = new NewsApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock used to filter the results. Example: AAPL.XNAS
String publisherName = "publisherName_example"; // String | A news publisher used to filter the results.
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 100; // Integer | The number of elements in each page. Max value: 500.
try {
    NewsResponse result = apiInstance.list(fullTicker, publisherName, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullTicker** | **String**| The fully qualified ticker of the stock used to filter the results. Example: AAPL.XNAS | [optional]
 **publisherName** | **String**| A news publisher used to filter the results. | [optional]
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 500. | [optional] [default to 100]

### Return type

[**NewsResponse**](NewsResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="publishers"></a>
# **publishers**
> PublishersResponse publishers(page, pageSize)

Get all the available news publishers.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.NewsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

NewsApi apiInstance = new NewsApi();
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 100; // Integer | The number of elements in each page. Max value: 1000.
try {
    PublishersResponse result = apiInstance.publishers(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#publishers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 1000. | [optional] [default to 100]

### Return type

[**PublishersResponse**](PublishersResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

