From the sixth writing, I need
Implement the add(E element) 
method by creating a new Node with the
specified element, and I used constructor:
Node newNode = new Node(element, null, tail);
After, if the list is empty or size=0,
 we need to have new Node for head and tail.
If not, only tail will be new. At the end we rise the size,
because, in all ways due to new tail or new tail and head,
size must increase.