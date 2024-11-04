/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorts;

/**
 *
 * @author user
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Swap");
        InsertionSortSwap();
        System.out.println();
        System.out.println();
        
        System.out.println("Swap Des");
        InsertionSortSwapDes();
        System.out.println();
        System.out.println();
        
        System.out.println("OP");
       InsertionSortOp();
       System.out.println();
       System.out.println();
       
       System.out.println("Op Des");
       InsertionSortOpDes();
       System.out.println();
       System.out.println();
       
    }
    
public static void InsertionSortSwap(){
        int arr[] = {5,7,3,9,4};
    int j;
    int key;
    int i;
    int swap;
    
        for(i=1;i<arr.length;i++){
            j=i-1;
            while(j>=0 && arr[j]>arr[j+1]){
                swap =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= swap;
                j--;
            }        
    }
        for(i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
    
    }
    
public static void InsertionSortOp(){
    int arr[] = {5,7,3,9,4};
    int j;
    int key;
    int i;
    
        for(i=1;i<arr.length;i++){
            key = arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
           
    }
        for(i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
        
}
public static void InsertionSortSwapDes(){
     int arr[] = {5,7,3,9,4};
    int j;
    int key;
    int i;
    int swap;
    
        for(i=1;i<arr.length;i++){
            j=i-1;
            while(j>=0 && arr[j]<arr[j+1]){
                swap =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= swap;
                j--;
            }        
    }
        for(i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
    
    
    }
public static void InsertionSortOpDes(){
    int arr[] = {5,7,3,9,4};
    int j;
    int key;
    int i;
    
        for(i=1;i<arr.length;i++){
            key = arr[i];
            j=i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
           
    }
        for(i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
        
}
}

