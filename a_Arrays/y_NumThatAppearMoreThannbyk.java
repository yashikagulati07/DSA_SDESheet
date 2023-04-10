// package a_Arrays;

// import java.util.*;

// public class y_NumThatAppearMoreThannbyk {
//     public static void more(int a[], int n, int k){
//         int x = n/k;
//         HashMap<Integer, Integer> y = new HashMap<>();
//         for(int i=0; i<n; i++){
//             if(!y.containsKey(a[i])){
//                 y.put(a[i],1);
//             } else{
//                 int cnt = y.get(a[i]);
//                 y.put(a[i],cnt+1);
//             }
//         }
//         for(Map.Entry m : y.entrySet()){
//             Integer temp =(Integer)m.getValue();
//             if(temp>x){
//                 System.out.println(m.getKey());
//             }
//         }
//     }
// }
