import java.util.*;
class matrix 
{
    int rows;
    int cols;
    int [][] a;
    int [][] transpose;

    matrix(int r,int c)
    {
        rows=r;
        cols=c;
        a=new int[rows][cols];
        transpose=new int[cols][rows];
    }
    void display()
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }        
    }
    void transpose() 
    {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) 
            {
                transpose[j][i]=a[i][j];
            }
        }
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=s.nextInt();
        System.out.println("Enter cloumns:");
        int cols=s.nextInt();
        matrix m=new matrix(rows, cols);
        for (int i=0;i<m.rows;i++)
        {
            for(int j=0;j<m.cols;j++)
            {
                System.out.println("Enter values:");
                m.a[i][j]=s.nextInt();
            }
        }
        m.display();
        m.transpose();
    }
}
