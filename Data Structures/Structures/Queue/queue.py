class queue:
    # constructor
    def __init__(self, size):
        # sets pointers to -1
        self.__front = -1
        self.__rear = -1
        # sets size var to size given by user
        self.__size = size
        # creates array of size given by user
        self.__data = [None] * self.__size
    
    # checks if the queue is full
    def isFull(self):
        return (self.__rear + 1) % self.__size == self.__front
    
    # checks if the queue is empty
    def isEmpty(self):
        return (self.__front == -1)
    
    # returns the item at the front
    def front(self):
        # checks if the queue is not empty
        if not queue.isEmpty(self):
            # returns the top item
            return self.__data[self.front]
        # returns None if no items are in the queue
        return None

    # adds an item to the queue
    def enqueue(self, item):
        # id the queue has space
        if not queue.isFull(self):
            # if the queue is empty
            if (queue.isEmpty(self)):
                self.__front = 0
            # increment rear
            self.__rear = (self.__rear + 1) % 5
            # add data at the back of the queue
            self.__data[self.__rear] = item
            # return true
            return True
        # return false if item was not added
        return False

    # method to remove an item form the queue
    def dequeue(self):
        # checks if there is an item to remove
        if not queue.isEmpty(self):
            # gets the item
            item = self.__data[self.__front]
            # check if the queue is empty now
            if self.__front == self.__rear:
                # reset pointers if empty
                self.__rear == -1
                self.__front == -1
            else:
                # increment front if not empty
                self.__front = (self.__front + 1) % self.__size
            # returns the item
            return item
        # returns None if queue was empty
        return None

# tests
s = queue(5)
s.enqueue(1)
s.enqueue(2)
s.enqueue(3)
s.enqueue(4)
s.enqueue(5)
print(s.dequeue())
s.enqueue(6)
print(s.dequeue())
print(s.dequeue())
print(s.dequeue())
print(s.dequeue())
print(s.dequeue())


