package okio;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;
import z3.j;

@s0({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n74#3:561\n68#3:562\n74#3:573\n68#3:594\n74#3:600\n68#3:642\n74#3:648\n68#3:703\n74#3:714\n68#3:735\n74#3:741\n68#3:783\n74#3:789\n74#3:845\n74#3:847\n74#3:849\n74#3:851\n74#3:853\n74#3:855\n74#3:857\n74#3:859\n74#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
@i(name = "Utf8")
public final class r0 {
    public static final byte a = 0x3F;
    public static final char b = '\uFFFD';
    public static final int c = 0xFFFD;
    public static final int d = 0xD7C0;
    public static final int e = 0xDC00;
    public static final int f = 0xF80;
    public static final int g = 0xFFFE1F80;
    public static final int h = 0x381F80;

    // 去混淆评级： 低(20)
    public static final boolean a(int v) {
        return v >= 0 && v < 0x20 || 0x7F <= v && v < 0xA0;
    }

    public static final boolean b(byte b) {
        return (b & 0xC0) == 0x80;
    }

    public static final int c(@l byte[] arr_b, int v, int v1, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "yield");
        if(v1 <= v + 1) {
            function10.invoke(0xFFFD);
            return 1;
        }
        int v2 = arr_b[v];
        int v3 = arr_b[v + 1];
        if((v3 & 0xC0) == 0x80) {
            int v4 = v3 ^ 0xF80 ^ v2 << 6;
            if(v4 < 0x80) {
                function10.invoke(0xFFFD);
                return 2;
            }
            function10.invoke(v4);
            return 2;
        }
        function10.invoke(0xFFFD);
        return 1;
    }

    public static final int d(@l byte[] arr_b, int v, int v1, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "yield");
        if(v1 <= v + 2) {
            function10.invoke(0xFFFD);
            return v1 <= v + 1 || (arr_b[v + 1] & 0xC0) != 0x80 ? 1 : 2;
        }
        int v2 = arr_b[v];
        int v3 = arr_b[v + 1];
        if((v3 & 0xC0) == 0x80) {
            int v4 = arr_b[v + 2];
            if((v4 & 0xC0) == 0x80) {
                int v5 = v4 ^ 0xFFFE1F80 ^ v3 << 6 ^ v2 << 12;
                if(v5 < 0x800) {
                    function10.invoke(0xFFFD);
                    return 3;
                }
                if(0xD800 <= v5 && v5 < 0xE000) {
                    function10.invoke(0xFFFD);
                    return 3;
                }
                function10.invoke(v5);
                return 3;
            }
            function10.invoke(0xFFFD);
            return 2;
        }
        function10.invoke(0xFFFD);
        return 1;
    }

    public static final int e(@l byte[] arr_b, int v, int v1, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "yield");
        if(v1 <= v + 3) {
            function10.invoke(0xFFFD);
            if(v1 > v + 1 && (arr_b[v + 1] & 0xC0) == 0x80) {
                return v1 <= v + 2 || (arr_b[v + 2] & 0xC0) != 0x80 ? 2 : 3;
            }
            return 1;
        }
        int v2 = arr_b[v];
        int v3 = arr_b[v + 1];
        if((v3 & 0xC0) == 0x80) {
            int v4 = arr_b[v + 2];
            if((v4 & 0xC0) == 0x80) {
                int v5 = arr_b[v + 3];
                if((v5 & 0xC0) == 0x80) {
                    int v6 = v5 ^ 0x381F80 ^ v4 << 6 ^ v3 << 12 ^ v2 << 18;
                    if(v6 > 0x10FFFF) {
                        function10.invoke(0xFFFD);
                        return 4;
                    }
                    if(0xD800 <= v6 && v6 < 0xE000) {
                        function10.invoke(0xFFFD);
                        return 4;
                    }
                    if(v6 < 0x10000) {
                        function10.invoke(0xFFFD);
                        return 4;
                    }
                    function10.invoke(v6);
                    return 4;
                }
                function10.invoke(0xFFFD);
                return 3;
            }
            function10.invoke(0xFFFD);
            return 2;
        }
        function10.invoke(0xFFFD);
        return 1;
    }

    public static final void f(@l byte[] arr_b, int v, int v1, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "yield");
        while(v < v1) {
            int v2 = 2;
            int v3 = arr_b[v];
            if(v3 >= 0) {
                function10.invoke(Character.valueOf(((char)v3)));
                ++v;
                while(v < v1) {
                    int v4 = arr_b[v];
                    if(v4 < 0) {
                        break;
                    }
                    ++v;
                    function10.invoke(Character.valueOf(((char)v4)));
                }
            }
            else {
                if(v3 >> 5 == -2) {
                    if(v1 > v + 1) {
                        int v5 = arr_b[v + 1];
                        if((v5 & 0xC0) == 0x80) {
                            int v6 = v3 << 6 ^ (v5 ^ 0xF80);
                            function10.invoke(Character.valueOf((v6 >= 0x80 ? ((char)v6) : '\uFFFD')));
                            goto label_73;
                        }
                    }
                    function10.invoke(Character.valueOf('\uFFFD'));
                    v2 = 1;
                }
                else if(v3 >> 4 == -2) {
                    if(v1 <= v + 2) {
                        function10.invoke(Character.valueOf('\uFFFD'));
                        if(v1 > v + 1 && (arr_b[v + 1] & 0xC0) == 0x80) {
                            goto label_73;
                        }
                    }
                    else {
                        int v7 = arr_b[v + 1];
                        if((v7 & 0xC0) == 0x80) {
                            int v8 = arr_b[v + 2];
                            if((v8 & 0xC0) == 0x80) {
                                int v9 = v3 << 12 ^ (v8 ^ 0xFFFE1F80 ^ v7 << 6);
                                function10.invoke(Character.valueOf((v9 < 0x800 || 0xD800 <= v9 && v9 < 0xE000 ? '\uFFFD' : ((char)v9))));
                                v2 = 3;
                            }
                            else {
                                function10.invoke(Character.valueOf('\uFFFD'));
                            }
                            goto label_73;
                        }
                        else {
                            function10.invoke(Character.valueOf('\uFFFD'));
                        }
                    }
                    v2 = 1;
                }
                else if(v3 >> 3 != -2) {
                    goto label_75;
                }
                else if(v1 <= v + 3) {
                    function10.invoke(Character.valueOf('\uFFFD'));
                    if(v1 <= v + 1 || (arr_b[v + 1] & 0xC0) != 0x80) {
                        v2 = 1;
                    }
                    else if(v1 > v + 2 && (arr_b[v + 2] & 0xC0) == 0x80) {
                        v2 = 3;
                    }
                }
                else {
                    int v10 = arr_b[v + 1];
                    if((v10 & 0xC0) == 0x80) {
                        int v11 = arr_b[v + 2];
                        if((v11 & 0xC0) == 0x80) {
                            int v12 = arr_b[v + 3];
                            if((v12 & 0xC0) == 0x80) {
                                int v13 = v3 << 18 ^ (v12 ^ 0x381F80 ^ v11 << 6 ^ v10 << 12);
                                if(v13 > 0x10FFFF || (0xD800 <= v13 && v13 < 0xE000 || v13 < 0x10000 || v13 == 0xFFFD)) {
                                    function10.invoke(Character.valueOf('\uFFFD'));
                                }
                                else {
                                    function10.invoke(Character.valueOf(((char)((v13 >>> 10) + 0xD7C0))));
                                    function10.invoke(Character.valueOf(((char)((v13 & 0x3FF) + 0xDC00))));
                                }
                                v2 = 4;
                            }
                            else {
                                function10.invoke(Character.valueOf('\uFFFD'));
                                v2 = 3;
                            }
                        }
                        else {
                            function10.invoke(Character.valueOf('\uFFFD'));
                        }
                    }
                    else {
                        function10.invoke(Character.valueOf('\uFFFD'));
                        v2 = 1;
                    }
                }
            label_73:
                v += v2;
                continue;
            label_75:
                function10.invoke(Character.valueOf('\uFFFD'));
                ++v;
            }
        }
    }

    public static final void g(@l String s, int v, int v1, @l Function1 function10) {
        L.p(s, "<this>");
        L.p(function10, "yield");
        while(v < v1) {
            int v2 = s.charAt(v);
            if(L.t(v2, 0x80) < 0) {
                function10.invoke(((byte)v2));
                ++v;
                while(v < v1 && L.t(s.charAt(v), 0x80) < 0) {
                    function10.invoke(((byte)s.charAt(v)));
                    ++v;
                }
            }
            else {
                if(L.t(v2, 0x800) < 0) {
                    function10.invoke(((byte)(v2 >> 6 | 0xC0)));
                    function10.invoke(((byte)(v2 & 0x3F | 0x80)));
                }
                else if(0xD800 > v2 || v2 >= 0xE000) {
                    function10.invoke(((byte)(v2 >> 12 | 0xE0)));
                    function10.invoke(((byte)(v2 >> 6 & 0x3F | 0x80)));
                    function10.invoke(((byte)(v2 & 0x3F | 0x80)));
                }
                else {
                    if(L.t(v2, 0xDBFF) <= 0 && v1 > v + 1) {
                        int v3 = s.charAt(v + 1);
                        if(0xDC00 <= v3 && v3 < 0xE000) {
                            int v4 = (v2 << 10) + s.charAt(v + 1) - 0x35FDC00;
                            function10.invoke(((byte)(v4 >> 18 | 0xF0)));
                            function10.invoke(((byte)(v4 >> 12 & 0x3F | 0x80)));
                            function10.invoke(((byte)(v4 >> 6 & 0x3F | 0x80)));
                            function10.invoke(((byte)(v4 & 0x3F | 0x80)));
                            v += 2;
                            continue;
                        }
                    }
                    function10.invoke(((byte)0x3F));
                }
                ++v;
            }
        }
    }

    public static final void h(@l byte[] arr_b, int v, int v1, @l Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "yield");
        while(v < v1) {
            int v2 = 2;
            int v3 = arr_b[v];
            if(v3 >= 0) {
                function10.invoke(v3);
                ++v;
                while(v < v1) {
                    int v4 = arr_b[v];
                    if(v4 < 0) {
                        break;
                    }
                    ++v;
                    function10.invoke(v4);
                }
            }
            else {
                if(v3 >> 5 == -2) {
                    if(v1 > v + 1) {
                        int v5 = arr_b[v + 1];
                        if((v5 & 0xC0) == 0x80) {
                            int v6 = v3 << 6 ^ (v5 ^ 0xF80);
                            function10.invoke((v6 >= 0x80 ? v6 : 0xFFFD));
                            goto label_69;
                        }
                    }
                    function10.invoke(0xFFFD);
                    v2 = 1;
                }
                else if(v3 >> 4 == -2) {
                    if(v1 <= v + 2) {
                        function10.invoke(0xFFFD);
                        if(v1 > v + 1 && (arr_b[v + 1] & 0xC0) == 0x80) {
                            goto label_69;
                        }
                    }
                    else {
                        int v7 = arr_b[v + 1];
                        if((v7 & 0xC0) == 0x80) {
                            int v8 = arr_b[v + 2];
                            if((v8 & 0xC0) == 0x80) {
                                int v9 = v3 << 12 ^ (v8 ^ 0xFFFE1F80 ^ v7 << 6);
                                function10.invoke((v9 < 0x800 || 0xD800 <= v9 && v9 < 0xE000 ? 0xFFFD : v9));
                                v2 = 3;
                            }
                            else {
                                function10.invoke(0xFFFD);
                            }
                            goto label_69;
                        }
                        else {
                            function10.invoke(0xFFFD);
                        }
                    }
                    v2 = 1;
                }
                else if(v3 >> 3 != -2) {
                    goto label_71;
                }
                else if(v1 <= v + 3) {
                    function10.invoke(0xFFFD);
                    if(v1 <= v + 1 || (arr_b[v + 1] & 0xC0) != 0x80) {
                        v2 = 1;
                    }
                    else if(v1 > v + 2 && (arr_b[v + 2] & 0xC0) == 0x80) {
                        v2 = 3;
                    }
                }
                else {
                    int v10 = arr_b[v + 1];
                    if((v10 & 0xC0) == 0x80) {
                        int v11 = arr_b[v + 2];
                        if((v11 & 0xC0) == 0x80) {
                            int v12 = arr_b[v + 3];
                            if((v12 & 0xC0) == 0x80) {
                                int v13 = v3 << 18 ^ (v12 ^ 0x381F80 ^ v11 << 6 ^ v10 << 12);
                                function10.invoke((v13 > 0x10FFFF || (0xD800 <= v13 && v13 < 0xE000 || v13 < 0x10000) ? 0xFFFD : v13));
                                v2 = 4;
                            }
                            else {
                                function10.invoke(0xFFFD);
                                v2 = 3;
                            }
                        }
                        else {
                            function10.invoke(0xFFFD);
                        }
                    }
                    else {
                        function10.invoke(0xFFFD);
                        v2 = 1;
                    }
                }
            label_69:
                v += v2;
                continue;
            label_71:
                function10.invoke(0xFFFD);
                ++v;
            }
        }
    }

    @i(name = "size")
    @j
    public static final long i(@l String s) {
        L.p(s, "<this>");
        return r0.l(s, 0, 0, 3, null);
    }

    @i(name = "size")
    @j
    public static final long j(@l String s, int v) {
        L.p(s, "<this>");
        return r0.l(s, v, 0, 2, null);
    }

    @i(name = "size")
    @j
    public static final long k(@l String s, int v, int v1) {
        int v4;
        L.p(s, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + v).toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + v1 + " < " + v).toString());
        }
        if(v1 > s.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + v1 + " > " + s.length()).toString());
        }
        long v2 = 0L;
        while(v < v1) {
            int v3 = s.charAt(v);
            if(v3 < 0x80) {
                ++v2;
            }
            else {
                if(v3 < 0x800) {
                    v4 = 2;
                }
                else if(v3 < 0xD800 || v3 > 0xDFFF) {
                    v4 = 3;
                }
                else {
                    int v5 = v + 1 >= v1 ? 0 : s.charAt(v + 1);
                    if(v3 > 0xDBFF || v5 < 0xDC00 || v5 > 0xDFFF) {
                        ++v2;
                        ++v;
                    }
                    else {
                        v2 += 4L;
                        v += 2;
                    }
                    continue;
                }
                v2 += (long)v4;
            }
            ++v;
        }
        return v2;
    }

    public static long l(String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        return r0.k(s, v, v1);
    }
}

