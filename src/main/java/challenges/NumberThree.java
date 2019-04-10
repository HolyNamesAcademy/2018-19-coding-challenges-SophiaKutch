package challenges;

public class NumberThree {

    public String timeConversion(String s) {
        String militaryTime = "";
        int hour = 0;
        if(s.contains("AM")){
            militaryTime = s.substring(0, 8);
        }
        if(s.contains("AM") && s.contains("12")){
            militaryTime = "00" + s.substring(2,8);
        }

        else if (s.contains("PM")){
            hour = Integer.parseInt(s.substring(0,2));
            if(hour == 12){
                return s.substring(0,8);
            }
            hour += 12;
            militaryTime = hour + s.substring(2,8);
        }
        return militaryTime;
    }
}
