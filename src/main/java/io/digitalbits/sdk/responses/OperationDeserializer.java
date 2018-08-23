package io.digitalbits.sdk.responses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import io.digitalbits.sdk.KeyPair;
import io.digitalbits.sdk.responses.operations.ManageDataOperationResponse;
import io.digitalbits.sdk.responses.operations.OperationResponse;
import io.digitalbits.sdk.responses.operations.CreateAccountOperationResponse;
import io.digitalbits.sdk.responses.operations.PaymentOperationResponse;
import io.digitalbits.sdk.responses.operations.PathPaymentOperationResponse;
import io.digitalbits.sdk.responses.operations.ManageOfferOperationResponse;
import io.digitalbits.sdk.responses.operations.CreatePassiveOfferOperationResponse;
import io.digitalbits.sdk.responses.operations.SetOptionsOperationResponse;
import io.digitalbits.sdk.responses.operations.ChangeTrustOperationResponse;
import io.digitalbits.sdk.responses.operations.AllowTrustOperationResponse;
import io.digitalbits.sdk.responses.operations.AccountMergeOperationResponse;
import io.digitalbits.sdk.responses.operations.InflationOperationResponse;

import java.lang.reflect.Type;

class OperationDeserializer implements JsonDeserializer<OperationResponse> {
  @Override
  public OperationResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    // Create new Gson object with adapters needed in Operation
    Gson gson = new GsonBuilder()
            .registerTypeAdapter(KeyPair.class, new KeyPairTypeAdapter().nullSafe())
            .create();

    int type = json.getAsJsonObject().get("type_i").getAsInt();
    switch (type) {
      case 0:
        return gson.fromJson(json, CreateAccountOperationResponse.class);
      case 1:
        return gson.fromJson(json, PaymentOperationResponse.class);
      case 2:
        return gson.fromJson(json, PathPaymentOperationResponse.class);
      case 3:
        return gson.fromJson(json, ManageOfferOperationResponse.class);
      case 4:
        return gson.fromJson(json, CreatePassiveOfferOperationResponse.class);
      case 5:
        return gson.fromJson(json, SetOptionsOperationResponse.class);
      case 6:
        return gson.fromJson(json, ChangeTrustOperationResponse.class);
      case 7:
        return gson.fromJson(json, AllowTrustOperationResponse.class);
      case 8:
        return gson.fromJson(json, AccountMergeOperationResponse.class);
      case 9:
        return gson.fromJson(json, InflationOperationResponse.class);
      case 10:
        return gson.fromJson(json, ManageDataOperationResponse.class);
      default:
        throw new RuntimeException("Invalid operation type");
    }
  }
}
