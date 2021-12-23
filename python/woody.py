N = int(input())
X = int(input())
Y = int(input())
if N >= 1 and N <=1000:
    if X >= 0 and X <= 500:
        if Y>= 0 and Y <= 500:
            result = N+X+Y 
Xi = int(input())
if Xi >= 0:
    Xi+=X
Yi = int(input())
if Yi >= 500:
    Yi+=Y
Ci = int(input())
if Ci >= 1 and Ci <= 10**9:
    R = Xi+Yi+Ci
if  R >= 2000:
        a = -1
        print(a)  

print(R)