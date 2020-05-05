package ArrayPgm;

public class AddTwoMatrix {

	public static void main(String[] args) {
		int[][] b={{1,2,3},{6,7,8}};
		int[][] c={{1,7,0},{5,8,9}};
		int[][] d=new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				d[i][j]=b[i][j]+c[i][j];
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}

	}

 }
