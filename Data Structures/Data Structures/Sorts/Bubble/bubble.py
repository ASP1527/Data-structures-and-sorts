# function to sort in ascending order
def bubbleAscending(arr):
    # for each pass in the bubble sort
    for i in range(0, len(arr)):
        # for each unsorted item in the list
        for j in range(0, len(arr)-1-i):
            # if the current item is smaller than the next item, swap them
            if arr[j] > arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
    # returns a sorted array
    return arr

# function to sort in ascending order
def bubbleDescending(arr):
    for i in range(0, len(arr)):
        # for each unsorted item in the list
        for j in range(0, len(arr)-1-i):
            # if the current item is larger than the next item, swap them
            if arr[j] < arr[j+1]:
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
    # returns a sorted array
    return arr

# tests
print(bubbleAscending([1, 6, 7, 3, 4, 5, 2]))
print(bubbleDescending([1, 6, 7, 3, 4, 5, 2]))

# outputs
'''
[1, 2, 3, 4, 5, 6, 7]
[7, 6, 5, 4, 3, 2, 1]
'''