### Learner Profile Object System

Create a Learner class and two separate Learner objects. Read the details of both learners and print them. Then update only the first learner's Java score and print both records again to prove that the second object remains unchanged.

#### Class and fields
| Field Name | Data Type |
| :--- | :--- |
| id | int |
| name | String |
| javaScore | int |

#### Input Format
Read seven values in this order:
1. First learner's ID
2. First learner's name
3. First learner's Java score
4. Second learner's ID
5. Second learner's name
6. Second learner's Java score
7. New Java score for the first learner

Each name is one word without spaces.

#### Output Format
Print the two records before the update and after the update:
Before Update
<first id> - <first name> - <first score>
<second id> - <second name> - <second score>
After Update
<first id> - <first name> - <new first score>
<second id> - <second name> - <unchanged second score>

#### Sample Input
101
Asha
82
102
Ravi
75
90

#### Sample Output
Before Update
101 - Asha - 82
102 - Ravi - 75
After Update
101 - Asha - 90
102 - Ravi - 75