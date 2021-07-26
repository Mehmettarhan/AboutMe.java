package day27_Recap;

public class FirstUniqueElement {
    public static void main(String[] args) {
        int[] nums ={1,1,2,3,3,4,1,1,1};
        int firstUniqueElement=0;

        for (int j = 0; j < nums.length; j++) {//responsible for repeating the inner loop to find frequency of each element

            int frequency=0;
            for (int i = 0; i <nums.length ; i++) { // responsible for finding the frequency of one element
                if (nums[i]==nums[j]){
                    frequency++;

                }

            }
            if (frequency==1){
                firstUniqueElement=nums[j];
                break; //to make sure only the first unique element is returned from the loop

            }
        }
        System.out.println(nums);



    }
}
