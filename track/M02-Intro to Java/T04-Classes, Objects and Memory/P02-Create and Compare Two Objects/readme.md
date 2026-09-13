### Create and Compare Two Objects

Create a Student class and two separate Student objects. Read the details of both students, display both records, compare their Java scores, and print the correct result.

#### Class and fields
| Field Name | Data Type |
| :--- | :--- |
| id | int |
| name | String |
| javaScore | int |

#### Input Format
Read six values in this order:
1. First student's ID
2. First student's name
3. First student's Java score
4. Second student's ID
5. Second student's name
6. Second student's Java score

Each name is one word without spaces.

#### Output Format
First print both records in this format:
`<id> - <name> - <javaScore>`

Then print exactly one comparison message:
- If the first score is higher: `<first name> has the higher Java score.`
- If the second score is higher: `<second name> has the higher Java score.`
- If both scores are equal: `Both students have the same Java score.`

#### Sample Input
201
Asha
82
202
Ravi
88

#### Sample Output
201 - Asha - 82
202 - Ravi - 88
Ravi has the higher Java score.