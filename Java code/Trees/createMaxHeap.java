class heapImplementation{
    int size;
    int[] arr = new int[20];

    public void insertNewValue(int val) {
        arr[size] = val;
        int index = size;
        int parent = (index - 1) / 2;
        
        while(parent >= 0 && arr[parent] < arr[index]){
            int t = arr[index];
            arr[index] = arr[parent];
            arr[parent] = t;

            t = parent;
            index = parent;
            parent = (t - 1) / 2;
        }
        size++;
    }
    public int getMax(){
        return arr[0];
    }

    public int removeMax(){
        int max = arr[0];
        arr[0] = arr[size-1];
        size--;
        maxHeapify(0);
        return max;
    }

    public void maxHeapify(int index){
        int l, r;
        l = 2 * index + 1;
        r = 2 * index + 2;

        int largest = index;
        if(l < this.size && arr[l] > arr[largest])
            largest = l;
        if(r < this.size && arr[r] > arr[largest])
            largest = r;

        if(largest != index){
            int t = arr[largest];
            arr[largest] = arr[index];
            arr[index] = t;

            maxHeapify(largest);
        }
    }

    public void buildMaxHeap(int[] arr){
        this.arr = arr;
        this.size = arr.length;

        for(int i = size/2; i>=0; i--){
            maxHeapify(i);
        }
    }
    public void heapSort(int[] arr){
        // buildMaxHeap(arr);
        for (int i = arr.length-1; i > 1; i--) {
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;
            
            maxHeapify(i-1);
        }
    }
}

public class createMaxHeap {
    public static void main(String[] args) {
        heapImplementation h = new heapImplementation();
        int arr[] = {10, 7, 11, 30, 20, 38, 2, 45};

        // for(int var : arr)
        //     h.insertNewValue(var);
        
        // System.out.println(h.getMax());
        h.buildMaxHeap(arr); // this function use for when there was any array given
                        //  and told to change it into the maxHeap
        h.heapSort(arr);
        for(int var : arr)
            System.out.println(var);
    }
}
