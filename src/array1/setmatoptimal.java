package array1;

public class setmatoptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {
				{1,1,1},
				{1,0,1},
				{1,1,1}
		};
		optimal(matrix);
		for( int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j] + " ");
				 
			}
			System.out.println();
		}

	}
public static void optimal(int matrix[][]) {
	int r=matrix.length;
	int c=matrix[0].length;
	int row_track[]=new int[r];
	int col_track[]=new int[c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			if(matrix[i][j]==0) {
				row_track[i]=-1;
				col_track[j]=-1;
			}
		}
	}
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			if(row_track[i]==-1 || col_track[j]==-1) {
				matrix[i][j]=0;
			}
		}
	}
	
	
	
}
}
