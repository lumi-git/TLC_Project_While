
public class assignation implements instruction {
    private String m_a;
    private String m_b;

    public assignation(String a, String b) {
        m_a = a;
        m_b = b;
    }

    public String toString() {
        return m_a + " = " + m_b;
    }

    public boolean equalsRight(Object o) {
        if (o instanceof assignation) {
            assignation a = (assignation) o;
            return m_b.equals(a.m_b);
        }
        return false;
    }

    public boolean equalsLeft(Object o) {
        if (o instanceof assignation) {
            assignation a = (assignation) o;
            return m_a.equals(a.m_a);
        }
        return false;
    }

    public void setRight(String s) {
        m_b = s;
    }

    public void setLeft(String s) {
        m_a = s;
    }

    public String getLeft() {
        return m_a;
    }

    public String getRight() {
        return m_b;
    }
}
