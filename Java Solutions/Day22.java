
public class Day22 {

	public static int getHeight(Node root){
        int count = 0;
        
        if(root == null){
            return 0;
        }
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);  
        
        if (left > right){
            count = left+1;
        } else {
            count = right+1;
        }

        return count;
    }
	
}
