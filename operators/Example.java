package operators;

public  class  Example {
	/**
	 * @param args
	 */
	public  static  void  main(String[] args) {
		System.out.println(10 + "abc"); //10abc
		System.out.println("abc" + 10); //abc10
		System.out.println(10 + 10 + "abc"); //20abc
		System.out.println(10 + 'a' + "abc"); //107abc
		System.out.println(10 + "-abc-" + "-cde-"); //10-abc--cde-
		System.out.println(10 + "-abc-" + 4 + 20); //10-abc-420
		System.out.println(10 + "-abc-" + 'a'); //10-abc-a
		System.out.println(10 + "-abc-" + true); //10-abc-true
		// System.out.println(10  + true + "-abc-"); //compiler error
		// System.out.println(10 + "-abc-" +20 - 30); //compiler error
		System.out.println(10 + "-abc-" +(20 - 30)); //10-abc--10
	}
}
