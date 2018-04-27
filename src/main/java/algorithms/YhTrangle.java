package algorithms;

/**
 * 杨辉三角
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */
public class YhTrangle {

    public void trangle(int x) {
        int []a = new int[x];
        int pre = 1;

        for (int i = 1; i <= x; i++) {

            for(int j =0 ;j < i;j++)
            {
                //每当遍历到一行的尾部  current = 0 --> (最后)pre = 0
                int current = a[j];
                a[j] =pre + current;
                pre =current;
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        YhTrangle yhTrangle = new YhTrangle();
        yhTrangle.trangle(5);
    }
}
