source_file = open(r'c:/Users/Tanabodee/Desktop/JAVAWORK/python/File IO/TRYI.CSV' , encoding="utf-8")
try:
    data = source_file.read()
finally:
    source_file.close()
print(data)