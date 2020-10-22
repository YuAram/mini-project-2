package mini.project.server.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

// Command 규칙에 따라 클래스를 정의한다.
public class SignOutCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[signout]");
  }
}
