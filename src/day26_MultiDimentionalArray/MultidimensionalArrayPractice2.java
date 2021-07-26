package day26_MultiDimentionalArray;

public class MultidimensionalArrayPractice2 {
    public static void main(String[] args) {

        /*
        String[] group5 = {"Ahmed", "Ahmet", "Igor", "Andrei", "Mykyta"},
                group2 = {"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve", "Atila", "Shokhzod", "Hende", "Serife", "Collins", "Akangankoy", "Liubov"},
                group3 = {"Oz", "Ibrahim", "Davut", "Dontrell", "Muahmmed"},
                group4 = {"Inesa","Aysu","Suat","Esra","Yusuf","Mohamed","Tinbite","Raphael"},
                group1 = {"Selda", "Ibrahim", "Tamerlan",  "Mehmut", "Sina"};
*/

        String[][] cybertekGroups = {
                {"Ahmed", "Ahmet", "Igor", "Andrei", "Mykyta"},
                {"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve", "Atila", "Shokhzod", "Hende"},
                {"Oz", "Ibrahim", "Davut", "Dontrell", "Muahmmed"},
                {"Inesa","Aysu","Suat","Esra","Yusuf","Mohamed","Tinbite","Raphael"},
                {"Selda", "Ibrahim", "Tamerlan",  "Mehmut", "Sina"}
        };

        int count = 0;
        for (String[] eachGroup : cybertekGroups){
            for (String eachName : eachGroup) {
                if (eachName.equals("Ahmed")){
                    count++;
                }

            }
        }
        System.out.println("count= "+count);


    }
}
