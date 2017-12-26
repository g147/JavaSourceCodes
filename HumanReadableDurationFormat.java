import java.util.*;
public class HumanReadableDurationFormat{
    
    public static String[] word = {"now","second","minute","hour","day","year"};
    public static int min, sec, hour, day, year;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int orig = in.nextInt();
        int dub = orig;
        if(dub==0)
            System.out.println(word[0]);
        else if(dub<60&&dub!=0)
            System.out.println(giveSeconds(dub));
        else if(dub>=60&&dub<3600)
            System.out.println(giveMinutes(dub));
        else if(dub>=3600&&dub<86400)
            System.out.println(giveHours(dub));
        else if(dub>=86400&&dub<31536000)
            System.out.println(giveDays(dub));
        else if(dub>=31536000)
            System.out.println(giveYears(dub));
    }
    
    public static String giveSeconds(int d){
        if(d<60&&d!=0){
            if(d==1)
                return (d+" "+word[1]);
            else
                return (d+" "+word[1]+"s");
        }
        return "";
    }
    
    public static String giveMinutes(int d){
        min = d/60;
        if(d>=60&&d<3600){
            int a=d-(min*60);
            if(a!=0){
                if(min==1)
                    return (min+" "+word[2]+" and "+giveSeconds(a));
                else
                    return (min+" "+word[2]+"s and "+giveSeconds(a));   
            }
            else{
                if(min==1)
                    return (min+" "+word[2]);
                else
                    return (min+" "+word[2]+"s");   
            }
        }
        return "";
    }
    public static String giveHours(int d){
        hour = d/3600;
        if(d>=3600&&d<86400){
            int a = d-(hour*60*60);
            if(a!=0){
                if(hour == 1)
                    return(hour+" "+word[3]+", "+giveMinutes(a));
                else
                    return(hour+" "+word[3]+"s, "+giveMinutes(a));
            }
            else{
                if(hour == 1)
                    return(hour+" "+word[3]);
                else
                    return(hour+" "+word[3]+"s");
            }
        }
        return "";
    }
    public static String giveDays(int d){
        day = d/86400;
        if(d>=86400&&d<31536000){
            int a=d-(day*60*60*24);
            if(a!=0){
                if(day==1)
                    return (day+" "+word[4]+", "+giveHours(a));
                else
                    return (day+" "+word[4]+"s, "+giveHours(a));
            }
            else{
                if(day==1)
                    return (day+" "+word[4]);
                else
                    return (day+" "+word[4]+"s");
            }
        }
        return "";
    }
    public static String giveYears(int d){
        year = d/31536000;
        if(d>=31536000){
            int a=d-(year*60*60*24*365);
            if(a!=0){
                if(year==1)
                    return (year+" "+word[5]+", "+giveDays(a));
                else
                    return (year+" "+word[5]+"s, "+giveDays(a));
            }
            else{
                if(year==1)
                    return (year+" "+word[5]);
                else
                    return (year+" "+word[5]+"s");
            }
        }
        return "";
    }
}