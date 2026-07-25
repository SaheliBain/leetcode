class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = 0, m = 0;
        int res[] = new int[nums.length];
        
        // Count positive and negative numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                n++;
            } else {
                m++;
            }
        }
        
        int[] a = new int[n];
        int[] b = new int[m];
        int posIdx = 0; 
        int negIdx = 0; 

        // Split into arrays a and b
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                a[posIdx] = nums[i];
                posIdx++;
            } else {
                b[negIdx] = nums[i];
                negIdx++;
            }
        }
        
        // Square elements in 'a' (Fixed bounds: < posIdx)
        for (int k = 0; k < posIdx; k++) {
            a[k] = a[k] * a[k];
        }
        
        // Square elements in 'b' (Fixed bounds: < negIdx)
        for (int k = 0; k < negIdx; k++) {
            b[k] = b[k] * b[k];
        }

        // Merge the two arrays
        int l = 0;             // Pointer for array a (reads left to right)
        int j = negIdx - 1;    // Pointer for array b (reads right to left!)
        int ind = 0;           // Pointer for res
        
        while (l < n && j >= 0) {
            if (a[l] < b[j]) {
                res[ind] = a[l];
                l++;
            } else {
                res[ind] = b[j];
                j--; // Move backwards in b
            }
            ind++;
        }
        
        // Add remaining elements from b (if any)
        while (j >= 0) {
            res[ind] = b[j];
            j--;
            ind++;
        }
        
        // Add remaining elements from a (if any)
        while (l < n) {
            res[ind] = a[l];
            l++;
            ind++;
        }
        
        return res;
    }
}