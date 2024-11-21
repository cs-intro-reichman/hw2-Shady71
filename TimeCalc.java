public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minToAdd = Integer.parseInt(args[1]);

        int totalMins = (hours * 60) + minutes + minToAdd;
        int totalHours = totalMins / 60;
        int newHour = totalHours % 24;
        int newMin = totalMins - (totalHours * 60);

        if (newHour < 10 && newMin < 10) {
            System.out.println("0" + newHour + ":" + "0" + newMin);
        }
        if(newHour < 10 && newMin >= 10) {
            System.out.println("0" + newHour + ":" + newMin);
        }
        if(newMin < 10 && newHour >= 10){
            System.out.println(newHour + ":" + "0" + newMin);
        }
    }
}
