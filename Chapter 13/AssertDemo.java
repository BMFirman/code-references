class AssertDemo {
    static int val = 3;

    // return an integer
    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for(int i = 0; i < 10; i++) {
            n = getnum();

            assert n> 0 : "n is negative";

            System.out.println("n is " + n);
        }
    }
}