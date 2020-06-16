package helloworld;

public class IpInt {
    // 192.168.10.1
    // 11000000 10101000 00001010 00000001
    // 3232238081
    // 注意：unsigned int用long代替。

    public static long ipToInt(int[] ipArr) {
        long ipInt = 0;
        for (int i = 0; i < ipArr.length; i++) {
            ipInt <<= 8;
            ipInt ^= (byte) ipArr[i] & 255;
        }
        return ipInt;
    }

    public static int[] intToIp(long ipInt) {
        int[] ipArr = new int[4];
        for (int i = 0; i < 4; i++) {
            ipArr[3 - i] ^= (byte) ipInt & 255;
            ipInt >>>= 8;
        }
        return ipArr;
    }

    public static void main(String[] args) {
        int[] ipArr = {192, 168, 10, 1};
        long ipInt = ipToInt(ipArr);
        System.out.println(ipInt);

        ipInt = 3232238081L;
        ipArr = intToIp(ipInt);
        for (int ip : ipArr) System.out.print(ip + ".");
    }
}
