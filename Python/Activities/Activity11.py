dict1={"apple":21,"mango":100,"Gauva":30,"banana":20}
fruit=input("Check which fruit:")
def CheckFruit(dict_ex):
    for n in dict_ex:
        if (n==fruit):
            print(n," Fruit Exists")
            raise SystemExit
        else:
            #print(n," Fruit does not exist")

CheckFruit(dict1)