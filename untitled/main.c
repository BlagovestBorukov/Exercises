#include <stdio.h>
void quicksort(float A[], int start, int stop)
{
    int m, j, i;
    m=A[(start+stop)/2];
    do
    {

        while (A[i]<m) i++;

        while (A[j]>m) j--;

        if(i<=j)
        {
            i++; j--;
        }
    }while (i<=j);

    if (start < j)
        quicksort(A, start, j);
    if (i < stop)
        quicksort(A, i, stop);
}

int main()
{
    int n,m;
    printf("rows: ");
    scanf("%d", &n);
    printf("columns: ");
    scanf("%d", &m);
    int arr[10][10], i, j;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            printf("Enter a[%d][%d]: ", i, j);
            scanf_s("%d", &arr[i][j]);
        }
    }
    printf("\n printing the elements ....\n");
    for (i = 0; i < n; i++)
    {
        printf("\n");
        for (j = 0; j < m; j++)
        {
            printf("%d\t", arr[i][j]);
        }
    }
}
