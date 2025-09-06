package okio;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;

@i(name = "-Base64")
public final class a {
    @l
    private static final byte[] a;
    @l
    private static final byte[] b;

    static {
        a.a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 0x2F};
        a.b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F};
    }

    @m
    public static final byte[] a(@l String s) {
        int v7;
        L.p(s, "<this>");
        int v;
        for(v = s.length(); v > 0 && (s.charAt(v - 1) == 9 || s.charAt(v - 1) == 10 || s.charAt(v - 1) == 13 || s.charAt(v - 1) == 0x20 || s.charAt(v - 1) == 61); --v) {
        }
        int v1 = (int)(((long)v) * 6L / 8L);
        byte[] arr_b = new byte[v1];
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(v2 < v) {
            int v6 = s.charAt(v2);
            if(65 <= v6 && v6 < 91) {
                v7 = v6 - 65;
                goto label_28;
            }
            else if(97 <= v6 && v6 < 0x7B) {
                v7 = v6 - 71;
                goto label_28;
            }
            else if(0x30 > v6 || v6 >= 58) {
                switch(v6) {
                    case 43: 
                    case 45: {
                        v7 = 62;
                        goto label_28;
                    }
                    case 0x2F: 
                    case 0x5F: {
                        v7 = 0x3F;
                    label_28:
                        v4 = v4 << 6 | v7;
                        ++v3;
                        if(v3 % 4 == 0) {
                            arr_b[v5] = (byte)(v4 >> 16);
                            int v8 = v5 + 2;
                            arr_b[v5 + 1] = (byte)(v4 >> 8);
                            v5 += 3;
                            arr_b[v8] = (byte)v4;
                        }
                        break;
                    }
                    default: {
                        if(v6 != 9 && v6 != 10 && v6 != 13 && v6 != 0x20) {
                            return null;
                        }
                    }
                }
            }
            else {
                v7 = v6 + 4;
                goto label_28;
            }
            ++v2;
        }
        switch(v3 % 4) {
            case 1: {
                return null;
            }
            case 2: {
                arr_b[v5] = (byte)(v4 << 12 >> 16);
                ++v5;
                break;
            }
            case 3: {
                int v9 = v5 + 1;
                arr_b[v5] = (byte)(v4 << 6 >> 16);
                v5 += 2;
                arr_b[v9] = (byte)(v4 << 6 >> 8);
            }
        }
        if(v5 == v1) {
            return arr_b;
        }
        byte[] arr_b1 = Arrays.copyOf(arr_b, v5);
        L.o(arr_b1, "copyOf(this, newSize)");
        return arr_b1;
    }

    @l
    public static final String b(@l byte[] arr_b, @l byte[] arr_b1) {
        L.p(arr_b, "<this>");
        L.p(arr_b1, "map");
        byte[] arr_b2 = new byte[(arr_b.length + 2) / 3 * 4];
        int v = arr_b.length - arr_b.length % 3;
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            int v3 = arr_b[v1];
            int v4 = v1 + 2;
            int v5 = arr_b[v1 + 1];
            v1 += 3;
            int v6 = arr_b[v4];
            arr_b2[v2] = arr_b1[(v3 & 0xFF) >> 2];
            arr_b2[v2 + 1] = arr_b1[(v3 & 3) << 4 | (v5 & 0xFF) >> 4];
            int v7 = v2 + 3;
            arr_b2[v2 + 2] = arr_b1[(v5 & 15) << 2 | (v6 & 0xFF) >> 6];
            v2 += 4;
            arr_b2[v7] = arr_b1[v6 & 0x3F];
        }
        switch(arr_b.length - v) {
            case 1: {
                int v8 = arr_b[v1];
                arr_b2[v2] = arr_b1[(v8 & 0xFF) >> 2];
                arr_b2[v2 + 1] = arr_b1[(v8 & 3) << 4];
                arr_b2[v2 + 2] = 61;
                arr_b2[v2 + 3] = 61;
                return t0.c(arr_b2);
            }
            case 2: {
                int v9 = arr_b[v1];
                int v10 = arr_b[v1 + 1];
                arr_b2[v2] = arr_b1[(v9 & 0xFF) >> 2];
                arr_b2[v2 + 1] = arr_b1[(v9 & 3) << 4 | (v10 & 0xFF) >> 4];
                arr_b2[v2 + 2] = arr_b1[(v10 & 15) << 2];
                arr_b2[v2 + 3] = 61;
                return t0.c(arr_b2);
            }
            default: {
                return t0.c(arr_b2);
            }
        }
    }

    public static String c(byte[] arr_b, byte[] arr_b1, int v, Object object0) {
        if((v & 1) != 0) {
            arr_b1 = a.a;
        }
        return a.b(arr_b, arr_b1);
    }

    @l
    public static final byte[] d() {
        return a.a;
    }

    public static void e() {
    }

    @l
    public static final byte[] f() [...] // 潜在的解密器

    public static void g() {
    }
}

