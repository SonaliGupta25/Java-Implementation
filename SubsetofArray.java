package lecture1;

public class SubsetofArray {
	
		public static int[][] check(int[] input,int index,int sum){
			if(input.length==index) {
				int[][] ans= new int[1][0];
				return ans;
			}
				int[][] smallAns=check(input,index+1,sum);
				int[][] ans=new int[2*smallAns.length][];
				
				for(int i=0;i<smallAns.length;i++) {
					ans[i] = new int[smallAns[i].length];
	              	for(int j = 0;j < smallAns[i].length;j++){
	                  ans[i][j] = smallAns[i][j];
	                  
	                }
	            }
				for(int i=0;i<smallAns.length;i++){
					ans[i+smallAns.length] = new int[smallAns[i].length+1];
	              	ans[i+smallAns.length][0] = input[index];
	              	for(int j = 0;j < smallAns[i].length;j++){
	                  ans[i+smallAns.length][j+1] = smallAns[i][j];
	                
		}
	              	
	
				}
				for(int i=0;i<smallAns.length;i++) {
					for(int j=0;j<smallAns[i].length;j++) {
						if(ans[i][j]+ans[i][j+1]==sum) {
							return ans;
						}
					}
				}
			return ans;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {2,7,8,6,};
	System.out.print(check(input,0,11));
		}
	}


