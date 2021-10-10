package com.venkatyarlagadda.learning.hackerrank;

import java.util.ArrayList;
import java.util.StringTokenizer;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    public int getResult() {
      	//implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    public int getResult() {
      	//implement this
        return 1;
    }

    public void visitNode(TreeNode node) {
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
    }
}

class FancyVisitor extends TreeVis {
    public int getResult() {
      	//implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
    	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
    	//implement this
    }
}

public class TreeSolution {
  
    public static Tree solve() {

        /*//read the tree from STDIN and return its root as a return value of this function
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String n1 = br.readLine();
			String n2 = br.readLine();
			String n3 = br.readLine();
			String n4 = br.readLine();
		    String n5 = br.readLine();
			String n6 = br.readLine();*/
    	
    	String s1 = "5"; // Number of nodes
    	String s2 = "4 7 2 5 12"; // node values
    	String s3 = "0 1 0 0 1"; // colors
    	String s4 = "1 2"; // bindings
    	String s5 = "1 3";
    	String s6 = "3 4";
    	String s7 = "3 5";
		//TreeNode value, color & Depth
    	
    	// Parse frist line
    	int numberOfNodes = Integer.parseInt(s1);
    	int valueOfNodes[] = new int[numberOfNodes];
    	Color colorsOfNodes[] = new Color[numberOfNodes];
    	
    	// Parse second line
    	StringTokenizer st = new StringTokenizer(s2);
    	if(st.countTokens() == numberOfNodes){
    		int counter =0;
    		while(st.hasMoreTokens()){
    			valueOfNodes[counter++] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	// Parse 3rd line
    	st = new StringTokenizer(s3);
    	if(st.countTokens() == numberOfNodes){
    		int counter =0;
    		while(st.hasMoreTokens()){
    			if(1==Integer.parseInt(st.nextToken())){
    				colorsOfNodes[counter++] = Color.GREEN;
    			}else{
    				colorsOfNodes[counter++] = Color.RED;
    			}
    		}
    	}
    	
    	for(Color color: colorsOfNodes){
    		System.out.println(color.name());
    	}
    	
    	TreeNode[] treeNodes = new TreeNode[numberOfNodes];
		return new TreeNode(1, Color.GREEN,4);
    	
    }   
    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}