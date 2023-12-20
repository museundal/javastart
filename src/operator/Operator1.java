package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a+b;
        System.out.println(sum);

        int diff = a-b;
        System.out.println(diff);

        int multi = a*b;
        System.out.println(multi);

        int div = a/b;
        System.out.println(div);
        //나머지
        int mod = a%b;
        System.out.println(mod);

//        int z = 10/0;     / by zero at operator 0으로 나누는건 수학에서 허용하지 않습니다.
//        System.out.println(z);
    }
}
