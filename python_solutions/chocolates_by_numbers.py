# Chocolates by numbers (see codility.com for more details)
# Performance 0 %.


def solution(N, M):
    A = [element for element in range(N)]
    index, steps = (0, 0)
    while A[index] != None:
        A[index] = None
        steps += 1
        index += M
        index %= N
    return steps
