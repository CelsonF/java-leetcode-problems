package leetcode.letterCombinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsSolution {

    /**
     * Returns all possible letter combinations that the number could represent.
     *
     * @param digits the string of digits
     * @return a list of all possible letter combinations
     */
    public static final Map<Character, String> phoneMap = Map.of(
        '2',"abc",
        '3',"def",
        '4',"ghi",
        '5',"jkl",
        '6',"mno",
        '7',"pqrs",
        '8',"tuv",
        '9',"wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits == null || digits.length() == 0) {
            return result;
        }
 
        backtrack(result, new StringBuilder(), digits, 0);

        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, String digits, int index) {
        if(index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneMap.get(digits.charAt(index));
        for(char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result,current,digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }


    
}
