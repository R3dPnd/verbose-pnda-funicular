package com.harmless.intrusion;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int endIndex = nums.length-1;
        for(int i=0; i<=endIndex; i++){
            if(nums[i]==val){
                int temp = nums[i];
                nums[i] = nums[endIndex];
                nums[endIndex] = temp;
                i--;
                endIndex--;
            }
        }
        return endIndex+1;
    }
}
