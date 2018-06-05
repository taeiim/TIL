using System;
using System.IO;

namespace StreamWriterEx
{
    class Program
    {
        static void Main(string[] args)
        {
            //StreamWriter writer = new System.IO.StreamWriter(@"\Users\parktaeim\temp\abc.txt", true);
            //writer.Write("시험중입니다.");
            //writer.WriteLine("두번째 시험중입니다 .");
            //writer.WriteLine("세번째 시험중입니다 .");
            //writer.Close();

            //StreamReader streamReader = new StreamReader(@"\Users\parktaeim\temp\abc.txt", true);
            //while(!streamReader.EndOfStream){
            //    string str = streamReader.ReadLine();
            //    Console.WriteLine("내용:" + str);
            //}
            //streamReader.Close();


            new ToDoList();

            //using (StreamWriter writer = new System.IO.StreamWriter(@"/Users/parktaeim/temp/test.txt",true)){
            //    writer.Write("시험중입니다.");
            //    writer.WriteLine("두번째 시험중입니다 .");
            //}
        }
    }
}
