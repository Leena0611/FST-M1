from tkinter import N


def sum(num):
    if (num<=1):
        return num
    else:
        return num+sum(num-1)

print(sum(10))
