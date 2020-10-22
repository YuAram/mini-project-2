package mini.project.server.pms.domain;

//Member 클래스는 더이상 CsvObject를 구현할 필요가 없다.
//
public class Member {
  private int no;
  private String id;
  private String password;
  private String name;

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
