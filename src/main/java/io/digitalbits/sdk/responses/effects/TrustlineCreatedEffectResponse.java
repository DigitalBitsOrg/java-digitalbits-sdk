package io.digitalbits.sdk.responses.effects;

/**
 * Represents trustline_created effect response.
 * @see <a href="https://developer.digitalbits.io/frontier/reference/resources/effect.html" target="_blank">Effect documentation</a>
 * @see io.digitalbits.sdk.requests.EffectsRequestBuilder
 * @see io.digitalbits.sdk.Server#effects()
 */
public class TrustlineCreatedEffectResponse extends TrustlineCUDResponse {
  TrustlineCreatedEffectResponse(String limit, String assetType, String assetCode, String assetIssuer) {
    super(limit, assetType, assetCode, assetIssuer);
  }
}
