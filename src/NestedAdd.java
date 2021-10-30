public class NestedAdd {
    public static void main(String []args){
        // it will go for i value loop then into j loop
        for(int i = 2; i<=5; i++){
            //
            for(int j = 7; j<=9; j++ ){
                System.out.println(i+j);//this will print addition
                /*
                2 +7=9(still in j loop)
                2+8=10(still in j loop)
                2+9=11(still in j loop)
                3+7=10(gone into i loop with increament still in J loop)
                3+8=11
                3+9=12
                4+7=11
                4+8=12
                4+9=13
                5+7=12
                5+8=13
                5+9=14
                6+==condition false so discontinues loop
                 */
            }
        }
    }
}
