package TLC.CompilerWhile.ThreeAC;

public class go_to implements instruction {
    private final String m_label;

    public go_to(String label) {
        m_label = label;
    }

    public String toString() {
        return "goto " + m_label;
    }
}

