def concatenatio(*paramas):
    res: str = ""# ниже только для строк
    for item in paramas:
        res += item
    return res

print(concatenatio('a','b','c'))