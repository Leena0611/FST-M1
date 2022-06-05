import pandas as pd

df = pd.read_csv("AdminDetails")

print(df)
print(df.sort_values('UserNames',ascending=False))