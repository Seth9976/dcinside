package com.google.common.io;

import J1.c;
import J1.d;
import O1.a;
import java.io.DataInput;

@c
@d
@q
public interface com.google.common.io.c extends DataInput {
    @Override
    @a
    boolean readBoolean();

    @Override
    @a
    byte readByte();

    @Override
    @a
    char readChar();

    @Override
    @a
    double readDouble();

    @Override
    @a
    float readFloat();

    @Override
    void readFully(byte[] arg1);

    @Override
    void readFully(byte[] arg1, int arg2, int arg3);

    @Override
    @a
    int readInt();

    @Override
    @a
    @o3.a
    String readLine();

    @Override
    @a
    long readLong();

    @Override
    @a
    short readShort();

    @Override
    @a
    String readUTF();

    @Override
    @a
    int readUnsignedByte();

    @Override
    @a
    int readUnsignedShort();

    @Override
    int skipBytes(int arg1);
}

