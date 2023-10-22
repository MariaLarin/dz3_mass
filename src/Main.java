public class Main {
    public static void main(String[] args) {

        int[] mas = new int[50];

        for (int i =0; i< mas.length; i++){
            mas[i] = (int)(Math.random()*- 50 - 50);
        }

        for(int item : mas){
            System.out.print(item + " ");
        }
        int positiv = 0;
        int negativ = 0;

        for (int item: mas) {
            if (item>0){
                positiv++;
            }else if (item<0){
                negativ++;
                   }
        System.out.println("Info");
        System.out.println("+: " + positiv);
        System.out.println("-: " + negativ);

}
}
}