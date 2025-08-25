'''
n=4
w=2*n-1
r=1
for i in range(1,n+1):
    print(" "*(n-i),"*"*r," "*(n-i))
    r=r+2

'''
'''
a='Cse'
b='IT'
c='Ece'
l=[a,b,c]
for i in l:
    print(i)

'''
'''
l=['Cse','IT','ECE']
#displaying the elements of list (3)
print(l)
print(l[0:])
for i in l:
    print(i)

l=['Cse','IT','ECE']
l.insert(2,"EEE")
print(l[1][1])


l=[[101,"Viya"],[111,'Priya'],[222,"Riya"],[333,'Chaitra'],[234,'Tara']]
print(l)


d={101:"Viya",111:'Priya',222:"Riya",333:'Chaitra',234:'Tara'}


for i,j in d.items():
    print(i,':',j)


l=[[90,'Varsha'],[92,'poojitha'],
   [93,'akshitha'],[4,'priya'],
   [32,'Sravani'],[13,'mamatha'],
   [12,'sravya'],[33,'sravanthi'],
   [55,'srujana'],[10,'riya']]
c=sorted(l)
print(c[-3:])

d={90:'Varsha',92:'poojitha',
   93:'akshitha',4:'priya',
   32:'Sravani',13:'mamatha',
   12:'sravya',33:'sravanthi',
   55:'srujana',10:'riya'}
c=(sorted(d.items()))
print(c[-3:]

'''

#2-sum program
'''

l=[1,2,3,4,5]
t=3
for i in range(0,5):
    for j in range(i+1,5):
        if(l[i]+l[j]==t):
            print('2-sum found at ',i,j)
            break
'''

'''
l=[5,16,18,25,32]
t=3
low=0
high=len(l)
result=0
for i in range(0,5):
    mid=(low+high)//2
    if(l[mid]==t):
        result=mid
        break
    elif(l[mid]>t):
        if(l[mid-1]<t):
            result=mid
            break
        high=mid-1
    else:
        if(mid==high-1):
            result=mid+1
            break
        else:
            if(l[mid+1]>t):
                result=mid
                break
        low=mid+1

print('target value at ',result)

'''
'''
def search(l,t,low,high):
    mid=(low+high)//2
    if(l[mid]==t):
        return mid
    elif(l[mid]>t)):
        
'''    
#transpose of a matrix
'''

l=[[1,2,3],[4,5,6],[7,8,9]]

for i in range(0,len(l)):
    for j in range(0,len(l)):
        print(l[i][j],end=' ' )
    print()
    
print('Transpose of a matrix is')

for i in range(0,len(l)):

    for j in range(0,len(l)):
        print(l[j][i],end=' ' )
    print()

'''
# sum of right and left diagonal elements of a list
'''
l=[[1,2,3],[4,5,6],[7,8,9]]
a=0
for i in range(0,len(l)):
    a+=l[i][i]
j=2
b=0
for i in range(0,len(l)):
    b+=l[i][j]
    j-=1
print('sum of left to right diagonal elements is ',a)
print('sum of right to left diagonal elements is ',b)
'''
#merge sort
'''
def mergesort(l,low,high):
    if(low>=high):
        return
    mid=(low+high)//2
    mergesort(l,low,mid)
    mergesort(l,mid+1,high)
    merge(l,low,high,mid)
def merge(l,low,high,mid):
    a=[]
    left=low
    right=mid+1
    while(left<=mid and right<=high):
        if(l[left]<=l[right]):
            a.append(l[left])
            left+=1
        else:
            a.append(l[right])
            right+=1
    while(left<=mid):
        a.append(l[left])
        left+=1
    while(right<=high):
        a.append(l[right])
        right+=1
    print(low,high)
    for i in range(low,high+1):
        l[i]=a[i-low]



n=int(input("Enter number "))
l=list(map(int,input("Enter elements").split()))
mergesort(l,0,n-1)
print(l)

'''
#input:- [[1,2],[2,3]]  output: [1,3]
'''
n=int(input("Enter number"))
a=[]
l=[]
for i in range(0,n):
    a=list(map(int,input().split()))
    m=len(l)
    if(i!=0 and l[m-1][1]==a[0]):
        l[m-1][1]=a[1]
    else:
        l.append(a)
    a=[]

print(l)

'''

#input :- is This a sentence  Output:- This is a sentence
'''
l=list(input('Enter sentence').split(' '))
dic={}
for i in l:
    if(i=='this'):
        dic[1]=i
    elif(i=='is'):
        dic[2]=i
    elif(i=='a'):
        dic[3]=i
    else:
        dic[4]=i

for i in range(1,len(l)+1):
    print(dic[i],end=' ')
'''



#to find second largest element of an array
'''
l=[1,1,1,1,0]
n=5
max,s_max=0,0
for i in range(0,n):
    if(l[i]>max):
        s_max=max
        max=l[i]
print(s_max)

'''
'''
#insertion into a linkedlist

class Node:
    
    def __init__(self,data):
        self.data=data
        self.link=None
class Insertion:
    def __init__(self):
        self.head=None
    def insert_beg(self,n_data):
        newnode=Node(n_data)
        
        if(self.head==None):
            self.head=newnode

        else:
            newnode.link=self.head
            self.head=newnode

    def insert_end(self,n_data):
        newnode=Node(n_data)
        if(self.head==None):
            self.head=newnode
        elif(self.head.link==None):
            self.head.link=newnode
            
        else:
            self.temp=self.head
            while(self.temp.link!=None):
                self.temp=self.temp.link
            self.temp.link=newnode
    def insert_specific(self,n_data,ele):
        newnode=Node(n_data)
        if(self.head==None):
            self.head=newnode
        elif(self.head.link==None):
            if(self.head.data==ele):
                self.head.link=newnode
        else:
            self.temp1=self.head
            while(self.temp1.data!=ele):
                self.temp1=self.temp1.link
                
            newnode.link=self.temp1.link
            self.temp1.link=newnode
        

    def deletion(self):
        self.head=self.head.link
    
        
    def show(self):
        while(self.head.link!=None):
            print(self.head.data)
            self.head=self.head.link
        print(self.head.data)
            
obj=Insertion()
obj.insert_beg(34)
obj.insert_beg(3)
obj.insert_specific(4,34)
#obj.deletion()
obj.show()
'''

# insertion in to a linked list
'''
class Node:
    def __init__(self,data):
        self.data=data
        self.link=None
        self.prev=None
class Insertion:
    def __init__(self):
        self.head=None
    def insert(self,n_data):
        newnode=Node(n_data)
        if(self.head==None):
            self.head=newnode
        else:
            newnode.link=self.head
            self.head=newnode
    def show(self):
        while(self.head.link!=None):
            print(self.head.data)
            self.head=self.head.link
        print(self.head.data)
        

obj=Insertion()
obj.insert(23)
obj.insert(26)
obj.insert(83)
obj.insert(56)
obj.show()

'''



#binary tree implementation
'''
class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
class BinaryTree:
    def __init__(self):
        self.head=None
    def insert(self,value):
        newnode = Node(value)
        if(self.head==None):
            self.head=newnode
        else:
            temp=self.head
            while(1):
                if(temp.left==None):
                    temp.left=newnode
                    break
                elif(temp.right == None):
                    temp.right=newnode
                    break
                else:
                    if(temp.left.left==None or temp.left.right==None):
                        temp=temp.left
                    elif(temp.right.left==None or temp.right.right==None):
                        temp=temp.right
                    
                    
    def show(self):
        temp=self.head
        print('root',temp.data)
        while(1):
            if(temp.left==None and temp.right==None):
                break
            
            print('parent',temp.data,'left',temp.left.data)
            print('parent',temp.data,'right ',temp.right.data)
            temp=temp.left
        temp=self.head.right
        print()
        print()
        while(1):
            if(temp.left==None and temp.right==None):
                break
            
            print('parent',temp.data,'left',temp.left.data)
            print('parent',temp.data,'right ',temp.right.data)
            temp=temp.right
        

obj=BinaryTree()
obj.insert(21)
obj.insert(22)
obj.insert(23)
obj.insert(24)
obj.insert(25)
obj.insert(26)
obj.insert(27)
#obj.insert(28)
#obj.insert(29)
obj.show()

'''


'''
#binary search tree insertion

class Node:
    def __init__(self,data):
        self.data=data
        self.left = None
        self.right = None
class BST:
    def __init__(self):
        self.head = None

    def insert(self,value):
        newnode=Node(value)
        if(self.head == None):
            self.head = newnode
         
        else:
            while(self.head!=None):
                if(self.head.data<newnode.data):
                    self.head=self.head.right
                elif(self.head.data>newnode.data):
                    self.head=self.head.left
            
            self.head=newnode
        
        print(self.head.data)
        
        
obj=BST()
obj.insert(10)
obj.insert(2)
obj.insert(13)
obj.insert(5)

'''



