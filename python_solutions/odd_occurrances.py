# Odd Occurances in Array (for more info visit www.codility.com)

def solution(A):
    B = sorted(A)
    for element in B[::2]:
        if A.count(element) == 1:
            return element    
    return element
