package j$.time.format;

import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalDateTime;
import j..time.LocalTime;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.ZonedDateTime;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.a;
import j..time.temporal.m;
import j..time.zone.f;
import j..time.zone.j;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

final class u extends t {
    private final G e;
    private final boolean f;
    private final HashMap g;
    private final HashMap h;
    private static final ConcurrentHashMap i;

    static {
        u.i = new ConcurrentHashMap();
    }

    u(G g0, boolean z) {
        super(m.k(), "ZoneText(" + g0 + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        this.e = (G)Objects.requireNonNull(g0, "textStyle");
        this.f = z;
    }

    @Override  // j$.time.format.t
    protected final n a(w w0) {
        n n0;
        G g0 = this.e;
        if(g0 == G.NARROW) {
            return super.a(w0);
        }
        Locale locale0 = w0.i();
        Set set0 = j.a();
        int v = set0.size();
        HashMap hashMap0 = w0.k() ? this.g : this.h;
        Map.Entry map$Entry0 = (Map.Entry)hashMap0.get(locale0);
        if(map$Entry0 == null || ((int)(((Integer)map$Entry0.getKey()))) != v) {
        label_11:
            n0 = n.f(w0);
            String[][] arr2_s = DateFormatSymbols.getInstance(locale0).getZoneStrings();
            for(int v1 = 0; true; ++v1) {
                int v2 = 1;
                if(v1 >= arr2_s.length) {
                    break;
                }
                String[] arr_s = arr2_s[v1];
                String s = arr_s[0];
                if(set0.contains(s)) {
                    n0.a(s, s);
                    String s1 = H.a(s, locale0);
                    if(g0 != G.FULL) {
                        v2 = 2;
                    }
                    while(v2 < arr_s.length) {
                        n0.a(arr_s[v2], s1);
                        v2 += 2;
                    }
                }
            }
            hashMap0.put(locale0, new AbstractMap.SimpleImmutableEntry(v, new SoftReference(n0)));
        }
        else {
            n0 = (n)((SoftReference)map$Entry0.getValue()).get();
            if(n0 == null) {
                goto label_11;
            }
        }
        return n0;
    }

    @Override  // j$.time.format.t
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        String[] arr_s;
        boolean z;
        ZoneId zoneId0 = (ZoneId)y0.f(m.l());
        if(zoneId0 == null) {
            return false;
        }
        String s = zoneId0.k();
        if(!(zoneId0 instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor0 = y0.d();
            if(this.f) {
                z = false;
            }
            else if(temporalAccessor0.e(a.INSTANT_SECONDS)) {
                z = zoneId0.Q().h(Instant.from(temporalAccessor0));
            }
            else {
                a a0 = a.EPOCH_DAY;
                if(temporalAccessor0.e(a0)) {
                    a a1 = a.NANO_OF_DAY;
                    if(temporalAccessor0.e(a1)) {
                        LocalDate localDate0 = LocalDate.ofEpochDay(temporalAccessor0.u(a0));
                        LocalTime localTime0 = LocalTime.Z(temporalAccessor0.u(a1));
                        localDate0.getClass();
                        LocalDateTime localDateTime0 = LocalDateTime.Z(localDate0, localTime0);
                        if(zoneId0.Q().f(localDateTime0) == null) {
                            f f0 = zoneId0.Q();
                            ZonedDateTime zonedDateTime0 = localDateTime0.atZone(zoneId0);
                            zonedDateTime0.getClass();
                            z = f0.h(Instant.ofEpochSecond(zonedDateTime0.P(), zonedDateTime0.toLocalTime().V()));
                        }
                        else {
                            z = false;
                        }
                    }
                    else {
                        z = false;
                    }
                }
                else {
                    z = false;
                }
            }
            Locale locale0 = y0.c();
            Map map0 = null;
            G g0 = this.e;
            if(g0 != G.NARROW) {
                ConcurrentHashMap concurrentHashMap0 = u.i;
                SoftReference softReference0 = (SoftReference)concurrentHashMap0.get(s);
                if(softReference0 == null) {
                label_42:
                    TimeZone timeZone0 = TimeZone.getTimeZone(s);
                    String[] arr_s1 = {s, timeZone0.getDisplayName(false, 1, locale0), timeZone0.getDisplayName(false, 0, locale0), timeZone0.getDisplayName(true, 1, locale0), timeZone0.getDisplayName(true, 0, locale0), s, s};
                    if(map0 == null) {
                        map0 = new ConcurrentHashMap();
                    }
                    map0.put(locale0, arr_s1);
                    concurrentHashMap0.put(s, new SoftReference(map0));
                    arr_s = arr_s1;
                }
                else {
                    map0 = (Map)softReference0.get();
                    if(map0 == null) {
                        goto label_42;
                    }
                    else {
                        arr_s = (String[])map0.get(locale0);
                        if(arr_s == null) {
                            goto label_42;
                        }
                    }
                }
                switch(z) {
                    case 0: {
                        map0 = arr_s[g0.l() + 1];
                        break;
                    }
                    case 1: {
                        map0 = arr_s[g0.l() + 3];
                        break;
                    }
                    default: {
                        map0 = arr_s[g0.l() + 5];
                    }
                }
            }
            if(map0 != null) {
                s = map0;
            }
        }
        stringBuilder0.append(s);
        return true;
    }
}

