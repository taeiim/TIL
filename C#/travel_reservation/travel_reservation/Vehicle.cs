using System;
namespace travel_reservation
{
    public class Vehicle
    {
        string desc { get; set; }
        int price { get; set; }
        int maxPerson { get; set; }
        public bool isRelate { get; set; }

        public Vehicle(string desc, int price, int maxPerson, bool isRelate){
            this.price = price;
            this.desc = desc;
            this.maxPerson = maxPerson;
            this.isRelate = isRelate;
        }

        public Vehicle(string desc, int price, int maxPerson)
        {
            this.price = price;
            this.desc = desc;
            this.maxPerson = maxPerson;
        }

        virtual public void PrintVehicleInfo()
        {
            Console.Write("한줄 소개 : " + desc+"       ");
            Console.Write("가격 : " + price+"원      ");
            Console.Write("탑승인원 : " + maxPerson+ "명    ");
            if (isRelate)
            {
                Console.Write("***여행사 연계 10% 할인상품***  할인적용가--> " + price * 0.9 + "원! ");
            }
        }
	}
}
