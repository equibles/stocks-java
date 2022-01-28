/*
 * Stocks
 * <h3>Authentication</h3>                     You need to authenticate to use this API.                     To authenticate click on the \"Authorize\" button and do one of the following steps.<br />                     1. Send your API key in the headers of the request by typing \"Bearer my-key\" on the Bearer authorization scheme.<br />                     2. Send your API key on the \"ApiKey\" query string parameter. To do this type your API key in the Query String authorization scheme.<br />                     Both methods are equally valid. We offer both options so that you can use the method that is easier to use in your application.<br />                     <br />                     <h3>API limits</h3>                     Your API key may be subject to daily/hourly limits. To know how much requests you have left look at the following headers in the response.<br />                     1. <strong>x-ratelimit-limit</strong> - The total number of requests that you are allowed to make in a given period (hour/day)                       2. <strong>x-ratelimit-remaining</strong> - The number of remaining requests that you can perform in the current period.<br />                     3. <strong>x-ratelimit-reset</strong> - The number of seconds until the current period resets.<br />                     <br />                     <h3>Suggestions</h3>                     You don't need to implement the whole API by hand in your programming language of choice.<br />                     Since this API has an OpenAPI specification you can use                      <a href=\"https://github.com/swagger-api/swagger-codegen\" target=\"_blank\">Swagger Generator</a>                      to automatically generate client stubs for more than 30 programming languages.                     <br />                     <br />                     You don't have an API key? <a href=\"https://www.equibles.com/api/pricing\" target=\"_blank\">Get one for free here.</a>
 *
 * OpenAPI spec version: v1
 * Contact: equibles@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.equibles.stocks.models;

import java.util.Objects;
import java.util.Arrays;
import com.equibles.stocks.models.BalanceSheet;
import com.equibles.stocks.models.CashFlowStatement;
import com.equibles.stocks.models.FiscalPeriod;
import com.equibles.stocks.models.IncomeStatement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * FinancialReport
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-01-28T01:43:07.282Z[Europe/Lisbon]")
public class FinancialReport {
  @SerializedName("balanceSheet")
  private BalanceSheet balanceSheet = null;

  @SerializedName("cashFlowStatement")
  private CashFlowStatement cashFlowStatement = null;

  @SerializedName("incomeStatement")
  private IncomeStatement incomeStatement = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("fiscalPeriod")
  private FiscalPeriod fiscalPeriod = null;

  @SerializedName("year")
  private Integer year = null;

  public FinancialReport balanceSheet(BalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
    return this;
  }

   /**
   * Get balanceSheet
   * @return balanceSheet
  **/
  @Schema(description = "")
  public BalanceSheet getBalanceSheet() {
    return balanceSheet;
  }

  public void setBalanceSheet(BalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
  }

  public FinancialReport cashFlowStatement(CashFlowStatement cashFlowStatement) {
    this.cashFlowStatement = cashFlowStatement;
    return this;
  }

   /**
   * Get cashFlowStatement
   * @return cashFlowStatement
  **/
  @Schema(description = "")
  public CashFlowStatement getCashFlowStatement() {
    return cashFlowStatement;
  }

  public void setCashFlowStatement(CashFlowStatement cashFlowStatement) {
    this.cashFlowStatement = cashFlowStatement;
  }

  public FinancialReport incomeStatement(IncomeStatement incomeStatement) {
    this.incomeStatement = incomeStatement;
    return this;
  }

   /**
   * Get incomeStatement
   * @return incomeStatement
  **/
  @Schema(description = "")
  public IncomeStatement getIncomeStatement() {
    return incomeStatement;
  }

  public void setIncomeStatement(IncomeStatement incomeStatement) {
    this.incomeStatement = incomeStatement;
  }

  public FinancialReport startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public FinancialReport endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public FinancialReport fiscalPeriod(FiscalPeriod fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
    return this;
  }

   /**
   * Get fiscalPeriod
   * @return fiscalPeriod
  **/
  @Schema(description = "")
  public FiscalPeriod getFiscalPeriod() {
    return fiscalPeriod;
  }

  public void setFiscalPeriod(FiscalPeriod fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }

  public FinancialReport year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @Schema(description = "")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialReport financialReport = (FinancialReport) o;
    return Objects.equals(this.balanceSheet, financialReport.balanceSheet) &&
        Objects.equals(this.cashFlowStatement, financialReport.cashFlowStatement) &&
        Objects.equals(this.incomeStatement, financialReport.incomeStatement) &&
        Objects.equals(this.startDate, financialReport.startDate) &&
        Objects.equals(this.endDate, financialReport.endDate) &&
        Objects.equals(this.fiscalPeriod, financialReport.fiscalPeriod) &&
        Objects.equals(this.year, financialReport.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceSheet, cashFlowStatement, incomeStatement, startDate, endDate, fiscalPeriod, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialReport {\n");
    
    sb.append("    balanceSheet: ").append(toIndentedString(balanceSheet)).append("\n");
    sb.append("    cashFlowStatement: ").append(toIndentedString(cashFlowStatement)).append("\n");
    sb.append("    incomeStatement: ").append(toIndentedString(incomeStatement)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
