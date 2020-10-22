package mini.project.client.pms.domain;

public class State {
    private int no;
    private String name;
    private boolean signInState;
    
    public State() {
      no = -1;
      name = "none";
      signInState = false;
    }
    
    public int getNo() {
      return no;
    }
    public void setNo(int no) {
      this.no = no;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public boolean isSignInState() {
      return signInState;
    }
    public void setSignInState(boolean signInState) {
      this.signInState = signInState;
    }
}

