package io.digitalbits.sdk.responses.operations;

import com.google.gson.annotations.SerializedName;

import io.digitalbits.sdk.Asset;
import io.digitalbits.sdk.AssetTypeNative;
import io.digitalbits.sdk.KeyPair;

/**
 * Represents AllowTrust operation response.
 * @see <a href="https://developer.digitalbits.io/horizon/reference/resources/operation.html" target="_blank">Operation documentation</a>
 * @see io.digitalbits.sdk.requests.OperationsRequestBuilder
 * @see io.digitalbits.sdk.Server#operations()
 */
public class AllowTrustOperationResponse extends OperationResponse {
  @SerializedName("trustor")
  protected final KeyPair trustor;
  @SerializedName("trustee")
  protected final KeyPair trustee;
  @SerializedName("asset_type")
  protected final String assetType;
  @SerializedName("asset_code")
  protected final String assetCode;
  @SerializedName("asset_issuer")
  protected final String assetIssuer;
  @SerializedName("authorize")
  protected final boolean authorize;

  AllowTrustOperationResponse(boolean authorize, String assetIssuer, String assetCode, String assetType, KeyPair trustee, KeyPair trustor) {
    this.authorize = authorize;
    this.assetIssuer = assetIssuer;
    this.assetCode = assetCode;
    this.assetType = assetType;
    this.trustee = trustee;
    this.trustor = trustor;
  }

  public KeyPair getTrustor() {
    return trustor;
  }

  public KeyPair getTrustee() {
    return trustee;
  }

  public boolean isAuthorize() {
    return authorize;
  }

  public Asset getAsset() {
    if (assetType.equals("native")) {
      return new AssetTypeNative();
    } else {
      KeyPair issuer = KeyPair.fromAccountId(assetIssuer);
      return Asset.createNonNativeAsset(assetCode, issuer);
    }
  }
}
