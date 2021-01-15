package xioalu381.Command;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);

//        策略模式调用
        cmd.exe();
        cmd.send();
    }
}