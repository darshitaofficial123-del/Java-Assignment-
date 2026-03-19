import java.util.*;
public class ArrayQuestions{
    public static void main(String[] args){
        //calling all questions here
        MissingNumber();
        RotateArray();
        MoveZeroes();
        MaxSubarraySum();
        TwoSum();
        FindDuplicates();
        MajorityElement();
        Sort012();
        StockBuySell();
        MaxProductSubarray();
        CountOccurrences();
    }

    //ques1-MissingNumber
    public static void MissingNumber(){
        int[] arr = {1,2,3,5,6};
        int n=6;

        int total=n*(n+1)/2;
        int sum=0;

        for (int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }

        System.out.println("Missing number : " + (total-sum));
    }

    //ques2-RotateArray
    public static void RotateArray(){
        int[] arr = {1,2,3,4,5};
        int k=4;

        int n=arr.length;
        int[] temp=new int[n];

        for (int i=0;i<n;i++) {
            temp[(i+k)%n]=arr[i];
        }

        System.out.println("Rotated Array : " + Arrays.toString(temp));
    }

    //ques3-MoveZeroes
    static void MoveZeroes(){
        int[] arr={0,1,0,3,12};
        int j=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        System.out.println("Move Zeroes : " + Arrays.toString(arr));
    }

    //ques4-MaxSubarraySum
    static void MaxSubarraySum(){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};

        int max=arr[0];
        int sum=arr[0];

        for(int i=1;i<arr.length;i++) {
            sum=Math.max(arr[i], sum + arr[i]);
            max=Math.max(max, sum);
        }

        System.out.println("Max Subarray Sum = " + max);
    }

    //ques5-TwoSum
    static void TwoSum(){
        int[] arr={2,7,11,15};
        int target=9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];

            if(map.containsKey(diff)){
                System.out.println("Two Sum Indexes : " + map.get(diff)+" "+i);
                return;
            }

            map.put(arr[i],i);
        }
    }

    //ques6-FindDuplicates
    static void FindDuplicates(){
        int[] arr={1,2,3,2,4,5,3};

        HashSet<Integer> set=new HashSet<>();

        System.out.print("Duplicates : ");
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]+" ");
            } else{
                set.add(arr[i]);
            }
        }
        System.out.println();
    }

    //ques7-MajorityElement
    static void MajorityElement(){
        int[] arr={3,2,3};

        for(int i=0;i<arr.length;i++) {
            int count=0;

            for(int j=0;j<arr.length;j++) {
                if(arr[i]==arr[j])
                    count++;
            }

            if(count>arr.length/3){
                System.out.println("Majority Element : " + arr[i]);
                return;
            }
        }
    }

    //ques8-Sort 012
    static void Sort012(){
        int[] arr = {2,0,1,2,1,0};

        Arrays.sort(arr);

        System.out.println("Sorted 0 1 2 : " + Arrays.toString(arr));
    }

    //ques9-StockBuySell
    static void StockBuySell(){
        int[] price={7,1,5,3,6,4};

        int min=price[0];
        int profit=0;

        for(int i=0;i<price.length;i++){
            if(price[i]<min)
                min = price[i];

            if(price[i]-min>profit){
                profit=price[i]-min;
            }
        }

        System.out.println("Max Profit = " + profit);
    }

    //ques10-MaxProductSubarray
    static void MaxProductSubarray(){
        int[] arr={2,3,-2,4};

        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            int product=1;

            for(int j=i;j<arr.length;j++){
                product*=arr[j];
                max=Math.max(max, product);
            }
        }

        System.out.println("Max Product : "+max);
    }

    //ques11-CountOccurrences
    static void CountOccurrences() {
        int[] arr={1,2,2,2,3,4};
        int x=2;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                count++;
        }

        System.out.println("Count : "+count);
    }
}