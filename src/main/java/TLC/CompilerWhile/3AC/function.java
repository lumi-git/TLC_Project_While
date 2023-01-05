import java.util.ArrayList;

public class function {
    private String m_name;

    private ArrayList<String> m_params;
    private ArrayList<instruction> m_instructions;

    public function(String name, ArrayList<String> params) {
        m_name = name;
        m_instructions = new ArrayList<instruction>();
        m_params = params;
    }

    public void addInstruction(instruction i) {
        m_instructions.add(i);
    }

    public instruction getInstruction(int i) {
        return m_instructions.get(i);
    }

    public ArrayList<instruction> getInstructions() {
        return m_instructions;
    }

    public String getName() {
        return m_name;
    }

    public String toString() {
        String s = m_name + ":\n";
        for (instruction i : m_instructions) {
            s += "\t" + i + "\n";
        }
        return s;
    }

    public String getParam(int i) {
        return m_params.get(i - 1);
    }

}
