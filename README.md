# 채팅 프로그램 mini-project
- **bitcamp-200713 2차 미니 프로젝트** (20201022 ~ 20201023)

## mini-project-server

### mini.project.server.context
 - ApplicationContextListener.java : 옵저버 규칙 정의
### mini.project.server.pms
 - ServerApp.java : 서버 값 주고 받기 관련 클래스 (main 포함)
 - ClientHandler.java : 클라이언트와 연결 통신 관련 클래스
### mini.project.server.pms.domain
 - Chatting.java : 채팅관련 정보(내용, 날짜시간 정보) 저장하는 클래스  
 - Member.java : 회원의 정보(번호, 아이디 비밀번호, 이름) 저장하는 클래스
### mini.project.server.pms.handler
 - Command.java 커맨드 인터페이스
 - ~Command.java 기능 커맨드
### mini.project.server.pms.listener
 - AppInitListener.java : 프로그램 시작 종료 알림
 - DataHandlerListener.java : 데이터를 파일에서 로딩하고 파일로 저장
 - RequestMappingListener.java : 클라이언트 요청을 처리할 커맨드 객체를 준비
### mini.project.server.util
 - Prompt.java : 명령 프롬프트 관련 메서드 클래스


## mini-project-client

### mini.project.client.pms
 - ClientApp.java : 클라이언트 값 주고 받기 관련 클래스 (main 포함)
### mini.project.client.pms.domain
 - State.java : 서버에서 로그인요청하여 전달받은 정보(번호, 이름, 로그인 상태) 저장하는 클래스
### mini.project.client.util
 - Prompt.java : 명령 프롬프트 관련 메서드 클래스
