import java.util.ArrayList;

public class Diet {
    private ArrayList<Entry> dietEntries;
    private int differential;
    private int netChange;

    Diet() {
        dietEntries = new ArrayList<Entry>();
        netChange = 0;
        differential = 0;
    }

    public void addEntry(Entry entry) {
        dietEntries.add(entry);
    }

    public Entry getEntry(String date) {
        for (Entry e : dietEntries) {
            if (e.getDate().equals(date)) {
                return e;
            }
        }
        return null;
    }

    public void viewList() {
        System.out.println("===============================");

        netChange = dietEntries.get(dietEntries.size() - 1).getWeight() - dietEntries.get(0).getWeight();
        for (int i = 0; i < dietEntries.size(); i++) {
            try {
                differential = (dietEntries.get(i).getWeight() - dietEntries.get(i - 1).getWeight());
            } catch (IndexOutOfBoundsException e) {
                differential = 0;
            }

            System.out.printf("%8s | %5s | %4d |\n", dietEntries.get(i).getDate(), dietEntries.get(i).getWeight(),
                    differential);

        }
        System.out.println("-------------------------------");
        System.out.println("Net Weight Loss/Gain = " + netChange);
        System.out.println("-------------------------------");
    }
}
