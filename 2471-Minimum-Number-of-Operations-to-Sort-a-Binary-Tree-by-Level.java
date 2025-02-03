class Solution {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);int c=0;
        while(!q.isEmpty()){
            int s=q.size();
            int[][] arr=new int[s][2];
            int i=0;
            while(s-->0){
            TreeNode t=q.poll();
            arr[i][0]=t.val;
            arr[i][1]=i++;
            if(t.left!=null)q.offer(t.left);
            if(t.right!=null)q.offer(t.right);
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        for(int j=0;j<arr.length;){
            if(arr[j][1]==j){
                j++;
                continue;
            }
            int[]t=arr[j];
            int p=arr[j][1];
            arr[j]=arr[p];
            arr[p]=t;
            c++;
        }
        }
        return c;
    }
}