list1=[11,22,36,67,63]
list2=[32,76,54,21,50]
list3=[]

#Getting Odd from 1st list and even from 2nd List

for n in list1:
    if n%2!=0:
        list3.append(n)
    
for m in list2:
    if m%2==0:
        list3.append(m)

print(list3)