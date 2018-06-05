using System;
namespace travel_reservation
{
    class Airplane :Vehicle
    {
        public Airplane(string desc, int price, int maxPerson, bool isRelate) : base(desc, price, maxPerson,isRelate)
        {
        }

        public override void PrintVehicleInfo()
        {
            Console.Write("[비행기] ");
            base.PrintVehicleInfo();
        }
    }
}
