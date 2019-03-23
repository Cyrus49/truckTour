First solution: 
Size complexity: O(1)
Time complexity: O(N^2)
Go through each petrol pump starting from 0 and going until one that works is reached
  starting from each pump, test each pump and loop around until the starting pump is reached and keep track of the current amount of fuel.
  If the fuel at any point reaches 0, move on to the next pump. 
Second solution:
Size complexity: O(N)
Time complexity: O(N)
startIndex, end - keeps track of the end and beginning of the loop
make array length of petrolpumps and fill each index with (fuel-distance)
iterate from end to start, or keep going if sum<0
    while sum is  negative, subtract the (fuel-distance) from the start index and increment the start index (loop to beginning if needed)
  Go through each pump and add (fuel-distance) to "sum". 
  increment end and loop around to beginning if needed
return startIndex
