#include <stdio.h>

int binarySearch(int array[], int target, int low, int high) {
  while (low <= high) {
    int mid = low + (high - low) / 2;

    if (array[mid] == target)
      return mid;

    if (array[mid] < target)
      low = mid + 1;

    else
      high = mid - 1;
  }

  return -1;
}

int main(void) {
    int arr[10] = {1,5,76,89,123};
    int target = 76;
    int result = binarySearch(arr, target, 0, 4);
    printf("The index of %d is %d, ", target, result);
}