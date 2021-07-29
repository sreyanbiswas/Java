The idea is to use recursion. In the recursive function, a flag is passed to indicate whether the current element in output should be taken from ‘A’ or ‘B’. Then we Will apply the Recursive Calls to solve the given problem. Refer from the below code for further Understanding of the Question.
We will Use a Function to print the array at any time.
Code

void generateUtil(int A[], int B[], int C[], int i, int j, int m, int n, int len, boolean flag)  { 
        if (flag) { 
             if (len != 0)

                printArr(C, len + 1); 

        for (int k = i; k < m; k++)  { 
            if (len == 0){ 
                C[len] = A[k]; 
                generateUtil(A, B, C, k + 1, j, m, n, len, !flag); 
            }  
            else if (A[k] > C[len])   { 
                    C[len + 1] = A[k]; 
                    generateUtil(A, B, C, k + 1, j, m, n, len + 1, !flag); 
            } 
        } 
    }         
    else{ 
        for (int l = j; l < n; l++)  { 
            if (B[l] > C[len])  { 
                C[len + 1] = B[l]; 
                generateUtil(A, B, C, i, l + 1, m, n, len + 1, !flag); 
            } 
        } 
    } 
} 

void printArr(int arr[], int n) { 
    for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
    System.out.println(""); 
} 