package org.mp4parser.tools;

import java.nio.ByteBuffer;

public final class IsoTypeReaderVariable {
    public static long read(ByteBuffer byteBuffer0, int v) {
        switch(v) {
            case 1: {
                return (long)IsoTypeReader.readUInt8(byteBuffer0);
            }
            case 2: {
                return (long)IsoTypeReader.readUInt16(byteBuffer0);
            }
            case 3: {
                return (long)IsoTypeReader.readUInt24(byteBuffer0);
            }
            case 4: {
                return IsoTypeReader.readUInt32(byteBuffer0);
            }
            case 8: {
                return IsoTypeReader.readUInt64(byteBuffer0);
            }
            default: {
                throw new RuntimeException("I don\'t know how to read " + v + " bytes");
            }
        }
    }
}

