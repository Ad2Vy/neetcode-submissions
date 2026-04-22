class Solution {
    public int maxArea(int[] heights) {
        /*
        brute force method would be to calculate  the area's for all and keep track of the largest.\
        need to calculate height and width
        height will be min(height[i],height[j])
        width will be j-i.
         */
        int maxArea=-1;
        for(int i=0;i<heights.length;i++){
            
            for(int j=i+1;j<heights.length;j++){
            int height=Math.min(heights[i],heights[j]);
            int width=j-i;
            maxArea= Math.max(maxArea, height*width);
            }
        }
        return maxArea;
    }
}
