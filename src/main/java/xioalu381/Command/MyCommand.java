package xioalu381.Command;

public class MyCommand implements Command {
    private final Receiver receiver;
    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }

    @Override
    public void send() {
        receiver.action1();
    }
}