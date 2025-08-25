class node:
    def __init__(self,data,link):
        self.data=data
        self.link=link
class insert:
    head="NULL"
    def insert(value):
        newnode=node(value,"NULL")
        
        if(head=="NULL"):
            head=newnode
        else:
            temp=head
            while(temp.next!="NULL"):
                temp=temp.next
            temp.next=newnode
def printt():
    temp=head
    while(temp!="NULL"):
        print(temp.data)

    
    
n=int(input())
for i in range(0,n):
    insert.insert(int(input()))
for i in range(0,n):
    printt()

        
    
    






















