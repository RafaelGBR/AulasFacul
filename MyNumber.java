public class MyNumber{
    public static void main(String[] args){
        int myNumber = 90;
// Int: is the most preferred type for numeric values.// 
        short myShort = 800;
// Short: is more than byte but less than int. It requires more memory than byte but less memory in comparison to int.// 
        long myLong = 9000;
// Long: is less frenquently used. It should only be used when the range of the numeric value is too high. It requires the most memory (8 bytes) in comparison to the other three data-types.//

        double myDouble = 7.9000;
// Double: has more precision than int or float. It requires more memory thant float. Can show more decimals numbers. Is represented in 64 bits, with 1 sign bit. It gives 15-16 decimal digits precision.//
        float myFloat = 324.3f;
// Float: it is used if we want to use momory effectively because it takes less memory in comparison to double data type. It gives 6-7 decimal digits precision. Is represented in 32 bits. A float number must have a "f" in the end.//

        char myChar = 'y';
// Char: it's a data type that is used to store a single character.// 
        boolean myBoolean = true;
// Boolean: it has 2 values (true of false). It's a 1-bit information.//

        byte myByte = 127;
// Byte: Has a range from -128 to 127 and it requires very little memory (only 1 byte). It can be used in place of int where we are sure that the range will be very small. //

        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);
    }
}