# credit-card-verifier
A program to verify whether a credit card number is valid or not.

This project contains a java file Verifier.java in src/cc/verifier/ which is the class that contains a method verify() which returns true if the credit card number is valid, it takes one argument which is the card number itself in string data type.

Procedure:
  1. Start with the second last digit of the credit card number and multiply every other digit by 2.
  2. Add these products' digits.
  3. Add the sum to the sum of digits that were not multiplied by 2.
  4. If the sum ends with 0 it is valid.
  
