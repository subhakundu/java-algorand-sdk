/*
 * for KMD HTTP API
 * API for KMD (Key Management Daemon)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: contact@algorand.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.algorand.algosdk.kmd.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

/**
 * APIV1POSTTransactionSignRequest is the request for &#x60;POST /v1/transaction/sign&#x60;
 */
@ApiModel(description = "APIV1POSTTransactionSignRequest is the request for `POST /v1/transaction/sign`")

public class SignTransactionRequest {
  @SerializedName("transaction")
  private byte[] transaction = null;

  @SerializedName("wallet_handle_token")
  private String walletHandleToken = null;

  @SerializedName("wallet_password")
  private String walletPassword = null;

  public SignTransactionRequest transaction(byte[] transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public byte[] getTransaction() {
    return transaction;
  }

  public void setTransaction(byte[] transaction) {
    this.transaction = transaction;
  }

  public SignTransactionRequest walletHandleToken(String walletHandleToken) {
    this.walletHandleToken = walletHandleToken;
    return this;
  }

   /**
   * Get walletHandleToken
   * @return walletHandleToken
  **/
  @ApiModelProperty(value = "")
  public String getWalletHandleToken() {
    return walletHandleToken;
  }

  public void setWalletHandleToken(String walletHandleToken) {
    this.walletHandleToken = walletHandleToken;
  }

  public SignTransactionRequest walletPassword(String walletPassword) {
    this.walletPassword = walletPassword;
    return this;
  }

   /**
   * Get walletPassword
   * @return walletPassword
  **/
  @ApiModelProperty(value = "")
  public String getWalletPassword() {
    return walletPassword;
  }

  public void setWalletPassword(String walletPassword) {
    this.walletPassword = walletPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SignTransactionRequest signTransactionRequest = (SignTransactionRequest) o;
    return ObjectUtils.equals(this.transaction, signTransactionRequest.transaction) &&
    ObjectUtils.equals(this.walletHandleToken, signTransactionRequest.walletHandleToken) &&
    ObjectUtils.equals(this.walletPassword, signTransactionRequest.walletPassword);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(transaction, walletHandleToken, walletPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignTransactionRequest {\n");
    
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    walletHandleToken: ").append(toIndentedString(walletHandleToken)).append("\n");
    sb.append("    walletPassword: ").append(toIndentedString(walletPassword)).append("\n");
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

