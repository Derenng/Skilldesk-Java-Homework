public class Main {
    public static void main(String[] args) {
        for (int seconds = 0;seconds <= 1290;seconds=seconds+30){
            double timepassed = seconds / 60.0;
            double passedmeters = (42000 / 60) * timepassed;
            System.out.println("Время движения автобуса = "+seconds+" сек.");
            System.out.println("Пройденное расстояние = "+passedmeters+" метров.");
            try
            {
                Thread.sleep(30000);
            }
            catch(InterruptedException e)
            {
                if (seconds == 1290){
                    System.out.println("Общее время движения автобуса = "+Math.divideExact(seconds,60)+" мин.");
                }
            }
        }
    }
}