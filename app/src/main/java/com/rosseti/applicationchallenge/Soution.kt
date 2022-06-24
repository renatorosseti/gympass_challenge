package com.rosseti.applicationchallenge

/**
Given a set (i.e., no duplicate) of integer numbers, e.g. [1, 3, 2, 4], write a function
that returns all unique subsets of the given set.
- Set A is a subset of a set B if all elements of A are also elements of B.
- It is possible for A and B to be equal.
- It is possible for A and B to be empty.
- By definition, order of elements in a set is not important, e.g., [1, 2] and [2, 1] are
considered the same set. The output of the function should contain all unique
subsets of the input set, in any order the candidate chooses.
Please include the test cases you used for your solution.
 **/

//En entreguei assim
object Solution {
    fun fetchSubsets(input: List<Int>): List<List<Int>> {
        var subsets = HashSet<List<Int>>()
        subsets.add(emptyList())
        for (index in input.indices) {
            subsets.add(listOf(input[index]))
            subsets.addAll(createGroup(subsets, input, index))
        }
        return subsets.toList().sortedBy { it.size }
    }

    private fun createGroup(
        group: HashSet<List<Int>>,
        input: List<Int>,
        index: Int
    ): HashSet<List<Int>> {
        var newGroup = HashSet<List<Int>>()
        for (element in group) {
            if (!element.contains(input[index])) {
                val list = element + input[index]
                newGroup.add(list)
            }
        }
        return newGroup
    }
}

// Depois eu olhei e vi que poderia ter entre assim:
object Solution2 {
    fun fetchSubsets(input: List<Int>): List<List<Int>> {
        var subsets = HashSet<List<Int>>()
        subsets.add(emptyList())
        for (index in input.indices) {
            subsets.add(listOf(input[index]))
            subsets.addAll(createGroup(subsets, input, index))
        }
        return subsets.toList().sortedBy { it.size }
    }

    private fun createGroup(
        group: HashSet<List<Int>>,
        input: List<Int>,
        index: Int
    ): HashSet<List<Int>> {
        var newGroup = HashSet<List<Int>>()
        for (element in group) {
            if (!element.contains(input[index])) {
                val list = element + input[index]
                newGroup.add(list)
            }
        }
        return newGroup
    }
}