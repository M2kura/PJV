package Lab2;

public class WeekDay {
    public String dayOfWeek(int num){
        switch (num){
            case 1: return "Pondělí";
            case 2: return "Úterý";
            case 3: return "Středa";
            case 4: return "Čtvrtek";
            case 5: return "Pátek";
            case 6: return "Sobota";
            case 7: return "Neděle";
            default: return "Neplatný den v týdnu!";
        }
    }

    void start(String[] args) {
        System.out.println(dayOfWeek(1));
        System.out.println(dayOfWeek(2));
        System.out.println(dayOfWeek(3));
        System.out.println(dayOfWeek(4));
        System.out.println(dayOfWeek(5));
        System.out.println(dayOfWeek(6));
        System.out.println(dayOfWeek(7));
        System.out.println(dayOfWeek(8));
    }
}
