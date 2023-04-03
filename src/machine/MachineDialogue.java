package machine;

import java.util.List;

public interface MachineDialogue {
    public List<String> ask(String s);

    public void reinit();

    public List<String> test(List<String> l);
}
