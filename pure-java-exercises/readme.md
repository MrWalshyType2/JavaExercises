# Exercises

## Table of Contents (ToC)

- [Beginner exercises](#beginner)

    - [Operators](#operators)
    
    - [Iteration](#iteration)
    
    - [Conditionals](#conditionals)
    
    - [Arrays](#arrays)

## Beginner

### Operators

#### Calculator

In the `exercises.beginner.operators` package, implement the following in the `Calculator` class:
   1. A method which adds two numbers and returns their sum.
   2. A method which subtracts two numbers and returns their difference.
   3. A method which multiplies two numbers and returns their product.
   4. A method which divides two numbers and returns their quotient.

#### Results

In the `exercises.beginner.operators` package, a `Results` class exists for you to do this exercise.

A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.

The `Results` class has been created for you with 5 instance variables already populated. You must implement the following methods:

- `displayResults()`: displays the results that the person got for each exam and then the total mark.

- `displayPercentage()`: which finds and displays the percentage that the person received for the exams overall.

For `displayResults()`, the output to the console must contain the following fragments, they may be in any order:

*Header*

```
###############
# EXAM SCORES #
###############
```

*Body*

```
PHYSICS: 104
CHEMISTRY: 134
BIOLOGY: 97
```

*Footer*

```
TOTAL SCORE: 335/450
PERCENTAGE: 74%
```

For `displayPercentage()`, the output to the console must contain the following:

```
PERCENTAGE: 74%
```

The exam scores and percentages will differ according to the values you use, everything else about the header, body and footer fragments must remain the same.

### Conditionals

#### Add together

Given a two digit number from 10 up to 100, the sum of both digits will be returned, i.e., 11 would be 2, 22 would be 4, 57 would be 12, etc...

See file: `exercises.beginner.conditionals.AddTogether`

#### Blackjack

Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.

```
play (10, 21) -> 21
play (20, 18) -> 20
play (1, 22) -> 1
play (22, 23) -> 0
```

See file: `exercises.beginner.conditionals.AddTogether`

#### CalculatorRevisited

Edit the division method in the `exercises.beginner.conditionals.CalculatorRevisited` class, the sum should only execute if the second parameter is not zero, otherwise it prints out a message saying that the division cannot be performed, the message must be the String `Cannot divide by zero`.

#### FizzBuzz

Implement the `play` method in `exercises.beginner.conditionals.FizzBuzz` where the method returns a String according to the following constraints:]

- returns 'Fizz' for multiples of 3
- returns 'Buzz' for multiples of 5
- returns 'FizzBuzz' for multiples of both 3 and 5
- returns the input number for numbers that are neither

#### ResultsRevisited

Using `exercises.beginner.conditionals.ResultsRevisited`, expand your original `exercises.beginner.operators.Results`:

1. Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.

2. Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.

eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84

they would have an overall grade of 85.3% (Pass)

but in this case the student would fail because their physics grade is 54% (Fail)

3. Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.

For `displayResults()`, the output to the console must contain the following fragments, they may be in any order:

**Header**

```
###############
# EXAM SCORES #
###############
```

**Body**

```
PHYSICS: 104/150
CHEMISTRY: 134/150
BIOLOGY: 97/150
```

**Footer**

```
TOTAL SCORE: 335/450
PERCENTAGE: 74%
```

**Failure message examples**:

When a failure occurs, it must be printed to the console. The possible fragments are as follows:

- `FAILED CHEMISTRY: 20%`

- `FAILED PHYSICS: 14%`

- `FAILED BIOLOGY: 39%`

- `FAILED: 41%`

Scores and percentages will differ dependent on the values used for chemistry, physics and biology scores.

#### Taxes

Using `exercises.beginner.conditionals.Taxes`, do the following tasks:

1. `calculateTaxRate` - which takes a salary and works out the percentage by which the salary will be taxed.

2. `calculateTax` - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.

The salaries are taxed as below:

```
0 - 14,999 : 0% tax
15,000 - 19,999 : 10% tax
20,000 - 29,999 : 15% tax
30,000 - 44,999 : 20% tax
45,000+ : 25% tax
```

#### UniqueSum

Using `exercises.beginner.conditionals.UniqueSum`, do the following tasks:

Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given.

```
play(1, 2, 3) -> 6
play(3, 3, 3) -> 0
play(1, 1, 2) -> 2
```

### Iteration

#### Shapes

For the following questions, you must use one or more iterative statements under the following constraint:

> Only `System.out.print('\n')`, `System.out.print('#')` and `System.out.print(' ')` may be used to output to the console.

Using `exercises.beginner.iteration.Shapes`, do the following tasks:

1. Print a right-angled triangle to the console, the desired output is as follows:

```
#
##
###
####
#####
```

3. Print an inverted right-angled triangle to the console, the desired output is as follows:

```
#####
####
###
##
#
```

2. Print a left-angled triangle to the console, the desired output is as follows:

```
    #
   ##
  ###
 ####
#####
```

4. Print an inverted left-angled triangle to the console, the desired output is as follows:

```
#####
 ####
  ###
   ##
    #
```

5. Print an acute triangle to the console, the desired output is as follows:

```
   #
  ###
 #####
#######
```

6. Print the following zig-zagged line to the console:

```
#
 #
# 
 #
#
 #
```

7. Print a circle to the console, the desired output is as follows:

```
 ##
#  #
#  #
 ##
```

#### Repeat the number

For the following questions, you must use one or more iterative statements under the following constraint:

> Only `System.out.print('\n')` and `System.out.print(i)`, where `i` is the number to print, may be used to output data to the console.

Using `exercises.beginner.iteration.RepeatTheNumber`, do the following tasks:

1) Create a method that will print out the numbers 1 through 10, 10 times each on the same line. Desired output is as follows:

```
1111111111
2222222222
3333333333
4444444444
5555555555
6666666666
7777777777
8888888888
9999999999
10101010101010101010
```

2) Create a method that will print the numbers 1 through 10 as many times as the value of that number. Desired output is as follows:

```
1
22
333
4444
55555
666666
7777777
88888888
999999999
10101010101010101010
```

#### Digit counter

Create a method that when given an integer _n_, the number of digits in the integer are output. For example:

```java
numOfDigits(10); // 2
numOfDigits(3); // 1
numOfDigits(34243); // 5
```

**Location**: `exercises.beginner.iteration.DigitCounter.numOfDigits`

##### Stretch task

As an add-on task if you feel like stretching yourself, try to implement a recursive solution to the digit counting problem.

> In programming, recursion is where a method or function call itself some number of times. This can cause stack overflow errors in some languages, Java being one of them.

#### Factorial

Create a method that when given an integer *n*, returns the integer factorial of the number. The factorial of a positive integer, *n!*, is the product of all positive integers less-than or equal to _n_ but greater than 0. 

For example:

```
5! = 5 x 4 x 3 x 2 x 1 = 120
4! = 4 x 3 x 2 x 1 = 24
3! = 3 x 2 x 1 = 6
etc...
```

**Location**: `exercises.beginner.iteration.Factorial.factorialOf`

#### Fibonacci sequence generator

Create a method that when given an integer *length*, it returns an array of integers containing a Fibonacci sequence of the specified *length*.

The Fibonacci sequence is a collection of numbers, of an arbitrary length, where each number is the sum of the prior two numbers. This sequence is built using natural numbers, all non-negative integers including 
zero. For example:

```java
generateFibonnaciSequence(3); // [0, 1, 1]
generateFibonnaciSequence(4); // [0, 1, 1, 2]
generateFibonnaciSequence(5); // [0, 1, 1, 2, 3]
generateFibonnaciSequence(10); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
```

**Location**: `exercises.beginner.iteration.FibonacciNumbers.generateFibonnaciSequence`

### Arrays

#### Stringify numbers

##### One to ninety-nine

Create a method that when given an integer between zero (inclusive) and 100 (exclusive) returns the number in its textual format, for example:

```java
oneToNinetyNine(3); // three
oneToNinetyNine(32); // thirty-two
oneToNinetyNine(13); // thirteen
oneToNinetyNine(99); // ninety-nine
oneToNinetyNine(0); // zero
oneToNinetyNine(-1); // TOO SMALL
oneToNinetyNine(100); // TOO BIG
```

If the number is less than zero, `TOO SMALL` should be returned. If it is greater than ninety-nine, `TOO BIG` should be returned.

**Location**: `exercises.beginner.arrays.StringifyNumbers.oneToNinetyNine`


##### One to nine-hundred and ninety-nine

Extend your one to ninety-nine solution to also include integer numbers up to 999, for example:

```java
oneToNineHundredNinetyNine(333); // three-hundred and thirty-three
```

The same constraints apply as before, except this time the upper bound is nine-hundred and ninety nine - beyond this is when `TOO BIG` should be returned.

**Location**: `exercises.beginner.arrays.StringifyNumbers.oneToNineHundredNinetyNine`

#### Generating multiples

Create a method that when given two integers, a *multiple* and a *count*, returns an integer array containing the multiples of a given number up to the specified count. If count is less than 1, an empty array 
must be returned.

For example:

```java
multiplesOf(5, 3); // [5, 10, 15]
multiplesOf(10, 0); // []
multiplesOf(7, 10); // [7, 14, 21, 28, 35, 42, 49]
```

**Location**: `exercises.beginner.arrays.GenerateArray.multiplesOf`

#### Summing up an array

Create a method that when given an integer array it returns the sum of the integers within the array, for example:

```java
sumOf(new int[] {1,2,3}); // 6
sumOf(new int[] {8,8}); // 16
```

**Location**: `exercises.beginner.arrays.ArrayIteration.sumOf`

#### Linear search

Create a method that when given an array of integers and a number, it returns the index of the first occurrence of the number. For example:

```java
indexOf(new int[] {1,2,3}, 3); // 2
indexOf(new int[] {1,2,3}, 1); // 0
indexOf(new int[] {1,2,3}, 332); // -1
```

If the given number does not exist in the array, the method should return -1 to indicate this to the caller.

**Location**: `exercises.beginner.arrays.ArrayIteration.indexOf`

##### Additional information

A linear search is where every element in a collection must be checked so that we can ascertain whether an element is present or not. It is said to have a complexity of `O(n)` where `n` is the number of 
items in the collection. The `O` is for Big-O notation, a way of representing the time complexity of an algorithm - the amount of steps a set of programming instructions carries out in plain-speak. `O(n)` simply 
means the programming instructions executed increase linear to the input size `n`.

For the following, we can assume certain instructions in Java are constant complexity, `O(1)`. These operations include but are not limited to addition, subtraction, division, multiplication, assignment, 
creating a variable, negation (NOT), conjunction (AND), disjunction (OR), accessing an element in an array and inserting an element into an array. The fastest chunks of code are said to be constant in how many steps they take to run, meaning that we can 
adjust the size of the input and the operation will take the same amount of time. `3 + 3` takes the same amount of time as `12312 + 324342` for example, although the numbers are different in size it can be 
assumed that the operations are constant due to usage of the ALU and FPU in the CPU.

> The reason a set of programming instructions is measured in steps with big-o is because time is not reliable, hardware built today will likely not run algorithms as fast as future hardware.... Heck, even 
> two machines of the same specification can have differences in how long they take in real-time. This can be caused by a multitude of factors, the main one being that your operating system is busy sending 
> other tasks to your processor that it needs to do.

All of the following code is constant complexity, `O(1)`:

```java
int i = 5;
i *= 2;
i + 4;
i * 8; 
```

- each instruction is one step, even if the size of the numbers changes it still one step

An example of linear complexity, `O(n)`, is easily demonstrated with a loop. A loop repeats instructions some `n` amount of times:

```java
int n = 5;

for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

The trick to seeing that this is linear is paying attention to the condition of the loop, `i < n`. If the number `n` increases, the amount of times we call the instructions inside the loops body also increases in 
a linear proportion to `n`. By that sense, if `n` is 5 `println(i)` is called 5 times and if `n` is 18, it would be called 18 times.

Finding the index of a number is an example of a linear search problem as unless the array is sorted, you must iterate through every element to check if the desired one exists or not.

#### Copying an array

Create a method that when given an array of integers, returns a copy of the original. For example:

```java
int[] arr = new int[] { 1, 2, 3 };
int[] copy = copy(arr); // { 1, 2, 3 }; 
```

**Location**: `exercises.beginner.arrays.ArrayIteration.copy`

#### Finding the largest value in an array

Create a method, that given an array, returns the largest number in the array. Assume the array is not in a sorted order and if the array is empty, return 0. For example:

```java
int[] arr = new int[] { 1, 2, 3 };
int[] arr2 = new int[] { 1, 2432, 3 };
max(arr); // 3
max(arr2); // 2432
```

> Smells like a search is in order

**Location**: `exercises.beginner.arrays.ArrayIteration.max`

#### Finding the smallest value in an array

Create a method, that given an array, returns the smallest number in the array. Assume the array is not in a sorted order and if the array is empty, return 0. For example:

```java
int[] arr = new int[] { 1, 2, 3 };
int[] arr2 = new int[] { 32321, 2432, 37 };
min(arr); // 1
min(arr2); // 37
```

**Location**: `exercises.beginner.arrays.ArrayIteration.min`

#### The bubble sort

A bubble sort is an algorithm, it is a way of sorting an array of `n` elements. The algorithm is relatively simple and can be summarised as follows:

> Given an array of elements, create an outer loop to iterate over the array. Inside of this, create an inner loop where on each iteration the current elements size is compared to the next element in the 
> array. If the next element is greater than the current one, their positions are swapped in the array.

As a simple set of instructions, it could be framed as:

1. for each element in the array
2. if the current element is greater than the next:
3. swap the positions of the elements in the array
        
This process should be repeated until all elements have been swapped to their correct positions.

```java
bubbleSort(new int[] { 3, 2, 1 });
// - Outer loop iteration 1, inner loop iteration 1, index 0: { 2, 3, 1 } <-- swap occurs between 3 and 2
// - Outer loop iteration 1, inner loop iteration 2, index 1: { 2, 1, 3 } <-- swap occurs between 3 and 1
// - Outer loop iteration 1, inner loop iteration 3, index 2: { 2, 1, 3 } <-- no swap
//
// - Outer loop iteration 2, inner loop iteration 1, index 0: { 1, 2, 3 } <-- swap occurs between 2 and 1
// - Outer loop iteration 2, inner loop iteration 2, index 1: { 1, 2, 3 } <-- no swap
// - Outer loop iteration 2, inner loop iteration 3, index 2: { 1, 2, 3 } <-- no swap
//
// - Outer loop iteration 3, inner loop iteration 1, index 0: { 1, 2, 3 } <-- no swap
// - Outer loop iteration 3, inner loop iteration 2, index 1: { 1, 2, 3 } <-- no swap
// - Outer loop iteration 3, inner loop iteration 3, index 2: { 1, 2, 3 } <-- no swap
```

The above demonstrates the general process of a bubble swap. Its runtime complexity is said to be `O(n^2)` as the outer loop is linear in `n` and the inner loop is also linear in `n`, meaning their combined 
complexity is `n * n`. An algorithm with a time complexity of `O(n^2)` may also be referred to as quadratic complexity, where quadratic implies the number of steps executed grows 
proportionally to the square of `n`.

**Location**: `exercises.beginner.arrays.ArrayIteration.bubbleSort`
