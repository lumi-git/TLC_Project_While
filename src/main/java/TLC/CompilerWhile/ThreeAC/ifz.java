package TLC.CompilerWhile.ThreeAC;

public class ifz implements instruction {
    private final String m_a;
    private final label m_label;

    public ifz(String a, label l) {
        m_a = a;
        m_label = l;
    }

    public String toString() {
        return "ifz " + m_a + " goto " + m_label;
    }
}
