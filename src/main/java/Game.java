import java.util.List;

public class Game {
    public String compare(Player player1, Player player2) {
        List<String> nums1 = player1.getNums();
        List<String> nums2 = player2.getNums();
        List<String> types2 = player2.getTypes();
        List<String> types1 = player1.getTypes();

        for (int i = 0; i < 5; i++){
            return nums1.get(i).compareTo(nums2.get(0)) == -1 ? "player2 win!" : "player1 win!";
        }

        return "tied!";
    }
}
