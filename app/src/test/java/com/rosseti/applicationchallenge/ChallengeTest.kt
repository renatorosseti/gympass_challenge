package com.rosseti.applicationchallenge

import org.junit.Test

import org.junit.Assert.*

class ChallengeTest {

    @Test
    fun `given an empty array when call fetch subsets should return an empty subset`() {
        assertEquals(
            arrayListOf(
                listOf<Int>()
            ), Solution.fetchSubsets(listOf())
        )
    }

    @Test
    fun `given an array 0 - 1 when call fetch subsets should return all subsets`() {
        assertEquals(
            arrayListOf(
                listOf(),
                listOf(1),
                listOf(0),
                listOf(0, 1),
            ), Solution.fetchSubsets(listOf(0, 1))
        )
    }

    @Test
    fun `given an array 0 - 2 when call fetch subsets should return all subsets`() {
        assertEquals(
            arrayListOf(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(0),
                listOf(0, 1),
                listOf(1, 2),
                listOf(0, 2),
                listOf(0, 1, 2),
            ), Solution.fetchSubsets(listOf(0, 1, 2))
        )
    }
    @Test
    fun `given an array 0 - 3 when call fetch subsets should return all subsets`() {
        assertEquals(
            arrayListOf(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(3),
                listOf(0),
                listOf(0, 1),
                listOf(1, 2),
                listOf(2, 3),
                listOf(0, 2),
                listOf(1, 3),
                listOf(0, 3),
                listOf(0, 1, 2),
                listOf(0, 2, 3),
                listOf(0, 1, 3),
                listOf(1, 2, 3),
                listOf(0, 1, 2, 3),
            ), Solution.fetchSubsets(listOf(0, 1, 2, 3))
        )
    }

    @Test
    fun `given an array 1 - 4 when call fetch subsets should return all subsets`() {
        assertEquals(
            arrayListOf(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(3),
                listOf(4),
                listOf(1, 2),
                listOf(2, 3),
                listOf(3, 4),
                listOf(1, 3),
                listOf(2, 4),
                listOf(1, 4),
                listOf(1, 2, 3),
                listOf(1, 3, 4),
                listOf(1, 2, 4),
                listOf(2, 3, 4),
                listOf(1, 2, 3, 4),
            ), Solution.fetchSubsets(listOf(1, 2, 3, 4))
        )
    }

    @Test
    fun `given an array 1 - 5 when call fetch subsets should return all subsets`() {
        assertEquals(
            arrayListOf(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(3),
                listOf(4),
                listOf(5),
                listOf(2, 3),
                listOf(4, 5),
                listOf(2, 4),
                listOf(2, 5),
                listOf(1, 2),
                listOf(3, 4),
                listOf(1, 3),
                listOf(3, 5),
                listOf(1, 4),
                listOf(1, 5),
                listOf(1, 3, 4),
                listOf(2, 3, 4),
                listOf(1, 3, 5),
                listOf(2, 3, 5),
                listOf(1, 2, 3),
                listOf(1, 4, 5),
                listOf(1, 2, 4),
                listOf(2, 4, 5),
                listOf(1, 2, 5),
                listOf(3, 4, 5),
                listOf(1, 2, 3, 5),
                listOf(2, 3, 4, 5),
                listOf(1,2, 3, 4),
                listOf(1, 3, 4, 5),
                listOf(1, 2, 4, 5),
                listOf(1, 2, 3, 4, 5),
            ), Solution.fetchSubsets(listOf(1, 2, 3, 4, 5))
        )
    }
}