#inversion pair

arr=[2,4,1,3,5]
c=0
for i in range(0,len(arr)):
    for j in range(i+1,len(arr)):
        if(i<j and arr[i]>arr[j]):
            c+=1

print(c)






























