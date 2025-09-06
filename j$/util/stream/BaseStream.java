package j$.util.stream;

import j..util.Spliterator;
import java.util.Iterator;

public interface BaseStream extends AutoCloseable {
    @Override
    void close();

    boolean isParallel();

    Iterator iterator();

    BaseStream onClose(Runnable arg1);

    BaseStream parallel();

    BaseStream sequential();

    Spliterator spliterator();

    BaseStream unordered();
}

