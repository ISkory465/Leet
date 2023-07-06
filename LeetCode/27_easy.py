class Solution:
    # def removeDuplicates(self, nums: List[int]) -> int:
                #works, but i am creating new list, so it does not pass the check
        # it is required to midofy input list
        # result = []
        # for i in range(len(nums)):
        #     print(nums[i])
        #     if nums[i] not in result:
        #         result.append(nums[i])
        #         print(result)
        # out = len(result)
        # print(f"result {out}")
        # nums = result[:]
        # return out

        def removeDuplicates(self, nums: List[int]) -> int:
                j = 0
                for i in range(1, len(nums)):
                        if nums[j] != nums[i]:
                                j += 1
                                nums[j] = nums[i]
                return j + 1
        



def Hello():
    return print("Main check")



if __name__ == "__main__":
    Hello()