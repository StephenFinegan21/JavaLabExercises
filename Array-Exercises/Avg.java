public class Avg {
    
    int[] arr;
    int avg;
    int sum;
    
    

    public Avg(){
        arr = new int[5];
        avg = 0;
        sum = 0;

    }

    public void setArray(int[] userArr){
        for(int i = 0; i<arr.length; i++){
            arr[i] = userArr[i];
        }
    }

    public void compute(){
        for(int i = 0; i<arr.length; i++){
            sum = sum+arr[i];
        }
    
        avg = sum/arr.length;
    }

    public int getAvg(){
        return avg;
    
    }


   
   


}
