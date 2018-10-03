package io.digitalbits.sdk.responses.effects;

import io.digitalbits.sdk.KeyPair;

/**
 * Represents trustline_deauthorized effect response.
 * @see <a href="https://developer.digitalbits.io/frontier/reference/resources/effect.html" target="_blank">Effect documentation</a>
 * @see io.digitalbits.sdk.requests.EffectsRequestBuilder
 * @see io.digitalbits.sdk.Server#effects()
 */
public class TrustlineDeauthorizedEffectResponse extends TrustlineAuthorizationResponse {
  TrustlineDeauthorizedEffectResponse(KeyPair trustor, String assetType, String assetCode) {
    super(trustor, assetType, assetCode);
  }
}
