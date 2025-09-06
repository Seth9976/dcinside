package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class TokenContents {
    @NonNull
    private final byte[] a;
    @Nullable
    private String b;
    @Nullable
    private List c;

    private TokenContents(@NonNull byte[] arr_b) {
        this.a = arr_b;
    }

    private TokenContents(@NonNull byte[] arr_b, @NonNull String s, @NonNull List list0) {
        this.a = arr_b;
        this.b = s;
        this.c = new ArrayList(list0.size());
        for(Object object0: list0) {
            this.c.add(Arrays.copyOf(((byte[])object0), ((byte[])object0).length));
        }
    }

    // 检测为 Lambda 实现
    private static int b(byte[] arr_b, byte[] arr_b1) [...]

    @NonNull
    static TokenContents c(String s, List list0) throws IOException {
        return new TokenContents(TokenContents.d(s, list0), s, list0);
    }

    @NonNull
    private static byte[] d(@NonNull String s, @NonNull List list0) throws IOException {
        Collections.sort(list0, (byte[] arr_b, byte[] arr_b1) -> {
            if(arr_b == arr_b1) {
                return 0;
            }
            if(arr_b == null) {
                return -1;
            }
            if(arr_b1 == null) {
                return 1;
            }
            for(int v = 0; v < Math.min(arr_b.length, arr_b1.length); ++v) {
                int v1 = arr_b[v];
                int v2 = arr_b1[v];
                if(v1 != v2) {
                    return v1 - v2;
                }
            }
            return arr_b.length == arr_b1.length ? 0 : arr_b.length - arr_b1.length;
        });
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
        dataOutputStream0.writeUTF(s);
        dataOutputStream0.writeInt(list0.size());
        for(Object object0: list0) {
            dataOutputStream0.writeInt(((byte[])object0).length);
            dataOutputStream0.write(((byte[])object0));
        }
        dataOutputStream0.flush();
        return byteArrayOutputStream0.toByteArray();
    }

    @NonNull
    static TokenContents e(@NonNull byte[] arr_b) {
        return new TokenContents(arr_b);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return TokenContents.class == class0 ? Arrays.equals(this.a, ((TokenContents)object0).a) : false;
        }
        return false;
    }

    @NonNull
    public byte[] f(int v) throws IOException {
        this.i();
        List list0 = this.c;
        if(list0 == null) {
            throw new IllegalStateException();
        }
        return Arrays.copyOf(((byte[])list0.get(v)), ((byte[])this.c.get(v)).length);
    }

    public int g() throws IOException {
        this.i();
        List list0 = this.c;
        if(list0 == null) {
            throw new IllegalStateException();
        }
        return list0.size();
    }

    @NonNull
    public String h() throws IOException {
        this.i();
        String s = this.b;
        if(s == null) {
            throw new IllegalStateException();
        }
        return s;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    private void i() throws IOException {
        if(this.b != null) {
            return;
        }
        DataInputStream dataInputStream0 = new DataInputStream(new ByteArrayInputStream(this.a));
        this.b = dataInputStream0.readUTF();
        int v = dataInputStream0.readInt();
        this.c = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = dataInputStream0.readInt();
            byte[] arr_b = new byte[v2];
            if(dataInputStream0.read(arr_b) != v2) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.c.add(arr_b);
        }
    }

    @NonNull
    public byte[] j() {
        return Arrays.copyOf(this.a, this.a.length);
    }
}

