package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int[]arr1={1,2,3};
        int[]arr2={4,5,6};
        int[]arr3={4,5,6};
        int[][]arr2D={{1,2,3},{4,5,6},{4,5,6}};
        // 3 dimensioanl array contains 2d arrays
        //                 0         1       2        0        1       2
        int[][][]arr3D={{{1,2,3},{4,5,6},{4,5,6}},{{1,2,3},{4,5,6},{4,5,6}}};// as much as i can create 2 dimensional array into 3D
        //index number                0                         1
        // [index num of 2DArray],[index num of 1D array][index number of elements]
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(arr3D[1][2][1]);
        //{4,5,6}
        for(int[][]each2D:arr3D){
            for(int[]each1D:each2D){
                for (int element:each1D){
                    System.out.println(element);
                }
            }
        }
        System.out.println("------------------------------");
        //int[][][][]arr4D={{{1,2,3},{4,5,6},{4,5,6}},  {{1,2,3},{4,5,6},{4,5,6}}}      }
    //index                                          0                                1
       // for[int[][][]each3D:arr4D]{
            //    for(int [][]each2D:each)
        }

    }

