package Stack;
import java.util.Stack;
public class celebrity_problem {
public int celebrity(int arr[][]) {
	int n=arr.length;
	Stack<Integer> st=new Stack<>();
	for(int i=0;i<n;i++) {
		st.push(i);
	}
	while(st.size()>1) {
		int a=st.pop();
		int b=st.pop();
		  if(arr[a][b] == 1) {
              st.push(b);
          }

          // a does not know b
          else {
              st.push(a);
          }
	}
		int celeb=st.pop();
		for(int j=0;j<n;j++) {
			if(celeb==j)continue;
			if(arr[celeb][j]==1) {
				return -1;
			}
			for(int i=0;i<n;i++) {
				if(celeb==i)continue;
				if(arr[i][celeb]==0) {
					return -1;
				}
			}
		}
		return celeb;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		celebrity_problem obj=new celebrity_problem();
		int arr[][]= {{0, 1, 1, 0},
				     {0, 0, 0, 0},
				     {1, 1, 0, 0},
				     {0, 1, 1, 0}};
		System.out.println(obj.celebrity(arr));

	}

}
