package cn.bdqn.pojo;

public class Hello {
    private String who;
    private String message;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Hello() {
    }

    public Hello(String who, String message) {
        this.who = who;
        this.message = message;
    }

    public  void show(){
        System.out.println(who+"说："+message);
    }
}
