using System;
namespace travel_reservation
{
    class Bus : Vehicle
    {
        public Bus(string desc, int price ,int maxPerson, bool isRelate):base(desc,price,maxPerson,isRelate)
        {
        }

		public override void PrintVehicleInfo()
		{
            Console.Write("[버스] ");
            base.PrintVehicleInfo();

		}
	}
}
