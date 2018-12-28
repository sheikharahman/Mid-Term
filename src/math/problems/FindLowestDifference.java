package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int dif = array1[0];
        for(int j=0;j< array1.length;j++){
            for(int i=0;i<array2.length;i++){
                int d =Math.abs(array1[j]-array2[i]);
                if (d<dif)dif =d;
            }
        }

         System.out.println(dif);


    }

}
