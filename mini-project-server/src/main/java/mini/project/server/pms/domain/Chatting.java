package mini.project.server.pms.domain;

import java.sql.Date;

// Board 클래스는 더이상 CsvObject를 구현할 필요가 없다.
//
public class Chatting {
  private String content;
  private String registeredDate;

  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public String getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(String registeredDate) {
    this.registeredDate = registeredDate;
  }
}






