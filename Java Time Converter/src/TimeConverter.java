public class TimeConverter {

    private int totalSeconds;

    public TimeConverter(int total) {
        this.totalSeconds = total;
    }

    public int convertToMinutes(){
        return totalSeconds/60;
    };
}