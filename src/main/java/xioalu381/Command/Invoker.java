package xioalu381.Command;

public class Invoker {
    private final Command command;

    Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
