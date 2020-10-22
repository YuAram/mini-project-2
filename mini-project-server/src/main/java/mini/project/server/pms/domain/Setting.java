package mini.project.server.pms.domain;

//Member 클래스는 더이상 CsvObject를 구현할 필요가 없다.
//
public class Setting {
  private int signInNo;

  public int getSignInNo() {
    return signInNo;
  }

  public void setSignInNo(int signInNo) {
    this.signInNo = signInNo;
  }
}
