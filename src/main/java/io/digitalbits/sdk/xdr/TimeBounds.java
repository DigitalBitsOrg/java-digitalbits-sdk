// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package io.digitalbits.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct TimeBounds
//  {
//      uint64 minTime;
//      uint64 maxTime; // 0 here means no maxTime
//  };

//  ===========================================================================
public class TimeBounds  {
  public TimeBounds () {}
  private Uint64 minTime;
  public Uint64 getMinTime() {
    return this.minTime;
  }
  public void setMinTime(Uint64 value) {
    this.minTime = value;
  }
  private Uint64 maxTime;
  public Uint64 getMaxTime() {
    return this.maxTime;
  }
  public void setMaxTime(Uint64 value) {
    this.maxTime = value;
  }
  public static void encode(XdrDataOutputStream stream, TimeBounds encodedTimeBounds) throws IOException{
    Uint64.encode(stream, encodedTimeBounds.minTime);
    Uint64.encode(stream, encodedTimeBounds.maxTime);
  }
  public static TimeBounds decode(XdrDataInputStream stream) throws IOException {
    TimeBounds decodedTimeBounds = new TimeBounds();
    decodedTimeBounds.minTime = Uint64.decode(stream);
    decodedTimeBounds.maxTime = Uint64.decode(stream);
    return decodedTimeBounds;
  }
}
