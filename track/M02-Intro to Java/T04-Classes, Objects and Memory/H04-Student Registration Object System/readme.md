# Student Registration Object System

Create two Student objects. Read both student records, then read a registration ID and a new attendance percentage. Make selectedStudent refer to the matching existing object. Update attendance through selectedStudent and display both records.

Do not create a third Student object. If the entered registration ID does not match either student, print Student not found. and leave both objects unchanged.

### Class and fields

| Field Name | Data Type |
| :--- | :--- |
| registrationId | int |
| name | String |
| attendancePercentage | double |

### Input Format

Read eight values in this order:
1. First student's registration ID
2. First student's name
3. First student's attendance percentage
4. Second student's registration ID
5. Second student's name
6. Second student's attendance percentage
7. Registration ID to select
8. New attendance percentage

Each name is one word without spaces.

### Output Format

For a valid registration ID, print:
Selected Student:  -  - % -  - %
For an invalid registration ID, print:
Student not found. -  - % -  - %
### Sample Input
301Neha72.0302Arjun81.030180.0
### Sample Output
Selected Student: Neha301 - Neha - 80.0%302 - Arjun - 81.0%