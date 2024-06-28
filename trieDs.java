package leetcode;

public class trieDs {
    static class Node {
        Node[] children;
        boolean ew;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
                ew = false;
            }
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].ew = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && node.ew == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "there", "their", "a", "any", "the" };
        for (int i = 0; i < words.length - 1; i++) {
            insert(words[i]);
        }
        System.out.println(search("there"));
    }
}
