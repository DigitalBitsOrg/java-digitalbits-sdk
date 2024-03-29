// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package io.digitalbits.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum TransactionResultCode
//  {
//      txSUCCESS = 0, // all operations succeeded
//  
//      txFAILED = -1, // one of the operations failed (none were applied)
//  
//      txTOO_EARLY = -2,         // ledger closeTime before minTime
//      txTOO_LATE = -3,          // ledger closeTime after maxTime
//      txMISSING_OPERATION = -4, // no operation was specified
//      txBAD_SEQ = -5,           // sequence number does not match source account
//  
//      txBAD_AUTH = -6,             // too few valid signatures / wrong network
//      txINSUFFICIENT_BALANCE = -7, // fee would bring account below reserve
//      txNO_ACCOUNT = -8,           // source account not found
//      txINSUFFICIENT_FEE = -9,     // fee is too small
//      txBAD_AUTH_EXTRA = -10,      // unused signatures attached to transaction
//      txINTERNAL_ERROR = -11       // an unknown error occured
//  };

//  ===========================================================================
public enum TransactionResultCode  {
  txSUCCESS(0),
  txFAILED(-1),
  txTOO_EARLY(-2),
  txTOO_LATE(-3),
  txMISSING_OPERATION(-4),
  txBAD_SEQ(-5),
  txBAD_AUTH(-6),
  txINSUFFICIENT_BALANCE(-7),
  txNO_ACCOUNT(-8),
  txINSUFFICIENT_FEE(-9),
  txBAD_AUTH_EXTRA(-10),
  txINTERNAL_ERROR(-11),
  ;
  private int mValue;

  TransactionResultCode(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static TransactionResultCode decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return txSUCCESS;
      case -1: return txFAILED;
      case -2: return txTOO_EARLY;
      case -3: return txTOO_LATE;
      case -4: return txMISSING_OPERATION;
      case -5: return txBAD_SEQ;
      case -6: return txBAD_AUTH;
      case -7: return txINSUFFICIENT_BALANCE;
      case -8: return txNO_ACCOUNT;
      case -9: return txINSUFFICIENT_FEE;
      case -10: return txBAD_AUTH_EXTRA;
      case -11: return txINTERNAL_ERROR;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, TransactionResultCode value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
