package org.mp4parser.tools;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class IsoTypeReader {
    public static int byte2int(byte b) {
        return b < 0 ? b + 0x100 : b;
    }

    public static String read4cc(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[4];
        byteBuffer0.get(arr_b);
        try {
            return new String(arr_b, "ISO-8859-1");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    public static double readFixedPoint0230(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[4];
        byteBuffer0.get(arr_b);
        return ((double)(arr_b[0] << 24 & 0xFF000000 | arr_b[1] << 16 & 0xFF0000 | arr_b[2] << 8 & 0xFF00 | arr_b[3] & 0xFF)) / 1073741824.0;
    }

    public static double readFixedPoint1616(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[4];
        byteBuffer0.get(arr_b);
        return ((double)(arr_b[0] << 24 & 0xFF000000 | arr_b[1] << 16 & 0xFF0000 | arr_b[2] << 8 & 0xFF00 | arr_b[3] & 0xFF)) / 65536.0;
    }

    public static float readFixedPoint88(ByteBuffer byteBuffer0) {
        byte[] arr_b = new byte[2];
        byteBuffer0.get(arr_b);
        return ((float)(((short)(((short)(arr_b[0] << 8 & 0xFF00)) | arr_b[1] & 0xFF)))) / 256.0f;
    }

    public static String readIso639(ByteBuffer byteBuffer0) {
        int v = IsoTypeReader.readUInt16(byteBuffer0);
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < 3; ++v1) {
            stringBuilder0.append(((char)((v >> (2 - v1) * 5 & 0x1F) + 0x60)));
        }
        return stringBuilder0.toString();
    }

    public static String readString(ByteBuffer byteBuffer0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        int v;
        while((v = byteBuffer0.get()) != 0) {
            byteArrayOutputStream0.write(v);
        }
        return Utf8.convert(byteArrayOutputStream0.toByteArray());
    }

    public static String readString(ByteBuffer byteBuffer0, int v) {
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        return Utf8.convert(arr_b);
    }

    public static int readUInt16(ByteBuffer byteBuffer0) {
        return (IsoTypeReader.byte2int(byteBuffer0.get()) << 8) + IsoTypeReader.byte2int(byteBuffer0.get());
    }

    public static int readUInt16BE(ByteBuffer byteBuffer0) {
        return IsoTypeReader.byte2int(byteBuffer0.get()) + (IsoTypeReader.byte2int(byteBuffer0.get()) << 8);
    }

    public static int readUInt24(ByteBuffer byteBuffer0) {
        return (IsoTypeReader.readUInt16(byteBuffer0) << 8) + IsoTypeReader.byte2int(byteBuffer0.get());
    }

    public static long readUInt32(ByteBuffer byteBuffer0) {
        long v = (long)byteBuffer0.getInt();
        return v >= 0L ? v : v + 0x100000000L;
    }

    public static long readUInt32BE(ByteBuffer byteBuffer0) {
        long v = (long)IsoTypeReader.readUInt8(byteBuffer0);
        long v1 = (long)IsoTypeReader.readUInt8(byteBuffer0);
        long v2 = (long)IsoTypeReader.readUInt8(byteBuffer0);
        return (((long)IsoTypeReader.readUInt8(byteBuffer0)) << 24) + (v2 << 16) + (v1 << 8) + v;
    }

    public static long readUInt48(ByteBuffer byteBuffer0) {
        long v = ((long)IsoTypeReader.readUInt16(byteBuffer0)) << 0x20;
        if(v < 0L) {
            throw new RuntimeException("I don\'t know how to deal with UInt64! long is not sufficient and I don\'t want to use BigInt");
        }
        return v + IsoTypeReader.readUInt32(byteBuffer0);
    }

    public static long readUInt64(ByteBuffer byteBuffer0) {
        long v = IsoTypeReader.readUInt32(byteBuffer0);
        if(v << 0x20 < 0L) {
            throw new RuntimeException("I don\'t know how to deal with UInt64! long is not sufficient and I don\'t want to use BigInt");
        }
        return (v << 0x20) + IsoTypeReader.readUInt32(byteBuffer0);
    }

    public static int readUInt8(ByteBuffer byteBuffer0) {
        return IsoTypeReader.byte2int(byteBuffer0.get());
    }
}

