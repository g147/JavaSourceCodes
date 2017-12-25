import java.io.*;
class Binary_Search
{
   public static void main(String[] args)throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("The the elements: ");
       int n[]=new int[5];
       for(int i=0;i<5;i++)
       {
           n[i]=Integer.parseInt(br.readLine());
       }
       System.out.println("Enter the number to be searched:");
       int k=Integer.parseInt(br.readLine());
       int min=0,max=5;
       int p=0,x=0;
       System.out.println("1.For Ascending");
       System.out.println("2.For Descending");
       int a=Integer.parseInt(br.readLine());
       switch(a)
       {
           case 1:
            for(int i=0;i<4;i++)
       {
           for(int j=(i+1);j<5;j++)
           {
               if(n[i]>n[j])
               {
                   p=n[i];
                   n[i]=n[j];
                   n[j]=p;
               }
           }
       }
       while(min<=max)
       {
           p=(min+max)/2;
           if(n[p]>k)
           {
               max=p-1;
           }
           if(n[p]<k)
           {
               min=p+1;
           }
           if(n[p]==k)
           {
               x++;
               break;
           }
       }
       if(x==1)
       {
           System.out.println("Search success");
       }
       else
       {
           System.out.println("Search unsuccess");
       }
       break;
       case 2:
        for(int i=0;i<4;i++)
       {
           for(int j=(i+1);j<5;j++)
           {
               if(n[i]>n[j])
               {
                   p=n[i];
                   n[i]=n[j];
                   n[j]=p;
               }
           }
       }
        while(min<=max)
       {
           p=(min+max)/2;
           if(n[p]<k)
           {
               min=p+1;
           }
           if(n[p]>k)
           {
               max=p-1;
           }
           if(n[p]==k)
           {
               x++;
               break;
           }
       }
       if(x==1)
       {
           System.out.println("Search success");
       }
       else
       {
           System.out.println("Search unsuccess");
       }
       
       }
       
       
   }
}
