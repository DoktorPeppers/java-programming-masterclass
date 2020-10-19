public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid value");
        } else {
            int currentRow = 1;
            int column = 1;
            int lastRow = currentRow;
            int counter = number;

            while (counter > 0) {

                while (currentRow == 1 && column <= number) {
                    System.out.print("*");
                    column++;
                }

                currentRow++;
                column = 1;

                while (currentRow < number) {

                    if (lastRow < currentRow) {
                        System.out.printf("\n*");
                        lastRow = currentRow;
                        column++;
                    }

                    while (column <= number) {

                        if (column == currentRow) {
                            System.out.print("*");
                        } else if (column == ((number - currentRow) + 1)) {
                            System.out.print("*");
                        } else if (column == number) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                        column++;
                    }

                    currentRow++;
                    column = 1;

                }

                if (currentRow == number) {
                    if (lastRow < currentRow) {
                        System.out.print("\n*");
                        lastRow = currentRow;
                        column++;
                    }

                    while (column <= number) {
                        System.out.print("*");
                        column++;
                    }
                }
                counter--;
            }
        }
    }
}
