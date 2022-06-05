try:
    x="Name:Leena"
    print(x)
except NameError:
    print("inside except, name not defined")
else:
    print("Insdie else block, No error, code executed successfully.")
finally:
    print("Executed finally")