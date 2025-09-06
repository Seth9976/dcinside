package j$.time.format;

import j..time.b;
import j..time.temporal.a;
import j..util.Objects;

final class k implements f {
    private final String a;
    private final int b;
    private final int c;
    static final String[] d;
    static final k e;
    static final k f;

    static {
        k.d = new String[]{"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
        k.e = new k("+HH:MM:ss", "Z");
        k.f = new k("+HH:MM:ss", "0");
    }

    k(String s, String s1) {
        Objects.requireNonNull(s, "pattern");
        Objects.requireNonNull(s1, "noOffsetText");
        for(int v = 0; true; ++v) {
            String[] arr_s = k.d;
            if(v >= 22) {
                break;
            }
            if(arr_s[v].equals(s)) {
                this.b = v;
                this.c = v % 11;
                this.a = s1;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: " + s);
    }

    private static void a(boolean z, int v, StringBuilder stringBuilder0) {
        stringBuilder0.append((z ? ":" : ""));
        stringBuilder0.append(((char)(v / 10 + 0x30)));
        stringBuilder0.append(((char)(v % 10 + 0x30)));
    }

    private static boolean b(CharSequence charSequence0, boolean z, int v, int[] arr_v) {
        int v1 = arr_v[0];
        if(v1 < 0) {
            return true;
        }
        if(z && v != 1) {
            if(v1 + 1 <= charSequence0.length() && charSequence0.charAt(v1) == 58) {
                ++v1;
                goto label_8;
            }
            return false;
        }
    label_8:
        if(v1 + 2 > charSequence0.length()) {
            return false;
        }
        int v2 = charSequence0.charAt(v1);
        int v3 = charSequence0.charAt(v1 + 1);
        if(v2 >= 0x30 && v2 <= 57 && v3 >= 0x30 && v3 <= 57) {
            int v4 = v2 * 10 + v3 - 0x210;
            if(v4 >= 0 && v4 <= 59) {
                arr_v[v] = v4;
                arr_v[0] = v1 + 2;
                return true;
            }
        }
        return false;
    }

    private static void c(CharSequence charSequence0, boolean z, int[] arr_v) {
        if(!z) {
            k.e(charSequence0, 1, 2, arr_v);
        }
        else if(!k.b(charSequence0, false, 1, arr_v)) {
            arr_v[0] = ~arr_v[0];
        }
    }

    private static void d(CharSequence charSequence0, boolean z, boolean z1, int[] arr_v) {
        if(!k.b(charSequence0, z, 2, arr_v) && z1) {
            arr_v[0] = ~arr_v[0];
        }
    }

    private static void e(CharSequence charSequence0, int v, int v1, int[] arr_v) {
        int v2 = arr_v[0];
        char[] arr_c = new char[v1];
        int v3 = 0;
        int v4 = 0;
        while(v3 < v1 && v2 + 1 <= charSequence0.length()) {
            char c = charSequence0.charAt(v2);
            if(c < 0x30 || c > 57) {
                break;
            }
            arr_c[v3] = c;
            ++v4;
            ++v3;
            ++v2;
        }
        if(v4 < v) {
            arr_v[0] = ~arr_v[0];
            return;
        }
        switch(v4) {
            case 1: {
                arr_v[1] = arr_c[0] - 0x30;
                break;
            }
            case 2: {
                arr_v[1] = arr_c[1] - 0x30 + (arr_c[0] - 0x30) * 10;
                break;
            }
            case 3: {
                arr_v[1] = arr_c[0] - 0x30;
                arr_v[2] = arr_c[2] - 0x30 + (arr_c[1] - 0x30) * 10;
                break;
            }
            case 4: {
                arr_v[1] = arr_c[1] - 0x30 + (arr_c[0] - 0x30) * 10;
                arr_v[2] = arr_c[3] - 0x30 + (arr_c[2] - 0x30) * 10;
                break;
            }
            case 5: {
                arr_v[1] = arr_c[0] - 0x30;
                arr_v[2] = arr_c[2] - 0x30 + (arr_c[1] - 0x30) * 10;
                arr_v[3] = arr_c[4] - 0x30 + (arr_c[3] - 0x30) * 10;
                break;
            }
            case 6: {
                arr_v[1] = arr_c[1] - 0x30 + (arr_c[0] - 0x30) * 10;
                arr_v[2] = arr_c[3] - 0x30 + (arr_c[2] - 0x30) * 10;
                arr_v[3] = arr_c[5] - 0x30 + (arr_c[4] - 0x30) * 10;
            }
        }
        arr_v[0] = v2;
    }

    @Override  // j$.time.format.f
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        Long long0 = y0.e(a.OFFSET_SECONDS);
        boolean z = false;
        if(long0 == null) {
            return false;
        }
        int v = j..com.android.tools.r8.a.h(((long)long0));
        String s = this.a;
        if(v == 0) {
            stringBuilder0.append(s);
            return true;
        }
        int v1 = Math.abs(v / 3600 % 100);
        int v2 = Math.abs(v / 60 % 60);
        int v3 = Math.abs(v % 60);
        int v4 = stringBuilder0.length();
        stringBuilder0.append((v >= 0 ? "+" : "-"));
        if(this.b >= 11 && v1 < 10) {
            stringBuilder0.append(((char)(v1 + 0x30)));
        }
        else {
            k.a(false, v1, stringBuilder0);
        }
        int v5 = this.c;
        if(v5 >= 3 && v5 <= 8 || v5 >= 9 && v3 > 0 || v5 >= 1 && v2 > 0) {
            k.a(v5 > 0 && v5 % 2 == 0, v2, stringBuilder0);
            v1 += v2;
            if(v5 == 7 || v5 == 8 || v5 >= 5 && v3 > 0) {
                if(v5 > 0 && v5 % 2 == 0) {
                    z = true;
                }
                k.a(z, v3, stringBuilder0);
                v1 += v3;
            }
        }
        if(v1 == 0) {
            stringBuilder0.setLength(v4);
            stringBuilder0.append(s);
        }
        return true;
    }

    @Override  // j$.time.format.f
    public final int n(w w0, CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        int v2 = this.a.length();
        if(v2 != 0) {
            if(v == v1) {
                return ~v;
            }
            if(w0.s(charSequence0, v, this.a, 0, v2)) {
                return w0.o(a.OFFSET_SECONDS, 0L, v, v + v2);
            }
        }
        else if(v == v1) {
            return w0.o(a.OFFSET_SECONDS, 0L, v, v);
        }
        int v3 = charSequence0.charAt(v);
        if(v3 == 43 || v3 == 45) {
            boolean z = this.c > 0 && this.c % 2 == 0;
            int v4 = this.b;
            boolean z1 = v4 < 11;
            int[] arr_v = new int[4];
            arr_v[0] = v + 1;
            if(!w0.l()) {
                if(!z1) {
                    if(z || v4 == 11 && v1 > v + 3 && (charSequence0.charAt(v + 2) == 58 || charSequence0.charAt(v + 3) == 58)) {
                        v4 = 21;
                        z = true;
                    }
                    else {
                        v4 = 20;
                    }
                }
                else if(!z && (v4 != 0 || v1 <= v + 3 || charSequence0.charAt(v + 3) != 58)) {
                    v4 = 9;
                }
                else {
                    v4 = 10;
                    z = true;
                }
            }
            switch(v4) {
                case 0: 
                case 11: {
                    k.c(charSequence0, z1, arr_v);
                    break;
                }
                case 12: {
                    k.e(charSequence0, 1, 4, arr_v);
                    break;
                }
                case 1: 
                case 2: 
                case 13: {
                    k.c(charSequence0, z1, arr_v);
                    k.d(charSequence0, z, false, arr_v);
                    break;
                }
                case 14: {
                    k.e(charSequence0, 3, 4, arr_v);
                    break;
                }
                case 3: 
                case 4: 
                case 15: {
                    k.c(charSequence0, z1, arr_v);
                    k.d(charSequence0, z, true, arr_v);
                    break;
                }
                case 16: {
                    k.e(charSequence0, 3, 6, arr_v);
                    break;
                }
                case 5: 
                case 6: 
                case 17: {
                    k.c(charSequence0, z1, arr_v);
                    k.d(charSequence0, z, true, arr_v);
                    k.b(charSequence0, z, 3, arr_v);
                    break;
                }
                case 18: {
                    k.e(charSequence0, 5, 6, arr_v);
                    break;
                }
                case 7: 
                case 8: 
                case 19: {
                    k.c(charSequence0, z1, arr_v);
                    k.d(charSequence0, z, true, arr_v);
                    if(!k.b(charSequence0, z, 3, arr_v)) {
                        arr_v[0] = ~arr_v[0];
                    }
                    break;
                }
                case 20: {
                    k.e(charSequence0, 1, 6, arr_v);
                    break;
                }
                case 9: 
                case 10: 
                case 21: {
                    k.c(charSequence0, z1, arr_v);
                    if(k.b(charSequence0, z, 2, arr_v)) {
                        k.b(charSequence0, z, 3, arr_v);
                    }
                }
            }
            int v5 = arr_v[0];
            if(v5 > 0) {
                int v6 = arr_v[1];
                if(v6 <= 23) {
                    int v7 = arr_v[2];
                    if(v7 <= 59) {
                        int v8 = arr_v[3];
                        if(v8 <= 59) {
                            return w0.o(a.OFFSET_SECONDS, (((long)v7) * 60L + ((long)v6) * 3600L + ((long)v8)) * ((long)(v3 == 45 ? -1 : 1)), v, v5);
                        }
                    }
                }
                throw new b("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
        return v2 == 0 ? w0.o(a.OFFSET_SECONDS, 0L, v, v) : ~v;
    }

    @Override
    public final String toString() {
        return "Offset(" + k.d[this.b] + ",\'" + this.a.replace("\'", "\'\'") + "\')";
    }
}

