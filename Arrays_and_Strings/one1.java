
// time complexity O(n) with n is the length of the string
// space complexity O(1)
boolean one1(String str){
    // ASCII alphabet only has 128 character
    if(str.length() > 128) return false;

    boolean[] ascii_char = new boolean[128];

    for(int i = 0; i < str.length(); i++){
        int val = str.charAt(i);
        // if seen, return false
        if(ascii_char[val] == true) return false;
        // not seen, set to true
        ascii_char[val] = true;
    }
    return true;
}
