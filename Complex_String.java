import java.io.*;
class Complex_String
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String st=br.readLine();
        int l=st.length();
        int x=0,y=0,z=0;
        for(int i=0;i<l;i++)
        {
            char b=st.charAt(i);
            if(b==' ')
            {
                x++;
            }
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U')
            {
                y++;
            }
            else
            {
                z++;
            }
        }
        int words=(l-x);
        System.out.println("The length of the String:  "+l);
        System.out.println("The no. of Vowels: "+y);
        System.out.println("The no. of Consonants: "+z);
        System.out.println("The no. of Alphabets:   "+words);
        System.out.println("The no. of Words:   "+x+1);
        
    }
}
