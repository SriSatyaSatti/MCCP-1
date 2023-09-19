  static int firstElement(int arr[], int n, int k) { 
     HashMap<Integer,Integer> h=new HashMap<>();
     for(int i=0;i<n;i++){
         if(h.containsKey(arr[i])){
             int x=h.get(arr[i]);
             h.put(arr[i],x+1);
         }else{
             h.put(arr[i],1);
         }
     }
     for(int i=0;i<n;i++){
         if(h.get(arr[i])==k)
         return arr[i];
     }
     return -1;
    }
