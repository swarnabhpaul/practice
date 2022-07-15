import java.util.*;
//Problem Link: https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/0/?track=DSASP-Recursion&batchId=154#

class Solution {
    // Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int a[], int N) {
        // your code here
        String strArr[] = new String[10];
        strArr[2] = "abc";
        strArr[3] = "def";
        strArr[4] = "ghi";
        strArr[5] = "jkl";
        strArr[6] = "mno";
        strArr[7] = "pqrs";
        strArr[8] = "tuv";
        strArr[9] = "wxyz";
        ArrayList<String> result = new ArrayList<>();
        findWords(a, N, 0, "", result, strArr);
        return result;
    }

    static void findWords(int arr[], int N, int arrIndex, String curr, ArrayList<String> result, String strArr[]) {
        if (arrIndex == N) {
            result.add(curr);
            return;
        }
        for (int i = 0; i < strArr[arr[arrIndex]].length(); i++) {
            findWords(arr, N, arrIndex + 1, curr + strArr[arr[arrIndex]].charAt(i), result, strArr);
        }
    }
}