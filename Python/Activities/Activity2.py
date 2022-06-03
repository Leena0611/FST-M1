num = int(input("Check if number is Odd Or Even, Number:"))
if num%2==0:
    output =  "{} is Even"
else:
    output =  "{} is Odd"
print(output.format(num))