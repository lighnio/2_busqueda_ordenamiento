package saveData;

import validators.functionalities;

import java.util.Scanner;

public class saveData extends functionalities {
    public String[][] data;

    public void save(){
        int op;
        Scanner entry = new Scanner(System.in);

        System.out.print("Number of persons do you want enter: ");
        op = entry.nextInt();

        data = new String[op][3];

        for (int i = 0; i < op; i++) {
            String dpitemp, nametemp, agetemp;

            // First while for validate the DPI.

            //First while for "errors" and repeat the entering of one person
            while (true){

                //Second while for validate DPI
                while (true){
                    System.out.println("\tPerson #" + (i+1));
                    System.out.print("DPI: ");
                    dpitemp = entry.next();

                    if (!isNumber(dpitemp)){

                        //After validate the number, is saved in data

                        data[i][0] = dpitemp;

                        //Exit of while
                        break;
                    }
                    System.out.println("Invalid DPI number. Repeat the number");
                }
                //End of second while

                //Saves the name
                System.out.print("Name: ");
                nametemp = entry.next();

                //Third while for validate the age.
                while(true){

                    //Saves the age
                    System.out.print("Age: ");
                    agetemp = entry.next();

                    if (isAge(agetemp)){

                        //After validate the number, is saved in data

                        data[i][2] = agetemp;

                        //Exit of while
                        break;
                    }
                    System.out.println("Invalid age. Repeat");
                }
                //End of third while

                String end_save_process;
                System.out.print("It's that enter okay? (y / n): ");
                //enter option for continue or repeat
                end_save_process = entry.next();

                if (end_save_process.equals("y")){
                    //Saving the data
                    data[i][1] = nametemp;
                    data[i][2] = agetemp;
                    break;
                }
            }
            //End of first while
            //End of save data process
        }

        // Sorting data process
        //data = sorter(data);
    }

    public void print(){
        //print data
        System.out.println("\n\nAmount of Persons: " + data.length);
        for (int j = 0; j < data.length; j++) {
            System.out.println("\tPerson #" + (j+1));
            System.out.print("==========================");
            System.out.println(
                    "\nDPI: " + data[j][0] +
                            "\nNombre: " + data[j][1] +
                            "\nEdad: " + data[j][2]
            );
            System.out.println("==========================");
            try {Thread.sleep(500);} catch (InterruptedException e){/*ignore*/}
        }
    }

    public void sort(){
        // Sorting data process
        data = sorter(data);
    }

    public void finder(){
        Scanner entry = new Scanner(System.in);
        System.out.print("Enter the DPI do you want to find: ");
        String dpi = entry.next();
        int index;

        if (search(data, dpi)){
            System.out.println("Yeah, result found");

            for (int i = 0; i < data.length; i++) {
                if (data[i][0].equals(dpi)){
                    index = i;
                    System.out.println("\tPerson #" + (index+1));
                    System.out.print("==========================");
                    System.out.println(
                            "\nDPI: " + data[index][0] +
                                    " - Nombre: " + data[index][1] +
                                    " - Edad: " + data[index][2]
                    );
                    System.out.print("==========================");
                    break;
                }
            }
        } else {
            System.out.println("Sorry, no matches found.");
        }
    }

}
