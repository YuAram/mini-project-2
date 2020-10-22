package mini.project.server.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import mini.project.server.util.Prompt;

public class ChattingCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[Chatting]");

    try {

      while (true) {
        String talk = Prompt.inputString(">>> ", out, in);

        if(talk.equalsIgnoreCase("quit")) {
          out.println("대화종료.");
          break;
        }
        out.println();
        out.println(talk);
        out.flush();
      }
    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생 !- %s\n", e.getMessage());
    }
  }

}
