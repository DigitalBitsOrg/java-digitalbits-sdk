// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package io.digitalbits.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct Auth
//  {
//      // Empty message, just to confirm
//      // establishment of MAC keys.
//      int unused;
//  };

//  ===========================================================================
public class Auth  {
  public Auth () {}
  private Integer unused;
  public Integer getUnused() {
    return this.unused;
  }
  public void setUnused(Integer value) {
    this.unused = value;
  }
  public static void encode(XdrDataOutputStream stream, Auth encodedAuth) throws IOException{
    stream.writeInt(encodedAuth.unused);
  }
  public static Auth decode(XdrDataInputStream stream) throws IOException {
    Auth decodedAuth = new Auth();
    decodedAuth.unused = stream.readInt();
    return decodedAuth;
  }
}
