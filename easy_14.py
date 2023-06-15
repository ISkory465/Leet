class Solution:
    """
    The big brained concept here seems to be this:

    If the array is sorted alphabetically then you can assume that the first element of the array 
    and the last element of the array will have most different prefixes of all comparisons that could 
    be made between strings in the array. If this is true, you only have to compare these two strings.
    """
    def longestCommonPrefix(self, v: List[str]) -> str:
        ans=""
        v=sorted(v)
        first=v[0]
        last=v[-1]
        for i in range(min(len(first),len(last))):
            if(first[i]!=last[i]):
                return ans
            ans+=first[i]
        return ans 