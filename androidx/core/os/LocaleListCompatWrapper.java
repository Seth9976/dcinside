package androidx.core.os;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

final class LocaleListCompatWrapper implements LocaleListInterface {
    @RequiresApi(21)
    static class Api21Impl {
        static String a(Locale locale0) {
            return locale0.getScript();
        }
    }

    private final Locale[] a;
    private final String b;
    private static final Locale[] c;
    private static final Locale d;
    private static final Locale e;
    private static final Locale f;

    static {
        LocaleListCompatWrapper.c = new Locale[0];
        LocaleListCompatWrapper.d = new Locale("en", "XA");
        LocaleListCompatWrapper.e = new Locale("ar", "XB");
        LocaleListCompatWrapper.f = LocaleListCompat.b("en-Latn");
    }

    LocaleListCompatWrapper(Locale[] arr_locale) {
        if(arr_locale.length == 0) {
            this.a = LocaleListCompatWrapper.c;
            this.b = "";
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_locale.length; ++v) {
            Locale locale0 = arr_locale[v];
            if(locale0 == null) {
                throw new NullPointerException("list[" + v + "] is null");
            }
            if(!hashSet0.contains(locale0)) {
                Locale locale1 = (Locale)locale0.clone();
                arrayList0.add(locale1);
                LocaleListCompatWrapper.j(stringBuilder0, locale1);
                if(v < arr_locale.length - 1) {
                    stringBuilder0.append(',');
                }
                hashSet0.add(locale1);
            }
        }
        this.a = (Locale[])arrayList0.toArray(new Locale[0]);
        this.b = stringBuilder0.toString();
    }

    @Override  // androidx.core.os.LocaleListInterface
    public String a() {
        return this.b;
    }

    @Override  // androidx.core.os.LocaleListInterface
    public Locale b(String[] arr_s) {
        return this.d(Arrays.asList(arr_s), false);
    }

    @Override  // androidx.core.os.LocaleListInterface
    public int c(Locale locale0) {
        for(int v = 0; true; ++v) {
            Locale[] arr_locale = this.a;
            if(v >= arr_locale.length) {
                break;
            }
            if(arr_locale[v].equals(locale0)) {
                return v;
            }
        }
        return -1;
    }

    private Locale d(Collection collection0, boolean z) {
        int v = this.e(collection0, z);
        return v == -1 ? null : this.a[v];
    }

    private int e(Collection collection0, boolean z) {
        int v;
        Locale[] arr_locale = this.a;
        if(arr_locale.length == 1) {
            return 0;
        }
        if(arr_locale.length == 0) {
            return -1;
        }
        if(z) {
            v = this.f(LocaleListCompatWrapper.f);
            if(v == 0) {
                return 0;
            }
            if(v >= 0x7FFFFFFF) {
                v = 0x7FFFFFFF;
            }
        }
        else {
            v = 0x7FFFFFFF;
        }
        for(Object object0: collection0) {
            int v1 = this.f(LocaleListCompat.b(((String)object0)));
            if(v1 == 0) {
                return 0;
            }
            if(v1 < v) {
                v = v1;
            }
        }
        return v == 0x7FFFFFFF ? 0 : v;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof LocaleListCompatWrapper)) {
            return false;
        }
        Locale[] arr_locale = ((LocaleListCompatWrapper)object0).a;
        if(this.a.length != arr_locale.length) {
            return false;
        }
        for(int v = 0; true; ++v) {
            Locale[] arr_locale1 = this.a;
            if(v >= arr_locale1.length) {
                break;
            }
            if(!arr_locale1[v].equals(arr_locale[v])) {
                return false;
            }
        }
        return true;
    }

    private int f(Locale locale0) {
        for(int v = 0; true; ++v) {
            Locale[] arr_locale = this.a;
            if(v >= arr_locale.length) {
                break;
            }
            if(LocaleListCompatWrapper.i(locale0, arr_locale[v]) > 0) {
                return v;
            }
        }
        return 0x7FFFFFFF;
    }

    private static String g(Locale locale0) {
        String s = Api21Impl.a(locale0);
        return s.isEmpty() ? "" : s;
    }

    @Override  // androidx.core.os.LocaleListInterface
    public Locale get(int v) {
        if(v >= 0) {
            return v >= this.a.length ? null : this.a[v];
        }
        return null;
    }

    @Override  // androidx.core.os.LocaleListInterface
    public Object getLocaleList() {
        return null;
    }

    // 去混淆评级： 低(20)
    private static boolean h(Locale locale0) {
        return LocaleListCompatWrapper.d.equals(locale0) || LocaleListCompatWrapper.e.equals(locale0);
    }

    @Override
    public int hashCode() {
        Locale[] arr_locale = this.a;
        int v = 1;
        for(int v1 = 0; v1 < arr_locale.length; ++v1) {
            v = v * 0x1F + arr_locale[v1].hashCode();
        }
        return v;
    }

    @IntRange(from = 0L, to = 1L)
    private static int i(Locale locale0, Locale locale1) {
        if(locale0.equals(locale1)) {
            return 1;
        }
        if(!locale0.getLanguage().equals(locale1.getLanguage())) {
            return 0;
        }
        if(!LocaleListCompatWrapper.h(locale0) && !LocaleListCompatWrapper.h(locale1)) {
            String s = LocaleListCompatWrapper.g(locale0);
            if(s.isEmpty()) {
                String s1 = locale0.getCountry();
                return s1.isEmpty() || s1.equals(locale1.getCountry()) ? 1 : 0;
            }
            return s.equals(LocaleListCompatWrapper.g(locale1));
        }
        return 0;
    }

    @Override  // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @VisibleForTesting
    static void j(StringBuilder stringBuilder0, Locale locale0) {
        stringBuilder0.append(locale0.getLanguage());
        String s = locale0.getCountry();
        if(s != null && !s.isEmpty()) {
            stringBuilder0.append('-');
            stringBuilder0.append(locale0.getCountry());
        }
    }

    @Override  // androidx.core.os.LocaleListInterface
    public int size() {
        return this.a.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        for(int v = 0; true; ++v) {
            Locale[] arr_locale = this.a;
            if(v >= arr_locale.length) {
                break;
            }
            stringBuilder0.append(arr_locale[v]);
            if(v < this.a.length - 1) {
                stringBuilder0.append(',');
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

