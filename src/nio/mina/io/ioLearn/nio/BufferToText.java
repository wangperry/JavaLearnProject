package nio.mina.io.ioLearn.nio;

import org.junit.Test;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-10-31 下午6:05
 */
public class BufferToText {

    public static final int SIZE = 1024;

    @Test
    public void bufferToText() throws Exception{
        String fileName = "hongye.txt";
        FileChannel fc = new FileOutputStream(fileName).getChannel();
        fc.write(ByteBuffer.wrap("xxxx".getBytes()));
    }

}
