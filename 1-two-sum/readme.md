### Example

```
nums = [3, 2, 4]
target = 6
```

We need two indices whose values add up to `6`.

---

### Step 1: Start with an empty HashMap

Map stores → **number : index**

```
map = {}
```

---

### Step 2: First element (i = 0, num = 3)

* Complement = `target - num = 6 - 3 = 3`
* Check if `3` exists in map → ❌ No
* Store `3 → 0` in map

```
map = {3=0}
```

---

### Step 3: Second element (i = 1, num = 2)

* Complement = `6 - 2 = 4`
* Check if `4` exists in map → ❌ No
* Store `2 → 1` in map

```
map = {3=0, 2=1}
```

---

### Step 4: Third element (i = 2, num = 4)

* Complement = `6 - 4 = 2`
* Check if `2` exists in map → ✅ Yes (map\[2] = 1)
* 🎯 Found!
  Indices = `[1, 2]` → values `2 + 4 = 6`

---

### Final Answer

```
[1, 2]
```

---

✅ **Step Pattern to Remember**

1. For each number, calculate `complement = target - num`.
2. If complement already in map → answer found.
3. Otherwise, put current number in map.
4. Continue until solution is found.
