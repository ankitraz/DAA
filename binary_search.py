ls = [2,4,6,7,8,9]


def binarysearch(array, target):
    start = array[0]
    end =   array[len(array)-1]

    while start <= end:
        mid = (start+end)/2

        if target > array[mid]:
            start = mid + 1
        elif target < array[mid]:
            end = mid - 1
        else:
            return array[mid]

ans = binarysearch(array,7)

print(array[3])
