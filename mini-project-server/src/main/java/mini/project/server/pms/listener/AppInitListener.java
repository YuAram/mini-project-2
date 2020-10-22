package mini.project.server.pms.listener;

import java.util.Map;
import mini.project.server.context.ApplicationContextListener;

public class AppInitListener implements ApplicationContextListener {
  @Override
  public void contextInitialized(Map<String,Object> context) {
    System.out.println("채팅 프로그램을 시작합니다!");
  }

  @Override
  public void contextDestroyed(Map<String,Object> context) {
    System.out.println("채팅 프로그램을 종료합니다!");
  }
}
