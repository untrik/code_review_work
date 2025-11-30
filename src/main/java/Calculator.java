public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("the divisor cannot be equal to 0"); // кидаем Exception если делитель равен 0 (деление на 0 неопределено)
        }
        return a/b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
//        (x + 5) * 2 − (18 / 3)
        int x = 3;
        int part1 = add(x,5); // x + 5 = 8 при x = 3
        int part2 = div(18,3); // 18 / 3 = 6
        int mult = times(part1,2); // 8 * 2 = 16
        int res = dif(mult,part2); //  16 - 6 = 10
        return res;
    }
}
