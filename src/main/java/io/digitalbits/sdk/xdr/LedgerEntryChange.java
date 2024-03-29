// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package io.digitalbits.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union LedgerEntryChange switch (LedgerEntryChangeType type)
//  {
//  case LEDGER_ENTRY_CREATED:
//      LedgerEntry created;
//  case LEDGER_ENTRY_UPDATED:
//      LedgerEntry updated;
//  case LEDGER_ENTRY_REMOVED:
//      LedgerKey removed;
//  case LEDGER_ENTRY_STATE:
//      LedgerEntry state;
//  };

//  ===========================================================================
public class LedgerEntryChange  {
  public LedgerEntryChange () {}
  LedgerEntryChangeType type;
  public LedgerEntryChangeType getDiscriminant() {
    return this.type;
  }
  public void setDiscriminant(LedgerEntryChangeType value) {
    this.type = value;
  }
  private LedgerEntry created;
  public LedgerEntry getCreated() {
    return this.created;
  }
  public void setCreated(LedgerEntry value) {
    this.created = value;
  }
  private LedgerEntry updated;
  public LedgerEntry getUpdated() {
    return this.updated;
  }
  public void setUpdated(LedgerEntry value) {
    this.updated = value;
  }
  private LedgerKey removed;
  public LedgerKey getRemoved() {
    return this.removed;
  }
  public void setRemoved(LedgerKey value) {
    this.removed = value;
  }
  private LedgerEntry state;
  public LedgerEntry getState() {
    return this.state;
  }
  public void setState(LedgerEntry value) {
    this.state = value;
  }
  public static void encode(XdrDataOutputStream stream, LedgerEntryChange encodedLedgerEntryChange) throws IOException {
  stream.writeInt(encodedLedgerEntryChange.getDiscriminant().getValue());
  switch (encodedLedgerEntryChange.getDiscriminant()) {
  case LEDGER_ENTRY_CREATED:
  LedgerEntry.encode(stream, encodedLedgerEntryChange.created);
  break;
  case LEDGER_ENTRY_UPDATED:
  LedgerEntry.encode(stream, encodedLedgerEntryChange.updated);
  break;
  case LEDGER_ENTRY_REMOVED:
  LedgerKey.encode(stream, encodedLedgerEntryChange.removed);
  break;
  case LEDGER_ENTRY_STATE:
  LedgerEntry.encode(stream, encodedLedgerEntryChange.state);
  break;
  }
  }
  public static LedgerEntryChange decode(XdrDataInputStream stream) throws IOException {
  LedgerEntryChange decodedLedgerEntryChange = new LedgerEntryChange();
  LedgerEntryChangeType discriminant = LedgerEntryChangeType.decode(stream);
  decodedLedgerEntryChange.setDiscriminant(discriminant);
  switch (decodedLedgerEntryChange.getDiscriminant()) {
  case LEDGER_ENTRY_CREATED:
  decodedLedgerEntryChange.created = LedgerEntry.decode(stream);
  break;
  case LEDGER_ENTRY_UPDATED:
  decodedLedgerEntryChange.updated = LedgerEntry.decode(stream);
  break;
  case LEDGER_ENTRY_REMOVED:
  decodedLedgerEntryChange.removed = LedgerKey.decode(stream);
  break;
  case LEDGER_ENTRY_STATE:
  decodedLedgerEntryChange.state = LedgerEntry.decode(stream);
  break;
  }
    return decodedLedgerEntryChange;
  }
}
