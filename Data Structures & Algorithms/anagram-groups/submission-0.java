class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        // 2. Loop through each word in the input array
        for (String word : strs) {
            
            // Step A: Convert the word to characters and sort them alphabetically
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            
            // Step B: Turn the sorted characters back into a string to use as the KEY
            String sortedKey = new String(chars);

            // Step C: If this key doesn't have a bucket yet, create an empty list for it
            map.putIfAbsent(sortedKey, new ArrayList<>());
            
            // Step D: Add the ORIGINAL word into the correct bucket
            map.get(sortedKey).add(word);
        }

        // 3. Return all the combined sublists together
        return new ArrayList<>(map.values());
    }
      
}
