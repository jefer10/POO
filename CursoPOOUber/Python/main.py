from car import Car
from account import Account

if __name__ == "__main__":
    print("hola mundo")
    car= Car("AMS234",Account("pepito perez","1234567890"))
    car.passenger=4
    print(vars(car))
    print(vars(car.driver))

    car2= Car("ZXC346",Account("sutanejo alvarez","2234567890"))
    car2.passenger=4
    print(vars(car2))
    print(vars(car2.driver))