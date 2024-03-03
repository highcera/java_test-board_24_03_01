import java.util.Map;


public class Main {
    public static void main(String[] args) {
        String queryString1 = "id=1&regDate=20240221&hitCount=20&writerName=신짱구";
        Map<String, String> params1 = Util.getParms(queryString1);
        System.out.println(params1);

        String queryString2 = "id=1&regDate=20240221&hitCount=20&writerName=신짱구";
        Map<String, String> params2 = Util.getParms(queryString2);
        System.out.println(params2);
    }
}
//        // 향상된 for문
//        for(String bit : queryStringBits) {
////            System.out.println(bit);
//
//            String[] bitBits = bit.split("=");
//
//            String paramName = bitBits[0];
//            String paramValue = bitBits[1];
//
//            if(paramName.equals("a")) {
//                a = Integer.parseInt(paramValue);
//            } else if(paramName.equals("b")) {
//                b = Integer.parseInt(paramValue);
//            } else if(paramName.equals("c")) {
//                c = Integer.parseInt(paramValue);
//            }
//
//            System.out.printf("%s : %s\n", paramName, paramValue);
//        }
//        System.out.printf("a : %d\n", a);
//        System.out.printf("b : %d\n", b);
//        System.out.printf("c : %d\n", c);
//    }

