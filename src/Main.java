public class Main {
    public static void main(String[] args) {
        //Level2: Феликс прожил 3011456_567 секунд. Сколько лет прожил Феликс? Посчитать,
        // используя Java, Long-переменные и деление.
        //Кто не знает - по какой формуле посчитать - напишите мне,
        // но сначала подумайте


        long seconds1 = 752864141;
        long seconds2 = 752864141;
        long seconds3 = 752864141;
        long seconds4 = 752864141;


        long seconds =(seconds1 + seconds2 + seconds3 + seconds4 + 3);
        System.out.println(   seconds   );


        long minutes    =    (seconds   /   60);
        long hours      =    (minutes   /   60);
        long days       =    (hours     /   24);
        long weeks      =    (days      /    7);
        long months     =    (days      /   30);
        long years      =    (months    /   12);


        System.out.println(   years   );



    }
}