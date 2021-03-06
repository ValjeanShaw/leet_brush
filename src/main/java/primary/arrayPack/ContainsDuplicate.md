## 解题思路

### 存在重复

```text
给定一个整数数组，判断是否存在重复元素。

如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

示例 1:

输入: [1,2,3,1]
输出: true
示例 2:

输入: [1,2,3,4]
输出: false
示例 3:

输入: [1,1,1,3,3,4,3,2,4,2]
输出: true
```

解题思路：

分析题意，针对判断重复的题，一般都考虑使用o(1)的方法直接进行判断，避免使用遍历导致时间复杂度升高。较常用的遍历
是Hash，由于java中HashSet自带hash功能，可以考虑使用。即使用set维护一个不重复的处理后的数组，针对待处理数组，
使用hashset判重即可，由于hashset是o(1)操作，所以整体时间复杂度是o(n)
