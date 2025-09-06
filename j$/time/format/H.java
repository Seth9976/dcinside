package j$.time.format;

import j..time.LocalDateTime;
import j..time.ZoneOffset;
import j..time.temporal.a;

final class h implements f {
    @Override  // j$.time.format.f
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        Long long0 = y0.e(a.INSTANT_SECONDS);
        a a0 = a.NANO_OF_SECOND;
        Long long1 = y0.d().e(a0) ? y0.d().u(a0) : null;
        if(long0 == null) {
            return false;
        }
        long v1 = (long)long0;
        int v2 = a0.Q((long1 == null ? 0L : ((long)long1)));
        if(v1 >= 0xFFFFFFF1868B8400L) {
            long v3 = j..com.android.tools.r8.a.n(v1 - 253402300800L, 315569520000L);
            LocalDateTime localDateTime0 = LocalDateTime.a0(j..com.android.tools.r8.a.m(v1 - 253402300800L, 315569520000L) - 0xE79747C00L, 0, ZoneOffset.UTC);
            if(v3 + 1L > 0L) {
                stringBuilder0.append('+');
                stringBuilder0.append(v3 + 1L);
            }
            stringBuilder0.append(localDateTime0);
            if(localDateTime0.T() == 0) {
                stringBuilder0.append(":00");
            }
        }
        else {
            long v4 = (v1 + 0xE79747C00L) / 315569520000L;
            long v5 = (v1 + 0xE79747C00L) % 315569520000L;
            LocalDateTime localDateTime1 = LocalDateTime.a0(v5 - 0xE79747C00L, 0, ZoneOffset.UTC);
            int v6 = stringBuilder0.length();
            stringBuilder0.append(localDateTime1);
            if(localDateTime1.T() == 0) {
                stringBuilder0.append(":00");
            }
            if(v4 < 0L) {
                if(localDateTime1.U() == -10000) {
                    stringBuilder0.replace(v6, v6 + 2, Long.toString(v4 - 1L));
                }
                else if(v5 == 0L) {
                    stringBuilder0.insert(v6, v4);
                }
                else {
                    stringBuilder0.insert(v6 + 1, Math.abs(v4));
                }
            }
        }
        if(v2 > 0) {
            stringBuilder0.append('.');
            int v7 = 100000000;
            for(int v = 0; v2 > 0 || v % 3 != 0 || v < -2; ++v) {
                int v8 = v2 / v7;
                stringBuilder0.append(((char)(v8 + 0x30)));
                v2 -= v8 * v7;
                v7 /= 10;
            }
        }
        stringBuilder0.append('Z');
        return true;
    }

    @Override  // j$.time.format.f
    public final int n(w w0, CharSequence charSequence0, int v) {
        int v12;
        int v11;
        v v1 = new v();
        v1.a(DateTimeFormatter.ISO_LOCAL_DATE);
        v1.e('T');
        a a0 = a.HOUR_OF_DAY;
        v1.o(a0, 2);
        v1.e(':');
        a a1 = a.MINUTE_OF_HOUR;
        v1.o(a1, 2);
        v1.e(':');
        a a2 = a.SECOND_OF_MINUTE;
        v1.o(a2, 2);
        a a3 = a.NANO_OF_SECOND;
        int v2 = 0;
        v1.b(a3, 0, 9, true);
        v1.e('Z');
        e e0 = v1.x().f();
        w w1 = w0.d();
        int v3 = e0.n(w1, charSequence0, v);
        if(v3 < 0) {
            return v3;
        }
        long v4 = (long)w1.j(a.YEAR);
        int v5 = w1.j(a.MONTH_OF_YEAR).intValue();
        int v6 = w1.j(a.DAY_OF_MONTH).intValue();
        int v7 = w1.j(a0).intValue();
        int v8 = w1.j(a1).intValue();
        Long long0 = w1.j(a2);
        Long long1 = w1.j(a3);
        int v9 = long0 == null ? 0 : long0.intValue();
        int v10 = long1 == null ? 0 : long1.intValue();
        if(v7 == 24 && v8 == 0 && v9 == 0 && v10 == 0) {
            v11 = 0;
            v2 = 1;
            v12 = 0;
        }
        else if(v7 != 23 || v8 != 59 || v9 != 60) {
            v12 = v7;
            v11 = v9;
        }
        else {
            w0.p();
            v12 = 23;
            v11 = 59;
        }
        try {
            long v13 = j..time.chrono.h.n(LocalDateTime.Y(((int)v4) % 10000, v5, v6, v12, v8, v11).c0(((long)v2)), ZoneOffset.UTC);
            long v14 = j..com.android.tools.r8.a.o(v4 / 10000L, 315569520000L);
            return w0.o(a3, ((long)v10), v, w0.o(a.INSTANT_SECONDS, v14 + v13, v, v3));
        }
        catch(RuntimeException unused_ex) {
            return ~v;
        }
    }

    @Override
    public final String toString() {
        return "Instant()";
    }
}

