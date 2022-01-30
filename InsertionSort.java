class InsertionSort{
  void sort(int arr[]){
    for(int i = 1; i < arr.length; i++){
      int key = arr[i];
      int j = i - 1;
      while(j >= 0 and arr[j] > key){
        arr[j+1] = arr[j];
        j = j-1;
      }
      arr[j+1] = key;
    }
  }
  class SelectionSort{
    void sort(int arr[]){
      int n = arr.length;
      for(int i = 0; i < n - 1; i++){
        int min_inx = i;
        for(int j = i+1; j < n; j++){
          if(arr[j] < arr[min_idx]){
            min_idx = j;
          }
          int temp = arr[min_idx];
          arr[min_idx] = arr[i];
          arr[i] = temp;
        }
      }
        
