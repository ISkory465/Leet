class Solution:
    def isValid(self, s: str) -> bool:
        #-------------MY ATTEMPS

        # check_value = ""
        # for i in range(1, len(s)+1):
        #     check_value += s[i-1]
        #     if i%2 == 0:
        #         print(f'output {check_value}')
        #         if check_value == "()" or check_value == "{}" or check_value == "[]":
        #             check_value = ""
        #         else:
        #             return False
        #             break
        #     return True


        #worked with testcases, filed with submit
        # result = [s[i:i+2] for i in range(0, len(s), 2)]
        # for i in result:
        #     print(f'dubug: {i}')
        #     if i == "()" or i == "{}" or i == "[]":
        #         return True
        #     else:
        #         return False
        #         break
        # return True

        # result = [s[i:(len(s))-i] for i in range(0, len(s))]
        # print(f'Input string lenght: {s[0:2]}')
        # print(f'recult -> {result}')
        # for i in result:
        #     print(f'dubug: {i}')
        #     if i == "()" or i == "{}" or i == "[]":
        #         return True
        #     else:
        #         return False
        #         break
        # return True

        
        #!!!------------------------SOLUTIONS
        #1 Didn't like it

        # # Create a pair of opening and closing parrenthesis...
        # opcl = dict(('()', '[]', '{}'))
        # # Create stack data structure...
        # stack = []
        # # Traverse each charater in input string...
        # for idx in s:
        #     # If open parentheses are present, append it to stack...
        #     if idx in '([{':
        #         stack.append(idx)
        #     # If the character is closing parentheses, check that the same type opening parentheses is being pushed to the stack or not...
        #     # If not, we need to return false...
        #     elif len(stack) == 0 or idx != opcl[stack.pop()]:
        #         return False
        # # At last, we check if the stack is empty or not...
        # # If the stack is empty it means every opened parenthesis is being closed and we can return true, otherwise we return false...
        # return len(stack) == 0



        #Good and easy to comprehend

        arr=['2']
        for i in s:
            if i =="(" or i=='[' or i=='{':
          
                arr.append(i)
            elif (i =="]" and arr[-1]=="[") or (i==')' and arr[-1]=='(') or (i=='}' and arr[-1]=='{'):
                arr.pop()
            else:
                return False
                break
        if len(arr)==1:
            return True
        else:
            return False    