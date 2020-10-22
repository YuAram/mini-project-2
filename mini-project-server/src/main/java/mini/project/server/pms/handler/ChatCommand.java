package mini.project.server.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import mini.project.server.pms.domain.Chatting;
import mini.project.server.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
public class ChatCommand implements Command {

  List<Chatting> chattingList;

  public ChatCommand(List<Chatting> list) {
    this.chattingList = list;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[Chat]");
    try {
      while (true) {
        Chatting chatting = new Chatting();
        String message = Prompt.inputString(">>> ", out, in);
        if(message.equalsIgnoreCase("bye")) {
          break;
        }
        chatting.setContent(message);
        chatting.setRegisteredDate(new Date(System.currentTimeMillis()));

        chattingList.add(chatting);

        Iterator<Chatting> iterator = chattingList.iterator();

        while (iterator.hasNext()) {
          chatting = iterator.next();
          out.printf("[%s] : %s\t_%s\n",
              "[none]",
              chatting.getContent(),
              chatting.getRegisteredDate());
        }
      }
    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생 !- %s\n", e.getMessage());
    }
  }
}
