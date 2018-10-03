package io.digitalbits.sdk.responses.operations;

import com.google.gson.annotations.SerializedName;

import io.digitalbits.sdk.KeyPair;

/**
 * Represents CreateAccount operation response.
 * @see <a href="https://developer.digitalbits.io/frontier/reference/resources/operation.html" target="_blank">Operation documentation</a>
 * @see io.digitalbits.sdk.requests.OperationsRequestBuilder
 * @see io.digitalbits.sdk.Server#operations()
 */
public class CreateAccountOperationResponse extends OperationResponse {
  @SerializedName("account")
  protected final KeyPair account;
  @SerializedName("funder")
  protected final KeyPair funder;
  @SerializedName("starting_balance")
  protected final String startingBalance;

  CreateAccountOperationResponse(KeyPair funder, String startingBalance, KeyPair account) {
    this.funder = funder;
    this.startingBalance = startingBalance;
    this.account = account;
  }

  public KeyPair getAccount() {
    return account;
  }

  public String getStartingBalance() {
    return startingBalance;
  }

  public KeyPair getFunder() {
    return funder;
  }
}
