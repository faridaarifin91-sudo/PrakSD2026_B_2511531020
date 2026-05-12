package pekan6_2511531020;

public class NodeDLL_2511531020 {
	//mendefenisikan kelas Node
	int data_1020; // data
	NodeDLL_2511531020 next_1020; //Pointer ke next Node
	NodeDLL_2511531020 prev_1020; // Pointer ke previous node
	
	//Konstruktor
	public NodeDLL_2511531020(int data_1020) {
		this.data_1020 = data_1020;
		this.next_1020 = null;
		this.prev_1020 = null;
	}
}