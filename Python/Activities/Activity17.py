import pandas as pd

Data = {
    "UserNames": ["admin", "Charles", "Deku"],
    "Passwords":["password", "Charl13", "AllMight"]
}

df = pd.DataFrame(Data)

ocsv = df.to_csv("AdminDetails",index=False)