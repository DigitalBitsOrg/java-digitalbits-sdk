// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package io.digitalbits.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct SimplePaymentResult
//  {
//      AccountID destination;
//      Asset asset;
//      int64 amount;
//  };

//  ===========================================================================
public class SimplePaymentResult  {
  public SimplePaymentResult () {}
  private AccountID destination;
  public AccountID getDestination() {
    return this.destination;
  }
  public void setDestination(AccountID value) {
    this.destination = value;
  }
  private Asset asset;
  public Asset getAsset() {
    return this.asset;
  }
  public void setAsset(Asset value) {
    this.asset = value;
  }
  private Int64 amount;
  public Int64 getAmount() {
    return this.amount;
  }
  public void setAmount(Int64 value) {
    this.amount = value;
  }
  public static void encode(XdrDataOutputStream stream, SimplePaymentResult encodedSimplePaymentResult) throws IOException{
    AccountID.encode(stream, encodedSimplePaymentResult.destination);
    Asset.encode(stream, encodedSimplePaymentResult.asset);
    Int64.encode(stream, encodedSimplePaymentResult.amount);
  }
  public static SimplePaymentResult decode(XdrDataInputStream stream) throws IOException {
    SimplePaymentResult decodedSimplePaymentResult = new SimplePaymentResult();
    decodedSimplePaymentResult.destination = AccountID.decode(stream);
    decodedSimplePaymentResult.asset = Asset.decode(stream);
    decodedSimplePaymentResult.amount = Int64.decode(stream);
    return decodedSimplePaymentResult;
  }
}
