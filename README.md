# Reverse Integer

This is a Java program that reverses the digits of a signed 32-bit integer while ensuring it stays within the range [-2^31, 2^31 - 1], as per the given conditions.

## Problem Statement

Given a signed 32-bit integer `x`, your task is to return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

### Example

Input: 123
Output: 321

Input: -123
Output: -321

Input: 120
Output: 21

Input: 3347483647
Output: 0

Input: -3347483647
Output: 0

## How to Use

1. Clone this repository to your local machine.
2. Open the Java program file, `ReverseInteger.java`.
3. Replace the placeholder code with the provided Java solution for reversing integers.
4. Compile the Java code using your preferred Java compiler (e.g., `javac ReverseInteger.java`).
5. Run the program using the Java Virtual Machine (JVM) (e.g., `java ReverseInteger`).
6. Follow the on-screen instructions to input the integer to be reversed.
7. The program will display the reversed integer or 0 if it goes outside the specified range.

Please note that this program assumes the environment does not allow you to store 64-bit integers (signed or unsigned).

