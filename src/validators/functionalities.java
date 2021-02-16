package validators;

import java.util.Arrays;

public class functionalities {

    public boolean isNumber(String number){

        if (number == null){
            return true;
        }

        try {
            long lnum = Long.parseLong(number);
        } catch (NumberFormatException e){
            return true;
        }

        return false;
    }

    public boolean isAge(String age){
        if (age == null){
            return true;
        }

        try {
            long lnum = Long.parseLong(age);

            //Validate the number is smallest like 100 and bigger than 17
            int realAge = Integer.parseInt(age);
            if (realAge > 17 && realAge < 100){
                return true;
            }

        } catch (NumberFormatException e){
            return true;
        }



        return false;
    }

    public int toInt(String number){
        return Integer.parseInt(number);
    }

    public static long toLong(String number){

        return Long.parseLong(number);
    }

    public void printMenu(){
        System.out.println("\n=================================================");
        System.out.println("=\t\t\t\t\tMenu\t\t\t\t\t\t=");
        System.out.println("=================================================");
        System.out.println("=\t\t\t\t\t\t\t\t\t\t\t\t=");
        System.out.println("=\t1. Enter data (only one time for execution)\t=");
        System.out.println("=\t2. Print data\t\t\t\t\t\t\t\t=");
        System.out.println("=\t3. Sort data\t\t\t\t\t\t\t\t=");
        System.out.println("=\t4. Find a person by DPI\t\t\t\t\t\t=");
        System.out.println("=\t5. End program\t\t\t\t\t\t\t\t=");
        System.out.println("=\t\t\t\t\t\t\t\t\t\t\t\t=");
        System.out.println("=================================================");
        System.out.print("Option (1, 2, 3...): ");
    }

    public String[][] sorter(String[][] persons){

        for (int i = 0; i < persons.length -1; i++){
            for (int j = i+1; j < persons.length; j++) {

                if (toLong(persons[i][0]) > toLong(persons[j][0])){
                    String temporalDPI, temporalName, temporalAge;

                    // Sorting DPI index
                    temporalDPI = persons[i][0];
                    persons[i][0] = persons[j][0];
                    persons[j][0] = temporalDPI;

                    // Sorting name index
                    temporalName = persons[i][1];
                    persons[i][1] = persons[j][1];
                    persons[j][1] = temporalName;

                    // Sorting age index
                    temporalAge = persons[i][2];
                    persons[i][2] = persons[j][2];
                    persons[j][2] = temporalAge;

                }
            }
        }

        return persons;
    }

    public static boolean  search(String[][] data, String numberToSearch){

        int size = data.length, middle = size/2;

        if (data[middle][0].equals(numberToSearch)){
            return true;
        } else if (size == 1){
            return false;
        } else if (toLong(data[middle][0]) > toLong(numberToSearch)){
            return search(Arrays.copyOfRange(data, 0, middle), numberToSearch);
        } else {
            return search(Arrays.copyOfRange(data, middle+1, size), numberToSearch);
        }
    }

}
