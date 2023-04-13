class stack:
    # constructor
    def __init__(self, size):
        # sets top to -1
        self.__top = -1
        # sets size var to size given by user
        self.__size = size
        # creates array of size given by user
        self.__data = [None] * self.__size
    
    # checks if the stack is full
    def isFull(self):
        return (self.__top == self.__size - 1)
    
    # checks if the stack is empty
    def isEmpty(self):
        return (self.__top == -1)
    
    # returns the item at the top
    def top(self):
        # checks if the stack is not empty
        if not stack.isEmpty(self):
            # returns the top item
            return self.__data[self.__top]
        # returns None if no items are in the stack
        return None

    # adds an item to the stack
    def push(self, item):
        # id the stack has space
        if not stack.isFull(self):
            # increment top
            self.__top += 1
            # add data at the top of the stack
            self.__data[self.__top] = item
            # return true
            return True
        # return false if item was not added
        return False

    # method to remove an item form the stack
    def pop(self):
        # checks if there is an item to remove
        if not stack.isEmpty(self):
            # gets the item
            item = self.__data[self.__top]
            # decrements the top
            self.top -= 1
            # returns the item
            return item
        # returns None if stack was empty
        return None

    # shows all content of the stack
    def toString(self):
        # if the stack has items
        if not stack.isEmpty(self):
            # var to hold the items
            string = ""
            # add each item with a space (" ") between them
            for i in range(self.__top + 1):
                string += str(self.__data[i]) + " "
            # return the string
            return string
        # return None if the stack was empty
        return None

# tests
s = stack(5)
print(s.toString())
print(s.pop())
print(s.isEmpty())
print(s.isFull())
print(s.push(1))
print(s.push(2))
print(s.push(3))
print(s.push(4))
print(s.push(5))
print("isFull? ", s.isFull())
print(s.push(6))
print(s.toString())
print(s.top())

