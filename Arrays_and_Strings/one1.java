// solution 1
// time complexity O(n) with n is the length of the string
// space complexity O(1)
boolean one1_1(String str){
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


// solution 2
// time complexity O(n) with n is the length of the string
// space complexity is reduced by a factor of 8 using a single int variable instead of an array
boolean one1_2(String str){
    // checker to check the matching bit
    // checker in binary = 00000
    int checker = 0;

    for(int i = 0; i < str.length(); i++){
        // assume its from 'a' to 'z'
        int val = str.charAt(i) - 'a';

        // 1<<val = 10000...000
        // bitwise AND with checker, if the checker and 1<<val has matching index
        // return false
        if((checker & (1<<val)) > 0) return false;
        // not seen, add the new bit to checker
        checker |= (1<<val);
    }
    return true;
}
