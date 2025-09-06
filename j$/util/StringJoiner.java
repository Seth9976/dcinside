package j$.util;

import java.util.Arrays;

public final class StringJoiner {
    private final String a;
    private final String b;
    private final String c;
    private String[] d;
    private int e;
    private int f;

    public StringJoiner(CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2) {
        Objects.requireNonNull(charSequence1, "The prefix must not be null");
        Objects.requireNonNull(charSequence0, "The delimiter must not be null");
        Objects.requireNonNull(charSequence2, "The suffix must not be null");
        this.a = charSequence1.toString();
        this.b = charSequence0.toString();
        this.c = charSequence2.toString();
    }

    private void a() {
        String[] arr_s;
        if(this.e > 1) {
            char[] arr_c = new char[this.f];
            int v = StringJoiner.b(this.d[0], arr_c, 0);
            int v1 = 1;
            do {
                int v2 = v + StringJoiner.b(this.b, arr_c, v);
                v = v2 + StringJoiner.b(this.d[v1], arr_c, v2);
                arr_s = this.d;
                arr_s[v1] = null;
                ++v1;
            }
            while(v1 < this.e);
            this.e = 1;
            arr_s[0] = new String(arr_c);
        }
    }

    public StringJoiner add(CharSequence charSequence0) {
        String s = String.valueOf(charSequence0);
        String[] arr_s = this.d;
        if(arr_s == null) {
            this.d = new String[8];
        }
        else {
            int v = this.e;
            if(v == arr_s.length) {
                this.d = (String[])Arrays.copyOf(arr_s, v * 2);
            }
            this.f = this.b.length() + this.f;
        }
        this.f = s.length() + this.f;
        int v1 = this.e;
        this.e = v1 + 1;
        this.d[v1] = s;
        return this;
    }

    private static int b(String s, char[] arr_c, int v) {
        return s.length();
    }

    public final StringJoiner c(StringJoiner stringJoiner0) {
        Objects.requireNonNull(stringJoiner0);
        if(stringJoiner0.d == null) {
            return this;
        }
        stringJoiner0.a();
        return this.add(stringJoiner0.d[0]);
    }

    @Override
    public final String toString() {
        String[] arr_s = this.d;
        int v = this.e;
        String s = this.a;
        int v1 = this.c.length() + s.length();
        if(v1 == 0) {
            this.a();
            return v == 0 ? "" : arr_s[0];
        }
        char[] arr_c = new char[this.f + v1];
        int v2 = StringJoiner.b(s, arr_c, 0);
        if(v > 0) {
            v2 += StringJoiner.b(arr_s[0], arr_c, v2);
            for(int v3 = 1; v3 < v; ++v3) {
                int v4 = v2 + StringJoiner.b(this.b, arr_c, v2);
                v2 = v4 + StringJoiner.b(arr_s[v3], arr_c, v4);
            }
        }
        return new String(arr_c);
    }
}

