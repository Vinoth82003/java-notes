
***Basic requirements***
1. Energy
2. Interactive
3. Confident
4. Fluency
5. discipline
6. Time management

# Operators & Typecasting

**Questions**:

1.  What is an ***operator***?
2. Can we convert ***String to Char*** datatype?
		We cannot convert string to char, because String is non-primitive datatype whereas Char is primitive datatype.
3. Can we convert ***Boolean to Integers***?
	- we cannot convert any other datatype to Boolean type and Boolean type to other datatype.
	- No, because the way of storing datatype is different.
	the size of Boolean is ***1 bit*** whereas Integer is ***4 byte***.
4. When we go for ***narrowing***?
	- Convert ***higher datatype*** to ***lower datatype***.
	- The conversion of higher to lower datatype will not done by the compiler so we developers to convert using ***(type caste operator)*** to convert from higher datatype to lower datatype.

5. When do we use ***logical Not (!)*** operator?
	- invert the value of a Boolean expression
	- **Unary Operator**: The logical NOT operator is unary, meaning it operates on a single operand, which is typically a Boolean expression (i.e., an expression that evaluates to  `true`  or  `false`). 
	- **Inversion**: The main function of the  `!`  operator is to reverse the truth value of the expression:

# Methods:


1. What is the syntax to create a method?
	- modifiers return_type method_name (formal arguments)
	- modifiers specify the method is static or non-static
	- return_type tells what type of data the method is returning
	- method_name represents what is the functionality of the method.

2. what is the diff between ***static and non-static methods***.
3. why ***main method is static***?
	- if main method is non-static, JVM wants to ***create an object each time*** when the execution starts.
	- to avoid this, they made main method as static.
4. inside a void method can we write return statement?
	- **Yes**, we can write return statement in void method.
	- but we should not return any value, because void method is no return data.
	-  ``` return ; ``` it only returns the control.
```java
	public static void display()
	{
		return ;
	}
```

5. can we ***create a method inside a method***?
	- Method belongs to the classes, not belongs to the blocks 
	- so, we cannot create a block inside a block.

6. Can we write ***print statement in ternary operator***?
	- ***No***, we cannot write.
	- because the return type of **print** and **println** methods are void

7. can we create method without return type?
	- we cannot write a method without return type, return type is mandatory.

8. can we write return statement inside main method?
    - **Yes**, we can write return statement inside main method without returning any value (``` return ;```). 

9. When will you get unreachable code error?
	- When the control is not able to reach to specific instruction, then we get unreachable code error.

10. Diff b/w formal arguments and actual arguments.
	|  Formal argument | Actual argument |
	|---------------------|----------------------|
	|  variables declared during the method declaration statement is **formal statement**. | The values passed during a method call statement is called **Actual arguments**. |

11. What is ```System.in``` in object creation of scanner class.
	- ```System.in``` where ***system*** is class and ***in*** is a variable holding buffers of the class where data is stored.

12. Rules for using return statement.
	- If the method return type anything ***other than void*** then the ***return type is mandatory***.
	- Suppose the method return type is void, the ***return key*** word is optional.
	- we can write ***only one value*** return in return statement.

# Decision Making Statements:

1. Is it very much mandatory to write condition inside **if**?
	- ***Condition is mandatory***, 
	- because the if clock will execute based on the condition.

2. Give one real time example where you used ***elseif ladder***?
	- A real-time example where I used the ***else if ladder*** was while working on a **user authentication system** for a web application. In this system, different user roles (like admin, moderator, and regular user) required different permissions. Here's how the ***else if ladder*** was applied:

	- **If** the user was an admin, they had full access to the system.
	- **Else if** the user was a moderator, they had limited access to manage content but not user accounts.
	- **Else if** the user was a regular user, they could only view content.
	- **Else**, if the user wasn't logged in, they were redirected to the login page.

This structure allowed the system to efficiently manage permissions based on the user's role.

3. Diff b/w ***else if ladder*** and ***switch***
	
| elseif ladder | switch |
|--|--|
| in else if ladder if none of the condition is true it goes for else. | in switch if none of the case passes it goes for default   |
| in else if all the datatypes are allowed | In switch case only few datatypes are allowed. not allowed datatype Eg: long, float, double. |
| only 2 keywords in else if.  (if, else) | we have 3 decision making keywords (switch, case, default) |
|break is optional in elseif ladder |it is mandatory to use break keyword in switch case.|
| Efficiency is less | Efficiency is more|

# Looping statements

1. Diff b/w **for** and **while** loop? 
	
|while  | for  |
|--|--|
|condition is mandatory in while loop   | condition is optional in for loop |
| cannot write print statement in while loop condition block | we can write print statement inside the initialization and updating block.

2. What is the default value of while loop?
	 - the default value is **true**.

# Arrays:

1. What is an array?
2. in what situation we get array index out of bound exception?
3. when do we get negative array size exception?
4. how many ways we can create an array?
	- 3 ways to create an array;
	- ``` int [] array = new int[5]```
	- ```int [] ar = {10,20,30}```
	- ``` int [] a = new int[] {10,20,30}```
5. what is ***vararg*** method? 