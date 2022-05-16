#include <stdio.h>
#include <float.h>
#include <stdlib.h>
#include <math.h>

// Структура за представяне на точка с координати (x;y)
typedef struct Point Point;
struct Point
{
    int x;
    int y;
};

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


Point firstPoint;
Point secondPoint;

//Сортиране масив от точки по X
int compareX(const void* a, const void* b)
{
    Point *p1 = (Point *)a;
    Point *p2 = (Point *)b;

    return (p1->x - p2->x);
}
// Сортиране масив от точки по Y
int compareY(const void* a, const void* b)
{struct
    Point *p1 = (Point *)a;
    Point *p2 = (Point *)b;

    return (p1->y - p2->y);
}

// Намиране на дистанцията между две точки
float dist(Point p1, Point p2)
{
    return sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
}

// A Brute Force method to return the smallest distance between two points
// in P[] of size n
float bruteForce(Point P[], int n)
{
    float min = FLT_MAX;
    for (int i = 0; i < n; ++i){
        for (int j = i+1; j < n; ++j){
            if (dist(P[i], P[j]) < min){
                min = dist(P[i], P[j]);
                firstPoint = P[i];
                secondPoint = P[j];
            }
        }
    }
    return min;
}

// Намиране на по малката от две float стойности
float min(float x, float y)
{
    return (x < y)? x : y;
}

// Намиране разстоянието на най-близките точки в strip с определен размер.
// Всички точки в strip[] се сортират по Y. Те имат горна граница на минимилно
// разстояние d.
float stripClosest(Point strip[], int size, float d)
{
    float min = d; // Инициализираме минималното разстояние d.

    qsort(strip, size, sizeof(Point), compareY);

    // Проверяваме всяка точка докато разликата между Y координата
    // е по-малка от d.
    // This is a proven fact that this loop runs at most 6 times
    for (int i = 0; i < size; ++i){
        for (int j = i+1; j < size && (strip[j].y - strip[i].y) < min; ++j){

            if (dist(strip[i],strip[j]) < min){
                min = dist(strip[i], strip[j]);
                firstPoint = strip[i];
                secondPoint = strip[j];
            }
        }
    }

    return min;
}

// Намираме най малкото разстояние с рекурсия. Масива P съдържа
// всички точки сортирани по X.
float closestUtil(Point P[], int n)
{
    // Ако точките са 2 или 3 използваме brute force.
    if (n <= 3)
        return bruteForce(P, n);

    // Намираме средата.
    int mid = n/2;
    Point midPoint = P[mid];

    // Изчисляваме най-малкото разстояние спрямо средата отляво dl и отдясно dr.
    float dl = closestUtil(P, mid);

    float dr = closestUtil(P + mid, n-mid);

    // Намираме по-малкото от двете разстояния.
    float d = min(dl, dr);

    // Масив strip[] съдържащ точките които са по-близо до средата от d.
    Point strip[n];
    int j = 0;

    for (int i = 0; i < n; i++){
        if (abs(P[i].x - midPoint.x) < d){
            strip[j] = P[i];
            j++;
        }
    }

    // Намираме най-близките точки в strip[]. Връщаме минималната стойност на d
    // и май-малкото разстояние е strip[].
    return min(d, stripClosest(strip, j, d) );
}

// Основната функция която намира най-малкото разстояние.
// Използваа основно closestUtil().
float closest(Point P[], int n)
{
    qsort(P, n, sizeof(Point), compareX);

    // Използваме рекурсивната функция closestUtil() за да намерим на-малкото разстояние.
    return closestUtil(P, n);
}

int main()
{
    Point P[] = {{2, 3}, {12, 20}, {40, 50}, {5, 1}, {12, 10}, {3, 4}};

    int n = sizeof(P) / sizeof(P[0]);

    printf("The smallest distance is %f between point with coordinates x - %d y- %d and point with coordinates x - %d y- %d.", closest(P, n), firstPoint.x, firstPoint.y, secondPoint.x,secondPoint.y);
    return 0;
}