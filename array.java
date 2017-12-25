/**************************
 ****CREATED*BY*THE*GEEQ****
 *********#anonymous********
 *****Don't*Waste*Time******
 ****Just*Code*N*Compile****
 ***************************/
import java.util.*;
class array
{
    public static void main (String[] args)
    {

        int k=0;
        int sum_of_left_diagonals = 0;
        int sum_of_right_diagonals = 0;
        int sum_of_anti_diagonals = 0;
        int sum_of_even_cells = 0;
        int count_of_even_cells = 0;
        int sum_of_odd_cells = 0;
        int count_of_odd_cells = 0;
        int sum_of_each_row=0;
        int sum_of_each_column=0;
        int sum_of_whole_array=0;

        // Creating Scanner for Input.
        Scanner sc = new Scanner(System.in);

        // Initializing the array.
        int a[][]=new int[5][5];

        // Invoking Screen.
        System.out.println("Enter your Input");

        
        // Input Loop.
        // Loop for Columns.
        for(int i=0;i<4;i++)
        {
            // Loop for Rows.
            for(int j=0;j<4;j++)
            {
                // Taking inputs.
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Orignal Matrix :-");
        // Display Loop.
        // Loop for Columns.
        for(int i=0;i<4;i++)
        {
            System.out.println();
            // Loop for Rows.
            for(int j=0;j<4;j++)
            {
                if(a[i][j]<10)
                    System.out.print(a[i][j]+"  ");
                else
                    System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();

        
        // Sum of Left Diagonal.
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i==j)
                    sum_of_left_diagonals=sum_of_left_diagonals+a[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum of Left Diagonal is : "+sum_of_left_diagonals);

        
        // Sum of Right Diagonal.
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i+j==2)
                    sum_of_right_diagonals=sum_of_right_diagonals+a[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum of Right Diagonal is : "+sum_of_right_diagonals);

        // Sum of Anti Diagonal.
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i!=j&&i+j!=2)
                    sum_of_anti_diagonals=sum_of_anti_diagonals+a[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum of Anti Diagonal is : "+sum_of_anti_diagonals);

        // Sum and Count of Even Values.
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(a[i][j]%2==0)
                {
                    sum_of_even_cells=sum_of_even_cells+a[i][j];
                    count_of_even_cells=count_of_even_cells+1;
                }   
            }
        }
        System.out.println();
        System.out.println("Sum of Even Cells is : "+sum_of_even_cells);
        System.out.println("Count of Even Cells is : "+count_of_even_cells);

        
        // Sum and Count of Odd Values.
        for(int i=0;i<4;i++)
        { 
            for(int j=0;j<4;j++)
            {
                if(a[i][j]%2!=0)
                {
                    sum_of_odd_cells=sum_of_odd_cells+a[i][j];
                    count_of_odd_cells=count_of_odd_cells+1;
                }   
            }
        }
        System.out.println();
        System.out.println("Sum of Odd Cells is : "+sum_of_odd_cells);
        System.out.println("Count of Odd Cells is : "+count_of_odd_cells);

        
        // Sum of Each Column.
        for(int i=0;i<4;i++)
        {
            sum_of_each_column=0;
            for(int j=0;j<4;j++)
            {
                sum_of_each_column=sum_of_each_column+a[i][j];
            }
            a[i][4]=sum_of_each_column;
        }

        // Sum of Each Row.
        for(int i=0;i<4;i++)
        {
            sum_of_each_row=0;
            for(int j=0;j<4;j++)
            {
                sum_of_each_row=sum_of_each_row+a[j][i];
            }
            a[4][i]=sum_of_each_row;
        }

        
        // Sum of Whole Array.
        for(int i=0;i<4;i++)
        {
            System.out.println();

            for(int j=0;j<4;j++)
            {
                sum_of_whole_array=sum_of_whole_array+a[i][j];
            }
        }
        a[4][4]=sum_of_whole_array;

        System.out.println("Orignal Matrix after some tweaks :-");

        //Re-printing array......
        for(int i=0;i<5;i++)
        {
            System.out.println();

            for(int j=0;j<5;j++)
            {
                if(a[i][j]<10)
                    System.out.print(a[i][j]+"  ");
                else
                    System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Orignal Matrix after transposing :-");

        // Reversing the Matrix....
        for(int i=0;i<4;i++)
        {
            System.out.println();

            for(int j=0;j<4;j++)
            {
                if(a[i][j]<10)
                    System.out.print(a[i][j]+"  ");
                else
                    System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();  
        System.out.println();  

        System.out.println("Orignal Matrix after sorting :-");
        // Sorting the Matrix. 
        int small, row = 0, col = 0, z;
        System.out.println(); 
        for(k = 0; k < 4; k++)
        {
            for(int p = 0; p < 4; p++)
            {
                small = a[k][p];
                for(int i = k; i < 4; i++)
                {
                    if(i == k)
                        z = p + 1;
                    else
                        z = 0;
                    for(;z < 4; z++)
                    {
                        if(a[i][z] <= small)
                        {
                            small = a[i][z];
                            row = i;
                            col = z;
                        }
                    }
                }
                a[row][col] = a[k][p];
                a[k][p] = small;
                if(a[k][p]<10)
                    System.out.print(a[k][p] + "  ");
                else
                    System.out.print(a[k][p] + " ");
            }
            System.out.println();
        }
    }
}
/***************************************************************
 **********************Class*Compiled****************************
 ****************Syntax*Errors*Not*Supported*********************
 ****************************************************************/