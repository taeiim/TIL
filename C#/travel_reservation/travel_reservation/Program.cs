using System;
using System.Collections.Generic;

namespace travel_reservation
{
    class Program
    {
        public static List<Vehicle> vehicleList = new List<Vehicle>();
        public static List<Vehicle> reserveVehicleList = new List<Vehicle>();

        static void Main(string[] args)
        {
            registerAirPlane();
            startSystem();
        }

        public static void startSystem()
        {
            while (true)
            {
                int user = inputMenu("1. 일반시민(예약하기)   2. 관리자  3. 종료");
                if (user == 3) break;
                switch (user)
                {
                    case 1:
                        reserveSystem();
                        break;
                    case 2:
                        adminSystem();
                        break;
                }
            }
        } 
    
        static void reserveSystem(){
            while (true)
            {
                int selectMenu = inputMenu(" 1.탈 것 검색  2. 예약   3. 처음으로");
                if (selectMenu == 3) break;
                switch (selectMenu)
                {
                    case 1:
                        searchVehicle();
                        break;
                    case 2:
                        reserveVehicle();
                        break;
                    default:
                        Console.Write("다시 선택해주세요. ");
                        break;
                }
            }
        }

        static void adminSystem(){
            while (true)
            {
                int selectMenu = inputMenu(" 1.연계된 교통수단 추가  2.예약된 교통수단 목록   3. 처음으로");
                if (selectMenu == 3) break;
                switch (selectMenu)
                {
                    case 1:
                        Console.WriteLine("===========연계 가능한 교통수단 목록===========");
                        addRelativeVehicle();
                        break;
                    case 2:
                        printList(reserveVehicleList);
                        break;
                    default:
                        Console.Write("다시 선택해주세요. ");
                        break;
                }
            }
        }

        static void addRelativeVehicle(){
            for (int i = 0; i < vehicleList.Count;i++){
                if(vehicleList[i].isRelate!=true && vehicleList[i].GetType().Name.Equals("LentCar")==false ){
                    Console.Write((i + 1) + ".  ");
                    vehicleList[i].PrintVehicleInfo();
                    Console.WriteLine();
                }
            }
            int num = inputMenu("연계하여 10% 할인할 교통수단을 선택해주세요.");
            vehicleList[num - 1].isRelate = true;

            Console.WriteLine("연계할 교통수단 추가 완료!!!!");
        }

        static void searchVehicle()
        {
            printList(vehicleList);
        }

        static void reserveVehicle()
        {
            printList(vehicleList);
            int reserveNum = inputMenu("예약할 교통수단을 선택해주세요.");

            reserveVehicleList.Add(vehicleList[reserveNum - 1]);
            vehicleList.RemoveAt(reserveNum - 1);

            Console.WriteLine("예약완료!!!!");
        }

        static void printList(List<Vehicle> list){
            for (int i = 0; i < list.Count; i++)
            {
                Console.Write((i + 1) + ".  ");
                list[i].PrintVehicleInfo();
                Console.WriteLine();
            }
        }

        // 탈것 더미데이터 저장
        public static void registerAirPlane()
        {
            Vehicle bus1 = new Bus("1년밖에 안된 깨끗한 버스~", 300000, 30,true);
            Vehicle bus2 = new Bus("노래방 기계 보유 / 에어컨 빵빵", 250000, 30, false);
            Vehicle bus3 = new Bus("멋있는 버스", 250000, 30, false);
            Vehicle airplane1 = new Airplane("1천만원에 누리는 전세기", 10000000, 300,true);
            Vehicle airplane2 = new Airplane("비행기를 단돈 800만원에 ?!", 8000000, 200,false);
            Vehicle airplane3 = new Airplane("세상에서 제일 큰 비행기", 8000000, 200, false);
            Vehicle airplane4 = new Airplane("귀여운 비행기", 8000000, 200, false);
            Vehicle lentCar1 = new LentCar("노란색 간지나는 렌트카", 200000, 10);
            Vehicle lentCar2 = new LentCar("빨간색 스포츠카", 100000, 4);

            Vehicle[] vehicles = { bus1,bus2,bus3,airplane1,airplane2,airplane3,airplane4,lentCar1,lentCar2 };
            for (int i = 0; i < vehicles.Length; i++)
            {
                vehicleList.Add(vehicles[i]);
            }
        }

        public static int inputMenu(String infoMsg)
        {
            Console.WriteLine();
            Console.WriteLine(infoMsg);
            Console.Write(">>");

            int num = Convert.ToInt32(Console.ReadLine());

            return num;
        }
    }
}