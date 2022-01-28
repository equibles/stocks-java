# TransactionsApi

All URIs are relative to *https://api.equibles.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**insiders**](TransactionsApi.md#insiders) | **GET** /stocks/transactions/insiders | Lists the insider transactions for a given stock.
[**institutional**](TransactionsApi.md#institutional) | **GET** /stocks/transactions/institutional | Lists the institutional transactions for a given stock.

<a name="insiders"></a>
# **insiders**
> TransactionsResponse insiders(fullTicker, page, pageSize)

Lists the insider transactions for a given stock.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock. Example: AAPL.XNAS
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 1000; // Integer | The number of elements in each page. Max value: 1000.
try {
    TransactionsResponse result = apiInstance.insiders(fullTicker, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#insiders");
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

[**TransactionsResponse**](TransactionsResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="institutional"></a>
# **institutional**
> TransactionsResponse institutional(fullTicker, page, pageSize)

Lists the institutional transactions for a given stock.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock. Example: AAPL.XNAS
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 1000; // Integer | The number of elements in each page. Max value: 1000.
try {
    TransactionsResponse result = apiInstance.institutional(fullTicker, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#institutional");
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

[**TransactionsResponse**](TransactionsResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

