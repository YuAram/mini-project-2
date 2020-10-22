package mini.project.server.pms.listener;

import java.util.List;
import java.util.Map;
import mini.project.server.context.ApplicationContextListener;
import mini.project.server.pms.domain.Member;
import mini.project.server.pms.handler.CalculatorCommand;
import mini.project.server.pms.handler.ChattingCommand;
import mini.project.server.pms.handler.HelpCommand;
import mini.project.server.pms.handler.MemberAddCommand;
import mini.project.server.pms.handler.MemberDeleteCommand;
import mini.project.server.pms.handler.MemberDetailCommand;
import mini.project.server.pms.handler.MemberListCommand;
import mini.project.server.pms.handler.MemberUpdateCommand;
import mini.project.server.pms.handler.SignInCommand;
import mini.project.server.pms.handler.SignOutCommand;

// 클라이언트 요청을 처리할 커맨드 객체를 준비한다.
public class RequestMappingListener implements ApplicationContextListener {

  @SuppressWarnings("unchecked")
  @Override
  public void contextInitialized(Map<String,Object> context) {
    // 옵저버가 작업한 결과를 맵에서 꺼낸다.
    List<Member> memberList = (List<Member>) context.get("memberList");

    context.put("/chat", new ChattingCommand());

    MemberListCommand memberListCommand = new MemberListCommand(memberList);
    context.put("/member/detail", new MemberDetailCommand(memberList));
    context.put("/member/add", new MemberAddCommand(memberList));
    context.put("/member/list", memberListCommand);
    context.put("/member/update", new MemberUpdateCommand(memberList));
    context.put("/member/delete", new MemberDeleteCommand(memberList));

    context.put("/signin", new SignInCommand(memberList));
    context.put("/signout", new SignOutCommand());    

    context.put("/help", new HelpCommand());

    //context.put("/hello", new HelloCommand());
    context.put("/calc", new CalculatorCommand());
  }

  @Override
  public void contextDestroyed(Map<String,Object> context) {
  }
}
