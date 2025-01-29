The program must accept a string S containing only lower case alphabets as the input. The
program must print all the alphabets between every two alphabets (both inclusive) in the string
S as the output. The English alphabet set is considered in a cyclic fashion to print the
alphabets from one alphabet to another.
Boundary Condition(s):
2 <= Length of S <= 100
Input Format:
The first line contains S.
Output Format:
The first line contains a string as per the given condition.

Example Input/Output 1:
Input:
aepd

Output:
abcdeefghijklmnoppqrstuvwxyzabcd

Explanation:
Here S = aepd.
The alphabets between a to e are a b c d e (a and e are inclusive).
The alphabets between e to p are e fg h ij k I m n o p (e and p are inclusive).
The alphabets between p to d are p q r st u v w xy z a b c d (p and d are inclusive).
So abcdeefghijklmnoppqrstuvwxyzabcd is printed as the output.

Example Input/Output 2:
Input:
apple

Output:
abcdefghijklmnopppqrstuvwxyzabcdefghijkllmnopqrstuvwxyzabcde

Example Input/Output 3:
Input:
aabbaa

Output:
aabbbcdefghijklmnopqrstuvwxyzaa