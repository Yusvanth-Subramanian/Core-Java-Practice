public class PrimitiveDataTypes {

    public static void main(String args[]){

        // -128 to 127    [ 1 byte ]
        byte b = 1;

        // -32,768 to 32,767    [ 2 bytes ]
        short s = 123;

        // -2,147,483,648 to 2,147,483,647      [ 4 bytes ]
        int i = 10;

        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807      [ 8 bytes ]
        long l = 10000000;

        // 6 to 7 decimal digits    [ 4 bytes ]
        float f = 123.456F;

        // 15 decimal digits    [ 8 bytes ]
        double d = 123.456789;

        // 1 byte
        boolean bool = true;

        // 2 bytes
        char ch = 'a';

        System.out.println("Byte : "+b+"\nShort : "+s+"\nInteger : "+i+"\nLong : "+l+"\nFloat : "+f+"\nDouble : "+d+"\nBoolean : "+bool+"\nCharacter : "+ch);


    }
}
