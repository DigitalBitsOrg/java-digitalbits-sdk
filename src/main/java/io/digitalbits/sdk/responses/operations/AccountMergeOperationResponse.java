package io.digitalbits.sdk.responses.operations;

import com.google.gson.annotations.SerializedName;

import io.digitalbits.sdk.KeyPair;

/**
 * Represents AccountMerge operation response.
 * @see <a href="https://developer.digitalbits.io/horizon/reference/resources/operation.html" target="_blank">Operation documentation</a>
 * @see io.digitalbits.sdk.requests.OperationsRequestBuilder
 * @see io.digitalbits.sdk.Server#operations()
 */
public class AccountMergeOperationResponse extends OperationResponse {
  @SerializedName("account")
  protected final KeyPair account;
  @SerializedName("into")
  protected final KeyPair into;

  AccountMergeOperationResponse(KeyPair account, KeyPair into) {
    this.account = account;
    this.into = into;
  }

  public KeyPair getAccount() {
    return account;
  }

  public KeyPair getInto() {
    return into;
  }
}
