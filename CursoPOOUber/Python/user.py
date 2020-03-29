from account import Account

class User(Account):

    id=int

    def __init__(self,id,name,document):
        super.__init__(name,document)
        self.id=id
    