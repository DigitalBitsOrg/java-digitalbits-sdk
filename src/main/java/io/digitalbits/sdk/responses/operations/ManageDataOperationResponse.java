package io.digitalbits.sdk.responses.operations;

import com.google.gson.annotations.SerializedName;

/**
 * Represents ManageDataoperation response.
 * @see <a href="https://developer.digitalbits.io/frontier/reference/resources/operation.html" target="_blank">Operation documentation</a>
 * @see io.digitalbits.sdk.requests.OperationsRequestBuilder
 * @see io.digitalbits.sdk.Server#operations()
 */
public class ManageDataOperationResponse extends OperationResponse {
  @SerializedName("name")
  protected final String name;
  @SerializedName("value")
  protected final String value;

  ManageDataOperationResponse(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }
}
