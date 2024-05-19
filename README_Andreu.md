# Practice 3 - Refactoring

<p>I have made the document in English because all the code is in that language, and that is also how I practice the language</p>

## General changes

1. We delete the file that comes by default.iml and create the .gitignore with the content *.iml.
2. We separate the classes into different.java files. This way we can more easily maintain the code.
3. I have not added the refactor comment in the code, because basically all the code is refactored.

## Class --> MathUtils.java

1. isGrater(num1,num2) --> I have changed the 'max' method to 'is greater' because it is more understandable. I have also optimized the way of doing the operation. Otherwise, it would return false in the case that number 1 is equal to or smaller than number two. This way it returns true if it is larger and false if anything else.
2. The code that was there was understandable because it was purely the mathematical expression. The syntax was made as the same formula, but for a programmer who does not necessarily have to know these things, the variables must be saved descriptively. In addition, we leave comments with the mathematical formula next to them to guide us as best as possible.

## Class --> OrderLineItems, Customer
<p>We add key methods like getters, setters and tostring.</p>

## Class --> Order

<p>Error checking because list cannot be null, and rate cannot be negative.
In the return we have made a simple change, adding a variable that understands the calculation we are performing and then putting it in the return.</p>

## Class --> Human

<p>I have added the constructor, I have made the basic methods (get, set, tostring).
I have also made a method to obtain the complete address.</p>

## Class --> Main

1. We separate the Visual Menu and put it in a method. The more methods, the easier the maintenance will be.
2. It has error control for variable types, error control to see if a number is positive or negative, and more error controls.
3. We also give the user the opportunity to enter the data they want to calculate, the object they want to create, etc...
4. All variables are descriptive and the code can be understood only by reading it.
5. In case 3, we give the opportunity to create all the objects you want and we check it with the size of the list.
6. Cases 4 and 5 are set to be done soon, they are currently under maintenance.