package nio.mina.io.ioLearn.iobuffer;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-9-16 下午5:53
 */
public abstract class IoBuffer {

    private static IoBufferAllocator allocator = new SimpleBufferAllocator();
    private static boolean direct;

    protected IoBuffer() {
        // do nothing
    }

    public static IoBuffer allocate(int capacity) {
        return allocator.allocate(capacity, direct);
    }

    public static IoBuffer wrap(byte[] byteArray, int offset, int length) {
        //TODO
        return null;
    }

    public abstract IoBuffer get();

    public abstract IoBuffer put(byte b);

    public abstract boolean other();
}
