package sort;

/**
 * 二分查找法
 * create by frank
 * on 2017/01/06
 */
public class BinarySearch {
    public static final int[] nums = {1,3,8,11,21,22,26,28,35,55,105,888,1111,2254};

    public static int binary(int search) {

        int start = 0;
        int end = nums.length - 1;
        int index;
        while (start <= end){
            index = (start + end) / 2;
            if(search > nums[index])
                start = index + 1;
            else if(search < nums[index])
                end = index -1;
            else return 1;
        }

        return 0;
    }

    public static void main (String args[]){

        System.out.println("查找结果："+BinarySearch.binary(3));

    }
}
