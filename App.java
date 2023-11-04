class Test {
    public static void main(String [] args){
        //int x = 25;
        //for (int i = 0; i <= x; i++){
        //    System.out.println(i);
            int x[] = {1,2,3,4,5,6};
            for(int i:x){
                System.out.println(x[i-1]);
            }


        }

    private static void market(){
        //int apples = 10;
        //float flapples = apples;
        //float garbage = 10.5f;
        //int collector = (int)garbage;
        //char holder = 'C';
        int x = 1;
        //System.out.println(x++);
        //System.out.println(x);
        //System.out.println(++x);
        //System.out.println(x--);
        //System.out.println(x);
        System.out.println(10>>x);
        

    }

    private static void umbrella(int x, int y){
        if (x > y){
            System.out.println("the greater number is: " + x);
        }
        else{
            System.out.println("the greater number is: " + y);
        }
    }
}
