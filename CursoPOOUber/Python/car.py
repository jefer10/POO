from account import Account

class Car:
    id =int
    license= str
    driver =Account("","")
    passenger=str

    def __init__(self,licence,driver):
        self.licence=licence
        self.driver=driver
