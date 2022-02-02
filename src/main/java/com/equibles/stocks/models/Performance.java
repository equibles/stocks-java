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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Performance
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-02T22:10:29.848Z[Europe/Lisbon]")
public class Performance {
  @SerializedName("oneDay")
  private Double oneDay = null;

  @SerializedName("oneWeek")
  private Double oneWeek = null;

  @SerializedName("twoWeeks")
  private Double twoWeeks = null;

  @SerializedName("oneMonth")
  private Double oneMonth = null;

  @SerializedName("threeMonths")
  private Double threeMonths = null;

  @SerializedName("sixMonths")
  private Double sixMonths = null;

  @SerializedName("yearToDate")
  private Double yearToDate = null;

  @SerializedName("oneYear")
  private Double oneYear = null;

  @SerializedName("twoYears")
  private Double twoYears = null;

  @SerializedName("twoYearsAnnualized")
  private Double twoYearsAnnualized = null;

  @SerializedName("threeYears")
  private Double threeYears = null;

  @SerializedName("threeYearsAnnualized")
  private Double threeYearsAnnualized = null;

  @SerializedName("fiveYears")
  private Double fiveYears = null;

  @SerializedName("fiveYearsAnnualized")
  private Double fiveYearsAnnualized = null;

  @SerializedName("tenYears")
  private Double tenYears = null;

  @SerializedName("tenYearsAnnualized")
  private Double tenYearsAnnualized = null;

  @SerializedName("twentyYears")
  private Double twentyYears = null;

  @SerializedName("twentyYearsAnnualized")
  private Double twentyYearsAnnualized = null;

  public Performance oneDay(Double oneDay) {
    this.oneDay = oneDay;
    return this;
  }

   /**
   * Get oneDay
   * @return oneDay
  **/
  @Schema(description = "")
  public Double getOneDay() {
    return oneDay;
  }

  public void setOneDay(Double oneDay) {
    this.oneDay = oneDay;
  }

  public Performance oneWeek(Double oneWeek) {
    this.oneWeek = oneWeek;
    return this;
  }

   /**
   * Get oneWeek
   * @return oneWeek
  **/
  @Schema(description = "")
  public Double getOneWeek() {
    return oneWeek;
  }

  public void setOneWeek(Double oneWeek) {
    this.oneWeek = oneWeek;
  }

  public Performance twoWeeks(Double twoWeeks) {
    this.twoWeeks = twoWeeks;
    return this;
  }

   /**
   * Get twoWeeks
   * @return twoWeeks
  **/
  @Schema(description = "")
  public Double getTwoWeeks() {
    return twoWeeks;
  }

  public void setTwoWeeks(Double twoWeeks) {
    this.twoWeeks = twoWeeks;
  }

  public Performance oneMonth(Double oneMonth) {
    this.oneMonth = oneMonth;
    return this;
  }

   /**
   * Get oneMonth
   * @return oneMonth
  **/
  @Schema(description = "")
  public Double getOneMonth() {
    return oneMonth;
  }

  public void setOneMonth(Double oneMonth) {
    this.oneMonth = oneMonth;
  }

  public Performance threeMonths(Double threeMonths) {
    this.threeMonths = threeMonths;
    return this;
  }

   /**
   * Get threeMonths
   * @return threeMonths
  **/
  @Schema(description = "")
  public Double getThreeMonths() {
    return threeMonths;
  }

  public void setThreeMonths(Double threeMonths) {
    this.threeMonths = threeMonths;
  }

  public Performance sixMonths(Double sixMonths) {
    this.sixMonths = sixMonths;
    return this;
  }

   /**
   * Get sixMonths
   * @return sixMonths
  **/
  @Schema(description = "")
  public Double getSixMonths() {
    return sixMonths;
  }

  public void setSixMonths(Double sixMonths) {
    this.sixMonths = sixMonths;
  }

  public Performance yearToDate(Double yearToDate) {
    this.yearToDate = yearToDate;
    return this;
  }

   /**
   * Get yearToDate
   * @return yearToDate
  **/
  @Schema(description = "")
  public Double getYearToDate() {
    return yearToDate;
  }

  public void setYearToDate(Double yearToDate) {
    this.yearToDate = yearToDate;
  }

  public Performance oneYear(Double oneYear) {
    this.oneYear = oneYear;
    return this;
  }

   /**
   * Get oneYear
   * @return oneYear
  **/
  @Schema(description = "")
  public Double getOneYear() {
    return oneYear;
  }

  public void setOneYear(Double oneYear) {
    this.oneYear = oneYear;
  }

  public Performance twoYears(Double twoYears) {
    this.twoYears = twoYears;
    return this;
  }

   /**
   * Get twoYears
   * @return twoYears
  **/
  @Schema(description = "")
  public Double getTwoYears() {
    return twoYears;
  }

  public void setTwoYears(Double twoYears) {
    this.twoYears = twoYears;
  }

  public Performance twoYearsAnnualized(Double twoYearsAnnualized) {
    this.twoYearsAnnualized = twoYearsAnnualized;
    return this;
  }

   /**
   * Get twoYearsAnnualized
   * @return twoYearsAnnualized
  **/
  @Schema(description = "")
  public Double getTwoYearsAnnualized() {
    return twoYearsAnnualized;
  }

  public void setTwoYearsAnnualized(Double twoYearsAnnualized) {
    this.twoYearsAnnualized = twoYearsAnnualized;
  }

  public Performance threeYears(Double threeYears) {
    this.threeYears = threeYears;
    return this;
  }

   /**
   * Get threeYears
   * @return threeYears
  **/
  @Schema(description = "")
  public Double getThreeYears() {
    return threeYears;
  }

  public void setThreeYears(Double threeYears) {
    this.threeYears = threeYears;
  }

  public Performance threeYearsAnnualized(Double threeYearsAnnualized) {
    this.threeYearsAnnualized = threeYearsAnnualized;
    return this;
  }

   /**
   * Get threeYearsAnnualized
   * @return threeYearsAnnualized
  **/
  @Schema(description = "")
  public Double getThreeYearsAnnualized() {
    return threeYearsAnnualized;
  }

  public void setThreeYearsAnnualized(Double threeYearsAnnualized) {
    this.threeYearsAnnualized = threeYearsAnnualized;
  }

  public Performance fiveYears(Double fiveYears) {
    this.fiveYears = fiveYears;
    return this;
  }

   /**
   * Get fiveYears
   * @return fiveYears
  **/
  @Schema(description = "")
  public Double getFiveYears() {
    return fiveYears;
  }

  public void setFiveYears(Double fiveYears) {
    this.fiveYears = fiveYears;
  }

  public Performance fiveYearsAnnualized(Double fiveYearsAnnualized) {
    this.fiveYearsAnnualized = fiveYearsAnnualized;
    return this;
  }

   /**
   * Get fiveYearsAnnualized
   * @return fiveYearsAnnualized
  **/
  @Schema(description = "")
  public Double getFiveYearsAnnualized() {
    return fiveYearsAnnualized;
  }

  public void setFiveYearsAnnualized(Double fiveYearsAnnualized) {
    this.fiveYearsAnnualized = fiveYearsAnnualized;
  }

  public Performance tenYears(Double tenYears) {
    this.tenYears = tenYears;
    return this;
  }

   /**
   * Get tenYears
   * @return tenYears
  **/
  @Schema(description = "")
  public Double getTenYears() {
    return tenYears;
  }

  public void setTenYears(Double tenYears) {
    this.tenYears = tenYears;
  }

  public Performance tenYearsAnnualized(Double tenYearsAnnualized) {
    this.tenYearsAnnualized = tenYearsAnnualized;
    return this;
  }

   /**
   * Get tenYearsAnnualized
   * @return tenYearsAnnualized
  **/
  @Schema(description = "")
  public Double getTenYearsAnnualized() {
    return tenYearsAnnualized;
  }

  public void setTenYearsAnnualized(Double tenYearsAnnualized) {
    this.tenYearsAnnualized = tenYearsAnnualized;
  }

  public Performance twentyYears(Double twentyYears) {
    this.twentyYears = twentyYears;
    return this;
  }

   /**
   * Get twentyYears
   * @return twentyYears
  **/
  @Schema(description = "")
  public Double getTwentyYears() {
    return twentyYears;
  }

  public void setTwentyYears(Double twentyYears) {
    this.twentyYears = twentyYears;
  }

  public Performance twentyYearsAnnualized(Double twentyYearsAnnualized) {
    this.twentyYearsAnnualized = twentyYearsAnnualized;
    return this;
  }

   /**
   * Get twentyYearsAnnualized
   * @return twentyYearsAnnualized
  **/
  @Schema(description = "")
  public Double getTwentyYearsAnnualized() {
    return twentyYearsAnnualized;
  }

  public void setTwentyYearsAnnualized(Double twentyYearsAnnualized) {
    this.twentyYearsAnnualized = twentyYearsAnnualized;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Performance performance = (Performance) o;
    return Objects.equals(this.oneDay, performance.oneDay) &&
        Objects.equals(this.oneWeek, performance.oneWeek) &&
        Objects.equals(this.twoWeeks, performance.twoWeeks) &&
        Objects.equals(this.oneMonth, performance.oneMonth) &&
        Objects.equals(this.threeMonths, performance.threeMonths) &&
        Objects.equals(this.sixMonths, performance.sixMonths) &&
        Objects.equals(this.yearToDate, performance.yearToDate) &&
        Objects.equals(this.oneYear, performance.oneYear) &&
        Objects.equals(this.twoYears, performance.twoYears) &&
        Objects.equals(this.twoYearsAnnualized, performance.twoYearsAnnualized) &&
        Objects.equals(this.threeYears, performance.threeYears) &&
        Objects.equals(this.threeYearsAnnualized, performance.threeYearsAnnualized) &&
        Objects.equals(this.fiveYears, performance.fiveYears) &&
        Objects.equals(this.fiveYearsAnnualized, performance.fiveYearsAnnualized) &&
        Objects.equals(this.tenYears, performance.tenYears) &&
        Objects.equals(this.tenYearsAnnualized, performance.tenYearsAnnualized) &&
        Objects.equals(this.twentyYears, performance.twentyYears) &&
        Objects.equals(this.twentyYearsAnnualized, performance.twentyYearsAnnualized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneDay, oneWeek, twoWeeks, oneMonth, threeMonths, sixMonths, yearToDate, oneYear, twoYears, twoYearsAnnualized, threeYears, threeYearsAnnualized, fiveYears, fiveYearsAnnualized, tenYears, tenYearsAnnualized, twentyYears, twentyYearsAnnualized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Performance {\n");
    
    sb.append("    oneDay: ").append(toIndentedString(oneDay)).append("\n");
    sb.append("    oneWeek: ").append(toIndentedString(oneWeek)).append("\n");
    sb.append("    twoWeeks: ").append(toIndentedString(twoWeeks)).append("\n");
    sb.append("    oneMonth: ").append(toIndentedString(oneMonth)).append("\n");
    sb.append("    threeMonths: ").append(toIndentedString(threeMonths)).append("\n");
    sb.append("    sixMonths: ").append(toIndentedString(sixMonths)).append("\n");
    sb.append("    yearToDate: ").append(toIndentedString(yearToDate)).append("\n");
    sb.append("    oneYear: ").append(toIndentedString(oneYear)).append("\n");
    sb.append("    twoYears: ").append(toIndentedString(twoYears)).append("\n");
    sb.append("    twoYearsAnnualized: ").append(toIndentedString(twoYearsAnnualized)).append("\n");
    sb.append("    threeYears: ").append(toIndentedString(threeYears)).append("\n");
    sb.append("    threeYearsAnnualized: ").append(toIndentedString(threeYearsAnnualized)).append("\n");
    sb.append("    fiveYears: ").append(toIndentedString(fiveYears)).append("\n");
    sb.append("    fiveYearsAnnualized: ").append(toIndentedString(fiveYearsAnnualized)).append("\n");
    sb.append("    tenYears: ").append(toIndentedString(tenYears)).append("\n");
    sb.append("    tenYearsAnnualized: ").append(toIndentedString(tenYearsAnnualized)).append("\n");
    sb.append("    twentyYears: ").append(toIndentedString(twentyYears)).append("\n");
    sb.append("    twentyYearsAnnualized: ").append(toIndentedString(twentyYearsAnnualized)).append("\n");
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
