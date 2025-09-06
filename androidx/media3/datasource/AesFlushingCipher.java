package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@UnstableApi
public final class AesFlushingCipher {
    private final Cipher a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private int e;

    public AesFlushingCipher(int v, byte[] arr_b, long v1, long v2) {
        try {
            Cipher cipher0 = Cipher.getInstance("AES/CTR/NoPadding");
            this.a = cipher0;
            int v3 = cipher0.getBlockSize();
            this.b = v3;
            this.c = new byte[v3];
            this.d = new byte[v3];
            int v4 = (int)(v2 % ((long)v3));
            cipher0.init(v, new SecretKeySpec(arr_b, Util.n2(cipher0.getAlgorithm(), "/")[0]), new IvParameterSpec(this.b(v1, v2 / ((long)v3))));
            if(v4 != 0) {
                this.e(new byte[v4], 0, v4);
            }
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException noSuchAlgorithmException0) {
            throw new RuntimeException(noSuchAlgorithmException0);
        }
    }

    public AesFlushingCipher(int v, byte[] arr_b, @Nullable String s, long v1) {
        this(v, arr_b, AesFlushingCipher.a(s), v1);
    }

    private static long a(@Nullable String s) {
        long v = 0L;
        if(s == null) {
            return 0L;
        }
        for(int v1 = 0; v1 < s.length(); ++v1) {
            v = 435 * (v ^ ((long)s.charAt(v1)));
        }
        return v;
    }

    private byte[] b(long v, long v1) {
        return ByteBuffer.allocate(16).putLong(v).putLong(v1).array();
    }

    private int c(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        try {
            return this.a.update(arr_b, v, v1, arr_b1, v2);
        }
        catch(ShortBufferException shortBufferException0) {
            throw new RuntimeException(shortBufferException0);
        }
    }

    public void d(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        int v3;
        while((v3 = this.e) > 0) {
            arr_b1[v2] = (byte)(arr_b[v] ^ this.d[this.b - v3]);
            ++v2;
            ++v;
            this.e = v3 - 1;
            --v1;
            if(v1 == 0) {
                return;
            }
        }
        int v4 = this.c(arr_b, v, v1, arr_b1, v2);
        if(v1 == v4) {
            return;
        }
        int v5 = v1 - v4;
        int v6 = 0;
        boolean z = true;
        Assertions.i(v5 < this.b);
        int v7 = v2 + v4;
        int v8 = this.b - v5;
        this.e = v8;
        if(this.c(this.c, 0, v8, this.d, 0) != this.b) {
            z = false;
        }
        Assertions.i(z);
        while(v6 < v5) {
            arr_b1[v7] = this.d[v6];
            ++v6;
            ++v7;
        }
    }

    public void e(byte[] arr_b, int v, int v1) {
        this.d(arr_b, v, v1, arr_b, v);
    }
}

