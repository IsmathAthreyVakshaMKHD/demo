class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here geeksforgeeks
        int index=0;
		int j=m-1;
		for(int i=0;i<n;i++){
		    while((j>=0) && (arr[i][j]==1)){
		        j--;
		        index=i;
		    }
		}
		int r=j==m-1?-1:index;
		return r;
    }
}