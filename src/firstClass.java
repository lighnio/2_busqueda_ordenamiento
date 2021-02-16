import  saveData.saveData;

import java.util.Scanner;

public class firstClass{

    public static void main(String[] args) {
        saveData savedata = new saveData();

        int option = 0;
        Scanner key = new Scanner(System.in);

        while(option != 5){

            savedata.printMenu();
            option = key.nextInt();

            switch (option){
                //Enter data
                case 1:
                    savedata.save();
                    break;

                //Print data
                case 2:
                    savedata.print();
                    break;

                //Sort data
                case 3:
                    savedata.sort();
                    break;

                //Find data
                case 4:
                    savedata.finder();
                    break;

                //Exit
                case 5:
                    System.out.println("Goodbye. See you later.");
                    break;

                default:
                    System.out.println("Error, incorrect option. Try again.");
                    break;
            }

        }



        //This is the first step, this save the data for the program
        //savedata.save();



    }
}
