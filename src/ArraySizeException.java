public class ArraySizeException extends Throwable {
    @Override
    public String getMessage() {
        return "Invalid array size. Please enter the 4x4 size array";
    }
}

//public class ArraySizeException extends Throwable {
//    public ArraySizeException() {
//        super ("Invalid array size. Please enter the 4x4 size array");
//    }
//}
