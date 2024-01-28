package InterviewProg;
import java.util.StringTokenizer;
public class Token {
public static void main(String args[]) {
	StringTokenizer st=new StringTokenizer("i love my country");
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}
}
}
