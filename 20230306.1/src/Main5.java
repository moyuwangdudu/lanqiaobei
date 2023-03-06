@SuppressWarnings({"all"})

public class Main5 {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode root=null;

    public TreeNode search(int val){
        TreeNode cur=root;
        while (cur!=null){
            if(cur.val<val){
                cur=cur.left;
            }
            else if(cur.val>val){
                cur=cur.right;
            }
            else {
                return cur;
            }
        }
        return null;
    }

    public static void main(String[] args) {
    }
}
