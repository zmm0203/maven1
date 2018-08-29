package backstage.entity;


public class User {

  private long uId;
  private String uPassword;
  private long uPhone;
  private String uPower;
  private String uName;
  private String uSex;
  private String uAddress;
  private java.sql.Date uBirthday;
  private String uIntroduce;
  private String uImage;


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public String getUPassword() {
    return uPassword;
  }

  public void setUPassword(String uPassword) {
    this.uPassword = uPassword;
  }


  public long getUPhone() {
    return uPhone;
  }

  public void setUPhone(long uPhone) {
    this.uPhone = uPhone;
  }


  public String getUPower() {
    return uPower;
  }

  public void setUPower(String uPower) {
    this.uPower = uPower;
  }


  public String getUName() {
    return uName;
  }

  public void setUName(String uName) {
    this.uName = uName;
  }


  public String getUSex() {
    return uSex;
  }

  public void setUSex(String uSex) {
    this.uSex = uSex;
  }


  public String getUAddress() {
    return uAddress;
  }

  public void setUAddress(String uAddress) {
    this.uAddress = uAddress;
  }


  public java.sql.Date getUBirthday() {
    return uBirthday;
  }

  public void setUBirthday(java.sql.Date uBirthday) {
    this.uBirthday = uBirthday;
  }


  public String getUIntroduce() {
    return uIntroduce;
  }

  public void setUIntroduce(String uIntroduce) {
    this.uIntroduce = uIntroduce;
  }


  public String getUImage() {
    return uImage;
  }

  public void setUImage(String uImage) {
    this.uImage = uImage;
  }

}
