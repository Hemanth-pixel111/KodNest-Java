Student Utility Using Methods

Build a reusable StudentUtility that receives student information, calculates academic values and returns results to main().

Create these methods:

| Method | Purpose |
| :--- | :--- |
| showReportTitle() | Print Student Performance Report |
| displayStudent(int id, String name) | Display the student identity |
| getPassingPercentage() | Return 60.0 |
| calculatePercentage(int javaScore, int sqlScore) | Return the average of the two scores |

Read one student's ID, full name, Java score and SQL score using Scanner. Use the returned percentage and passing percentage in main() to print PASS or NEEDS IMPROVEMENT.

### Input Order
1. Student ID
2. Full name
3. Java score
4. SQL score

### Rules
- Use one StudentUtility object.
- Call every custom method through that object.
- Keep percentage calculation inside calculatePercentage.
- Return the percentage; do not print it inside the calculation method.
- Perform the final PASS decision in main() using the two returned values.
- Preserve spaces in the full name.
- Do not use constructors, this, custom static methods, arrays or collections.

### Sample Input
101
Asha Rao
82
78

### Sample Output
Student Performance Report
ID: 101
Name: Asha Rao
Percentage: 80.0
Result: PASS