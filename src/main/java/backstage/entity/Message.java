package backstage.entity;


public class Message {

  private long mId;
  private long vId;
  private long uId;
  private java.sql.Timestamp mDate;
  private String mText;
  private long mPraise;


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }


  public long getVId() {
    return vId;
  }

  public void setVId(long vId) {
    this.vId = vId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public java.sql.Timestamp getMDate() {
    return mDate;
  }

  public void setMDate(java.sql.Timestamp mDate) {
    this.mDate = mDate;
  }


  public String getMText() {
    return mText;
  }

  public void setMText(String mText) {
    this.mText = mText;
  }


  public long getMPraise() {
    return mPraise;
  }

  public void setMPraise(long mPraise) {
    this.mPraise = mPraise;
  }

}
