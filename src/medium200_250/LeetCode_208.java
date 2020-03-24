package medium200_250;

public class LeetCode_208 {
    class TrieNode {
        TrieNode[] child;
        boolean isEnd;

        public TrieNode() {
            child = new TrieNode[26];
            isEnd = false;
        }
    }

    class Trie {

        TrieNode root;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            root = new TrieNode();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            TrieNode ptr = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (ptr.child[c - 'a'] == null) // 如果c - 'a'为空，说明还没有存入
                    ptr.child[c - 'a'] = new TrieNode();
                ptr = ptr.child[c - 'a'];
            }
            ptr.isEnd = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search(String word) {
            TrieNode ptr = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (ptr.child[c - 'a'] == null) // 如果不存在于前缀树中，返回false
                    return false;
                ptr = ptr.child[c - 'a'];
            }
            return ptr.isEnd;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            TrieNode ptr = root;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                if (ptr.child[c - 'a'] == null) // 如果不存在于前缀树中，返回false
                    return false;
                ptr = ptr.child[c - 'a'];
            }
            return true;
        }
    }
}
