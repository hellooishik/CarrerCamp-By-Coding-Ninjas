/*
package Trics;
// Declearing the TricNode Class

class  tricNode{
	// Integer as a data 
	char data;
	// Declear the boolean if it's the Termina node or not
	boolean IsTerminal;
	// Declear the array is respcet to the terminal node 
	tricNode children[];
	
// Implementation of the constutor
	// Where the class takes same danme as in the previous class
	
public tricNode(char data) {
	this.data = data;
	this.IsTerminal = false;
	this.children = new tricNode[26];
	
}
}

public class Trics {
	// Insert
	// Search
	// Deleted
	// DeClaring the root
	private tricNode root;
	// Adding the constuctor
	public Trics() {
		root = new tricNode('\0');
	}
	// Function to insert as a tric
	private void AdHelper(tricNode root, String Word ) {
		// Checking the base case
		if(Word.length()== 0){
			
			root.IsTerminal= true;
			return;
		}
		// Declearing the index
		int ChildIndex = Word.charAt(0)- 'A';
		// Main Node Decleartaion 
		tricNode Child = root.children[ChildIndex];
		if(Child == null) {
			Child = new tricNode(Word.charAt(0));
			root.children[ChildIndex] = Child;
		}
		AdHelper(Child, Word.substring(1));
	}
	public void insert(String Word) {
		// Add the function to add the new word in dic
		AdHelper(root, Word);
	}
	public void SearchData(String Word) {
		// Fuction to Search From an Dic
	}
	public void delete(String Word) {
		// Function to Delete the data;
	}
}
*/
