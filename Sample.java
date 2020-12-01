public class Sample {
  static int a=20;
  public static void main(String[] args) {
  System.out.println("Welcome of the Sample program being solved in the Master Branch");
  Sample a2=new Sample("test1");
  Sample a3=new Sample("test2",10);
  System.out.println(Sample.a);
   Sample.add();
  }
  Sample(String i) {
  System.out.println(i);
  }
  Sample(String k,int j) {
  System.out.println(j);
  System.out.println(k);
  }
  public void add( ) {
  System.out.println("from method");
  }
}
