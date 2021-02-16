package validators;

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

    public long toLong(String number){

        return Long.parseLong(number);
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

        /*
        *       A TENER EN CUENTA, RECUERDA QUE DE ESTA MANERA TAMBIEN DEBES DE ORDENAR TODOS
        *       LOS DATOS, POR EJEMPLO, NO SOLO CAMBIAS EL INDICE DE persons[i][0] SINO TAMBIEN
        *       DE persons[i][1] Y persons[i][2]
        *
        *
        * */

        return persons;
    }

}
