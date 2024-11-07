public class HW_7_3 {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearchImpl();

        Integer[] intArray = {1, 3, 5, 7, 9};
        int intKey = 5;
        int intResult = binarySearch.binarySearch(intArray, intKey);
        System.out.println("Integer Array: [1, 3, 5, 7, 9]");
        System.out.println("Searching for " + intKey);
        System.out.println("Result: " + (intResult != -1 ? "Found at index " + intResult : "Not found"));

        String[] strArray = {"apple", "banana", "cherry", "date", "fig"};
        String strKey1 = "cherry";
        String strKey2 = "grape";

        int strResult1 = binarySearch.binarySearch(strArray, strKey1);
        System.out.println("\nString Array: [apple, banana, cherry, date, fig]");
        System.out.println("Searching for \"" + strKey1 + "\"");
        System.out.println("Result: " + (strResult1 != -1 ? "Found at index " + strResult1 : "Not found"));

        int strResult2 = binarySearch.binarySearch(strArray, strKey2);
        System.out.println("\nString Array: [apple, banana, cherry, date, fig]");
        System.out.println("Searching for \"" + strKey2 + "\"");
        System.out.println("Result: " + (strResult2 != -1 ? "Found at index " + strResult2 : "Not found"));
    }
}

interface BinarySearch {
    int binarySearch(Integer[] array, Integer key);
    int binarySearch(String[] array, String key);
}

class BinarySearchImpl implements BinarySearch {

    public int binarySearch(Integer[] array, Integer key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid].equals(key)) {
                return mid;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }


    public int binarySearch(String[] array, String key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid].equals(key)) {
                return mid;
            } else if (array[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}