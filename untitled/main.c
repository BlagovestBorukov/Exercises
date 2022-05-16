#include <stdio.h>

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
