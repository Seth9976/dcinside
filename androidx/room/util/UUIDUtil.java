package androidx.room.util;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@RestrictTo({Scope.c})
@i(name = "UUIDUtil")
public final class UUIDUtil {
    @l
    public static final UUID a(@l byte[] arr_b) {
        L.p(arr_b, "bytes");
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        return new UUID(byteBuffer0.getLong(), byteBuffer0.getLong());
    }

    @l
    public static final byte[] b(@l UUID uUID0) {
        L.p(uUID0, "uuid");
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[16]);
        byteBuffer0.putLong(uUID0.getMostSignificantBits());
        byteBuffer0.putLong(uUID0.getLeastSignificantBits());
        byte[] arr_b = byteBuffer0.array();
        L.o(arr_b, "buffer.array()");
        return arr_b;
    }
}

