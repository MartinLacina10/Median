import java.util.*; 
  
class Median{ 
  
public static double findMedian(int a[], int n){ 
       
        Arrays.sort(a); 
  
        if (n % 2 != 0) 
            return (double)a[n / 2];
 
return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0; 
} 
  
    
public static void main(String args[]){ 

        int a[] = { 4, 2, 3, 4, 5, 5 }; 
        int n = a.length; 
        System.out.println("Median = " + findMedian(a, n)); 
    } 
}