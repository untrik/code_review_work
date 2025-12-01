public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("на нолик делить нельзя");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver() {

        // ((x - 2) * (y + 3) + 10) / 4
        // при x = 8, y = 4

        int x = 8;
        int y = 4;

        int xMinus2 = dif(x, 2);        // 8 - 2 = 6
        int yPlus3 = add(y, 3);         // 4 + 3 = 7

        int mult = times(xMinus2, yPlus3); // 6 * 7 = 42

        int sum = add(mult, 10);        // 42 + 10 = 52

        int res = div(sum, 4);          // 52 / 4 = 13

        return res;
    }

}
