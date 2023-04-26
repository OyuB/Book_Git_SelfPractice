package Chapter02;

public class page03 {
    //page 3 was created
    
    // please initialize the page and write some code



    public static void main(String[] args) {
        String str = "aabcccd";
        String unique="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency=0;
            for (int j = 0; j < str.length(); j++) {
                if (ch==str.charAt(j)){
                    frequency++;
                }
            }
           if (frequency==1){
               unique+=ch;
           }

        }
        System.out.println(unique);










    }


}
