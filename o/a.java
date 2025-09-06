package O;

import kotlin.jvm.internal.L;
import y4.l;

public final class a {
    @l
    public static final a a = null;
    @l
    public static final String b = "ads_device";
    public static final int c;

    static {
        a.a = new a();
    }

    @l
    public final String a() {
        String s = com.coupang.ads.a.o.b().m().getSharedPreferences("ads_device", 0).getString("adId", "");
        L.m(s);
        L.o(s, "sp.getString(\"adId\", \"\")!!");
        return s;
    }

    public final void b(@l String s) {
        L.p(s, "value");
        com.coupang.ads.a.o.b().m().getSharedPreferences("ads_device", 0).edit().putString("adId", s).apply();
    }
}

