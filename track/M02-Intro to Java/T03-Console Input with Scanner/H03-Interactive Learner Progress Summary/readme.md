# Interactive Learner Progress Summary

Create a Java program that prepares a learner's practice-progress summary.

Read the following values in order:
1. Learner's full name
2. Number of practice days
3. Solved-problem count for each day

The full name may contain spaces, so read it using `nextLine()`.

Use a loop to read the daily solved-problem counts. Calculate the total number of problems solved and the decimal daily average.

`daily average = total solved / number of practice days`

Assume the number of practice days is greater than zero. Do not use an array.

---

### Readiness Status Rules

| Daily Average | Status |
| :--- | :--- |
| 5.0 or more | Consistent |
| Below 5.0 | Needs consistency |

---

### Input Format
```text
fullName
days
day1Solved day2Solved ... dayNSolved
```
- `fullName` may contain spaces.
- `days` is a positive integer.
- The next `days` integers represent daily solved-problem counts.

---

### Output Format
Print exactly four lines:
```text
Learner: <fullName>
Total solved: <total>
Daily average: <average>
Status: <status>
```

---

### Sample Input
```text
Ravi Kumar
3
5 5 5
```

### Sample Output
```text
Learner: Ravi Kumar
Total solved: 15
Daily average: 5.0
Status: Consistent
```