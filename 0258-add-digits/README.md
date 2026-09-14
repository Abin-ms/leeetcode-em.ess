<h2><a href="https://leetcode.com/problems/add-digits">258. Add Digits</a></h2><h3>Easy</h3><hr><p>Given an integer <code>num</code>, repeatedly add all its digits until the result has only one digit, and return it.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> num = 38
<strong>Output:</strong> 2
<strong>Explanation:</strong> The process is
38 --&gt; 3 + 8 --&gt; 11
11 --&gt; 1 + 1 --&gt; 2 
Since 2 has only one digit, return it.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> num = 0
<strong>Output:</strong> 0
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= num &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Could you do it without any loop/recursion in <code>O(1)</code> runtime?</p>

# Approach 2 - description.

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
 The number may have more than one digit, so I repeatedly calculate the sum of its digits until only one digit remains.

For example:
 ```38
    ↓
    3 + 8 = 11
    ↓
    1 + 1 = 2
 ```
The outer loop makes sure the process continues until num becomes a single-digit number.

```
    Outer loop → repeat until one digit remains
        ↓
    Inner loop → calculate the sum of the digits
 ```

  # Approach
<!-- Describe your approach to solving the problem. -->
1) Use an outer while loop with the condition num >= 10 to check whether the number has more than one digit.
    2) Inside it, initialize resultt to 0.
    3) Use another while loop to extract each digit:
    - num % 10 gets the last digit.
    - Add the digit to resultt.
    - num / 10 removes the last digit.
    4) After all digits are added, assign the result back to num.
    5) The outer loop repeats the process if the new value still has more than one digit.
    6) Finally, return num.

    For example, with 38:
 ```
    num = 38
        ↓
    3 + 8 = 11
        ↓
    num = 11
        ↓
    1 + 1 = 2
        ↓
    num = 2
        ↓
    return 2
  ```



# Complexity
- Time complexity: O(log n)
    <!-- Add your time complexity here, e.g. $$O(n)$$ -->

    - Space complexity:O(1)
    <!-- Add your space complexity here, e.g. $$O(n)$$ -->

    # Code
    ```java []
    class Solution {
        public int addDigits(int num) {
            while(num>=10){
                int resultt = 0;
            while( num !=  0){
                int digit = num % 10;
                resultt = resultt + digit;
                num = num / 10;
            }
            num = resultt;
            }
            return num;
        }
    
    }
    ```

    # Beats 98.11% in runtime.
    ![Screenshot 2026-09-14 124605.png](https://assets.leetcode.com/users/images/a5b26ebb-2ab2-4cee-be95-26612abe93a5_1789370242.171148.png)

