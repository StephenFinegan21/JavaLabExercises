public class MaxNum {
    int max; //This value will be returned to the main programme as the max number in the passed in array
    int[] arr; //The array passed in by the user

    public MaxNum(){
        max = 0;
        arr = new int[5]; //Declare it as having 5 values
    }

    //Setter for the array - array passed in by the user is set to the array in this class
    public void setArray(int[] userArr){
        for(int i = 0; i<arr.length; i++){
            //Cycle through the array and each element is copied
            arr[i] = userArr[i];
        }
    }

    //Calculate the max
    public void computeMax(){
        max = arr[0];//First set the max as the very first value in the array
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > max){//As the array is cycled through check if the current value is greater than the current max
                max = arr[i]; //If this is true then the current value becomes the new max value
            }
        }
    }

    public int getMax(){
        return max;

    }

}