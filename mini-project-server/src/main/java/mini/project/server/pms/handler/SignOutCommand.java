package mini.project.server.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import mini.project.server.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
public class SignOutCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {

      String response = Prompt.inputString("정말 로그아웃하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.println("로그아웃을 취소하였습니다.");
        return;
      }

      out.println();
      out.flush();

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생 !- %s\n", e.getMessage());
    }
  }
}
