/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Node fun(Node n,Map<Node,Node> m){
        Node t=new Node(n.val);
        m.put(n,t);
        for(Node l:n.neighbors){
            if(!m.containsKey(l)){
                t.neighbors.add(fun(l,m));
            }
            else{
                t.neighbors.add(m.get(l));
            }
        }
        return t;
    }
    public Node cloneGraph(Node node) {
        if(node==null)return node;
        Map<Node,Node> m=new HashMap<>();
        return fun(node,m);
    }
}