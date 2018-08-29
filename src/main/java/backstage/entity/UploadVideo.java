package backstage.entity;;


public class UploadVideo {

  private long upvId;
  private String upvName;
  private long uId;
  private java.sql.Timestamp upvDate;
  private String upvVideo;
  private String upvState;


  public long getUpvId() {
    return upvId;
  }

  public void setUpvId(long upvId) {
    this.upvId = upvId;
  }


  public String getUpvName() {
    return upvName;
  }

  public void setUpvName(String upvName) {
    this.upvName = upvName;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public java.sql.Timestamp getUpvDate() {
    return upvDate;
  }

  public void setUpvDate(java.sql.Timestamp upvDate) {
    this.upvDate = upvDate;
  }


  public String getUpvVideo() {
    return upvVideo;
  }

  public void setUpvVideo(String upvVideo) {
    this.upvVideo = upvVideo;
  }


  public String getUpvState() {
    return upvState;
  }

  public void setUpvState(String upvState) {
    this.upvState = upvState;
  }

}
