
public class ArrayValueCalculator {
    public int doCalc (String[][] numbers) throws ArraySizeException, ArrayDataException {
        int i=0;
        if (numbers.length!=4 || numbers[i].length!=4){
            throw new ArraySizeException("Invalid array size. Please enter the 4x4 size array");
        }

        int sum = 0;
        for (String[] number : numbers) {
            try {
                for (i = 0; i < numbers.length; i++) {
                    sum += Integer.parseInt(number[i]);
                }
            }catch (NumberFormatException e){
                throw new ArrayDataException("Invalid array's data. Please enter the digits only!");
            }

        }
        return sum;
    }
}
