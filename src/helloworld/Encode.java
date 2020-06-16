package helloworld;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Encode {
    public static void main(java.lang.String[] args) throws IOException {
        System.out.println("1".getBytes().length);
        System.out.println("1".getBytes("GBK").length);
        System.out.println("1".getBytes(StandardCharsets.UTF_8).length);
        System.out.println("1".getBytes(StandardCharsets.UTF_16BE).length);
        System.out.println("1".getBytes(StandardCharsets.UTF_16LE).length);
        System.out.println("1".getBytes(StandardCharsets.UTF_16).length);
        String path = Encode.class.getResource("").getPath() + "Encode.class";
        System.out.println(FileToString1(path));
        System.out.println(FileToString2(path));
    }

    // 字符流，适合文本。
    private static String FileToString1(String path) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String str;
        while ((str = reader.readLine()) != null) {
            sb.append(str);
        }
        reader.close();
        return sb.toString();
    }

    // 字节流，适合图片、音频、视频等。
    private static String FileToString2(String path) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        int len;
        byte[] buf = new byte[1024];
        while ((len = bis.read(buf)) != -1) {
            sb.append(new String(buf, 0, len));
        }
        bis.close();
        return sb.toString();
    }
}
