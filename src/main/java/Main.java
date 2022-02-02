public class Main {
    public static void main(String[] args) {
        int celsius;
        double farenheit,reaumur;
        for(celsius=0;celsius<=100;celsius+=5){
            farenheit   =(9.0/5.0)*celsius+32;
            reaumur     =(4.0/5.0)*celsius;
            System.out.println("Celsius: "+celsius+" Farenheit: "+farenheit+ " Reaumur: "+reaumur);
        }
    }
}
