# Cyclic Rotation (for more information see codility.com)

def solution(A, K):
    if K > 0 and len(A) != 0:
        K = K % len(A)
    while K > 0 and len(A) > 0:
        A.insert(0, A[len(A) - 1])
        A = A[:-1]
        K -= 1 
    return A
