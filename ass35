print("Enter the Row and Column Size of First Matrix: ", end="")
r1 = int(input())
c1 = int(input())
print("Enter " +str(r1 * c1)+ " Elements: ", end="")
m1 = []
for i in range(r1):
    m1.append([])
    for j in range(c1):
        n = int(input())
        m1[i].append(n)

print("\nEnter Row and Column Size of Second Matrix: ", end="")
r2 = int(input())
if c1 != r2:
    print("\nMultiplication Not Possible!")
    exit()
else:
    c2 = int(input())
    print("Enter " +str(r2 * c2)+ " Elements: ", end="")
    m2 = []
    for i in range(r2):
        m2.append([])
        for j in range(c2):
            n = int(input())
            m2[i].append(n)

    m3 = []
    for i in range(r1):
        m3.append([])
        for j in range(c2):
            sum = 0
            for k in range(c1):
                sum = sum + (m1[i][k] * m2[k][j])
            m3[i].append(sum)

    print("\nMultiplication Result of Two Given Matrix is:")
    for i in range(r1):
        for j in range(c2):
            print(m3[i][j], end=" ")
        print()
