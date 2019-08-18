import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Game {
    static int HIGH_CARD = 1;
    static int PAIR = 2;
    static int TWO_PAIR = 3;
    static int THREE_OF_A_KIND = 4;
    static int STRAIGHT = 5;
    static int FLUSH = 6;
    static int FULL_HOUSE = 7;
    static int FOUR_OF_A_KIND = 8;
    static int STRAIGHT_FLUSH = 9;


    public String compare(Player player1, Player player2) {

        List<String> nums1 = player1.getNums();
        List<String> nums2 = player2.getNums();
        List<String> types2 = player2.getTypes();
        List<String> types1 = player1.getTypes();
        int style1 = getStyle(nums1, types1);
        int style2 = getStyle(nums2, types2);


        if (style1 > style2) {
            return "player1 win!";
        } else if (style1 < style2) {
            return "player2 win!";
        } else {
            if (style1 == HIGH_CARD) {
                return compareHighCard(nums1, nums2);
            } else if (style1 == PAIR) {
                return comparePair(nums1, nums2);
            } else if (style1 == TWO_PAIR) {
               return compareTwoPair(nums1, nums2);

            } else if (style1 == THREE_OF_A_KIND) {
                return compareTriple(nums1, nums2);

            } else if (style1 == FOUR_OF_A_KIND) {
                return compareQuadruple(nums1, nums2);

            } else if (style1 == STRAIGHT_FLUSH || style1 == STRAIGHT) {
               return compareStraightFlushORStraight(nums1, nums2);

            } else if (style1 == FLUSH) {
                if (Integer.parseInt(types1.get(0)) < Integer.parseInt(types2.get(0))) {
                    return "player2 win!";
                } else if (Integer.parseInt(types1.get(0)) > Integer.parseInt(types2.get(0))) {
                    return "player1 win!";
                }

            }
        }

        return "tied!";
    }

    private String compareStraightFlushORStraight(List<String> nums1, List<String> nums2) {
        if (Integer.parseInt(nums1.get(0)) < Integer.parseInt(nums2.get(0))) {
            return "player2 win!";
        } else if (Integer.parseInt(nums1.get(0)) > Integer.parseInt(nums2.get(0))) {
            return "player1 win!";
        }
        return "tied!";
    }

    private String compareQuadruple(List<String> nums1, List<String> nums2) {
        List<String> str1 = getDuplicateMax(nums1, FOUR_OF_A_KIND);
        List<String> str2 = getDuplicateMax(nums2, FOUR_OF_A_KIND);
        if (Integer.parseInt(str1.get(0)) < Integer.parseInt(str2.get(0))) {
            return "player2 win!";
        } else if (Integer.parseInt(str1.get(0)) > Integer.parseInt(str2.get(0))) {
            return "player1 win!";
        }
        return "tied!";
    }

    private String compareTriple(List<String> nums1, List<String> nums2) {
        List<String> str1 = getDuplicateMax(nums1, THREE_OF_A_KIND);
        List<String> str2 = getDuplicateMax(nums2, THREE_OF_A_KIND);
        if (Integer.parseInt(str1.get(0)) < Integer.parseInt(str2.get(0))) {
            return "player2 win!";
        } else if (Integer.parseInt(str1.get(0)) > Integer.parseInt(str2.get(0))) {
            return "player1 win!";
        }
        return "tied!";
    }

    private String compareTwoPair(List<String> nums1, List<String> nums2) {
        List<String> str1 = getDuplicateMax(nums1, TWO_PAIR);
        List<String> str2 = getDuplicateMax(nums2, TWO_PAIR);

        for (int i = 0; i < 2; i++) {

            if (Integer.parseInt(str1.get(i)) < Integer.parseInt(str2.get(i))) {
                return "player2 win!";
            } else if (Integer.parseInt(str1.get(i)) > Integer.parseInt(str2.get(i))) {
                return "player1 win!";
            } else {
                List<String> rest1 = nums1.stream().filter(e -> !e.equals(str1.get(0))).filter(e -> !e.equals(str1.get(1))).collect(Collectors.toList());
                List<String> rest2 = nums2.stream().filter(e -> !e.equals(str2.get(0))).filter(e -> !e.equals(str2.get(1))).collect(Collectors.toList());
                if (Integer.parseInt(rest1.get(0)) < Integer.parseInt(rest2.get(0))) {

                    return "player2 win!";
                } else if (Integer.parseInt(rest1.get(0)) > Integer.parseInt(rest2.get(0))) {
                    return "player1 win!";
                }
            }

        }
        return "tied!";
    }

    private String comparePair(List<String> nums1, List<String> nums2) {
        List<String> str1 = getDuplicateMax(nums1, PAIR);
        List<String> str2 = getDuplicateMax(nums2, PAIR);

        if (Integer.parseInt(str1.get(0)) < Integer.parseInt(str2.get(0))) {
            return "player2 win!";
        } else if (Integer.parseInt(str1.get(0)) > Integer.parseInt(str2.get(0))) {
            return "player1 win!";
        } else {
            List<String> rest1 = nums1.stream().filter(e -> !e.equals(str1.get(0))).collect(Collectors.toList());
            List<String> rest2 = nums2.stream().filter(e -> !e.equals(str2.get(0))).collect(Collectors.toList());
            for (int i = 0; i < 3; i++) {
                if (Integer.parseInt(rest1.get(i)) < Integer.parseInt(rest2.get(i))) {

                    return "player2 win!";
                } else if (Integer.parseInt(rest1.get(i)) > Integer.parseInt(rest2.get(i))) {
                    return "player1 win!";
                }
            }

        }
        return "tied!";
    }

    private String compareHighCard(List<String> nums1, List<String> nums2) {
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).compareTo(nums2.get(i)) == -1) {
                return "player2 win!";
            } else if (nums1.get(i).compareTo(nums2.get(i)) == 1) {
                return "player1 win!";
            }
        }
        return "tied!";
    }

    private List<String> getDuplicateMax(List<String> nums, int style) {

        Map<String, Long> map = nums.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if (style == PAIR) {
            for (int i = 0; i < nums.size(); i++) {
                if (map.get(nums.get(i)) == 2) {
                    return Arrays.asList(nums.get(i));
                }
            }
        } else if (style == TWO_PAIR) {
            List<String> str = new ArrayList<>();

            map.entrySet().stream().map(e -> e.getValue() == 2 ? str.add(e.getKey()) : "").collect(Collectors.toList());
            return str;

        } else if (style == THREE_OF_A_KIND) {
            for (int i = 0; i < nums.size(); i++) {
                if (map.get(nums.get(i)) == 3) {
                    return Arrays.asList(nums.get(i));
                }
            }

        } else if (style == FOUR_OF_A_KIND) {
            for (int i = 0; i < nums.size(); i++) {
                if (map.get(nums.get(i)) == 4) {
                    return Arrays.asList(nums.get(i));
                }
            }

        }
        return null;

    }


    private int getStyle(List<String> nums, List<String> types) {
        int cnt = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i).equals(nums.get(i + 1))) {
                cnt++;
            }
        }

        if (cnt == 3) {
            if (nums.get(1).equals(nums.get(3))) {
                return FOUR_OF_A_KIND;
            } else {
                return FULL_HOUSE;
            }
        } else if (cnt == 2) {
            if (nums.get(1).equals(nums.get(3)) || nums.get(0).equals(nums.get(2)) || nums.get(2).equals(nums.get(4)))
                return THREE_OF_A_KIND;
            else {
                return TWO_PAIR;
            }

        } else if (cnt == 1) {
            return PAIR;
        }
        if (isFlush(types) && isStraight(nums)) {
            return STRAIGHT_FLUSH;
        } else if (isFlush(types)) {
            return FLUSH;
        } else if (isStraight(nums)) {
            return STRAIGHT;
        }

        return HIGH_CARD;
    }

    private boolean isFlush(List<String> types) {
        if (types.stream().distinct().count() == 1) {
            return true;
        }
        return false;
    }

    private boolean isStraight(List<String> nums) {
        boolean flag = true;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (Integer.parseInt(nums.get(i)) != (Integer.parseInt(nums.get(i + 1)) - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
