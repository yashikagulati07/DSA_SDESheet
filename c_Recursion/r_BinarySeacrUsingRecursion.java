public class r_BinarySeacrUsingRecursion {

    static int search(int a[], int target, int s, int e) {
        if (e >= s) {
            int mid = s + (e - s) / 2;
            if (a[mid] == target) {
                return mid;
            }
            if (a[mid] > target) {
                return search(a, target, s, mid - 1);
            } else {
                return search(a, target, mid + 1, e);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 66, 67, 68 };
        int n = a.length;
        int target = 4;
        System.out.println(search(a, target, 0, n - 1));
    }
}
