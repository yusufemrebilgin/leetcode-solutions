package array;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer `numRows`, return the first numRows of Pascal's triangle.
 * Example 1:
 *  - Input:    numRows = 5
 *  - Output:   [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 *  - Input:    numRows = 1
 *  - Output:   [[1]]
 */
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || j == i)
                    rowList.add(1);
                else
                    rowList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            list.add(rowList);
        }

        return list;
    }
}
