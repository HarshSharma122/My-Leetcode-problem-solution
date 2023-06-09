public class semi_ordered_permutation_leetcode {
    public static int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int r1=0;
        int r2=0;
        while (true) {
            if(nums[0]==1 && nums[n-1]==n){
                break;
            }
            while(nums[0]!=1){
                int first = getPosition(1,nums);
                swap(first,first-1,nums);
                r1++;
            }
            while(nums[n-1]!=n){
                int last = getPosition(n,nums);
                swap(last,last+1,nums);
                r2++;
            }
        }
        int result = r1+r2;
        return result;

    }

    public static void swap(int a,int b,int[] nums){

        int temp= nums[a];
        nums[a]= nums[b];
        nums[b]=temp;

//        System.out.println("a"+a+"b"+b);
    }

    public static int getPosition(int a,int[] nums){

        for(int i=0;i<nums.length;i++){
            if(nums[i]==a){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]nums = {2,1,4,3};
        System.out.println(semiOrderedPermutation(nums));


    }
}
