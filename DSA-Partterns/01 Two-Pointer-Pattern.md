# Two Pointer Pattern - Complete Notes

## Overview
The Two Pointer pattern is a technique where we use two pointers/indices to traverse through a data structure (usually arrays) simultaneously. It's an efficient approach to solve problems in O(n) or O(n log n) time without requiring extra space.

---

## When to Use Two Pointer Pattern

### ✅ Sorted/Sort Scenarios
- Array is **already sorted** OR can be **sorted**
- Need to find pairs, triplets, or specific combinations
- Common in array manipulation problems

### ✅ Key Conditions
- **Number Problems**: We CAN sort the array (order of elements can change)
- **Index Problems**: We CANNOT sort the array (order matters, index positions are important)

---

## Problem Categories & Patterns

### 1️⃣ **Merge Problems**
**Pattern**: Merging two sorted arrays/sequences

**Approach**:
- Start from the beginning (or end) of both arrays
- Compare elements and move appropriate pointer
- Common in merge sort, merge intervals

**Example Problems**:
- Merge two sorted arrays
- Merge sorted linked lists
- Merge intervals

```python
# Merge two sorted arrays
def merge(arr1, arr2):
    result = []
    i, j = 0, 0
    
    while i < len(arr1) and j < len(arr2):
        if arr1[i] <= arr2[j]:
            result.append(arr1[i])
            i += 1
        else:
            result.append(arr2[j])
            j += 1
    
    result.extend(arr1[i:])
    result.extend(arr2[j:])
    return result
```

---

### 2️⃣ **Remove Duplicates**
**Pattern**: Remove/Skip duplicate elements while modifying array in-place

**Approach**:
- Use one pointer for position to place next unique element
- Use another pointer to search for next unique element
- Compare elements and advance accordingly

**Example Problems**:
- Remove duplicates from sorted array
- Remove duplicates II (keep at most k occurrences)
- Remove all occurrences of a value

```python
# Remove duplicates from sorted array
def removeDuplicates(nums):
    if len(nums) <= 1:
        return len(nums)
    
    i = 0  # pointer for position to place next unique
    
    for j in range(1, len(nums)):  # j searches through array
        if nums[j] != nums[i]:
            i += 1
            nums[i] = nums[j]
    
    return i + 1
```

---

### 3️⃣ **Rearrange Elements**
**Pattern**: Rearrange array based on conditions (even/odd, positive/negative, etc.)

**Approach**:
- One pointer tracks position to place element
- Other pointer searches for elements meeting condition
- Swap or place elements accordingly

**Example Problems**:
- Move zeros to end
- Partition array (smaller/larger than pivot)
- Separate even and odd numbers
- Sort colors (0, 1, 2)
- Dutch National Flag problem

```python
# Move zeros to end
def moveZeroes(nums):
    i = 0  # position for non-zero elements
    
    for j in range(len(nums)):
        if nums[j] != 0:
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
```

---

### 4️⃣ **Detect Cycle**
**Pattern**: Detect cycles in linked structures using slow and fast pointers

**Approach**:
- Slow pointer moves 1 step
- Fast pointer moves 2 steps
- If they meet → cycle exists
- Floyd's Cycle Detection algorithm

**Example Problems**:
- Detect cycle in linked list
- Find cycle start position
- Happy number (cycle in sequence)
- Linked list cycle II

```python
# Detect cycle in linked list
def hasCycle(head):
    slow = fast = head
    
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        
        if slow == fast:
            return True
    
    return False
```

---

### 5️⃣ **Pair/Triplets/Quadruplets Problems**
**Pattern**: Find specific combinations that satisfy conditions

**Approach**:
- **Pairs (2Sum)**: Left and right pointers from ends
- **Triplets (3Sum)**: Fix one element, use two pointers for remaining
- **Quadruplets (4Sum)**: Fix two elements, use two pointers for remaining

**Example Problems**:
- Two Sum II (sorted array)
- 3Sum
- 3Sum Closest
- 4Sum
- Container with most water

```python
# Two Sum II - Input array is sorted
def twoSum(numbers, target):
    left, right = 0, len(numbers) - 1
    
    while left < right:
        current_sum = numbers[left] + numbers[right]
        
        if current_sum == target:
            return [left + 1, right + 1]
        elif current_sum < target:
            left += 1
        else:
            right -= 1
    
    return []

# 3Sum
def threeSum(nums):
    nums.sort()
    result = []
    
    for i in range(len(nums) - 2):
        if i > 0 and nums[i] == nums[i-1]:
            continue
        
        left, right = i + 1, len(nums) - 1
        
        while left < right:
            total = nums[i] + nums[left] + nums[right]
            
            if total == 0:
                result.append([nums[i], nums[left], nums[right]])
                
                while left < right and nums[left] == nums[left+1]:
                    left += 1
                while left < right and nums[right] == nums[right-1]:
                    right -= 1
                
                left += 1
                right -= 1
            elif total < 0:
                left += 1
            else:
                right -= 1
    
    return result
```

---

### 6️⃣ **Other Common Patterns**

#### String/Array Reversal
```python
def reverseString(s):
    left, right = 0, len(s) - 1
    
    while left < right:
        s[left], s[right] = s[right], s[left]
        left += 1
        right -= 1
```

#### Palindrome Check
```python
def isPalindrome(s):
    left, right = 0, len(s) - 1
    
    while left < right:
        if s[left] != s[right]:
            return False
        left += 1
        right -= 1
    
    return True
```

#### Container with Most Water
```python
def maxArea(height):
    left, right = 0, len(height) - 1
    max_area = 0
    
    while left < right:
        current_area = min(height[left], height[right]) * (right - left)
        max_area = max(max_area, current_area)
        
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
    
    return max_area
```

---

## Key Decision Points

### NUMBER Problems (CAN SORT)
- We care about **values**, not their original positions
- Sorting doesn't break the problem
- Example: Find 2Sum, 3Sum, etc.

### INDEX Problems (CANNOT SORT)
- Original **index/position matters**
- Sorting would invalidate the solution
- We must preserve array order
- Example: If array is already sorted, use two pointers; if not sorted, use two pointers while maintaining order

---

## Two Pointer Variations

| Type | Left Start | Right Start | Movement | Use Case |
|------|-----------|------------|----------|----------|
| **Opposite Ends** | Index 0 | Index n-1 | Move inward | Pairs, palindrome, reversal |
| **Same Direction** | Index 0 | Index 1 | Move forward | Duplicates, partition, move zeros |
| **Slow/Fast** | Index 0 (1 step) | Index 0 (2 steps) | Move forward | Cycle detection, middle finder |

---

## Time & Space Complexity

| Pattern | Time | Space | Notes |
|---------|------|-------|-------|
| Merge | O(n+m) | O(1) | Without extra array |
| Remove Duplicates | O(n) | O(1) | In-place |
| Rearrange | O(n) | O(1) | In-place |
| Cycle Detection | O(n) | O(1) | Floyd's algorithm |
| Pair/Triplet | O(n² to n³) | O(1) | Depends on problem |

---

## Common Mistakes to Avoid

1. ❌ Forgetting to handle duplicates in sorted arrays
2. ❌ Not updating both pointers correctly
3. ❌ Wrong loop condition (off-by-one errors)
4. ❌ Assuming array is sorted when it's not
5. ❌ Not skipping duplicates to avoid duplicate results

---

## Practice Strategy

1. **Master the fundamentals**: Reverse, palindrome, 2Sum
2. **Move to sorted pairs**: Container with water, 2Sum II
3. **Tackle triplets**: 3Sum, 3Sum Closest
4. **Handle complex cases**: 4Sum, Quadruplets
5. **Practice variations**: Dutch National Flag, Partition, Cycle Detection

---

## Quick Reference Checklist

- [ ] Is the array sorted or can be sorted?
- [ ] Do we need to preserve original indices?
- [ ] Are we looking for pairs/triplets/combinations?
- [ ] Do we need to rearrange elements?
- [ ] Are we detecting cycles?
- [ ] What's the optimal time complexity needed?
- [ ] Can we solve it in O(n) time and O(1) space?

