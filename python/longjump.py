N = int(input())
if N >= 1 and N <= 1000:
    M = int(input())
    if M >= 0 and M <= 1000: 
        W = 0
        min = ((N+2)*((M+2)-2))
        if W >=0 and W <= min:
            sx = int(input())
            sy = int(input())
            ex = int(input())
            if ex > sx:
                ey = int(input())
                if ey > sy:
                    a = -1
            else:
                a = -1
                print(a)
            r = (sx-ex)+(sy-ey) 
print(r)