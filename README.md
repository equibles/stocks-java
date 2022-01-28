# equibles-stocks

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.equibles.stocks</groupId>
  <artifactId>equibles-stocks</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.equibles.stocks:equibles-stocks:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/equibles-stocks-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.equibles.stocks.*;
import com.equibles.stocks.auth.*;
import com.equibles.stocks.models.*;
import com.equibles.stocks.api.ExchangesApi;

import java.io.File;
import java.util.*;

public class ExchangesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: Query String
        ApiKeyAuth Query String = (ApiKeyAuth) defaultClient.getAuthentication("Query String");
        Query String.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Query String.setApiKeyPrefix("Token");

        ExchangesApi apiInstance = new ExchangesApi();
        try {
            CurrenciesResponse result = apiInstance.currencies();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangesApi#currencies");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.equibles.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ExchangesApi* | [**currencies**](docs/ExchangesApi.md#currencies) | **GET** /stocks/exchanges/currencies | Get the list of all the currencies supported by this API.
*ExchangesApi* | [**list**](docs/ExchangesApi.md#list) | **GET** /stocks/exchanges/list | Get the list of all the exchanges supported by this API.
*ExchangesApi* | [**stocks**](docs/ExchangesApi.md#stocks) | **GET** /stocks/exchanges/stocks | Get all the stocks for a given exchange.
*FundamentalsApi* | [**dividends**](docs/FundamentalsApi.md#dividends) | **GET** /stocks/fundamentals/dividends | Get the dividends for a given stock.
*FundamentalsApi* | [**financialReports**](docs/FundamentalsApi.md#financialReports) | **GET** /stocks/fundamentals/financialreports | Get the financial statements for a given stock.
*MetricsApi* | [**priceToEarnings**](docs/MetricsApi.md#priceToEarnings) | **GET** /stocks/metrics/pricetoearnings | Get the price to earnings ratio over time for this stock.
*NewsApi* | [**list**](docs/NewsApi.md#list) | **GET** /stocks/news/list | Get the latest news for this stock.
*NewsApi* | [**publishers**](docs/NewsApi.md#publishers) | **GET** /stocks/news/publishers | Get all the available news publishers.
*PerformanceApi* | [**list**](docs/PerformanceApi.md#list) | **GET** /stocks/performance/list | Lists the performance for a given stock.
*PricesApi* | [**endOfDay**](docs/PricesApi.md#endOfDay) | **GET** /stocks/prices/endofday | Lists the end of day prices for a given stock.
*SectorsApi* | [**list**](docs/SectorsApi.md#list) | **GET** /stocks/sectors/list | Lists all the sectors.
*SectorsApi* | [**searchStocks**](docs/SectorsApi.md#searchStocks) | **GET** /stocks/sectors/searchstocks | Lists and the stock in a given sector/industry.
*StocksApi* | [**list**](docs/StocksApi.md#list) | **GET** /stocks/list | Get a list of all the available stocks.
*StocksApi* | [**officers**](docs/StocksApi.md#officers) | **GET** /stocks/officers | Get the officers of the company.
*StocksApi* | [**profile**](docs/StocksApi.md#profile) | **GET** /stocks/profile | The profile of this stock.
*StocksApi* | [**screener**](docs/StocksApi.md#screener) | **POST** /stocks/screener | Get a list of stocks constraint to several criteria.
*StocksApi* | [**search**](docs/StocksApi.md#search) | **GET** /stocks/search | Search among all the available stocks.
*StocksApi* | [**splits**](docs/StocksApi.md#splits) | **GET** /stocks/splits | Get all the splits for a given stock.
*TransactionsApi* | [**insiders**](docs/TransactionsApi.md#insiders) | **GET** /stocks/transactions/insiders | Lists the insider transactions for a given stock.
*TransactionsApi* | [**institutional**](docs/TransactionsApi.md#institutional) | **GET** /stocks/transactions/institutional | Lists the institutional transactions for a given stock.

## Documentation for Models

 - [AssetType](docs/AssetType.md)
 - [BalanceSheet](docs/BalanceSheet.md)
 - [CashFlowStatement](docs/CashFlowStatement.md)
 - [CommonStock](docs/CommonStock.md)
 - [CommonStockResponse](docs/CommonStockResponse.md)
 - [CommonStocksResponse](docs/CommonStocksResponse.md)
 - [CurrenciesResponse](docs/CurrenciesResponse.md)
 - [Currency](docs/Currency.md)
 - [Dividend](docs/Dividend.md)
 - [DividendsResponse](docs/DividendsResponse.md)
 - [Exchange](docs/Exchange.md)
 - [ExchangesResponse](docs/ExchangesResponse.md)
 - [FinancialAssetsResponse](docs/FinancialAssetsResponse.md)
 - [FinancialReport](docs/FinancialReport.md)
 - [FiscalPeriod](docs/FiscalPeriod.md)
 - [FundamentalsResponse](docs/FundamentalsResponse.md)
 - [Image](docs/Image.md)
 - [IncomeStatement](docs/IncomeStatement.md)
 - [Industry](docs/Industry.md)
 - [MetricNullablePointsResponse](docs/MetricNullablePointsResponse.md)
 - [News](docs/News.md)
 - [NewsResponse](docs/NewsResponse.md)
 - [NullablePoint](docs/NullablePoint.md)
 - [Officer](docs/Officer.md)
 - [OfficersResponse](docs/OfficersResponse.md)
 - [Performance](docs/Performance.md)
 - [PerformanceResponse](docs/PerformanceResponse.md)
 - [Price](docs/Price.md)
 - [PricesResponse](docs/PricesResponse.md)
 - [Publisher](docs/Publisher.md)
 - [PublishersResponse](docs/PublishersResponse.md)
 - [Recommendation](docs/Recommendation.md)
 - [ResponseStatus](docs/ResponseStatus.md)
 - [ScreenerRequest](docs/ScreenerRequest.md)
 - [Sector](docs/Sector.md)
 - [SectorsResponse](docs/SectorsResponse.md)
 - [SplitsResponse](docs/SplitsResponse.md)
 - [StockSplit](docs/StockSplit.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionType](docs/TransactionType.md)
 - [TransactionsResponse](docs/TransactionsResponse.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### Query String

- **Type**: API key
- **API key parameter name**: ApiKey
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
[Equibles](https://www.equibles.com)\
equibles@gmail.com
