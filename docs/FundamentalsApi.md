# FundamentalsApi

All URIs are relative to *https://api.equibles.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dividends**](FundamentalsApi.md#dividends) | **GET** /stocks/fundamentals/dividends | Get the dividends for a given stock.
[**financialReports**](FundamentalsApi.md#financialReports) | **GET** /stocks/fundamentals/financialreports | Get the financial statements for a given stock.

<a name="dividends"></a>
# **dividends**
> DividendsResponse dividends(fullTicker, page, pageSize)

Get the dividends for a given stock.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.FundamentalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

FundamentalsApi apiInstance = new FundamentalsApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock. Example: AAPL.XNAS
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 1000; // Integer | The number of elements in each page. Max value: 1000.
try {
    DividendsResponse result = apiInstance.dividends(fullTicker, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundamentalsApi#dividends");
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

[**DividendsResponse**](DividendsResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="financialReports"></a>
# **financialReports**
> FundamentalsResponse financialReports(fullTicker, year, fiscalPeriod, page, pageSize)

Get the financial statements for a given stock.

Returns a list of fully qualified ticker names. A fully qualified ticker has the following structure: [Ticker].[ExchangeMic] Example: AAPL.XNAS.

### Example
```java
// Import classes:
//import com.equibles.stocks.ApiClient;
//import com.equibles.stocks.ApiException;
//import com.equibles.stocks.Configuration;
//import com.equibles.stocks.auth.*;
//import com.equibles.stocks.api.FundamentalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Query String
ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
Query String.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Query String.setApiKeyPrefix("Token");

FundamentalsApi apiInstance = new FundamentalsApi();
String fullTicker = "fullTicker_example"; // String | The fully qualified ticker of the stock. Example: AAPL.XNAS
Integer year = 56; // Integer | The year of the report.
FiscalPeriod fiscalPeriod = new FiscalPeriod(); // FiscalPeriod | The fiscal period of the report.
Integer page = 1; // Integer | The number of the page to request.
Integer pageSize = 50; // Integer | The number of elements in each page. Max value: 50.
try {
    FundamentalsResponse result = apiInstance.financialReports(fullTicker, year, fiscalPeriod, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundamentalsApi#financialReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullTicker** | **String**| The fully qualified ticker of the stock. Example: AAPL.XNAS |
 **year** | **Integer**| The year of the report. |
 **fiscalPeriod** | [**FiscalPeriod**](.md)| The fiscal period of the report. |
 **page** | **Integer**| The number of the page to request. | [optional] [default to 1]
 **pageSize** | **Integer**| The number of elements in each page. Max value: 50. | [optional] [default to 50]

### Return type

[**FundamentalsResponse**](FundamentalsResponse.md)

### Authorization

[Query String](../README.md#Query String)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

