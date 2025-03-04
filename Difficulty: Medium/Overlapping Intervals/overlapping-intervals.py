class Solution:
    def mergeOverlap(self, arr):
        # Step 1: Sort the intervals based on the starting times
        arr.sort(key=lambda x: x[0])
        
        # Step 2: Initialize the merged list
        merged = []
        
        for interval in arr:
            # If merged is empty or there is no overlap, add the interval
            if not merged or merged[-1][1] < interval[0]:
                merged.append(interval)
            else:
                # There is an overlap, merge the current interval with the last one
                merged[-1][1] = max(merged[-1][1], interval[1])
        
        return merged

#{ 
 # Driver Code Starts
if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        n = int(input())
        # a = list(map(int, input().strip().split()))
        arr = []
        # j = 0
        for i in range(n):
            a = list(map(int, input().strip().split()))
            x = a[0]
            # j += 1
            y = a[1]
            # j += 1
            arr.append([x, y])
        obj = Solution()
        ans = obj.mergeOverlap(arr)
        for i in ans:
            for j in i:
                print(j, end=" ")
        print()

# } Driver Code Ends