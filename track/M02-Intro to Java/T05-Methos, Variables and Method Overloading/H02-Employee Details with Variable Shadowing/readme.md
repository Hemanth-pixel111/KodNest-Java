Employee Details with Variable Shadowing

Create a class named Employee with:
- A String instance variable named name
- A double instance variable named salary
- A method setDetails(String name, double salary)
- A method displayDetails()

Inside setDetails(), the parameter names are the same as the instance-variable names. Store the values using:
this.name = name;
this.salary = salary;

In main():
1. Read the employee's full name.
2. Read the salary.
3. Create one Employee object.
4. Call setDetails().
5. Call displayDetails().

Do not print input prompts.

Input
<employee name>
<salary>

Output
Employee Name: <employee name>
Salary: <salary>

Sample Input
Asha Rao
25000

Sample Output
Employee Name: Asha Rao
Salary: 25000.0