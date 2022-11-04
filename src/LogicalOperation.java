public class LogicalOperation {

    public String exercise1(String textInput) {
        if (textInput.equals("FastTrack")) {
            return "Learning text comparison";

        } else {
            return "Got to try some more";
        }

    }
     int first = 8;
    int second = 4;
    public int checkBiggerNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }
    int number = 9;
     public String returnTextNumber (String text, int number) {
         if (text.equals("FastTrackIt") && number <= 5) {
             return text + number;
         } else if (!text.equals("FastTrackIt") && number >= 8) {
             return number + text;
         } else {
             return "Neither conditions are true";
         }
     }
     int numberOne = 7;
         public String orCondition(int numberOne) {

             if (numberOne > 9 || numberOne == 7) {

                 return "The amount of snow this winter was(cm): " + numberOne;

             } else {

                 return "The forecast snow is(cm): " + numberOne;
             }
         }
         int numberTwo = 5;
    public boolean greaterThanEqualTo (int numberTwo) {

        if ( numberTwo > 3 && numberTwo != 4) {

            return "The number is greater than 3 and not equal to 4";

        } else if (numberTwo == 4) {

            return "The number is equal to 4";

        } else if (numberTwo < 3);
        {


            return "The number is lower than 3";


        }
        public void printNumber (int number){

            switch (number) {

                case 0:

                    System.out.println("The number os 0");

                    break;

                case 1:

                    System.out.println("The number is 1");

                    break;

                case 2:

                    System.out.println("The number is 2");

                    break;

                case 3:

                    System.out.println("The number is 3");

                    break;

                case 4:

                    System.out.println("The number is 4");

                    break;

                case 5:

                    System.out.println("The number is 5");

                    break;

                case 6:

                    System.out.println("The number is 6");

                    break;

                case 7:

                    System.out.println("The number is 7");

                    break;

                case 8:

                    System.out.println("The number is 8");

                    break;

                case 9:

                    System.out.println("The number is 9");

                    break;

                default:

                    System.out.println("Not allowed");

            }


            public boolean isNumberEven (int numberThree){

            if (number % 2 == 0) {

                return true;

            } else {

                return false;
            }
                public boolean isEligibleToVote (int numberFour) {

                    if (number >= 18) {

                        return true;

                    } else {

                        return false;
                    }

                    public int returnBiggestNumber (int firstNumber, int secondNumber, int thirdNumber){
                    if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {

                        return firstNumber;

                    } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {

                        return secondNumber;

                    } else {

                        return thirdNumber;

                    }
        }






