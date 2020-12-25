package Arrays_and_Strings;

public class one3 {
    // string in java is immutable so we use a character array
    public void replaceSpaces(char[] s, int length) {
        int space_counter = 0;

        // count the number of spaces
        for (int i = 0; i < length; i++) {
            if (s[i] == ' ')
                space_counter++;
        }
        // index of the last array element of the new array
        int index = length + space_counter * 2;
        if (length < s.length)
            s[length] = '\0';

        // change the charaters
        // reverse loop to avoid overwriting
        for (int i = length - 1; i >= 0; i--) {
            // if it is a space
            if (s[i] == ' ') {
                s[index - 1] = '0';
                s[index - 2] = '2';
                s[index - 3] = '%';
                index -= 3;
            } else {
                s[index - 1] = s[i];
                index--;
            }
        }
    }
}
