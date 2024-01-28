package InterviewProg;

public class Tasks {

public class StringTask {

	public static void main(String[] args) {
		String ogStr = "Beautiful Butterfly";
		
	    String revStr = "";   
	    for (int i = 0; i < ogStr.length(); i++) {
	      revStr = ogStr.charAt(i) + revStr;
	    }
	    
	    System.out.println("Reversed string: "+ revStr);   //reverse a  string
	    System.out.println();
	    
	    
        String trim= ogStr.substring(10, 13);
        System.out.println("Trimmed Word: " + trim);
        System.out.println();
        
        System.out.println(ogStr.toUpperCase());
        System.out.println();
        
        String txt="\"Beautiful\" Butterfly";
        System.out.println(txt);
        System.out.println();
        
        String sentence = "Aim high fly sky";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word); 
        }
        System.out.println();
        
        
        int number = 12345;
        String str1 = Integer.toString(number);
        System.out.println(str1);
        System.out.println();
        
        
        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println(num);
        System.out.println();
        
        String str6="Empty";
        String revStr1 = "";   
	    for (int i = 0; i < str6.length(); i++) {
	      revStr1 = str6.charAt(i) + revStr1;
	    }
	    System.out.println(str6+" = "+ revStr1);   //reverse a  string
	    System.out.println();
	    
	    
	    for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                switch (i) {
                    case 5:
                        System.out.print("five ");
                        break;
                    case 10:
                        System.out.print("ten ");
                        break;
                    case 15:
                        System.out.print("fifteen ");
                        break;
                    case 20:
                        System.out.print("Twenty");
                        break;
                    default:
                        break;
                }
            } else {
                System.out.print(i + " ");
            }
        }
	}

}
}
