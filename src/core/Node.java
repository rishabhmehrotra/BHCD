package core;

public class Node {

	public int nodeID;
	public Query q;

	public Node(int nodeID)
	{
		this.nodeID = nodeID;
	}
	
	public Query getQ() {
		return q;
	}

	public void setQ(Query q) {
		this.q = q;
	}
}
