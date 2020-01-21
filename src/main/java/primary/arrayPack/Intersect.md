## 解题思路

### 两个数组的交集 II

```text
给定两个数组，编写一个函数来计算它们的交集。

示例 1:

输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2,2]
示例 2:

输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [4,9]

```

解题思路：

根据题意，即根据一个数组中指定数字，从另一个数组中找指定数字的情况。根据这类题目，一般从数组中找到指定数字，如不是有序数组，
均需要遍历，时间复杂度将会是o(n),因此可考虑是否有办法将o(n)变成o(1)，一般可以使用hash实现该目的。

针对此题，可先对比两个数组长度大小，将短的数组，将其全部存入hashmap，然后遍历长的数组，取出对应hashmap中的值即可。
时间复杂度  o(m+n)