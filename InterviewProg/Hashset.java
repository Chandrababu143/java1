package InterviewProg;

public class Hashset {
	public static void main(String args[]){  
		//Creating HashSet and adding elements  
		Hashset<String> set=new Hashset<String>();  
		set.add("Abi");  
		set.add("Rubesh");  
		set.add("Vicky");  
		set.add("Jenith");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}
}
