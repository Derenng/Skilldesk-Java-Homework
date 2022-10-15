public class Main {
    public static void main(String[] args) {
        /*--Задание 1--*/
        byte thebyte = 2;
        int theinteger = 318;
        short theshort = 16;
        long thelong = 365553;

        System.out.println("Переменная с типом byte и названием thebyte имеет значение равное " + thebyte);
        System.out.println("Переменная с типом int и названием theinteger имеет значение равное " + theinteger);
        System.out.println("Переменная с типом short и названием theshort имеет значение равное " + theshort);
        System.out.println("Переменная с типом long и названием thelong имеет значение равное " + thelong);
        /*--Задание 2--*/
        System.out.println("Сумма двух чисел = " + Math.addExact(54,16) );
        /*--Задание 3--*/
        System.out.println("Деление двух чисел = " + Math.subtractExact(50,3) );
        /*--Задание 4--*/
        int quadrat = (int)(Math.pow(16,3));
        System.out.println("Квадрат числа = " + quadrat);
        /*--Задание 5--*/
        int obs0 = 0;
        int obs1 = 1;
        int obs2 = 2;
        int obs3 = 3;
        int obs4 = 4;
        int obs5 = 5;
        int obs6 = 6;
        int obs7 = 7;
        int obs8 = 8;
        int obs9 = 9;
        int obs10 = (obs0 + obs1 + obs2 + obs3 + obs4 + obs5 + obs6 + obs7 + obs8 + obs9) / 10;
        System.out.println("Среднее 10 чисел = " + obs10);
    }
}