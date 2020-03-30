public class RomanCalculator {

    String add(String ingredientI, String ingredientII) {
        return "";
    }

    int roman2Arabic(String roman) {

        char[] romanChars = roman.toCharArray();
        int romanLen = romanChars.length;
        int arabic = 0;
        int previosChar = 0;

        for (int i = romanLen - 1; i >= 0; i--) {
            if ('I' == romanChars[i]) {
                if (previosChar > 1) {
                    arabic -= 1;
                } else {
                    arabic += 1;
                }
            }
            if ('V' == romanChars[i]) {
                arabic += 5;
                previosChar = 5;
            }
            if ('X' == romanChars[i]) {
                if (previosChar > 10) {
                    arabic -= 10;
                } else {
                    arabic += 10;
                    previosChar = 10;
                }
            }
            if ('L' == romanChars[i]) {
                arabic += 50;
                previosChar = 50;
            }
            if ('C' == romanChars[i]) {
                if (previosChar > 100) {
                    arabic -= 100;
                } else {
                    arabic += 100;
                    previosChar = 100;
                }
            }
            if ('D' == romanChars[i]) {
                arabic += 500;
                previosChar = 500;
            }
            if ('M' == romanChars[i]) {
                arabic += 1000;
                previosChar = 1000;
            }
        }
        return arabic;
    }

    String arabic2Roman(int arabic) {
        return "";
    }

}
