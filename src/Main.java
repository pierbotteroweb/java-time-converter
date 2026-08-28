public class Main {
    public static void main(String[] args){
        TimeConverter converter = new TimeConverter(3661);

        int minutes = converter.convertToMinutes()

        System.out.println("Tempo em minutos: "+minutes);

    }

}