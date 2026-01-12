import java.util.List;

public class ListManager {
    public void addElement(List<Integer> li, int element) { li.add(element); }
    public void removeElement(List<Integer> li, int element) { li.remove(Integer.valueOf(element)); }
    public int getSize(List<Integer> li) { return li.size(); }
}
