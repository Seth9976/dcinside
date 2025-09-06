package okio.internal;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import okio.a;
import okio.o;
import okio.t0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,363:1\n131#1,2:369\n133#1,9:372\n68#2:364\n74#2:365\n74#2:367\n74#2:368\n68#2:396\n74#2:408\n1#3:366\n1#3:371\n212#4,7:381\n122#4:388\n219#4,5:389\n122#4:394\n226#4:395\n228#4:397\n397#4,2:398\n122#4:400\n400#4,6:401\n127#4:407\n406#4:409\n122#4:410\n407#4,13:411\n122#4:424\n422#4:425\n122#4:426\n425#4:427\n230#4,3:428\n440#4,3:431\n122#4:434\n443#4:435\n127#4:436\n446#4,10:437\n127#4:447\n456#4:448\n122#4:449\n457#4,4:450\n127#4:454\n461#4:455\n122#4:456\n462#4,14:457\n122#4:471\n477#4,2:472\n122#4:474\n481#4:475\n122#4:476\n484#4:477\n234#4,3:478\n500#4,3:481\n122#4:484\n503#4:485\n127#4:486\n506#4,2:487\n127#4:489\n510#4,10:490\n127#4:500\n520#4:501\n122#4:502\n521#4,4:503\n127#4:507\n525#4:508\n122#4:509\n526#4,4:510\n127#4:514\n530#4:515\n122#4:516\n531#4,15:517\n122#4:532\n547#4,2:533\n122#4:535\n550#4,2:536\n122#4:538\n554#4:539\n122#4:540\n557#4:541\n241#4:542\n122#4:543\n242#4,5:544\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n329#1:369,2\n329#1:372,9\n67#1:364\n68#1:365\n258#1:367\n259#1:368\n348#1:396\n348#1:408\n329#1:371\n348#1:381,7\n353#1:388\n348#1:389,5\n353#1:394\n348#1:395\n348#1:397\n348#1:398,2\n353#1:400\n348#1:401,6\n348#1:407\n348#1:409\n353#1:410\n348#1:411,13\n353#1:424\n348#1:425\n353#1:426\n348#1:427\n348#1:428,3\n348#1:431,3\n353#1:434\n348#1:435\n348#1:436\n348#1:437,10\n348#1:447\n348#1:448\n353#1:449\n348#1:450,4\n348#1:454\n348#1:455\n353#1:456\n348#1:457,14\n353#1:471\n348#1:472,2\n353#1:474\n348#1:475\n353#1:476\n348#1:477\n348#1:478,3\n348#1:481,3\n353#1:484\n348#1:485\n348#1:486\n348#1:487,2\n348#1:489\n348#1:490,10\n348#1:500\n348#1:501\n353#1:502\n348#1:503,4\n348#1:507\n348#1:508\n353#1:509\n348#1:510,4\n348#1:514\n348#1:515\n353#1:516\n348#1:517,15\n353#1:532\n348#1:533,2\n353#1:535\n348#1:536,2\n353#1:538\n348#1:539\n353#1:540\n348#1:541\n348#1:542\n353#1:543\n348#1:544,5\n*E\n"})
@i(name = "-ByteString")
public final class b {
    @l
    private static final char[] a;

    static {
        b.a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    @l
    public static final o A(@l o o0, int v, int v1) {
        L.p(o0, "<this>");
        int v2 = okio.i.l(o0, v1);
        if(v < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if(v2 > o0.s().length) {
            throw new IllegalArgumentException(("endIndex > length(" + o0.s().length + ')').toString());
        }
        if(v2 - v < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        return v != 0 || v2 != o0.s().length ? new o(kotlin.collections.l.f1(o0.s(), v, v2)) : o0;
    }

    @l
    public static final o B(@l o o0) {
        L.p(o0, "<this>");
        for(int v = 0; v < o0.s().length; ++v) {
            int v1 = o0.s()[v];
            if(v1 >= 65 && v1 <= 90) {
                byte[] arr_b = o0.s();
                byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
                L.o(arr_b1, "copyOf(this, size)");
                int v2 = v + 1;
                arr_b1[v] = (byte)(v1 + 0x20);
                while(v2 < arr_b1.length) {
                    int v3 = arr_b1[v2];
                    if(v3 >= 65 && v3 <= 90) {
                        arr_b1[v2] = (byte)(v3 + 0x20);
                    }
                    ++v2;
                }
                return new o(arr_b1);
            }
        }
        return o0;
    }

    @l
    public static final o C(@l o o0) {
        L.p(o0, "<this>");
        for(int v = 0; v < o0.s().length; ++v) {
            int v1 = o0.s()[v];
            if(v1 >= 97 && v1 <= 0x7A) {
                byte[] arr_b = o0.s();
                byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
                L.o(arr_b1, "copyOf(this, size)");
                int v2 = v + 1;
                arr_b1[v] = (byte)(v1 - 0x20);
                while(v2 < arr_b1.length) {
                    int v3 = arr_b1[v2];
                    if(v3 >= 97 && v3 <= 0x7A) {
                        arr_b1[v2] = (byte)(v3 - 0x20);
                    }
                    ++v2;
                }
                return new o(arr_b1);
            }
        }
        return o0;
    }

    @l
    public static final byte[] D(@l o o0) {
        L.p(o0, "<this>");
        byte[] arr_b = o0.s();
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(this, size)");
        return arr_b1;
    }

    @l
    public static final o E(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "<this>");
        int v2 = okio.i.m(arr_b, v1);
        okio.i.e(arr_b.length, v, v2);
        return new o(kotlin.collections.l.f1(arr_b, v, v2 + v));
    }

    @l
    public static final String F(@l o o0) {
        o o1 = o0;
        L.p(o1, "<this>");
        if(o0.s().length == 0) {
            return "[size=0]";
        }
        int v = b.c(o0.s(), 0x40);
        if(v == -1) {
            if(o0.s().length <= 0x40) {
                return "[hex=" + o0.z() + ']';
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("[size=");
            stringBuilder0.append(o0.s().length);
            stringBuilder0.append(" hex=");
            int v1 = okio.i.l(o1, 0x40);
            if(v1 > o0.s().length) {
                throw new IllegalArgumentException(("endIndex > length(" + o0.s().length + ')').toString());
            }
            if(v1 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            if(v1 != o0.s().length) {
                o1 = new o(kotlin.collections.l.f1(o0.s(), 0, v1));
            }
            stringBuilder0.append(o1.z());
            stringBuilder0.append("…]");
            return stringBuilder0.toString();
        }
        String s = o0.t0();
        String s1 = s.substring(0, v);
        L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
        String s2 = v.l2(v.l2(v.l2(s1, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        return v >= s.length() ? "[text=" + s2 + ']' : "[size=" + o0.s().length + " text=" + s2 + "…]";
    }

    @l
    public static final String G(@l o o0) {
        L.p(o0, "<this>");
        String s = o0.y();
        if(s == null) {
            s = t0.c(o0.K());
            o0.c0(s);
        }
        return s;
    }

    public static final void H(@l o o0, @l okio.l l0, int v, int v1) {
        L.p(o0, "<this>");
        L.p(l0, "buffer");
        l0.d2(o0.s(), v, v1);
    }

    private static final int I(char c) {
        if(0x30 <= c && c < 58) {
            return c - 0x30;
        }
        if(97 <= c && c < 103) {
            return c - 87;
        }
        if(65 > c || c >= 71) {
            throw new IllegalArgumentException("Unexpected hex digit: " + c);
        }
        return c - 55;
    }

    @l
    public static final char[] J() {
        return b.a;
    }

    public static void K() {
    }

    private static final int c(byte[] arr_b, int v) {
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
    label_3:
        while(v1 < arr_b.length) {
            int v4 = arr_b[v1];
            if(v4 >= 0) {
                int v5 = v3 + 1;
                if(v3 == v) {
                    return v2;
                }
                if(v4 != 10 && v4 != 13 && (v4 >= 0 && v4 < 0x20 || 0x7F <= v4 && v4 < 0xA0) || v4 == 0xFFFD) {
                    return -1;
                }
                v2 += (v4 >= 0x10000 ? 2 : 1);
                ++v1;
                while(true) {
                    v3 = v5;
                    if(v1 >= arr_b.length) {
                        continue label_3;
                    }
                    int v6 = arr_b[v1];
                    if(v6 < 0) {
                        continue label_3;
                    }
                    ++v1;
                    v5 = v3 + 1;
                    if(v3 == v) {
                        return v2;
                    }
                    if(v6 != 10 && v6 != 13 && (v6 >= 0 && v6 < 0x20 || 0x7F <= v6 && v6 < 0xA0) || v6 == 0xFFFD) {
                        return -1;
                    }
                    v2 += (v6 >= 0x10000 ? 2 : 1);
                }
            }
            if(v4 >> 5 == -2) {
                if(arr_b.length <= v1 + 1) {
                    return v3 == v ? v2 : -1;
                }
                int v7 = arr_b[v1 + 1];
                if((v7 & 0xC0) == 0x80) {
                    int v8 = v4 << 6 ^ (v7 ^ 0xF80);
                    if(v8 < 0x80) {
                        return v3 == v ? v2 : -1;
                    }
                    if(v3 == v) {
                        return v2;
                    }
                    if(v8 != 10 && v8 != 13 && (v8 >= 0 && v8 < 0x20 || 0x7F <= v8 && v8 < 0xA0) || v8 == 0xFFFD) {
                        return -1;
                    }
                    v2 += (v8 >= 0x10000 ? 2 : 1);
                    v1 += 2;
                    ++v3;
                    continue;
                }
            }
            else if(v4 >> 4 == -2) {
                if(arr_b.length <= v1 + 2) {
                    return v3 == v ? v2 : -1;
                }
                int v9 = arr_b[v1 + 1];
                if((v9 & 0xC0) == 0x80) {
                    int v10 = arr_b[v1 + 2];
                    if((v10 & 0xC0) == 0x80) {
                        int v11 = v4 << 12 ^ (v10 ^ 0xFFFE1F80 ^ v9 << 6);
                        if(v11 < 0x800) {
                            return v3 == v ? v2 : -1;
                        }
                        if(0xD800 <= v11 && v11 < 0xE000) {
                            return v3 == v ? v2 : -1;
                        }
                        if(v3 == v) {
                            return v2;
                        }
                        if(v11 != 10 && v11 != 13 && (v11 >= 0 && v11 < 0x20 || 0x7F <= v11 && v11 < 0xA0) || v11 == 0xFFFD) {
                            return -1;
                        }
                        v2 += (v11 >= 0x10000 ? 2 : 1);
                        v1 += 3;
                        ++v3;
                        continue;
                    }
                    return v3 == v ? v2 : -1;
                }
            }
            else {
                if(v4 >> 3 != -2 || arr_b.length <= v1 + 3) {
                    return v3 == v ? v2 : -1;
                }
                int v12 = arr_b[v1 + 1];
                if((v12 & 0xC0) == 0x80) {
                    int v13 = arr_b[v1 + 2];
                    if((v13 & 0xC0) == 0x80) {
                        int v14 = arr_b[v1 + 3];
                        if((v14 & 0xC0) == 0x80) {
                            int v15 = v4 << 18 ^ (v14 ^ 0x381F80 ^ v13 << 6 ^ v12 << 12);
                            if(v15 > 0x10FFFF) {
                                return v3 == v ? v2 : -1;
                            }
                            if(0xD800 <= v15 && v15 < 0xE000) {
                                return v3 == v ? v2 : -1;
                            }
                            if(v15 < 0x10000) {
                                return v3 == v ? v2 : -1;
                            }
                            if(v3 == v) {
                                return v2;
                            }
                            if(v15 != 10 && v15 != 13 && (v15 >= 0 && v15 < 0x20 || 0x7F <= v15 && v15 < 0xA0) || v15 == 0xFFFD) {
                                return -1;
                            }
                            v2 += 2;
                            v1 += 4;
                            ++v3;
                            continue;
                        }
                        return v3 == v ? v2 : -1;
                    }
                    return v3 == v ? v2 : -1;
                }
            }
            return v3 == v ? v2 : -1;
        }
        return v2;
    }

    @l
    public static final String d(@l o o0) {
        L.p(o0, "<this>");
        return a.c(o0.s(), null, 1, null);
    }

    @l
    public static final String e(@l o o0) {
        L.p(o0, "<this>");
        return a.b(o0.s(), new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F});
    }

    public static final int f(@l o o0, @l o o1) {
        L.p(o0, "<this>");
        L.p(o1, "other");
        int v = o0.h0();
        int v1 = o1.h0();
        int v2 = Math.min(v, v1);
        int v3 = 0;
        while(v3 < v2) {
            int v4 = o0.r(v3) & 0xFF;
            int v5 = o1.r(v3) & 0xFF;
            if(v4 == v5) {
                ++v3;
                continue;
            }
            return v4 < v5 ? -1 : 1;
        }
        if(v == v1) {
            return 0;
        }
        return v < v1 ? -1 : 1;
    }

    public static final void g(@l o o0, int v, @l byte[] arr_b, int v1, int v2) {
        L.p(o0, "<this>");
        L.p(arr_b, "target");
        kotlin.collections.l.v0(o0.s(), arr_b, v1, v, v2 + v);
    }

    @m
    public static final o h(@l String s) {
        L.p(s, "<this>");
        byte[] arr_b = a.a(s);
        return arr_b == null ? null : new o(arr_b);
    }

    @l
    public static final o i(@l String s) {
        L.p(s, "<this>");
        if(s.length() % 2 != 0) {
            throw new IllegalArgumentException(("Unexpected hex string: " + s).toString());
        }
        int v = s.length();
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v / 2; ++v1) {
            arr_b[v1] = (byte)((b.I(s.charAt(v1 * 2)) << 4) + b.I(s.charAt(v1 * 2 + 1)));
        }
        return new o(arr_b);
    }

    @l
    public static final o j(@l String s) {
        L.p(s, "<this>");
        o o0 = new o(t0.a(s));
        o0.c0(s);
        return o0;
    }

    public static final boolean k(@l o o0, @l o o1) {
        L.p(o0, "<this>");
        L.p(o1, "suffix");
        return o0.W(o0.h0() - o1.h0(), o1, 0, o1.h0());
    }

    public static final boolean l(@l o o0, @l byte[] arr_b) {
        L.p(o0, "<this>");
        L.p(arr_b, "suffix");
        return o0.X(o0.h0() - arr_b.length, arr_b, 0, arr_b.length);
    }

    public static final boolean m(@l o o0, @m Object object0) {
        L.p(o0, "<this>");
        return object0 == o0 || object0 instanceof o && ((o)object0).h0() == o0.s().length && ((o)object0).X(0, o0.s(), 0, o0.s().length);
    }

    public static final byte n(@l o o0, int v) {
        L.p(o0, "<this>");
        return o0.s()[v];
    }

    public static final int o(@l o o0) {
        L.p(o0, "<this>");
        return o0.s().length;
    }

    public static final int p(@l o o0) {
        L.p(o0, "<this>");
        int v = o0.u();
        if(v != 0) {
            return v;
        }
        int v1 = Arrays.hashCode(o0.s());
        o0.b0(v1);
        return v1;
    }

    @l
    public static final String q(@l o o0) {
        L.p(o0, "<this>");
        char[] arr_c = new char[o0.s().length * 2];
        byte[] arr_b = o0.s();
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            int v2 = arr_b[v];
            int v3 = v1 + 1;
            arr_c[v1] = b.J()[v2 >> 4 & 15];
            v1 += 2;
            arr_c[v3] = b.J()[v2 & 15];
        }
        return v.x1(arr_c);
    }

    public static final int r(@l o o0, @l byte[] arr_b, int v) {
        L.p(o0, "<this>");
        L.p(arr_b, "other");
        int v1 = o0.s().length - arr_b.length;
        int v2 = Math.max(v, 0);
        if(v2 <= v1) {
            while(true) {
                if(okio.i.d(o0.s(), v2, arr_b, 0, arr_b.length)) {
                    return v2;
                }
                if(v2 == v1) {
                    break;
                }
                ++v2;
            }
        }
        return -1;
    }

    @l
    public static final byte[] s(@l o o0) {
        L.p(o0, "<this>");
        return o0.s();
    }

    public static final int t(@l o o0, @l o o1, int v) {
        L.p(o0, "<this>");
        L.p(o1, "other");
        return o0.P(o1.K(), v);
    }

    public static final int u(@l o o0, @l byte[] arr_b, int v) {
        L.p(o0, "<this>");
        L.p(arr_b, "other");
        for(int v1 = Math.min(okio.i.l(o0, v), o0.s().length - arr_b.length); -1 < v1; --v1) {
            if(okio.i.d(o0.s(), v1, arr_b, 0, arr_b.length)) {
                return v1;
            }
        }
        return -1;
    }

    @l
    public static final o v(@l byte[] arr_b) {
        L.p(arr_b, "data");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(this, size)");
        return new o(arr_b1);
    }

    public static final boolean w(@l o o0, int v, @l o o1, int v1, int v2) {
        L.p(o0, "<this>");
        L.p(o1, "other");
        return o1.X(v1, o0.s(), v, v2);
    }

    public static final boolean x(@l o o0, int v, @l byte[] arr_b, int v1, int v2) {
        L.p(o0, "<this>");
        L.p(arr_b, "other");
        return v >= 0 && v <= o0.s().length - v2 && v1 >= 0 && v1 <= arr_b.length - v2 && okio.i.d(o0.s(), v, arr_b, v1, v2);
    }

    public static final boolean y(@l o o0, @l o o1) {
        L.p(o0, "<this>");
        L.p(o1, "prefix");
        return o0.W(0, o1, 0, o1.h0());
    }

    public static final boolean z(@l o o0, @l byte[] arr_b) {
        L.p(o0, "<this>");
        L.p(arr_b, "prefix");
        return o0.X(0, arr_b, 0, arr_b.length);
    }
}

