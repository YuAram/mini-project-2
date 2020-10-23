package mini.project.server.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

// Command 규칙에 따라 클래스를 정의한다.
public class HelpCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[HELP]");

    out.println("************** SignIn/Out ***************");
    out.println("*  로그인:/signin\t\t\t*");
    out.println("*  로그아웃 :/signout\t\t\t*");

    out.println("**************   Member   ***************");
    out.println("*  현재 사용자 정보: /member/detail\t*");
    out.println("*  사용자 목록 확인: /member/list\t*");
    out.println("*  사용자 정보 수정: /member/update\t*");
    out.println("*  사용자 추가: /member/add\t\t*");
    out.println("*  사용자 삭제: /member/delete\t\t*");

    out.println("**************  Chatting  ***************");
    out.println("*  채팅 시작 : /chat\t\t\t*");
    out.println("*****************************************");
  }
}
