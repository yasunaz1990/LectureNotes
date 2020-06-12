# Java Operator 
---
*Alphalef, LLC* 

**Definition**:  Operators are special symbols that carry out opearations ( manipulations ) on its operatns ( raw data or variable that contains data value ).
**Purpose**:  It is cool that we can express data we use on daily basis thanks to the Data Types in java, and also store them temproarly while the program is running using varialbes.  However, what is the point if we cannot manipulate the data and benefit from it.  Operator let us do manipulations on our data such as arithmetic, logical and representational manipulations.

**Example:** 
```java
int a = 10;   // variable a that contains whole number data value 10
int b = 20;   // variable b that contains whole number data value 20
// +  addition operator 
System.out.println(  a + b );   // 30 
// Thanks to the addition operator, we were able to get 30 which was very hard for us if we do manually. Afterall, who would enjoy adding numbers. 
```

Note that all of the operators we will learn in this session are for the Data Types we have covered so far, especiall 
- integer
- double 
- boolean 

**Types of operators**:
- Assignment Operator 
- Arithmetic Operator 
- Compound Assignment Operator ( Variable Content Updater ) 
- Unary Operators 
- Relational Operators
- Logical Operators
- Ternary Operator ( Conditional Assignment Operator )

---
### Assignment Operator
**symbol**:   `=`
**purpose**:   Assignment operators are used in Java to assign values to variables. The assignment operator assigns the value on its right to the variable on its left.
**Example:**
```java
int number;     // empty integer varialbe named 'number'
number = 90;    // integer variable number contains 90 
number = 0;     // now, integer variable number contains 0
number = -80;   // now, integer variable number contains -80

int age = 29;   // creating integer variable named 'age'
number = age;   // now, variable number contains the integer data 29 that was stored in variable age
```
### 
### Arithmetic Operator
**symbols** : 
![Image](https://www.dropbox.com/s/ud1u46baffm1iye/ByAAB_ZTL_SystF_WaL.png?dl=1)

**purpose**:  Arithmetic operators are used to perform mathematical operations like addition, subtraction, multiplication, etc.
**Example:**
```java
int num1 = 10;
int num2 = 20;

//   +  Addition (also used for string concatenation)
int sum = num1 + num2;
System.out.println(sum);  //  30

//    -  Subtraction Operator
int sub = num1 - num2;
System.out.println(sub);  //  -10

//    *  Multiplication Operator
int multi = num1 * num2;
System.out.println(multi); // 200

//    /	 Division Operator
int div = num2 / num1;
System.out.println(div);  // 2

int err = num2 / 0;   // note that you cannot divide any number by zero, uncomment this 

// dividing tow integer data will result in any fractional part of the result will be ignored.
int ret = num1 / 3;  
System.out.println(ret); // you will get 3, not 3.33333 since it is integer data type division

// use double data type if precision is priority
double x = 10.0;
double y = 3.0;
double ans = x / y;  
System.out.println(ans);  // 3.3333333335

//    %  Remainder Operator
// This operator will give us remainder of dividing two numbers
int rem = num1 % 3;
System.out.println(rem); // 1
```

The `+` operator can also be used to **concatenate** two or more strings.
Concatenating two string data means, from two different string data, we can get one whole string data using `+` operator. 

**Example:** 
```java
String front = "Hello ";
String middle = "Students! Let's ";
String end = "code some java!";

String result = front + middle + end;
System.out.println(result);  //Hello Students! Let's code some java!

String greeting = "Hello " + "World!";
System.out.println(greeting); //Hello World!

System.out.println("What " + " is your" + "fav color?"); //What  is yourfav color?
```



### Unary Operators
 **symbols:** 
![Image](https://www.dropbox.com/s/nf25m5qea2ljohd/ByAAB_ZTL_Sk0pFFZaI.png?dl=1)

**purpose**:  To indicate whether a number is positive or negative, as well as shortcut for increment by 1and decrement by 1.    Note that there are two sytle of usage for increment operator and decrement operator. 
- Postfix  :    ``num`++`     if you use postfix with `System.out.println( num++ );`  the value of num will be first displayed and afterwords its content will be incremented by 1. 
- Prefix   :    `++`num``      if you use postfix with `System.out.println( ++num );`  the value of num will be incremented by 1 first, and then its content will be displayed. 
**Exmaple:**
```java
int myInt = 5;
++myInt   // myInt becomes 6
myInt++   // myInt becomes 7
--myInt   // myInt becomes 6
myInt--   // myInt becomes 5

System.out.println(myInt--);  // displays 5, then the content of myInt will be decremente by 1
System.out.println(myInt );   // displayes 4
System.out.println(++myInt);  // displays 5, since incremental by 1 is done first and then value was displayed

int x = 10;
int y = 20;

//         9  + 20
int ans = --x + y++;
System.out.println(y);    // 21
System.out.println(ans);  // 29
```








