// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package io.digitalbits.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct TransactionResultPair
//  {
//      Hash transactionHash;
//      TransactionResult result; // result for the transaction
//  };

//  ===========================================================================
public class TransactionResultPair  {
  public TransactionResultPair () {}
  private Hash transactionHash;
  public Hash getTransactionHash() {
    return this.transactionHash;
  }
  public void setTransactionHash(Hash value) {
    this.transactionHash = value;
  }
  private TransactionResult result;
  public TransactionResult getResult() {
    return this.result;
  }
  public void setResult(TransactionResult value) {
    this.result = value;
  }
  public static void encode(XdrDataOutputStream stream, TransactionResultPair encodedTransactionResultPair) throws IOException{
    Hash.encode(stream, encodedTransactionResultPair.transactionHash);
    TransactionResult.encode(stream, encodedTransactionResultPair.result);
  }
  public static TransactionResultPair decode(XdrDataInputStream stream) throws IOException {
    TransactionResultPair decodedTransactionResultPair = new TransactionResultPair();
    decodedTransactionResultPair.transactionHash = Hash.decode(stream);
    decodedTransactionResultPair.result = TransactionResult.decode(stream);
    return decodedTransactionResultPair;
  }
}
