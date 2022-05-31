package Model.Interpreter.Commands;

import Model.Interpreter.Interpreter;

import java.util.List;

public class ConnectToServerCommand extends AbstractCommand {

    public ConnectToServerCommand(Interpreter interpreter) {
        super(interpreter,2);//ip port
    }

    @Override
    public void execute(List<String> args, int index) {

    }

    @Override
    public void validParams() {

    }
}
