package io.digitalbits.sdk.responses;

import com.google.gson.annotations.SerializedName;

import io.digitalbits.sdk.Asset;
import io.digitalbits.sdk.AssetTypeNative;
import io.digitalbits.sdk.KeyPair;

import java.util.ArrayList;

/**
 * Represents path response.
 * @see <a href="https://developer.digitalbits.io/frontier/reference/resources/path.html" target="_blank">Path documentation</a>
 * @see io.digitalbits.sdk.requests.PathsRequestBuilder
 * @see io.digitalbits.sdk.Server#paths()
 */
public class PathResponse extends Response {
  @SerializedName("destination_amount")
  private final String destinationAmount;
  @SerializedName("destination_asset_type")
  private final String destinationAssetType;
  @SerializedName("destination_asset_code")
  private final String destinationAssetCode;
  @SerializedName("destination_asset_issuer")
  private final String destinationAssetIssuer;

  @SerializedName("source_amount")
  private final String sourceAmount;
  @SerializedName("source_asset_type")
  private final String sourceAssetType;
  @SerializedName("source_asset_code")
  private final String sourceAssetCode;
  @SerializedName("source_asset_issuer")
  private final String sourceAssetIssuer;

  @SerializedName("path")
  private final ArrayList<Asset> path;

  @SerializedName("_links")
  private final Links links;

  PathResponse(String destinationAmount, String destinationAssetType, String destinationAssetCode, String destinationAssetIssuer, String sourceAmount, String sourceAssetType, String sourceAssetCode, String sourceAssetIssuer, ArrayList<Asset> path, Links links) {
    this.destinationAmount = destinationAmount;
    this.destinationAssetType = destinationAssetType;
    this.destinationAssetCode = destinationAssetCode;
    this.destinationAssetIssuer = destinationAssetIssuer;
    this.sourceAmount = sourceAmount;
    this.sourceAssetType = sourceAssetType;
    this.sourceAssetCode = sourceAssetCode;
    this.sourceAssetIssuer = sourceAssetIssuer;
    this.path = path;
    this.links = links;
  }

  public String getDestinationAmount() {
    return destinationAmount;
  }

  public String getSourceAmount() {
    return sourceAmount;
  }

  public ArrayList<Asset> getPath() {
    return path;
  }

  public Asset getDestinationAsset() {
    if (destinationAssetType.equals("native")) {
      return new AssetTypeNative();
    } else {
      KeyPair issuer = KeyPair.fromAccountId(destinationAssetIssuer);
      return Asset.createNonNativeAsset(destinationAssetCode, issuer);
    }
  }

  public Asset getSourceAsset() {
    if (sourceAssetType.equals("native")) {
      return new AssetTypeNative();
    } else {
      KeyPair issuer = KeyPair.fromAccountId(sourceAssetIssuer);
      return Asset.createNonNativeAsset(sourceAssetCode, issuer);
    }
  }

  public Links getLinks() {
    return links;
  }

  /**
   * Links connected to path.
   */
  public static class Links {
    @SerializedName("self")
    private final Link self;

    Links(Link self) {
      this.self = self;
    }

    public Link getSelf() {
      return self;
    }
  }
}
