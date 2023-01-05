package TLC.CompilerWhile.ThreeAC;

public class label implements instruction {
    private final String m_label;

    public label(String l) {
        m_label = l;
    }

    public String toString() {
        return "label_" + m_label;
    }
}
