I choose this problem because on first glance it seems only solvable by an O(N^2) time solution, but upon further analysis a O(N) time solution can be reached
First solution: 
Size complexity: O(1)
Time complexity: O(N^2)
Go through each petrol pump starting from 0 until one that works is reached
  starting from each pump, test each pump and loop around until the starting pump is reached and keep track of the current amount of fuel.
  If the fuel at any point reaches 0, move on to the next pump. 
Second solution:
Size complexity: O(N)
Time complexity: O(N)
startIndex, end - keeps track of the end and beginning of the loop
make array length of petrolpumps and fill each index with (fuel-distance)
iterate from end to start, or keep going if sum<0
    while sum is  negative, subtract the (fuel-distance)at the start index fromt he sum and increment the start index (loop to beginning if needed)
  Go through each pump and add (fuel-distance) at each pump to "sum". 
  increment end and loop around to beginning if needed
return startIndex

I choose the second solution because the time required was significatly less than the first solution, although the size complexity was slightly higher, as in most applications a lower time complexity is preferred over a lower size complexity.
