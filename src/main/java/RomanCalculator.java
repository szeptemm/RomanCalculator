public class RomanCalculator {

    String add(String ingredientI, String ingredientII) {
        return "";
    }

    int roman2Arabic(String roman) {

        char[] romanChars = roman.toCharArray();
        int romanLen = romanChars.length;
        int arabic = 0;

        if (romanChars[0] == 'I' && romanChars.length == 1) {
            return 1;
        } else if ("II".equals(roman)) {
            return 2;
        } else if ("III".equals(roman)) {
            return 3;
        } else if ("X".equals(roman)) {
            return 10;
        } else {
            int previosChar = 0;
            arabic = 0;
            for (int i = romanLen - 1; i >= 0; i--) {
                if ('V' == romanChars[i]) {
                    arabic = 5;
                    previosChar = 5;
                }
                if ('I' == romanChars[i]) {
                    if (previosChar != 0) {
                        arabic -= 1;
                    }
                }
            }
        }
        ;
        return arabic;
    }


    String arabic2Roman(int arabic) {
        return "";
    }

}
