/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Pinned Messages
 */
@ApiModel(description = "Pinned Messages")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T15:37:13.208+08:00")
public class PinnedMessage {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("channelID")
  private BigDecimal channelID = null;

  @SerializedName("messageId")
  private BigDecimal messageId = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("ended")
  private OffsetDateTime ended = null;

  @SerializedName("createdUserId")
  private Double createdUserId = null;

  @SerializedName("endedUserId")
  private Double endedUserId = null;

  public PinnedMessage id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public PinnedMessage channelID(BigDecimal channelID) {
    this.channelID = channelID;
    return this;
  }

   /**
   * Get channelID
   * @return channelID
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getChannelID() {
    return channelID;
  }

  public void setChannelID(BigDecimal channelID) {
    this.channelID = channelID;
  }

  public PinnedMessage messageId(BigDecimal messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getMessageId() {
    return messageId;
  }

  public void setMessageId(BigDecimal messageId) {
    this.messageId = messageId;
  }

  public PinnedMessage created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public PinnedMessage ended(OffsetDateTime ended) {
    this.ended = ended;
    return this;
  }

   /**
   * Get ended
   * @return ended
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEnded() {
    return ended;
  }

  public void setEnded(OffsetDateTime ended) {
    this.ended = ended;
  }

  public PinnedMessage createdUserId(Double createdUserId) {
    this.createdUserId = createdUserId;
    return this;
  }

   /**
   * Get createdUserId
   * @return createdUserId
  **/
  @ApiModelProperty(value = "")
  public Double getCreatedUserId() {
    return createdUserId;
  }

  public void setCreatedUserId(Double createdUserId) {
    this.createdUserId = createdUserId;
  }

  public PinnedMessage endedUserId(Double endedUserId) {
    this.endedUserId = endedUserId;
    return this;
  }

   /**
   * Get endedUserId
   * @return endedUserId
  **/
  @ApiModelProperty(value = "")
  public Double getEndedUserId() {
    return endedUserId;
  }

  public void setEndedUserId(Double endedUserId) {
    this.endedUserId = endedUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinnedMessage pinnedMessage = (PinnedMessage) o;
    return Objects.equals(this.id, pinnedMessage.id) &&
        Objects.equals(this.channelID, pinnedMessage.channelID) &&
        Objects.equals(this.messageId, pinnedMessage.messageId) &&
        Objects.equals(this.created, pinnedMessage.created) &&
        Objects.equals(this.ended, pinnedMessage.ended) &&
        Objects.equals(this.createdUserId, pinnedMessage.createdUserId) &&
        Objects.equals(this.endedUserId, pinnedMessage.endedUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channelID, messageId, created, ended, createdUserId, endedUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinnedMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channelID: ").append(toIndentedString(channelID)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    createdUserId: ").append(toIndentedString(createdUserId)).append("\n");
    sb.append("    endedUserId: ").append(toIndentedString(endedUserId)).append("\n");
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
