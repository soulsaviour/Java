public class random {
public static void main(String[] args){
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
double r = Math.random();
int value = (int) (r*(b-a)+a);
System.out.println(value);
}
}