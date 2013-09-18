package nio.mina.io;

/**
 * Created with IntelliJ IDEA.
 * Date: 13-9-16 下午5:54
 */

import java.nio.ByteBuffer;

public interface IoBufferAllocator {

    IoBuffer allocate(int capacity, boolean direct);

    IoBuffer wrap(ByteBuffer nioBuffer);

    ByteBuffer allocateNioBuffer(int capacity, boolean direct);

    void dispose();

}