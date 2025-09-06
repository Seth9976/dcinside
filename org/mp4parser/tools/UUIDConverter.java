package org.mp4parser.tools;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

public class UUIDConverter {
    public static UUID convert(byte[] arr_b) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        return new UUID(byteBuffer0.getLong(), byteBuffer0.getLong());
    }

    public static byte[] convert(UUID uUID0) [...] // 潜在的解密器
}

