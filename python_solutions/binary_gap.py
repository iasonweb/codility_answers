# Binary gap (to see the information about the task visit codility.com)

def solution(N): 
    return len(max(str(bin(N)[2:]).strip('0').split('1')))
