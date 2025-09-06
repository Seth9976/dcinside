package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.c0;
import kotlin.k;
import y4.l;

public interface m extends WritableByteChannel, m0 {
    @l
    m A1(long arg1) throws IOException;

    @l
    m A3(@l String arg1, @l Charset arg2) throws IOException;

    @k(level = kotlin.m.a, message = "moved to val: use getBuffer() instead", replaceWith = @c0(expression = "buffer", imports = {}))
    @l
    okio.l D();

    @l
    m D2(@l String arg1) throws IOException;

    @l
    okio.l E();

    @l
    m F1(@l o0 arg1, long arg2) throws IOException;

    long K2(@l o0 arg1) throws IOException;

    @l
    m M1(@l o arg1) throws IOException;

    @l
    m P(long arg1) throws IOException;

    @l
    OutputStream U3();

    @l
    m X0(@l o arg1, int arg2, int arg3) throws IOException;

    @l
    m X1() throws IOException;

    @l
    m b0(@l String arg1, int arg2, int arg3) throws IOException;

    @l
    m b2(int arg1) throws IOException;

    @l
    m f1(int arg1) throws IOException;

    @Override  // okio.m0
    void flush() throws IOException;

    @l
    m n2() throws IOException;

    @l
    m q1(int arg1) throws IOException;

    @l
    m s0(@l String arg1, int arg2, int arg3, @l Charset arg4) throws IOException;

    @l
    m v0(long arg1) throws IOException;

    @l
    m write(@l byte[] arg1) throws IOException;

    @l
    m write(@l byte[] arg1, int arg2, int arg3) throws IOException;

    @l
    m writeByte(int arg1) throws IOException;

    @l
    m writeInt(int arg1) throws IOException;

    @l
    m writeLong(long arg1) throws IOException;

    @l
    m writeShort(int arg1) throws IOException;
}

