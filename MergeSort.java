class MergeSort{
  void sort(int arr[], int low, int high){
    if(low<high){
      int mid = low +(high - low)/2;
      sort(arr, low , mid);
      sort(arr, mid +1, high);
      merge(arr, low , high, mid);
    }
  }
  void merge(int arr[], int low, int high, int mid){
    int n1 = mid - low  + 1;
    int n2 = right - mid;
    
    int L[] = new int[n1];
    int R[] = new int[n2];
    
    for(int i = 0; i<n1; i++){
      L[i] = arr[l+i];
    }
    for(int j = 0; j<n2; j++){
      R[j] = arr[m + 1 + j];
    }
    
    int i = 0,j = 0;
    int k = 0;
    while(i < n1 && j < n2){
      if(L[i] <=  R[j]){
        arr[k] = L[i];
        i++;
      }
      else{
        arr[k] = R[j];
        j++;
      }
      k++;
    }
    while(i < n1){
      arr[k] = L[i];
      i++;
      k++;
    }
    while(j < n2){
      arr[k] = R[j];
      j++;
      k++;
    }
  }
}
