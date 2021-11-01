package calculate1;


    public class Calculator {

        public void add(int a, int b) {
            int res = a + b;
            System.out.println("Addition of " + a + " and " + b + " is: " + res);
        }

        public void sub(int a, int b) {
            int res = a - b;
            System.out.println("Substraction of " + a + " and " + b + " is: " + res);
        }

        public void multiply(int a, int b) {
            int res = a * b;
            System.out.println("Multplication of " + a + " and " + b + " is: " + res);
        }

        public void div(int a, int b) {
            int res;
            if (b == 0) {
                res = 0;
            } else
                res = a / b;
            System.out.println("Division of " + a + " and " + b + " is: " + res);
        }

        public void calculateResult(int a, int b, char symbol) {
            switch (symbol) {
                case '+':
                    add(a, b);
                    break;
                case '-':
                    sub(a, b);
                    break;
                case '*':
                    multiply(a, b);
                    break;
                case '/':
                    div(a, b);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;


            }
        }


    }
