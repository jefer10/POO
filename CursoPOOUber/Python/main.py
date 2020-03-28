from car import Car #python.car es por la carpeta y el archivo car

if __name__ == "__main__":
    print("hola mundo")
    car= Car()
    car.license="AMS234"
    car.driver="pepito perez"
    car.passenger=4
    print(vars(car))

    car2= Car()
    car2.license="ZXC346"
    car2.driver="sutanejo alvarez"
    car2.passenger=4
    print(vars(car2))