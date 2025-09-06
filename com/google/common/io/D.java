package com.google.common.io;

import J1.c;
import J1.d;
import java.io.DataOutput;

@c
@d
@q
public interface com.google.common.io.d extends DataOutput {
    byte[] toByteArray();

    @Override
    void write(int arg1);

    @Override
    void write(byte[] arg1);

    @Override
    void write(byte[] arg1, int arg2, int arg3);

    @Override
    void writeBoolean(boolean arg1);

    @Override
    void writeByte(int arg1);

    @Override
    @Deprecated
    void writeBytes(String arg1);

    @Override
    void writeChar(int arg1);

    @Override
    void writeChars(String arg1);

    @Override
    void writeDouble(double arg1);

    @Override
    void writeFloat(float arg1);

    @Override
    void writeInt(int arg1);

    @Override
    void writeLong(long arg1);

    @Override
    void writeShort(int arg1);

    @Override
    void writeUTF(String arg1);
}

