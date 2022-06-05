def addition(list1):
    sum=0
    for i in list1:
        sum = sum + int(i)

    return sum

inputlist = list(input("List:").split(","))
print(addition(inputlist))