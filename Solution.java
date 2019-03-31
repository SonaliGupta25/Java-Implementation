package lecture1;

import java.util.ArrayList;

public class Solution {

		/*	Binary Tree Node class
		 * 
		 * class BinaryTreeNode<T> {
				T data;
				BinaryTreeNode<T> left;
				BinaryTreeNode<T> right;
				
				public BinaryTreeNode(T data) {
					this.data = data;
				}
			}
			*/

			public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
				/* Your class should be named Solution
				* Don't write main().
				* Don't read input, it is passed as function argument.
				* Return output and don't print it.
				* Taking input and printing output is handled automatically.
				*/
			// if(root==null){
			// return null;
			// }
			// ArrayList<Integer> arr=new ArrayList<>();
			// if(path(root,arr,data)){
			// return arr;
			// }
			// else{
			// return null;
			// }
			// }
			// public static boolean path(BinaryTreeNode<Integer> root,ArrayList<Integer> arr,int data){
		        ArrayList<Integer> arr=new ArrayList<>();
		        if(root==null){
		            return null;
		        }
		        //arr.add(root.data);
		        else if(root.data==data){
		        arr.add(root.data);
		            return arr;
		        }
		        else{
		            if(data>root.data){
		               arr=findPath(root.right,data);
		                if(arr!=null){
		                    arr.add(root.data);
		                }
		                return arr;
		            }
		            else{
		                arr=findPath(root.left,data);
		                if(arr!=null){
		                    arr.add(root.data);
		                }
		                return arr;
		            }
		        }
		        // if(path(root.left,arr,data)||path(root.right,arr,data)){
		        //     return true;
		        // }
		        // arr.remove(arr.size()-1);
		        // return false;
		    }  

}
