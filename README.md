# LeetCode Java Solutions (5 Problems)

A small collection of **5 LeetCode solutions in Java**, written to practice core problem‑solving patterns such as **math formulas**, **sorting**, **bitwise XOR**, **string scanning**, and **brute force search**.

> ✅ Focus: Clean, beginner‑friendly implementations + clear **Time/Space Complexity**.

---

## 📌 Problems Included

1. **Missing Number** — Math (Sum Formula)
2. **Contains Duplicate** — Sorting + Adjacent Scan
3. **Single Number** — Bit Manipulation (XOR)
4. **Longest Common Prefix** — Prefix Shrinking Across Strings
5. **Two Sum** — Brute Force Pair Search

---

## 🧠 Techniques Used

- **Arithmetic Sum Formula** to compute expected sum `n(n+1)/2`
- **Sorting** to bring duplicates next to each other
- **Bitwise XOR** to cancel paired numbers
- **Iterative Prefix Reduction** for common prefix
- **Nested Loops** for pair matching (Two Sum)

---

## ⏱️ Complexity Summary

- **Missing Number:** `O(n)` time, `O(1)` extra space
- **Contains Duplicate:** `O(n log n)` time, `O(1)` extra space *(ignoring sort overhead)*
- **Single Number:** `O(n)` time, `O(1)` extra space
- **Longest Common Prefix:** `O(total characters)` time, `O(1)` extra space *(besides temp strings)*
- **Two Sum (Brute Force):** `O(n^2)` time, `O(1)` extra space

---

## 🧩 Source Code

All solutions are inside **one Java file** and implemented as separate methods:

- `missingNumber(int[] nums)`
- `containsDuplicate(int[] nums)`
- `singleNumber(int[] nums)`
- `longestCommonPrefix(String[] strs)`
- `twoSum(int[] nums, int target)`

---

## ▶️ How to Run (Java)

### 1) Recommended file structure

```
.
├── Main.java
└── README.md
```

### 2) Important note about `main`

In Java, the entry point must be:

```java
public static void main(String[] args)
```

If your current method is `void main()`, update it to the standard signature so you can run from terminal.

### 3) Compile & run

```bash
javac Main.java
java Main
```

---

## ✅ Implementation Notes (Per Problem)

### 1) Missing Number
- Compute expected sum of `0..n` using `n(n+1)/2`
- Subtract actual array sum to get the missing value

### 2) Contains Duplicate
- Sort the array
- Check neighbors: if `nums[i] == nums[i-1]` → duplicate exists

> ⚠️ Sorting changes the original array order.

### 3) Single Number
- XOR all elements
- Since `a ^ a = 0` and `0 ^ x = x`, the remaining value is the unique number

### 4) Longest Common Prefix
- Start with the first string as a prefix
- For every next string, shrink the prefix until characters stop matching

### 5) Two Sum (Brute Force)
- Check every pair `(i, j)`
- Return indices when `nums[i] + nums[j] == target`

> 💡 Optimization idea: Use a **HashMap** to solve it in `O(n)` time.

---

## 🚀 Possible Improvements

- **Two Sum:** Replace brute force with `HashMap<Integer, Integer>` (One‑Pass).
- **Longest Common Prefix:** Avoid repeated string concatenation (use `StringBuilder`).
- **Project structure:** Split each problem into its own class/file for scalability.

---

## 📄 License

This repository is for learning and practice. Feel free to fork and improve.
