public class Main {
    public static void main(String[] args){
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        try {
            String[][] numbers = {
                    {"12", "34", "56", "78"},
                    {"910", "1516"},
                    {"1718", "1920", "2122", "2324"},
            };
            System.out.println(arrayValueCalculator.doCalc(numbers));
            } catch (ArraySizeException | ArrayDataException e){
                System.err.println(new ArraySizeException().getMessage());
            }
        try {
            String[][] numbers = {
                    {"1@2", "name", "56", "7'8"},
                    {"910", "1112", "car", "1516"},
                    {"DOG", "19!20", "2122", "2324"},
                    {"2526", "2728", "2930", "3132"},
                };
            System.out.println(arrayValueCalculator.doCalc(numbers));
            }   catch (ArrayDataException | ArraySizeException e) {
                    System.err.println(new ArrayDataException().getMessage());
                }
        finally {
                String[][] numbers = {
                        {"12", "34", "56", "78"},
                        {"910", "1112", "1314", "1516"},
                        {"1718", "1920", "2122", "2324"},
                        {"2526", "2728", "2930", "3132"},
                };
            try {
                System.out.println(arrayValueCalculator.doCalc(numbers));
            } catch (ArraySizeException | ArrayDataException ignored) {
            }
        }
    }
}