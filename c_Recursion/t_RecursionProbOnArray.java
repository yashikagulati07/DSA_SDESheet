import java.util.ArrayList;

public class t_RecursionProbOnArray {

    // Check if array is sorted using recursion 
    static boolean checkArraySorted(int a[], int ind){
        if(ind == a.length-1){
            return true;
        }
        return a[ind] < a[ind+1] && checkArraySorted(a, ind+1);
    }

    static boolean linearSearch(int a[], int ind, int target){
        if(ind == a.length){
            return false;
        }
        return a[ind] == target || linearSearch(a, ind+1, target);
    }

    static int findIndexInLinearSearch(int a[], int ind, int target){
        if(ind == a.length){
            return -1;
        }
        if(a[ind] == target){
            return ind;
        }
        return findIndexInLinearSearch(a, ind+1, target);
    }

    static ArrayList<Integer> al = new ArrayList<>();
    static int findAllIndexes(int a[], int ind, int target){
        if(ind == a.length){
            return -1;
        }
        if(a[ind] == target){
            al.add(ind);
        }
        return findAllIndexes(a, ind+1, target);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,3,4,6,9};
        System.out.println(checkArraySorted(a, 0));

        System.out.println(linearSearch(a, 0, 4));

        System.out.println(findIndexInLinearSearch(a, 0, 4));

        System.out.println(findAllIndexes(a, 0, 3));

    }
}
