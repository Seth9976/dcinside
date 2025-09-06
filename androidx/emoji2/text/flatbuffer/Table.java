package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

public class Table {
    protected int a;
    protected ByteBuffer b;
    private int c;
    private int d;
    Utf8 e;

    public Table() {
        this.e = Utf8.d();
    }

    protected static boolean a(ByteBuffer byteBuffer0, String s) {
        if(s.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for(int v = 0; v < 4; ++v) {
            if(s.charAt(v) != ((char)byteBuffer0.get(byteBuffer0.position() + 4 + v))) {
                return false;
            }
        }
        return true;
    }

    protected int b(int v) {
        return v + this.b.getInt(v);
    }

    protected static int c(int v, ByteBuffer byteBuffer0) {
        return v + byteBuffer0.getInt(v);
    }

    protected int d(int v) {
        return v >= this.d ? 0 : this.b.getShort(this.c + v);
    }

    protected static int e(int v, int v1, ByteBuffer byteBuffer0) {
        int v2 = byteBuffer0.capacity() - v1;
        return byteBuffer0.getShort(v + v2 - byteBuffer0.getInt(v2)) + v2;
    }

    public void f() {
        this.g(0, null);
    }

    protected void g(int v, ByteBuffer byteBuffer0) {
        this.b = byteBuffer0;
        if(byteBuffer0 != null) {
            this.a = v;
            int v1 = v - byteBuffer0.getInt(v);
            this.c = v1;
            this.d = this.b.getShort(v1);
            return;
        }
        this.a = 0;
        this.c = 0;
        this.d = 0;
    }

    protected String h(int v) {
        return Table.i(v, this.b, this.e);
    }

    protected static String i(int v, ByteBuffer byteBuffer0, Utf8 utf80) {
        int v1 = v + byteBuffer0.getInt(v);
        return utf80.a(byteBuffer0, v1 + 4, byteBuffer0.getInt(v1));
    }

    protected Table j(Table table0, int v) {
        return Table.k(table0, v, this.b);
    }

    protected static Table k(Table table0, int v, ByteBuffer byteBuffer0) {
        table0.g(Table.c(v, byteBuffer0), byteBuffer0);
        return table0;
    }

    protected int l(int v) {
        int v1 = v + this.a;
        return v1 + this.b.getInt(v1) + 4;
    }

    protected ByteBuffer m(int v, int v1) {
        int v2 = this.d(v);
        if(v2 == 0) {
            return null;
        }
        ByteBuffer byteBuffer0 = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int v3 = this.l(v2);
        byteBuffer0.position(v3);
        byteBuffer0.limit(v3 + this.o(v2) * v1);
        return byteBuffer0;
    }

    protected ByteBuffer n(ByteBuffer byteBuffer0, int v, int v1) {
        int v2 = this.d(v);
        if(v2 == 0) {
            return null;
        }
        int v3 = this.l(v2);
        byteBuffer0.rewind();
        byteBuffer0.limit(this.o(v2) * v1 + v3);
        byteBuffer0.position(v3);
        return byteBuffer0;
    }

    protected int o(int v) {
        int v1 = v + this.a;
        int v2 = this.b.getInt(v1);
        return this.b.getInt(v1 + v2);
    }

    protected static int p(int v, int v1, ByteBuffer byteBuffer0) {
        int v2 = v + byteBuffer0.getInt(v);
        int v3 = v1 + byteBuffer0.getInt(v1);
        int v4 = byteBuffer0.getInt(v2);
        int v5 = byteBuffer0.getInt(v3);
        int v6 = Math.min(v4, v5);
        for(int v7 = 0; v7 < v6; ++v7) {
            int v8 = v7 + (v2 + 4);
            int v9 = v7 + (v3 + 4);
            if(byteBuffer0.get(v8) != byteBuffer0.get(v9)) {
                return byteBuffer0.get(v8) - byteBuffer0.get(v9);
            }
        }
        return v4 - v5;
    }

    protected static int q(int v, byte[] arr_b, ByteBuffer byteBuffer0) {
        int v1 = v + byteBuffer0.getInt(v);
        int v2 = byteBuffer0.getInt(v1);
        int v3 = Math.min(v2, arr_b.length);
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = v4 + (v1 + 4);
            if(byteBuffer0.get(v5) != arr_b[v4]) {
                return byteBuffer0.get(v5) - arr_b[v4];
            }
        }
        return v2 - arr_b.length;
    }

    public ByteBuffer r() {
        return this.b;
    }

    protected int s(Integer integer0, Integer integer1, ByteBuffer byteBuffer0) [...] // Inlined contents

    protected void t(int[] arr_v, ByteBuffer byteBuffer0) {
        Integer[] arr_integer = new Integer[arr_v.length];
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            arr_integer[v1] = (int)arr_v[v1];
        }
        Arrays.sort(arr_integer, new Comparator() {
            final Table b;

            public int b(Integer integer0, Integer integer1) {
                return 0;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((Integer)object0), ((Integer)object1));
            }
        });
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v[v] = (int)arr_integer[v];
        }
    }
}

