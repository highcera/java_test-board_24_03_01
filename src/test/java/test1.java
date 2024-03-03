import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        String queryString = "a=100&b=2&c=3";
        String[] queryStringBits = queryString.split("&");
        System.out.println(Arrays.toString(queryStringBits));

        int a = 0;
        int b = 0;
        int c = 0;

        // 향상된 for문
        for(String bit : queryStringBits) {
//            System.out.println(bit);

            String[] bitBits = bit.split("=");

            String paramName = bitBits[0];
            String paramValue = bitBits[1];

            if(paramName.equals("a")) {
                a = Integer.parseInt(paramValue);
            } else if(paramName.equals("b")) {
                b = Integer.parseInt(paramValue);
            } else if(paramName.equals("c")) {
                c = Integer.parseInt(paramValue);
            }

            System.out.printf("%s : %s\n", paramName, paramValue);
        }
        System.out.printf("a : %d\n", a);
        System.out.printf("b : %d\n", b);
        System.out.printf("c : %d\n", c);
    }
}


