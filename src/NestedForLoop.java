public class NestedForLoop {
    public static void main(String []args){
        // it will go for i value
        for(int i = 2; i<=5; i++){
            //then come to next loop so it will not print anything for i
            for(int j = 7; j<=9; j++ ){
                System.out.println(j);//this will print
            }
        }
    }
}
