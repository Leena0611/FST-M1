import pandas as pd
from pandas import DataFrame, ExcelFile
from pandas import ExcelWriter

df = pd.read_excel("EmpDetails.xlsx")
print("Shape: ",df.shape)
print(df['Email'])
print(df.sort_values('FirstName'))