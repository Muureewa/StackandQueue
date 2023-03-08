# StackandQueue

Question 1:

Write a method removeMin that accepts a Stack of integers as a parameter and removes and returns the smallest value from the stack. 
For example if a variable s stores these values:

bottom [2, 8, 3, 19, 7, 3, 2, 3, 2, 7, 12, -8, 4] top
and we make the following call:

int n = removeMin(s);
The method removes and returns -8, so n will store -8 after the call and s will store the following values:

bottom [2, 8, 3, 19, 7, 3, 2, 3, 2, 7, 12, 4] top
If the minimum value appears more than once, all occurrences of it should be removed. For example, given the stack above, 
if we again call removeMin(s), it would return 2 and leave the stack as follows:

bottom [8, 3, 19, 7, 3, 3, 7, 12, 4] top
You may use one queue as auxiliary storage. You may not use any other structures to solve this problem, although you can have as 
many primitive variables as you like. You may not solve the problem recursively.

 

Question 2:

Write a method split that takes a stack of integers as a parameter and splits it into negatives and non-negatives. 
The numbers in the stack should be rearranged so that all the negatives appear on the bottom of the stack and all the non-negatives appear on the top. 
In other words, if after this method is called you were to pop numbers off the stack, you would first get all the nonnegative numbers 
and then get all the negative numbers. It does not matter what order the numbers appear in as long as all the negatives appear lower in the 
stack than all the non-negatives. You may use a single queue as auxiliary storage.

 

Question 3:

Write a method expand that takes a stack of integers as a parameter and replaces every value in the stack with two occurrences of that value. 
For example, suppose the stack stores these values:

bottom [3, 7, 1, 14, 9] top
Then the stack should store these values after the method terminates:

bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top
Notice that you must preserve the original order. In the original list the 9 was at the top and would have been popped first. 
In the new stack the two 9s would be the first values popped from the stack. You may use a single queue as auxiliary storage to solve this problem.
