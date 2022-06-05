class Car:

    def __init__(self,manufacturer, model, make, transmission, color) :
        self.manufacturer = manufacturer
        self.model = model
        self.make =make
        self.transmission=transmission
        self.color=color

    def accelerate(self):
        out = "Car is moving having manufacturer {} and with Model {}"
        print(out.format(self.manufacturer,self.make))

    def stop(self):
        out = "Car is stopped having manufacturer {} and with Model {}"
        print(out.format(self.manufacturer,self.make))

car1 = Car("BMW","DemoDesign","2000","Manual","Black")
car1.accelerate()
car1.stop()