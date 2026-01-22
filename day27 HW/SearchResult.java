public class SearchResult {
    
    public static void main(String[] args)
    {
        int[] arr = {13,14,17,19,27,143};
        int searchvalue = 1443;
        
        SearchResult ob = new SearchResult();
        int index = ob.binarySearch(arr, searchvalue);
        System.out.println(index);
    }
    
    public int binarySearch(int[] arr, int searchvalue)
    {
        int left = 0;
        int right = arr.length-1;
        int mid = (left + right)/2;
        
        while(left <= right)
        {
            if(searchvalue == arr[mid])
            {
                return mid;
            } else if(searchvalue > arr[mid])
            {
                left = mid+1;
            } else if(searchvalue < arr[mid])
            {
                right = mid-1;
            }
            mid = (left + right)/2;
        }
        return -1;
    }
}