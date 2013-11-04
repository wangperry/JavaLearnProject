package nio.mina.io.ioLearn.nio;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-10-31 下午2:05
 * <br/>参考：
 * <br/>http://zcdxzsz.iteye.com/blog/310917
 * <br/>http://walsh.iteye.com/blog/450114
 *
 */
public class GetChannel {

    public static final int SIZE = 1024;

    @Test
    public void testGetChannel() throws Exception{
        String fileName = "hongye.txt";

        //利用channel添加文件
        FileChannel fc = new FileOutputStream(fileName).getChannel();
        fc.write(ByteBuffer.wrap("test data".getBytes()));
        fc.close();

        //在尾部添加文件
        System.out.println("file.length() = " + new File(fileName).length());
        fc = new RandomAccessFile(fileName,"rw").getChannel(); //获取channel的时候，已经获取到了文件的大小
        System.out.println("fc.size() = " + fc.size());

        fc.position(fc.size());
        fc.write(ByteBuffer.wrap(" 2013-10-31".getBytes()));
        fc.close();

        System.out.println("************************");

        //读取
        fc = new FileInputStream(fileName).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(SIZE);
        fc.read(buffer);
        /**
         * 将缓存字节数组的指针设置为数组的开始序列即数组下标0,buffer.flip(),一定得有，如果没有，就是从文件最后开始读取的
         * flip() ：交换限制指针和位置指针，然后将位置置为 0，并废弃已经做的mark标记
         */
        buffer.flip();
        while (buffer.hasRemaining()){
            System.out.print((char) buffer.get());
        }
        System.out.println("\n************************");
    }


    @Test
    public void testGetBytes(){
        String str_1 = "hello world";

        /*System.out.println("str_1.getBytes().length = " + str_1.getBytes().length);
        for(int i = 0 ; i < str_1.getBytes().length; i++){
            System.out.print("\nstr_byte = " + str_1.getBytes()[i]);
        }*/
        printArrays(str_1.getBytes());

        System.out.println("\n ------------");

        String str_2 = "中国";

        printArrays(str_2.getBytes());
    }

    private void printArrays(byte[] arrays){
        for(int i = 0 ; i < arrays.length; i++){
            System.out.print("i = " + arrays[i]+" ");
        }
    }

    private <T> void printArrays(T[] arrays){
       for(int i = 0 ; i < arrays.length; i++){
           System.out.println("i = " + i);
       }
    }

}
