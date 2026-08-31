# Personal Expense Calculator

Create a Java program to calculate a person’s monthly expenses and remaining balance.

The program must read four decimal values in the following order:
1. Monthly income
2. Rent expense
3. Food expense
4. Travel expense

Calculate the total expense by adding rent, food and travel expenses.

Then calculate the remaining amount:
`remaining amount = monthly income - total expense`

Determine the budget status using these rules:
- If the remaining amount is zero or positive, print `Within budget`.
- If the remaining amount is negative, print `Over budget`.

Do not print any input prompts.

---

### Input Format
The input contains four values, each provided on a separate line:
- `monthlyIncome`
- `rentExpense`
- `foodExpense`
- `travelExpense`

*All input values must be read as `double`.*

---

### Output Format
Print the result in exactly three lines:
```text
Total expense: <totalExpense>
Remaining: <remainingAmount>
Status: <status>
```

---

### Sample Input
```text
20000
10000
6000
4000
```

### Sample Output
```text
Total expense: 20000.0
Remaining: 0.0
Status: Within budget
```

