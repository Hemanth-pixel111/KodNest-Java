# Number Range Analyzer

Create a Java program that analyzes every integer in a given range.

Read a start value and an end value. Visit every number from the start to the end, including both limits.

While traversing the range:
- Add every even number to `evenSum`.
- Count every odd number in `oddCount`.

Assume that the start value is less than or equal to the end value. Use one loop and do not use an array.

---

### Input Format
The input contains two integers:
- `start`
- `end`

*Assume `start <= end`.*

---

### Output Format
Print exactly two lines:
```text
Even sum: <evenSum>
Odd count: <oddCount>
```

---

### Sample Input
```text
6
6
```

### Sample Output
```text
Even sum: 6
Odd count: 0
```

---

### Evaluation Requirements
- Read both range limits at runtime using `Scanner`.
- Include the start and end values in the analysis.
- Use one loop to traverse the range.
- Use the modulo operator to identify even and odd numbers.
- Maintain separate accumulator and counter variables.
- Do not use arrays or collections.
- Match the output labels, capitalization and spacing exactly.
- Do not print input prompts or additional messages.