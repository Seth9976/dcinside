package org.bson.io;

import java.io.Closeable;
import org.bson.types.ObjectId;

public interface c extends Closeable {
    boolean C();

    ObjectId H();

    d I1(int arg1);

    void J2();

    @Override
    void close();

    void g(int arg1);

    int getPosition();

    String h2();

    @Deprecated
    void mark(int arg1);

    void r2(byte[] arg1);

    byte readByte();

    double readDouble();

    int readInt32();

    long readInt64();

    String readString();

    @Deprecated
    void reset();

    void x1(byte[] arg1, int arg2, int arg3);
}

