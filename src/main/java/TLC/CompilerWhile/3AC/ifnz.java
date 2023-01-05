public class ifnz implements instruction {
    private final String m_a;
    private final label m_label;

    public ifnz(String a, label l) {
        m_a = a;
        m_label = l;
    }

    public String toString() {
        return "ifnz " + m_a + " goto " + m_label;
    }
}
