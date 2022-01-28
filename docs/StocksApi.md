# StocksApi

All URIs are relative to *https://api.equibles.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](StocksApi.md#list) | **GET** /stocks/list | Get a list of all the available stocks.
[**officers**](StocksApi.md#officers) | **GET** /stocks/officers | Get the officers of the company.
[**profile**](StocksApi.md#profile) | **GET** /stocks/profile | The profile of this stock.
[**screener**](StocksApi.md#screener) | **POST** /stocks/screener | Get a list of stocks constraint to several criteria.
[**search**](StocksApi.md#search) | **GET** /stocks/search | Search among all the available stocks.
[**splits**](StocksApi.md#splits) | **GET** /stocks/splits | Get all the splits for a given stock.

<a name="list"></a>
# **list**
> CommonStocksResponse list(page, pageSize)

Get a list of all the available stocks.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.StocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

StocksApi apiInstance = new StocksApi();
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 100; // Integer | The number of elements in each page. Max value: 100.
try {
    CommonStocksResponse result = apiInstance.list(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 100. | [optional] [default to 100]

### Return type

[**CommonStocksResponse**](CommonStocksResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="officers"></a>
# **officers**
> OfficersResponse officers(fullTicker)

Get the officers of the company.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.StocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

StocksApi apiInstance = new StocksApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock. Example: AAPL.XNAS
try {
    OfficersResponse result = apiInstance.officers(fullTicker);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#officers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullTicker** | **String**| The fully qualified ticker of the stock. Example: AAPL.XNAS |

### Return type

[**OfficersResponse**](OfficersResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="profile"></a>
# **profile**
> CommonStockResponse profile(fullTicker)

The profile of this stock.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.StocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

StocksApi apiInstance = new StocksApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock. Example: AAPL.XNAS
try {
    CommonStockResponse result = apiInstance.profile(fullTicker);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#profile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullTicker** | **String**| The fully qualified ticker of the stock. Example: AAPL.XNAS |

### Return type

[**CommonStockResponse**](CommonStockResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="screener"></a>
# **screener**
> CommonStocksResponse screener(body, page, pageSize)

Get a list of stocks constraint to several criteria.

Get a list of the stocks constraint to several criteria. You only need to fill the fields of ScreenerRequest that you want to use as filters.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.StocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

StocksApi apiInstance = new StocksApi();
ScreenerRequest body = new ScreenerRequest(); // ScreenerRequest | The criteria used to filter the search results. You only need to fill the fields that you want to use on the search.
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 100; // Integer | The number of elements in each page. Max value: 100.
try {
    CommonStocksResponse result = apiInstance.screener(body, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#screener");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScreenerRequest**](ScreenerRequest.md)| The criteria used to filter the search results. You only need to fill the fields that you want to use on the search. |
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 100. | [optional] [default to 100]

### Return type

[**CommonStocksResponse**](CommonStocksResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="search"></a>
# **search**
> CommonStocksResponse search(text, page, pageSize)

Search among all the available stocks.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.StocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

StocksApi apiInstance = new StocksApi();
String text = "text_example"; // String | The text to search for.
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 100; // Integer | The number of elements in each page. Max value: 100.
try {
    CommonStocksResponse result = apiInstance.search(text, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| The text to search for. |
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 100. | [optional] [default to 100]

### Return type

[**CommonStocksResponse**](CommonStocksResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="splits"></a>
# **splits**
> SplitsResponse splits(fullTicker, page, pageSize)

Get all the splits for a given stock.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.StocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

StocksApi apiInstance = new StocksApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock. Example: AAPL.XNAS
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 1000; // Integer | The number of elements in each page. Max value: 1000.
try {
    SplitsResponse result = apiInstance.splits(fullTicker, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#splits");
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

[**SplitsResponse**](SplitsResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

