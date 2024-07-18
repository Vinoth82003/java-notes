package operators;

public  class  IncDec {
public  static  void  main(String[] args) {
int  x  =  5;
int  y  =  10;
int  z  =  ++x  +  x  +  --y  +  y++  +  y;
z++;
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
}   
