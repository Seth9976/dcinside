package kotlinx.serialization.json.internal;

import y4.l;

public final class b {
    public static final byte A = 10;
    public static final byte B = 0x7F;
    private static final int C = 0x7E;
    private static final int D = 0x75;
    public static final int E = 0x20;
    @l
    public static final String a = "Use \'isLenient = true\' in \'Json {}` builder to accept non-compliant JSON.";
    @l
    public static final String b = "Use \'coerceInputValues = true\' in \'Json {}` builder to coerce nulls to default values.";
    @l
    public static final String c = "It is possible to deserialize them using \'JsonBuilder.allowSpecialFloatingPointValues = true\'";
    @l
    public static final String d = "Use \'ignoreUnknownKeys = true\' in \'Json {}\' builder to ignore unknown keys.";
    @l
    public static final String e = "Use \'allowStructuredMapKeys = true\' in \'Json {}\' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
    @l
    public static final String f = "null";
    public static final char g = ',';
    public static final char h = ':';
    public static final char i = '{';
    public static final char j = '}';
    public static final char k = '[';
    public static final char l = ']';
    public static final char m = '\"';
    public static final char n = '\\';
    public static final char o = '\u0000';
    public static final char p = 'u';
    public static final byte q = 0;
    public static final byte r = 1;
    public static final byte s = 2;
    public static final byte t = 3;
    public static final byte u = 4;
    public static final byte v = 5;
    public static final byte w = 6;
    public static final byte x = 7;
    public static final byte y = 8;
    public static final byte z = 9;

    public static final byte a(char c) {
        return c >= 0x7E ? 0 : kotlinx.serialization.json.internal.l.c[c];
    }

    public static final char b(int v) {
        return v >= 0x75 ? '\u0000' : kotlinx.serialization.json.internal.l.b[v];
    }
}

