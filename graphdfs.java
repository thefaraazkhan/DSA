// Graph DFS traversal
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	    adj.add(new ArrayList<Integer>(Arrays.asList(1,2))); 
	    adj.add(new ArrayList<Integer>(Arrays.asList(3))); 
	    adj.add(new ArrayList<Integer>(Arrays.asList(3))); 
	    adj.add(new ArrayList<Integer>(Arrays.asList(4)));
	    adj.add(new ArrayList<Integer>()); 
	    Solution dfsNew = new Solution();
	    ArrayList<Integer> DFStraversal = dfsNew.dfsOfGraph(5,adj);
	    for(Integer node : DFStraversal){
	        System.out.print(node);
	    }
	   
	}
}

class Solution {
    public void dfs(int node, boolean visited[], ArrayList<Integer> storeDFS,  ArrayList<ArrayList<Integer>> adj  ){
        if(visited[node] == false){
            storeDFS.add(node);
            visited[node] = true;
            for(Integer nodes : adj.get(node)){
                if(visited[nodes] == false){
                    dfs(nodes, visited, storeDFS, adj);
                }
            }
        }
    }
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> storeDFS = new ArrayList<>();
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++){
            this.dfs(i, visited, storeDFS, adj);
        }
        
        return storeDFS;
    }
    
}
