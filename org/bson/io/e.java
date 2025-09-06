package org.bson.io;

import java.io.Closeable;
import org.bson.types.ObjectId;

public interface e extends Closeable {
    void B2(String arg1);

    @Override
    void close();

    void d(String arg1);

    void e1(int arg1);

    int getPosition();

    int getSize();

    void h(int arg1);

    void h3(byte[] arg1, int arg2, int arg3);

    void l(ObjectId arg1);

    void r(long arg1);

    void writeByte(int arg1);

    void writeBytes(byte[] arg1);

    void writeDouble(double arg1);

    void writeInt32(int arg1, int arg2);
}

