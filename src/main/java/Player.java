import java.util.Collections;
import java.util.List;

public class Player {
    private List<String> nums;
    private List<String> types;


    public List<String> getNums() {
        return nums;
    }

    public List<String> getTypes() {
        return types;
    }

    public Player(List<String> nums, List<String> types) {
        this.nums = nums;
        this.types = types;
        convert();
    }

    private void convert() {
        this.getNums().replaceAll(e -> e.equals("J") ? "11" : e);
        this.getNums().replaceAll(e -> e.equals("Q") ? "12" : e);
        this.getNums().replaceAll(e -> e.equals("K") ? "13" : e);
        this.getNums().replaceAll(e -> e.equals("A") ? "14" : e);

        this.getTypes().replaceAll(e -> e.equals("D") ? "1" : e);
        this.getTypes().replaceAll(e -> e.equals("C") ? "2" : e);
        this.getTypes().replaceAll(e -> e.equals("H") ? "3" : e);
        this.getTypes().replaceAll(e -> e.equals("S") ? "4" : e);


    }
}
