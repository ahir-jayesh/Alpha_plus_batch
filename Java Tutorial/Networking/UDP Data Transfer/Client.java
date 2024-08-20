import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        String str = "";
        while (!str.equals("stop")) {
            DatagramPacket dp = new DatagramPacket(buf, 1024);
            ds.receive(dp);
            str = new String(dp.getData(), 0, dp.getLength());
            System.out.println(str);
        }
        ds.close();
    }
}