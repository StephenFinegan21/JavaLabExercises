public class MinNum {
    private int min; //This value will be returned to the main programme as the minimum number in the passed in array
    private int[] arr; //The array passed in by the user

    public MinNum(){
        min = 0;
        arr = new int[5]; //Declare it as having 5 values
    }

    //Setter for the array - array passed in by the user is set to the array in this class
    public void setArray(int[] userArr){
        for(int i = 0; i<arr.length; i++){
            //Cycle through the array and each element is copied
            arr[i] = userArr[i];
        }
    }

    //Calculate the min
    public void computeMin(){
        min = arr[0]; //First set the min as the very first value in the array
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] < min){ //As the array is cycled through check if the current value is less than the current min
                min = arr[i]; //If this is true then the current value becomes the new minimum value
            }
        }
    }
    /** Visualisation of the above eg array is [8,2,6,4,1]
     *  min = arr[0]; sets the min to 8
     *  cycles through loop 5 times and evaluates 1(is 8 < 8) = no 2(is 2 less than 8) = yes so it sets 2 as the new min ....
     */

    public int getMin(){
        return min;
    }

}