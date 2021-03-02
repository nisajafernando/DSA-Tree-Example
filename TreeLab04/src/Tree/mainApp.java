package Tree;

public class mainApp {

	public static void main(String[] args) {
		Tree T1 = new Tree();
		
		T1.insert(149, "Anusha");
		T1.insert(150,"Kosala");
		T1.insert(160, "Dinusha");
		T1.insert(130,"Malith");
		T1.insert(155, "Kamal");
		
		System.out.println("Inorder (Left,root,Right)");
		T1.TraverseinOrder();
		
		System.out.println("PreOrder (root,left,right)");
		T1.TraversepreOrder();
		
		System.out.println("PostOrder (left,right,root)");
		T1.TraversepostOrder();
		
		T1.find(160);
		 
//		T1.deleteAll();

		
	}

}
