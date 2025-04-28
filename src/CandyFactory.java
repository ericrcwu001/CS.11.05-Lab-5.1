public class CandyFactory {
    public static Candy[][] candyBox(int rows, int cols) {
        Candy[][] candyBox = new Candy[rows][cols];

        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                candyBox[row][col] = new Candy();
                if (row % 3 == 0) {
                    candyBox[row][col].setFlavour("Chocolate");
                } else if (row % 3 == 1) {
                    candyBox[row][col].setFlavour("Marshmallow");
                } else if (row % 3 == 2) {
                    candyBox[row][col].setFlavour("Chupa Chup");
                }
            }
        }

        return candyBox;
    }

    public static void printFlavours(Candy[][] candies) {
        for (int row = 0; row < candies.length; row++) {
            for (int col = 0; col < candies[row].length; col++) {
                System.out.print(candies[row][col].getFlavour() + " ");
            }
            System.out.println();
        }

        for (Candy[] row : candies) {
            for (Candy candy : row) {
                System.out.print(candy.getFlavour() + " ");
            }
            System.out.println();
        }
    }

    public static void greenMarshmallows(Candy[][] candies) {
        for (Candy[] row : candies) {
            for (Candy candy : row) {
                if (candy.getFlavour().equals("Marshmallow")) candy.setColour("Green");
            }
        }
    }

    public static void main(String[] args) {
        Candy[][] test = candyBox(7, 5);
        printFlavours(test);
    }
}
