class Solution {
    public int[] dailyTemperatures(int[] temp) {
        /*  we have to return an array with result containing the next warm day if there is.

            soln1: brute force > for the element i in temp array. we check if there's a day further with greater temp. if it's there we find the number of days by subtracting the j th index by i th index.
            but if we reach the end of the array and still didn't find an element with higher value.
            we add 0 at result[i].
            [30,38,30,36,35,40,28]

            Let's write a code for the above solution first.
        */
        int[] result= new int[temp.length];
        for( int i=0; i<temp.length; i++){
            // run another loop.
            for( int j=i+1;j<temp.length;j++){
                if(temp[j]>temp[i]){
                    result[i]=j-i;
                    break;
                }
            }

        }
        return result;

            
    }
}
