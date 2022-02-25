list = []
pl = []
count = 0
f=0
n = int(input("Enter the size of list:"))
print("Enter list elements:")
for i in range(n):
    x = int(input())
    list.append(x)
for i in range(n):
    f=0
    for j in range(1,list[i]+1):
        if list[i]%j==0:
            f+=1
    if f==2:
        count+=1
        p=list[i]
        pl.append(p)
print("The count of prime numbers in given list is:",count)
print("They are:",pl)
