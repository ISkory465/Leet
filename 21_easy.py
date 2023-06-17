# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        # result = list1[:]
        
        # print(list2)
        # for i in range(len(list2)):
        #     element_pos = list1.index(list2[i])
        #     list1.insert(element_pos+1, list2[i])
        # return result


        #COMMENT
        #Didn'e see that it is cutomlike node-list object created from the uncommented class above;
        #I'va started to do it with aprroach for the ordinary list -_-

        #Variant 1: too slow, time exceeding

        # cur = dummy = ListNode()
        # while list1 and list2:               
        #     if list1.val < list2.val:
        #         cur.next = list1
        #         list1 = list1.next; cur = list1
        #     else:
        #         cur.next = list2
        #         list2 = list2.next; cur = list2
                
        # if list1 or list2:
        #     cur.next = list1 if list1 else list2
            
        # return dummy.next


        if not list1 and not list2:
            return list1
        if not list1 or not list2:
            return list1 if not list2 else list2
        seek, target = (list1, list2) if list1.val < list2.val else (list2, list1)
        head = seek
        while seek and target:
            while seek.next and seek.next.val < target.val:
                seek = seek.next
            seek.next, target = target, seek.next
            seek = seek.next
        return head