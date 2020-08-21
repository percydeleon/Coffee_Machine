public class Main {

    public static void main(String[] args) {
        Secret[] secrets = Secret.values();
        int ctr = 0;

        for (Secret secret: secrets) {
            String s = new String(secret.toString());

            if (s.substring(0, 4).equals("STAR")) {
                ctr++;
            } else {
                continue;
            }
        }
        System.out.println(ctr);
    }
}

//enum Secret {
//    STAR, CRASH, START;
//}
