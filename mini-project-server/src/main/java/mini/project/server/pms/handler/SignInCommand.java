package mini.project.server.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import mini.project.server.pms.domain.Member;
import mini.project.server.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
public class SignInCommand implements Command {

  List<Member> memberList;

  public SignInCommand(List<Member> list) {
    this.memberList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[signin]");

    try {
      String id = Prompt.inputString("ID? ", out, in);
      String password = Prompt.inputString("PASSWORD? ", out, in);

      Member member = findById(id);
      if (member == null) {
        out.println("아이디가 틀립니다.");
        return;
      }
      if (checkByPassword(password) == false) {
        out.println("비밀번호가 틀립니다.");
        return;
      }

      out.println("로그인 정보가 맞습니다.");

      out.println();
      out.printf("%d,%s,%b",member.getNo(), member.getName(), true);
      out.flush();

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생 !- %s\n", e.getMessage());
    }
  }

  private Member findById(String id) {
    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      if (member.getId().equalsIgnoreCase(id)) {
        return member;
      }
    }
    return null;
  }

  private boolean checkByPassword(String password) {
    for (int i = 0; i < memberList.size(); i++) {
      Member member = memberList.get(i);
      if (member.getPassword().equals(password)) {
        return true;
      }
    }
    return false;
  }
}
