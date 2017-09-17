
public class Lytest {
	private  String str = "Hello";
	private  char a[]={'a','b','c'};
public static void main(String[] args) {
	Lytest ly = new Lytest();
	change(ly.str,ly.a);
	System.out.println(ly.str);
	System.out.println(ly.a);
}
public static void change(String str,char a[]){
	str="change";
	a[0]='g';
	//gegnxin
}
}
