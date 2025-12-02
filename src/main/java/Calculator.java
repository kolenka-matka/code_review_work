public class Calculator {
    public int add(int a, int b){
        return a+b;
        //TODO inser your realisation in method add
    }
    public int dif(int a, int b){
        return a-b;
        //TODO inser your realisation in method dif
    }
    public int div(int a, int b) throws Exception {
        if (b == 0){
            throw new Exception("decision by zero");
        }
        return a/b;
        //TODO inser your realisation in method div
    }
    public int times(int a, int b){
        return a*b;
        //TODO inser your realisation in method times
    }
    public int solver() throws Exception {
        // уравнение (1000000000 - 23425) / 123 + 335*444 = ?
        int temp1 = dif(1000000000, 23425);
        int temp2 = div(temp1, 123);
        return temp2  + times(335, 444);
        //TODO inser your realisation in method solver
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Дедить на 0 нельзя!");
        }
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        //((74 + 985) * 92 - 26) / 56
        int sum = add(74, 985);
        int product = times(sum, 92);
        int difference = dif(product, 26);
        int result = div(difference, 56);
        return result;
    }
}
