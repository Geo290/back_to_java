public class Datatypes {
    /* PRIMITIVE DATATYPES */

    // 1) INTEGERS
        // A) BYTE
        byte lowestByteValue = -128;
        byte highestByteValue = 127;

        // B) SHORT
        short lowestShortValue = -32768;
        short highestShortValue = 32767;

        // C) INT
        int lowestIntValue = -2147483648;
        int highestIntValue = 2147483647;

        // D) LONG
        long lowestLongValue = -9223372036854775808L;
        long highestLongValue = 9223372036854775807L;

    // 2) FLOATING
        // A) FLOAT
        float floatValue = 1.2345678f; // UP TO 7 DECIMAL DIGITS

        // B) DOUBLE
        double doubleValue = 1.234567890123456; // UP TO 15 DECIMAL DIGITS; MORE PRECISION THAN FLOAT

    // 3) CHARACTERS
        // A) CHAR
        char lettersAsCharacter = 'A'; // STORES ONLY ONE CHARACTER
        char numberAsCharacter = '1'; // STORES ONLY ONE NUMBER AS A CHARACTER
        char symbolAsCharacter = '*'; // STORES ONLY ONE SYMBOL AS A CHARACTER
        char unicodeAsCharacter = '\u263A'; // STORES UNICODES AS CHARACTERS; THE OUTPUT WILL BE AN SMILEY FACE
        char charValueAsInt = 65; // CAN STORE INTEGERS THAT REPRESENT ASCII CODES; HERE THE OUTPUT WILL BE "A"
    
    // 4) BOOLEAN
        // A) BOOLEAN
        boolean boolTrue = true;
        boolean boolFalse = false;
    
}
