public class ArrayDataException extends Throwable {
    @Override
    public String getMessage() {
        return "Invalid array's data. Please enter the digits only!";
    }
}