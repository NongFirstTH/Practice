import requests
from bs4 import BeautifulSoup
url = "https://ch3plus.com/hotissue/omicron" #ข่าวโอไมครอน ช่อง3
web_data = requests.get(url)
soup = BeautifulSoup(web_data.text, 'html.parser')
find_word = soup.find_all("div",{"class":"detail"})

for i in find_word:
    print(i.find("a").text)    
   