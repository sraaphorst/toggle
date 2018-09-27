package com.vorpal.toggle.trie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

final class LinkedTrieTest {
    private static LinkedTrie trie;

    @BeforeAll
    static void setUp() {
        var res = LinkedTrieTest.class.getResourceAsStream("/dictionary.txt");
        trie = new LinkedTrie(res);
    }

    @Test
    void findApple() {
        assertTrue(trie.isWord("apple"));
    }

    @Test
    void findApples() {
        assertTrue(trie.isWord("apples"));
    }

    @Test
    void findApplesauce() {
        assertTrue(trie.isWord("applesauce"));
    }

    @Test
    void doNotFindAppleSau() {
        assertFalse(trie.isWord("applesau"));
    }

    @Test
    void caseDoesntMatter() {
        assertTrue(trie.isWord("APPLE"));
        assertTrue(trie.isWord("Apple"));
        assertTrue(trie.isWord("aPpLe"));
    }

}