package machine;

import java.util.List;

public class MachineImpl implements MachineDialogue{

    static MachineImpl instance;

    public static MachineImpl getInstance(){
        if (instance == null){
            instance = new MachineImpl();
        }
        return instance;
    }

    @Override
    public List<String> ask(String s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ask'");
    }

    @Override
    public void reinit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reinit'");
    }

    @Override
    public List<String> test(List<String> l) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'test'");
    }
    
}
