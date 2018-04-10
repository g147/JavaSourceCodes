import java.util.Scanner;
public class completeSyllabus{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int j=0; j<q; j++){
            int subs = in.nextInt();
            int c = 0;
            int[] weeks = new int[7];
            for(int i=0; i<7; i++){
                weeks[i]=in.nextInt();
            }
            String[] week ={"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
            int ind=0;
            while(c!=subs){
                for(int i=0; i<weeks.length; i++){
                    c=c+weeks[i];
                    ind=i;
                    if(c==subs)
                        break;
                }

            }
            System.out.println(week[ind]);
        }
    }
}