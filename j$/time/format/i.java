package j$.time.format;

import j..time.temporal.a;

final class i implements f {
    public final int a;
    private final Object b;

    public i(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    private static void a(StringBuilder stringBuilder0, int v) {
        stringBuilder0.append(((char)(v / 10 + 0x30)));
        stringBuilder0.append(((char)(v % 10 + 0x30)));
    }

    static int b(CharSequence charSequence0, int v) {
        int v1 = charSequence0.charAt(v);
        return v1 < 0x30 || v1 > 57 ? -1 : v1 - 0x30;
    }

    @Override  // j$.time.format.f
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        if(this.a != 0) {
            stringBuilder0.append(((String)this.b));
            return true;
        }
        Long long0 = y0.e(a.OFFSET_SECONDS);
        if(long0 == null) {
            return false;
        }
        stringBuilder0.append("GMT");
        int v = j..com.android.tools.r8.a.h(((long)long0));
        if(v != 0) {
            int v1 = Math.abs(v / 3600 % 100);
            int v2 = Math.abs(v / 60 % 60);
            int v3 = Math.abs(v % 60);
            stringBuilder0.append((v >= 0 ? "+" : "-"));
            if(((G)this.b) == G.FULL) {
                i.a(stringBuilder0, v1);
                stringBuilder0.append(':');
                i.a(stringBuilder0, v2);
                if(v3 != 0) {
                    stringBuilder0.append(':');
                    i.a(stringBuilder0, v3);
                    return true;
                }
            }
            else {
                if(v1 >= 10) {
                    stringBuilder0.append(((char)(v1 / 10 + 0x30)));
                }
                stringBuilder0.append(((char)(v1 % 10 + 0x30)));
                if(v2 != 0 || v3 != 0) {
                    stringBuilder0.append(':');
                    i.a(stringBuilder0, v2);
                    if(v3 != 0) {
                        stringBuilder0.append(':');
                        i.a(stringBuilder0, v3);
                    }
                }
            }
        }
        return true;
    }

    @Override  // j$.time.format.f
    public final int n(w w0, CharSequence charSequence0, int v) {
        int v3;
        if(this.a != 0) {
            if(v > charSequence0.length() || v < 0) {
                throw new IndexOutOfBoundsException();
            }
            String s = (String)this.b;
            return w0.s(charSequence0, v, s, 0, s.length()) ? s.length() + v : ~v;
        }
        int v1 = charSequence0.length();
        if(w0.s(charSequence0, v, "GMT", 0, 3)) {
            if(v + 3 == v1) {
                return w0.o(a.OFFSET_SECONDS, 0L, v, v + 3);
            }
            int v2 = charSequence0.charAt(v + 3);
            if(v2 == 43) {
                v3 = 1;
            }
            else {
                if(v2 != 45) {
                    return w0.o(a.OFFSET_SECONDS, 0L, v, v + 3);
                }
                v3 = -1;
            }
            int v4 = 0;
            if(((G)this.b) == G.FULL) {
                int v5 = i.b(charSequence0, v + 4);
                int v6 = i.b(charSequence0, v + 5);
                if(v5 >= 0 && v6 >= 0 && charSequence0.charAt(v + 6) == 58) {
                    int v7 = i.b(charSequence0, v + 7);
                    int v8 = v + 9;
                    int v9 = i.b(charSequence0, v + 8);
                    if(v7 >= 0 && v9 >= 0) {
                        if(v + 11 < v1 && charSequence0.charAt(v8) == 58) {
                            int v10 = i.b(charSequence0, v + 10);
                            int v11 = i.b(charSequence0, v + 11);
                            if(v10 >= 0 && v11 >= 0) {
                                v4 = v10 * 10 + v11;
                                v8 = v + 12;
                            }
                        }
                        return w0.o(a.OFFSET_SECONDS, (((long)(v7 * 10 + v9)) * 60L + ((long)(v5 * 10 + v6)) * 3600L + ((long)v4)) * ((long)v3), v, v8);
                    }
                }
            }
            else {
                int v12 = v + 5;
                int v13 = i.b(charSequence0, v + 4);
                if(v13 >= 0) {
                    if(v12 < v1) {
                        int v14 = i.b(charSequence0, v12);
                        if(v14 >= 0) {
                            v13 = v13 * 10 + v14;
                            v12 = v + 6;
                        }
                        if(v12 + 2 < v1 && charSequence0.charAt(v12) == 58 && v12 + 2 < v1 && charSequence0.charAt(v12) == 58) {
                            int v15 = i.b(charSequence0, v12 + 1);
                            int v16 = i.b(charSequence0, v12 + 2);
                            if(v15 >= 0 && v16 >= 0) {
                                int v17 = v15 * 10 + v16;
                                if(v12 + 5 < v1 && charSequence0.charAt(v12 + 3) == 58) {
                                    int v18 = i.b(charSequence0, v12 + 4);
                                    int v19 = i.b(charSequence0, v12 + 5);
                                    return v18 < 0 || v19 < 0 ? w0.o(a.OFFSET_SECONDS, (((long)v17) * 60L + ((long)v13) * 3600L) * ((long)v3), v, v12 + 3) : w0.o(a.OFFSET_SECONDS, (((long)v17) * 60L + ((long)v13) * 3600L + ((long)(v18 * 10 + v19))) * ((long)v3), v, v12 + 6);
                                }
                                return w0.o(a.OFFSET_SECONDS, (((long)v17) * 60L + ((long)v13) * 3600L) * ((long)v3), v, v12 + 3);
                            }
                        }
                    }
                    return w0.o(a.OFFSET_SECONDS, ((long)v13) * 3600L * ((long)v3), v, v12);
                }
            }
        }
        return ~v;
    }

    @Override
    public final String toString() {
        return this.a == 0 ? "LocalizedOffset(" + ((G)this.b) + ")" : "\'" + ((String)this.b).replace("\'", "\'\'") + "\'";
    }
}

