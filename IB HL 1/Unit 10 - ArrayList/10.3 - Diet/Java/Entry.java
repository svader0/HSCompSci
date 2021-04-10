public class Entry {
    private String m_date;
    private int m_weight;

    Entry(String date, int weight) {
        m_date = date;
        m_weight = weight;
    }

    Entry() {
        m_date = "no date";
        m_weight = 0;
    }

    public String getDate() {
        return m_date;
    }

    public int getWeight() {
        return m_weight;
    }

    public void setDate(String date) {
        m_date = date;
    }

    public void setWeight(int weight) {
        m_weight = weight;
    }

    @Override
    public String toString() {
        return ("Date: " + this.m_date + "\nWeight: " + this.m_weight);
    }
}
