package mini.project.server.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class ChattingCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[Chatting]");
  }

}
