# Practice 3 - Refactoring

<p>I have made the document in English because all the code is in that language, and that is also how I practice the language</p>

## General changes

1. We delete the file that comes by default.iml and create the .gitignore with the content *.iml.
2. We separate the classes into different.java files. This way we can more easily maintain the code.

## Class --> MathUtils.java

1. isGrater(num1,num2) --> I have changed the 'max' method to 'is greater' because it is more understandable. I have also optimized the way of doing the operation. Otherwise, it would return false in the case that number 1 is equal to or smaller than number two. This way it returns true if it is larger and false if anything else.
2. The code that was there was understandable because it was purely the mathematical expression. The syntax was made as the same formula, but for a programmer who does not necessarily have to know these things, the variables must be saved descriptively. In addition, we leave comments with the mathematical formula next to them to guide us as best as possible.
