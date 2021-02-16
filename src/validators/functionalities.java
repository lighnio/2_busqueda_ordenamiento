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

    public int toNumber(String number){
        return Integer.parseInt(number);
    }

    public String[][] sorter(String[][] persons){

        for (int i = 0; i < persons.length -1; i++){
            for (int j = i+1; j < persons.length; j++) {
                //in process
                System.out.println("In process :D");
            }
        }

        /*
        *       A TENER EN CUENTA, RECUERDA QUE DE ESTA MANERA TAMBIEN DEBES DE ORDENAR TODOS
        *       LOS DATOS, POR EJEMPLO, NO SOLO CAMBIAS EL INDICE DE persons[i][0] SINO TAMBIEN
        *       DE persons[i][1] Y persons[i][2]
        *
        *
        * */

        return null;
    }

}
