package QuestionBank;

public class Fourteen {
    public static void main(String[] args) {

        int[] marks = {80, 90, 85};

        try{
            System.out.println(marks[5]);

            int sum = 0;
            for (int mark: marks){
                sum += mark;
            }

            int average = sum/marks.length;
            System.out.println("Average:" + average);
            }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Invalid array index");
        }

        catch(ArithmeticException e){
            System.out.println("Error: cannot divide by zero");
        }

        finally{
            System.out.println("Marks analysis complete");
        }
    }
}
