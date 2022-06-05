tuple1 = tuple(input("List:").split(","))
tuple2=(5,10,15, 20,45,900,67,15,98,34,80)
for num in tuple1:
    if (int(num) % 5==0):
        print(num)


for t2 in tuple2:
    if (t2%5==0):
        print(t2)
