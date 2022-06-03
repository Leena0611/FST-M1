name = input("Your name is: ")
age = int(input("Your age is:"))
year = int(2022-age)+100
toprint = "Name is:{} and her age is {} and {} will be 100 years old in year {}"
print(toprint.format(name,age, name,year))