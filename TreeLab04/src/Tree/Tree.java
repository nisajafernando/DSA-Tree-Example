package Tree;

public class Tree {

	private Node root;
	
  
  public void insert(int empNo, String Name ) {
       Node newNode = new Node();
       newNode.EmpNo = empNo; // assign the empno to the new node
       newNode.name = Name; // assign name to the new node
       
       if (root== null) { //checking whether tree is empty
    	 root = newNode; // if the tree is empty make the new node as root
       }
       else {
    	   Node current = root;
    	   Node parent;
    	   while(true) {// always the condition is true
    		   parent = current;
    		   if(empNo < current.EmpNo) { //left
    			   current = current.leftChild;
    			   if(current == null) {
    				   parent.leftChild = newNode;
    				   return;
    			   } 
    		   }
    		   else { // right side
    			   current= current.rightChild;
    			   if(current == null) {
    				   parent.rightChild = newNode;
    				   return;
    			   }
    		   }
    	   }
       } 
  }
  
  private void inOrder( Node localRoot) { // left,root,right
	  if(localRoot != null) {
		  inOrder(localRoot.leftChild);
		  localRoot.displayNode();
		  inOrder(localRoot.rightChild);
		  
		  
	  }
  }
  public void TraverseinOrder() {
	  inOrder(root);
	  
  }
  
  private void preOrder(Node localRoot ) { //root,left,right
	  if(localRoot != null) {
		  localRoot.displayNode();
		  preOrder(localRoot.leftChild);
		  preOrder(localRoot.rightChild); 
	  }
  }
  public void TraversepreOrder() {
	  preOrder(root);
  }
  
  private void postOrder( Node localRoot) {//left,right,root
	  if(localRoot != null) {
		  
		  postOrder(localRoot.leftChild);
		  postOrder(localRoot.rightChild); 
		  localRoot.displayNode();
	  }
	  
  }
  
  public void TraversepostOrder() {
	  postOrder(root);
  }
  private Node findRecursive(Node localRoot,int empNo ) {
	  if(localRoot == null) {
		  return null;
	  }
	  else if(localRoot.EmpNo == empNo) {
		  System.out.println(localRoot.name);
		  return localRoot;
	  }
	  else if(empNo<localRoot.EmpNo) {
		  return findRecursive(localRoot.leftChild,empNo);
		  
	  }
	  else {
		  return findRecursive(localRoot.rightChild,empNo);
	  }
  }
  public Node callRecursive(int empNo) {
	  return findRecursive(root,empNo);
  }
  public Node find(int empNo) {
	  Node current = root;
	  while(current.EmpNo != empNo) {
		  if(empNo < current.EmpNo) {
			  current = current.leftChild;
			  
		  }
		  else {
			  current = current.rightChild;
		  }
		  if(current == null ) {
			  return null;
		  }
	  }//found the Emp number
	  System.out.println(current.name);
	  return current;
	  
  }
  public void deleteAll() {
	  root = null;
  }
 
}
