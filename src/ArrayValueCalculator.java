
public class ArrayValueCalculator {
    public int doCalc (String[][] numbers) throws ArraySizeException, ArrayDataException {
        int i=0;
        if (numbers.length!=4 || numbers[i].length!=4){
            throw new ArraySizeException();
        }

        int sum = 0;
        for (String[] number : numbers) {
            try {
                for (i = 0; i < numbers.length; i++) {
                    sum += Integer.parseInt(number[i]);
                }
            }catch (NumberFormatException e){
                throw new ArrayDataException();
            }

        }
        return sum;
    }
}
