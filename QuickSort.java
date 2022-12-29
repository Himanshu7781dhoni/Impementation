class QuickSort{
  void sort(int arr[], int low, int high){
    if(low < high){
      int pivot = partition(arr, low, high);
      sort(arr, low, pivot -1);
      sort(arr, pivot + 1; high);
    }
  }
  int partition(int arr[], int low, int high){
    //here we are considering the highest element as pivot
    int pivot = arr[high];
    int i = (low - 1);
    for(int j = low; j < high; j++){
      //if the current is element is smaller than or equal to pivot
      if(arr[j] <= pivot){
        i++;
        
        //swap arr[i] with arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
      //swap arr[i+1] and arr[high](or you can say pivot)
      int temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;
      
      return i + 1;
  }
  
  //Second implementation of partition method
  int partition(int arr[], int low, int high){
    //here we take the first element as pivot
    int pivot = arr[low];
    int i = low;
    int j = high;
    while(i < j){
      while(arr[i] <= pivot) i++;
      while(arr[j] > pivot) j++;
      if(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[j];
    arr[j] = arr[low];
    arr[low] = temp;
    
    return j;
  }
        
       
    
