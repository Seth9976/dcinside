package org.mp4parser.tools;

import java.nio.ByteBuffer;

public final class IsoTypeWriter {
    static final boolean $assertionsDisabled;

    static {
    }

    public static void writeFixedPoint0230(ByteBuffer byteBuffer0, double f) {
        byteBuffer0.put(((byte)((0xFF000000 & ((int)(((long)f) * 0x41D0000000000000L))) >> 24)));
        byteBuffer0.put(((byte)((0xFF0000 & ((int)(((long)f) * 0x41D0000000000000L))) >> 16)));
        byteBuffer0.put(((byte)((0xFF00 & ((int)(((long)f) * 0x41D0000000000000L))) >> 8)));
        byteBuffer0.put(((byte)(((int)(((long)f) * 0x41D0000000000000L)) & 0xFF)));
    }

    public static void writeFixedPoint1616(ByteBuffer byteBuffer0, double f) {
        byteBuffer0.put(((byte)((0xFF000000 & ((int)(((long)f) * 0x40F0000000000000L))) >> 24)));
        byteBuffer0.put(((byte)((0xFF0000 & ((int)(((long)f) * 0x40F0000000000000L))) >> 16)));
        byteBuffer0.put(((byte)((0xFF00 & ((int)(((long)f) * 0x40F0000000000000L))) >> 8)));
        byteBuffer0.put(((byte)(((int)(((long)f) * 0x40F0000000000000L)) & 0xFF)));
    }

    public static void writeFixedPoint88(ByteBuffer byteBuffer0, double f) {
        int v = (short)(((int)(((long)f) * 0x4070000000000000L)));
        byteBuffer0.put(((byte)((0xFF00 & v) >> 8)));
        byteBuffer0.put(((byte)(v & 0xFF)));
    }

    public static void writeIso639(ByteBuffer byteBuffer0, String s) {
        if(s.getBytes().length != 3) {
            throw new IllegalArgumentException("\"" + s + "\" language string isn\'t exactly 3 characters long!");
        }
        int v = 0;
        for(int v1 = 0; v1 < 3; ++v1) {
            v += s.getBytes()[v1] - 0x60 << (2 - v1) * 5;
        }
        IsoTypeWriter.writeUInt16(byteBuffer0, v);
    }

    public static void writePascalUtfString(ByteBuffer byteBuffer0, String s) {
        byte[] arr_b = Utf8.convert(s);
        IsoTypeWriter.writeUInt8(byteBuffer0, arr_b.length);
        byteBuffer0.put(arr_b);
    }

    public static void writeUInt16(ByteBuffer byteBuffer0, int v) {
        IsoTypeWriter.writeUInt8(byteBuffer0, (0xFFFF & v) >> 8);
        IsoTypeWriter.writeUInt8(byteBuffer0, v & 0xFF);
    }

    public static void writeUInt16BE(ByteBuffer byteBuffer0, int v) {
        IsoTypeWriter.writeUInt8(byteBuffer0, v & 0xFF);
        IsoTypeWriter.writeUInt8(byteBuffer0, (0xFFFF & v) >> 8);
    }

    public static void writeUInt24(ByteBuffer byteBuffer0, int v) {
        IsoTypeWriter.writeUInt16(byteBuffer0, (v & 0xFFFFFF) >> 8);
        IsoTypeWriter.writeUInt8(byteBuffer0, v & 0xFFFFFF);
    }

    public static void writeUInt32(ByteBuffer byteBuffer0, long v) {
        byteBuffer0.putInt(((int)v));
    }

    public static void writeUInt32BE(ByteBuffer byteBuffer0, long v) {
        IsoTypeWriter.writeUInt16BE(byteBuffer0, ((int)v) & 0xFFFF);
        IsoTypeWriter.writeUInt16BE(byteBuffer0, ((int)(v >> 16 & 0xFFFFL)));
    }

    public static void writeUInt48(ByteBuffer byteBuffer0, long v) {
        IsoTypeWriter.writeUInt16(byteBuffer0, ((int)((0xFFFFFFFFFFFFL & v) >> 0x20)));
        IsoTypeWriter.writeUInt32(byteBuffer0, v & 0xFFFFFFFFL);
    }

    public static void writeUInt64(ByteBuffer byteBuffer0, long v) {
        byteBuffer0.putLong(v);
    }

    public static void writeUInt8(ByteBuffer byteBuffer0, int v) {
        byteBuffer0.put(((byte)(v & 0xFF)));
    }

    public static void writeUtf8String(ByteBuffer byteBuffer0, String s) {
        byteBuffer0.put(Utf8.convert(s));
        IsoTypeWriter.writeUInt8(byteBuffer0, 0);
    }

    public static void writeZeroTermUtf8String(ByteBuffer byteBuffer0, String s) {
        byteBuffer0.put(Utf8.convert(s));
        IsoTypeWriter.writeUInt8(byteBuffer0, 0);
    }
}

