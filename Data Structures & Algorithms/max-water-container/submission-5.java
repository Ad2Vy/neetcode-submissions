class Solution {
    public int maxArea(int[] heights) {
        /*
        A better method would require O(n) time complexity.
        {1,4,3,2,4,3,5}
                                    |
                |           |       |
                |   |       |   |   |  
                |   |   |   |   |   |
            |   |   |   |   |   |   |

        For bettwe time complexity.
        we will use pointers.   rMax, lMax
                                Right,Left
        
        keep track of maxArea.
        */
        int l=0,r=heights.length-1;
        int rMax=-1,lMax=-1;
        int maxArea=-1;
        while(l<r){
            maxArea=Math.max(maxArea, (r-l)*Math.min(heights[l],heights[r]));
            if(heights[l]<=heights[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return maxArea;

    }
}
