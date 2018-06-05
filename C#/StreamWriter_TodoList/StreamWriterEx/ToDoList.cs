using System;
using System.IO;
using System.Windows;
using System.Collections.Generic;

namespace StreamWriterEx
{
    public class ToDoList
    {
        public ToDoList()
        {
            startToDoList();
        }

        public void startToDoList(){
            while(true){
                Console.WriteLine();
                Console.WriteLine("1.열기\t2.할일 저장\t3.종료");
                int num = int.Parse(Console.ReadLine());
                if (num == 3) break;
                switch(num){
                    case 1:
                        taskFileOpen();
                        break;
                    case 2:
                        saveTask();
                        break;
                }
            }
        }

        public void taskFileOpen(){
            List<string> fileNameList = new List<string>();
            int i = 1;

            string folderPath = @"/Users/parktaeim/Desktop/temp";
            if(System.IO.Directory.Exists(folderPath)){
                System.IO.DirectoryInfo di = new System.IO.DirectoryInfo(folderPath);
                foreach (System.IO.FileInfo File in di.GetFiles())
                {
                    if (File.Extension.ToLower().CompareTo(".txt") == 0)
                    {
                        String FileNameOnly = File.Name.Substring(0, File.Name.Length - 4);
                        String FullFileName = File.FullName;

                        Console.WriteLine("["+i+"] "+FullFileName + "  " + FileNameOnly);

                        fileNameList.Add(FileNameOnly);
                        i++;
                    }
                }
            }

            Console.Write("오픈하실 파일을 선택해주세요 : ");
            int fileNum = int.Parse(Console.ReadLine());
            string filename = fileNameList[fileNum - 1];
            StreamReader streamReader = new StreamReader(@"/Users/parktaeim/Desktop/temp/" +filename+ ".txt", true);
            while (!streamReader.EndOfStream)
            {
                string str = streamReader.ReadLine();
                Console.WriteLine(str);
            }
            streamReader.Close();

        }

        public void saveTask(){
            string taskStr;
            string finishDate;
            string import;
            string detailStr;

            Console.Write("할 일 : ");
            taskStr = Console.ReadLine();
            Console.Write("기한 : ");
            finishDate = Console.ReadLine();
            Console.Write("중요도 : ");
            import = Console.ReadLine();
            Console.Write("상세설명 : ");
            detailStr = Console.ReadLine();
            Console.WriteLine("=====저장완료=====");

            StreamWriter writer = new System.IO.StreamWriter(@"/Users/parktaeim/Desktop/temp/" + taskStr + ".txt", true);
            writer.WriteLine("할 일 : " + taskStr);
            writer.WriteLine("기한 : " + finishDate);
            writer.WriteLine("중요도 : " + import);
            writer.WriteLine("상세설명 : " + detailStr);
            writer.Close();
        }

    }
}
