public class problem2 {

    public static void main(String[] args) {
        // with string

        String stringAns = "a";
            for(int i=0; i<1000; i++){
                stringAns+="a";
            }

            System.out.println("with String -> " + stringAns);

            //Using StringBuilder
            StringBuilder sbAns = new StringBuilder();

            // for(int i=0; i<1000; i++){
            //     sbAns.append("a");
            // }

            System.out.println("with StringBuilder-> "+ sbAns);
    }
}
