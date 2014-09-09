package core;
import java.util.*;

public class Tree {
	
	public int treeID;
	public ArrayList<Node> nodeList; // we assume that the nodeList is always updated with nodes from all the children
	public ArrayList<Tree> childTrees;
	public int nChildren;
	public double likelihood = 0.0;
	public boolean isLeaf;
	public int n1;
	public int n0;
	public int n1CH, n0CH;
	public double gXY;
	
	public boolean isMerge;
	public boolean isInitialMerge;
	public Tree X,Y;
	public double bayesFactorScore;
	
	public Tree(int tID)
	{
		this.treeID = tID;
		this.nodeList = new ArrayList<Node>();
		this.childTrees = new ArrayList<Tree>();
		this.nChildren = 0;
		this.isLeaf = false;
		this.isMerge = false;
		this.isInitialMerge = false;
		this.bayesFactorScore = 0.0;
		this.n1 = 0; this.n0 = 0; this.n1CH = 0; this.n0CH = 0;
	}
	
	public void addNode(Node n)
	{
		this.nodeList.add(n);
		//this.nChildren++; TODO: check, it wasnt commented before,shud we comment it?
		// we are incrementingnChildren only when we have merged t rees, not with initialTrees
	}
	
	public void addChildTree(Tree t)
	{
		this.childTrees.add(t);
		this.nChildren++;
		// now that a new child is added to this tree, we update the nodeList accordingly
		updateNodeList(t);
	}
	
	public void updateNodeList(Tree t)
	{
		Iterator<Node> itr = t.nodeList.iterator();
		while(itr.hasNext())
		{
			Node n = itr.next();
			this.nodeList.add(n);
		}
	}
	
	public Tree getX() {
		return X;
	}

	public void setX(Tree x) {
		X = x;
	}

	public Tree getY() {
		return Y;
	}

	public void setY(Tree y) {
		Y = y;
	}
}
