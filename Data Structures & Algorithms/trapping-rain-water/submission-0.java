class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int[] lMax=new int[len];
        int[] rMax= new int[len];
        int res=0;
        //loop one to set values to lMax and rMax.
        
        int l=height[0],r=height[len-1];
        lMax[0]=l;
        rMax[len-1]=r;
        
        for(int i=0;i<len;i++){
            if(i==0){
                lMax[i]=(height[i]>=l)?height[i]:l;
                rMax[len-1-i]=(height[len-1-i]>=r)?height[len-1-i]:r;
                continue;
            }
            lMax[i]=(height[i]>=lMax[i-1])?height[i]:lMax[i-1];
            rMax[len-1-i]=(height[len-1-i]>=rMax[len-i])?height[len-1-i]:rMax[len-i];
        }
        //This would have set the lMax and rMax arrays
        //Now loop again to calculate total water
        //  res += (min(lMax,rMax) - height);
        for(int i=0 ;i < len; i++){
            res+= (Math.min(lMax[i],rMax[i]) -height[i]) ;
        }
        return res;

    }
}
