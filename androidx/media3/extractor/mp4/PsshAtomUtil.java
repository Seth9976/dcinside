package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.UUID;

@UnstableApi
public final class PsshAtomUtil {
    public static final class PsshAtom {
        public final UUID a;
        public final int b;
        public final byte[] c;
        @Nullable
        public final UUID[] d;

        PsshAtom(UUID uUID0, int v, byte[] arr_b, @Nullable UUID[] arr_uUID) {
            this.a = uUID0;
            this.b = v;
            this.c = arr_b;
            this.d = arr_uUID;
        }
    }

    private static final String a = "PsshAtomUtil";

    public static byte[] a(UUID uUID0, @Nullable byte[] arr_b) {
        return PsshAtomUtil.b(uUID0, null, arr_b);
    }

    public static byte[] b(UUID uUID0, @Nullable UUID[] arr_uUID, @Nullable byte[] arr_b) {
        int v = arr_b == null ? 0 : arr_b.length;
        int v1 = arr_uUID == null ? v + 0x20 : v + 0x20 + (arr_uUID.length * 16 + 4);
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v1);
        byteBuffer0.putInt(v1);
        byteBuffer0.putInt(0x70737368);
        byteBuffer0.putInt((arr_uUID == null ? 0 : 0x1000000));
        byteBuffer0.putLong(uUID0.getMostSignificantBits());
        byteBuffer0.putLong(uUID0.getLeastSignificantBits());
        if(arr_uUID != null) {
            byteBuffer0.putInt(arr_uUID.length);
            for(int v2 = 0; v2 < arr_uUID.length; ++v2) {
                UUID uUID1 = arr_uUID[v2];
                byteBuffer0.putLong(uUID1.getMostSignificantBits());
                byteBuffer0.putLong(uUID1.getLeastSignificantBits());
            }
        }
        if(arr_b != null && arr_b.length != 0) {
            byteBuffer0.putInt(arr_b.length);
            byteBuffer0.put(arr_b);
            return byteBuffer0.array();
        }
        byteBuffer0.putInt(0);
        return byteBuffer0.array();
    }

    public static boolean c(byte[] arr_b) {
        return PsshAtomUtil.d(arr_b) != null;
    }

    @Nullable
    public static PsshAtom d(byte[] arr_b) {
        UUID[] arr_uUID;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(arr_b);
        if(parsableByteArray0.g() < 0x20) {
            return null;
        }
        parsableByteArray0.Y(0);
        int v = parsableByteArray0.a();
        int v1 = parsableByteArray0.s();
        if(v1 != v) {
            Log.n("PsshAtomUtil", "Advertised atom size (" + v1 + ") does not match buffer size: " + v);
            return null;
        }
        int v2 = parsableByteArray0.s();
        if(v2 != 0x70737368) {
            Log.n("PsshAtomUtil", "Atom type is not pssh: " + v2);
            return null;
        }
        int v3 = Atom.c(parsableByteArray0.s());
        if(v3 > 1) {
            Log.n("PsshAtomUtil", "Unsupported pssh version: " + v3);
            return null;
        }
        UUID uUID0 = new UUID(parsableByteArray0.E(), parsableByteArray0.E());
        if(v3 == 1) {
            int v4 = parsableByteArray0.P();
            arr_uUID = new UUID[v4];
            for(int v5 = 0; v5 < v4; ++v5) {
                arr_uUID[v5] = new UUID(parsableByteArray0.E(), parsableByteArray0.E());
            }
        }
        else {
            arr_uUID = null;
        }
        int v6 = parsableByteArray0.P();
        int v7 = parsableByteArray0.a();
        if(v6 != v7) {
            Log.n("PsshAtomUtil", "Atom data size (" + v6 + ") does not match the bytes left: " + v7);
            return null;
        }
        byte[] arr_b1 = new byte[v6];
        parsableByteArray0.n(arr_b1, 0, v6);
        return new PsshAtom(uUID0, v3, arr_b1, arr_uUID);
    }

    @Nullable
    public static byte[] e(byte[] arr_b, UUID uUID0) {
        PsshAtom psshAtomUtil$PsshAtom0 = PsshAtomUtil.d(arr_b);
        if(psshAtomUtil$PsshAtom0 == null) {
            return null;
        }
        if(!uUID0.equals(psshAtomUtil$PsshAtom0.a)) {
            Log.n("PsshAtomUtil", "UUID mismatch. Expected: " + uUID0 + ", got: " + psshAtomUtil$PsshAtom0.a + ".");
            return null;
        }
        return psshAtomUtil$PsshAtom0.c;
    }

    @Nullable
    public static UUID f(byte[] arr_b) {
        PsshAtom psshAtomUtil$PsshAtom0 = PsshAtomUtil.d(arr_b);
        return psshAtomUtil$PsshAtom0 == null ? null : psshAtomUtil$PsshAtom0.a;
    }

    public static int g(byte[] arr_b) {
        PsshAtom psshAtomUtil$PsshAtom0 = PsshAtomUtil.d(arr_b);
        return psshAtomUtil$PsshAtom0 == null ? -1 : psshAtomUtil$PsshAtom0.b;
    }
}

