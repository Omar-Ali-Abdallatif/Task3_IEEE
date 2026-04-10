import java.util.Arrays;
import java.util.Locale;

public class Main {
    void main(){
        int [] numsMissFn = {9,6,4,2,3,5,7,0,1};
        int [] numsConDuplicateFn = {1,4,3,2};
        int []  numsSingleNumFn = {4,1,2,1,2};
        String [] strs = {"flower","flow","flight"};
        int [] nums = {2,7,11,15};
        int target = 9;

        System.out.println(missingNumber(numsMissFn));
        System.out.println(containsDuplicate(numsConDuplicateFn));
        System.out.println(singleNumber(numsSingleNumFn));
        System.out.println(longestCommonPrefix(strs));
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum=0,missingNum;
        int arrSum = (size*(size+1))/2;

        for(int i=0; i < size; i++){
            sum += nums[i];
        }

        missingNum = arrSum - sum;
        return missingNum;
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if (nums[i] == nums[i-1]){
                    return true;
            }
        }
        return false;
    }

    public int singleNumber(int[] nums) {
        int result=0;
        for (int i : nums){
            result ^= i;
        }
        return result;

    }

    public String longestCommonPrefix(String[] strs) {
            String firstStr = strs[0];
            for (int i=1; i<strs.length; i++){
                String commonChar="";
                for (int j=0; j<firstStr.length() && j<strs[i].length(); j++){
                    if (firstStr.charAt(j) == strs[i].charAt(j)){
                        commonChar += firstStr.charAt(j);
                    }else {
                        break;
                    }
                }
                firstStr = commonChar;
            }
            return firstStr;
    }

    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return null;
    }
}
