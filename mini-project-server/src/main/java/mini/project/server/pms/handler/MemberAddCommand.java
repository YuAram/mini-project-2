package mini.project.server.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import mini.project.server.pms.domain.Member;
import mini.project.server.util.Prompt;

public class MemberAddCommand implements Command {

  List<Member> memberList;

  public MemberAddCommand(List<Member> list) {
    this.memberList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[사용자 등록]");

    try {
      Member member = new Member();
      member.setNo(Prompt.inputInt("번호? ", out, in));
      member.setId(Prompt.inputString("ID? ", out, in));
      member.setPassword(Prompt.inputString("비밀번호? ", out, in));
      member.setName(Prompt.inputString("이름? ", out, in));
   
      memberList.add(member);
    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생 !- %s\n", e.getMessage());
    }
  }
}
