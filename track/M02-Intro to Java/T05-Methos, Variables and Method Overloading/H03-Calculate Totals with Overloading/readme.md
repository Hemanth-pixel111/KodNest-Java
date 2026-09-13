Calculate Totals with Overloading

Create a class named ResultCalculator with two overloaded methods:
int getTotal(int first, int second)
int getTotal(int first, int second, int third)

The first method must return the total of two marks. The second method must return the total of three marks.

In main():
1. Read three integer marks.
2. Create one ResultCalculator object.
3. Call the two-parameter method using the first two marks.
4. Call the three-parameter method using all three marks.
5. Print both returned totals.

Do not print input prompts.

Input
<first mark>
<second mark>
<third mark>

Output
Two-Mark Total: <total of first and second>
Three-Mark Total: <total of all three>

Sample Input
70
80
90

Sample Output
Two-Mark Total: 150
Three-Mark Total: 240