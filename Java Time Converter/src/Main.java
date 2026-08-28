public class Main {
    public static void main(String[] args){
        TimeConverter converter = new TimeConverter(3661);

        System.out.println("Tempo em minutos: "+converter.convertToMinutes());

    }

}