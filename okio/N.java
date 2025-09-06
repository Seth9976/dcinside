package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.c0;
import kotlin.k;
import kotlin.m;
import y4.l;

public interface n extends ReadableByteChannel, o0 {
    @l
    o B1() throws IOException;

    @l
    String C0(long arg1) throws IOException;

    @k(level = m.a, message = "moved to val: use getBuffer() instead", replaceWith = @c0(expression = "buffer", imports = {}))
    @l
    okio.l D();

    @l
    okio.l E();

    @l
    o F0(long arg1) throws IOException;

    int H3() throws IOException;

    @l
    InputStream J();

    long K(@l o arg1, long arg2) throws IOException;

    @l
    String K1() throws IOException;

    @l
    String L1(long arg1, @l Charset arg2) throws IOException;

    @l
    String M2() throws IOException;

    boolean N2(long arg1, @l o arg2, int arg3, int arg4) throws IOException;

    @l
    byte[] O2(long arg1) throws IOException;

    long R1(@l m0 arg1) throws IOException;

    long S(@l o arg1) throws IOException;

    long T1() throws IOException;

    long U(byte arg1, long arg2) throws IOException;

    long W(@l o arg1) throws IOException;

    @y4.m
    String X() throws IOException;

    void X2(long arg1) throws IOException;

    int X3(@l okio.c0 arg1) throws IOException;

    @l
    byte[] Z0() throws IOException;

    boolean a0(long arg1, @l o arg2) throws IOException;

    boolean j3() throws IOException;

    void l2(@l okio.l arg1, long arg2) throws IOException;

    long m2(byte arg1, long arg2, long arg3) throws IOException;

    long o3() throws IOException;

    @l
    n peek();

    short q0() throws IOException;

    @l
    String q2(long arg1) throws IOException;

    long r0() throws IOException;

    int read(@l byte[] arg1) throws IOException;

    int read(@l byte[] arg1, int arg2, int arg3) throws IOException;

    byte readByte() throws IOException;

    void readFully(@l byte[] arg1) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long arg1) throws IOException;

    void skip(long arg1) throws IOException;

    long t0(@l o arg1, long arg2) throws IOException;

    long w0(byte arg1) throws IOException;

    @l
    String w1(@l Charset arg1) throws IOException;

    int z1() throws IOException;
}

