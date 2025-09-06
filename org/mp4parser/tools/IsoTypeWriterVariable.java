package org.mp4parser.tools;

import java.nio.ByteBuffer;

public final class IsoTypeWriterVariable {
    public static void write(long v, ByteBuffer byteBuffer0, int v1) {
        switch(v1) {
            case 1: {
                IsoTypeWriter.writeUInt8(byteBuffer0, ((int)(v & 0xFFL)));
                return;
            }
            case 2: {
                IsoTypeWriter.writeUInt16(byteBuffer0, ((int)(v & 0xFFFFL)));
                return;
            }
            case 3: {
                IsoTypeWriter.writeUInt24(byteBuffer0, ((int)(v & 0xFFFFFFL)));
                return;
            }
            case 4: {
                IsoTypeWriter.writeUInt32(byteBuffer0, v);
                return;
            }
            case 8: {
                IsoTypeWriter.writeUInt64(byteBuffer0, v);
                return;
            }
            default: {
                throw new RuntimeException("I don\'t know how to read " + v1 + " bytes");
            }
        }
    }
}

