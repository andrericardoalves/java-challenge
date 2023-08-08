package org.example;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        int smallestNumber = Integer.MAX_VALUE;
        int position = -1;

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] > 0 && nums[i] < smallestNumber){
                smallestNumber = nums[i];
                position = i;
            }

        }

        return position;
    }
}
