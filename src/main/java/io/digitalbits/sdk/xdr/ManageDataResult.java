// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package io.digitalbits.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union ManageDataResult switch (ManageDataResultCode code)
//  {
//  case MANAGE_DATA_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================
public class ManageDataResult  {
  public ManageDataResult () {}
  ManageDataResultCode code;
  public ManageDataResultCode getDiscriminant() {
    return this.code;
  }
  public void setDiscriminant(ManageDataResultCode value) {
    this.code = value;
  }
  public static void encode(XdrDataOutputStream stream, ManageDataResult encodedManageDataResult) throws IOException {
  stream.writeInt(encodedManageDataResult.getDiscriminant().getValue());
  switch (encodedManageDataResult.getDiscriminant()) {
  case MANAGE_DATA_SUCCESS:
  break;
  default:
  break;
  }
  }
  public static ManageDataResult decode(XdrDataInputStream stream) throws IOException {
  ManageDataResult decodedManageDataResult = new ManageDataResult();
  ManageDataResultCode discriminant = ManageDataResultCode.decode(stream);
  decodedManageDataResult.setDiscriminant(discriminant);
  switch (decodedManageDataResult.getDiscriminant()) {
  case MANAGE_DATA_SUCCESS:
  break;
  default:
  break;
  }
    return decodedManageDataResult;
  }
}
