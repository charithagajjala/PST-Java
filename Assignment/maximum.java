class maximum {
    public static void main (String[] args){

        int[] arr = {2, 4, 5, 6, 7, 8};
        int max = arr[0];

        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Number is:"+ max);
    }
}



