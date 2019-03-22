# From Jump (form more infe see codility.com)


def solution(X, Y, D):
    steps = 0
    if X == Y:
        return 0
    else:
        distance = Y - X
        if distance % D == 0:
            return int(distance / D)
        else:
            return int(distance // D + 1)
