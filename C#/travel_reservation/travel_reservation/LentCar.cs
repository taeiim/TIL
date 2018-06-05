using System;
namespace travel_reservation
{
    class LentCar : Vehicle
    {
        public LentCar(string desc, int price, int maxPerson) : base(desc, price, maxPerson)
        {

        }

        public override void PrintVehicleInfo()
        {
            Console.Write("[렌트카] ");
            base.PrintVehicleInfo();
        }
    }
}
