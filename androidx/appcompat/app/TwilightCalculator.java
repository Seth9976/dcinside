package androidx.appcompat.app;

class TwilightCalculator {
    public long a;
    public long b;
    public int c;
    private static TwilightCalculator d = null;
    public static final int e = 0;
    public static final int f = 1;
    private static final float g = 0.017453f;
    private static final float h = 0.0009f;
    private static final float i = -0.10472f;
    private static final float j = 0.03342f;
    private static final float k = 0.000349f;
    private static final float l = 0.000005f;
    private static final float m = 0.40928f;
    private static final long n = 946728000000L;

    public void a(long v, double f, double f1) {
        float f2 = ((float)(v - 946728000000L)) / 86400000.0f;
        float f3 = 0.017202f * f2 + 6.24006f;
        double f4 = Math.sin(f3) * 0.03342 + ((double)f3) + Math.sin(2.0f * f3) * 0.000349 + Math.sin(f3 * 3.0f) * 0.000005 + 4.938186;
        double f5 = ((double)(((float)Math.round(((double)(f2 - 0.0009f)) - -f1 / 360.0)) + 0.0009f)) + -f1 / 360.0 + Math.sin(f3) * 0.0053 + Math.sin(2.0 * f4) * -0.0069;
        double f6 = Math.asin(Math.sin(f4) * 0.397949);
        double f7 = (-0.104528 - Math.sin(0.017453 * f) * Math.sin(f6)) / (Math.cos(0.017453 * f) * Math.cos(f6));
        if(f7 >= 1.0) {
            this.c = 1;
            this.a = -1L;
            this.b = -1L;
            return;
        }
        if(f7 <= -1.0) {
            this.c = 0;
            this.a = -1L;
            this.b = -1L;
            return;
        }
        double f8 = (double)(((float)(Math.acos(f7) / 6.283185)));
        this.a = Math.round((f5 + f8) * 86400000.0) + 946728000000L;
        long v1 = Math.round((f5 - f8) * 86400000.0);
        this.b = v1 + 946728000000L;
        if(v1 + 946728000000L < v && this.a > v) {
            this.c = 0;
            return;
        }
        this.c = 1;
    }

    static TwilightCalculator b() {
        if(TwilightCalculator.d == null) {
            TwilightCalculator.d = new TwilightCalculator();
        }
        return TwilightCalculator.d;
    }
}

