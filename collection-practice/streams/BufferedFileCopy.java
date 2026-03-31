
import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[4096];

        long start = System.nanoTime();
        FileInputStream fis = new FileInputStream("bigfile.dat");
        FileOutputStream fos = new FileOutputStream("copy_unbuffered.dat");

        int bytes;
        while ((bytes = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytes);
        }
        fis.close();
        fos.close();
        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start));

        start = System.nanoTime();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bigfile.dat"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy_buffered.dat"));

        while ((bytes = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytes);
        }
        bis.close();
        bos.close();
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start));
    }
}
