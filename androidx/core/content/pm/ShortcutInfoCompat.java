package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.UriCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShortcutInfoCompat {
    @RequiresApi(33)
    static class Api33Impl {
        static void a(ShortcutInfo.Builder shortcutInfo$Builder0, int v) {
            shortcutInfo$Builder0.setExcludedFromSurfaces(v);
        }
    }

    public static class Builder {
        private final ShortcutInfoCompat a;
        private boolean b;
        private Set c;
        private Map d;
        private Uri e;

        @RequiresApi(25)
        @RestrictTo({Scope.c})
        public Builder(Context context0, ShortcutInfo shortcutInfo0) {
            ShortcutInfoCompat shortcutInfoCompat0 = new ShortcutInfoCompat();
            this.a = shortcutInfoCompat0;
            shortcutInfoCompat0.a = context0;
            shortcutInfoCompat0.b = shortcutInfo0.getId();
            shortcutInfoCompat0.c = shortcutInfo0.getPackage();
            Intent[] arr_intent = shortcutInfo0.getIntents();
            shortcutInfoCompat0.d = (Intent[])Arrays.copyOf(arr_intent, arr_intent.length);
            shortcutInfoCompat0.e = shortcutInfo0.getActivity();
            shortcutInfoCompat0.f = shortcutInfo0.getShortLabel();
            shortcutInfoCompat0.g = shortcutInfo0.getLongLabel();
            shortcutInfoCompat0.h = shortcutInfo0.getDisabledMessage();
            int v = Build.VERSION.SDK_INT;
            if(v >= 28) {
                shortcutInfoCompat0.A = shortcutInfo0.getDisabledReason();
            }
            else {
                shortcutInfoCompat0.A = shortcutInfo0.isEnabled() ? 0 : 3;
            }
            shortcutInfoCompat0.l = shortcutInfo0.getCategories();
            shortcutInfoCompat0.k = ShortcutInfoCompat.u(shortcutInfo0.getExtras());
            shortcutInfoCompat0.s = shortcutInfo0.getUserHandle();
            shortcutInfoCompat0.r = shortcutInfo0.getLastChangedTimestamp();
            if(v >= 30) {
                shortcutInfoCompat0.t = shortcutInfo0.isCached();
            }
            shortcutInfoCompat0.u = shortcutInfo0.isDynamic();
            shortcutInfoCompat0.v = shortcutInfo0.isPinned();
            shortcutInfoCompat0.w = shortcutInfo0.isDeclaredInManifest();
            shortcutInfoCompat0.x = shortcutInfo0.isImmutable();
            shortcutInfoCompat0.y = shortcutInfo0.isEnabled();
            shortcutInfoCompat0.z = shortcutInfo0.hasKeyFieldsOnly();
            shortcutInfoCompat0.m = ShortcutInfoCompat.p(shortcutInfo0);
            shortcutInfoCompat0.o = shortcutInfo0.getRank();
            shortcutInfoCompat0.p = shortcutInfo0.getExtras();
        }

        public Builder(Context context0, String s) {
            ShortcutInfoCompat shortcutInfoCompat0 = new ShortcutInfoCompat();
            this.a = shortcutInfoCompat0;
            shortcutInfoCompat0.a = context0;
            shortcutInfoCompat0.b = s;
        }

        @RestrictTo({Scope.c})
        public Builder(ShortcutInfoCompat shortcutInfoCompat0) {
            ShortcutInfoCompat shortcutInfoCompat1 = new ShortcutInfoCompat();
            this.a = shortcutInfoCompat1;
            shortcutInfoCompat1.a = shortcutInfoCompat0.a;
            shortcutInfoCompat1.b = shortcutInfoCompat0.b;
            shortcutInfoCompat1.c = shortcutInfoCompat0.c;
            shortcutInfoCompat1.d = (Intent[])Arrays.copyOf(shortcutInfoCompat0.d, shortcutInfoCompat0.d.length);
            shortcutInfoCompat1.e = shortcutInfoCompat0.e;
            shortcutInfoCompat1.f = shortcutInfoCompat0.f;
            shortcutInfoCompat1.g = shortcutInfoCompat0.g;
            shortcutInfoCompat1.h = shortcutInfoCompat0.h;
            shortcutInfoCompat1.A = shortcutInfoCompat0.A;
            shortcutInfoCompat1.i = shortcutInfoCompat0.i;
            shortcutInfoCompat1.j = shortcutInfoCompat0.j;
            shortcutInfoCompat1.s = shortcutInfoCompat0.s;
            shortcutInfoCompat1.r = shortcutInfoCompat0.r;
            shortcutInfoCompat1.t = shortcutInfoCompat0.t;
            shortcutInfoCompat1.u = shortcutInfoCompat0.u;
            shortcutInfoCompat1.v = shortcutInfoCompat0.v;
            shortcutInfoCompat1.w = shortcutInfoCompat0.w;
            shortcutInfoCompat1.x = shortcutInfoCompat0.x;
            shortcutInfoCompat1.y = shortcutInfoCompat0.y;
            shortcutInfoCompat1.m = shortcutInfoCompat0.m;
            shortcutInfoCompat1.n = shortcutInfoCompat0.n;
            shortcutInfoCompat1.z = shortcutInfoCompat0.z;
            shortcutInfoCompat1.o = shortcutInfoCompat0.o;
            Person[] arr_person = shortcutInfoCompat0.k;
            if(arr_person != null) {
                shortcutInfoCompat1.k = (Person[])Arrays.copyOf(arr_person, arr_person.length);
            }
            if(shortcutInfoCompat0.l != null) {
                shortcutInfoCompat1.l = new HashSet(shortcutInfoCompat0.l);
            }
            PersistableBundle persistableBundle0 = shortcutInfoCompat0.p;
            if(persistableBundle0 != null) {
                shortcutInfoCompat1.p = persistableBundle0;
            }
            shortcutInfoCompat1.B = shortcutInfoCompat0.B;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public Builder a(String s) {
            if(this.c == null) {
                this.c = new HashSet();
            }
            this.c.add(s);
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public Builder b(String s, String s1, List list0) {
            this.a(s);
            if(!list0.isEmpty()) {
                if(this.d == null) {
                    this.d = new HashMap();
                }
                if(this.d.get(s) == null) {
                    this.d.put(s, new HashMap());
                }
                ((Map)this.d.get(s)).put(s1, list0);
            }
            return this;
        }

        public ShortcutInfoCompat c() {
            if(TextUtils.isEmpty(this.a.f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            ShortcutInfoCompat shortcutInfoCompat0 = this.a;
            if(shortcutInfoCompat0.d == null || shortcutInfoCompat0.d.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if(this.b) {
                if(shortcutInfoCompat0.m == null) {
                    shortcutInfoCompat0.m = new LocusIdCompat(shortcutInfoCompat0.b);
                }
                this.a.n = true;
            }
            if(this.c != null) {
                ShortcutInfoCompat shortcutInfoCompat1 = this.a;
                if(shortcutInfoCompat1.l == null) {
                    shortcutInfoCompat1.l = new HashSet();
                }
                this.a.l.addAll(this.c);
            }
            if(this.d != null) {
                ShortcutInfoCompat shortcutInfoCompat2 = this.a;
                if(shortcutInfoCompat2.p == null) {
                    shortcutInfoCompat2.p = new PersistableBundle();
                }
                for(Object object0: this.d.keySet()) {
                    String s = (String)object0;
                    Map map0 = (Map)this.d.get(s);
                    Set set0 = map0.keySet();
                    this.a.p.putStringArray(s, ((String[])set0.toArray(new String[0])));
                    for(Object object1: map0.keySet()) {
                        List list0 = (List)map0.get(((String)object1));
                        this.a.p.putStringArray(s + "/" + ((String)object1), (list0 == null ? new String[0] : ((String[])list0.toArray(new String[0]))));
                    }
                }
            }
            if(this.e != null) {
                ShortcutInfoCompat shortcutInfoCompat3 = this.a;
                if(shortcutInfoCompat3.p == null) {
                    shortcutInfoCompat3.p = new PersistableBundle();
                }
                this.a.p.putString("extraSliceUri", UriCompat.a(this.e));
            }
            return this.a;
        }

        public Builder d(ComponentName componentName0) {
            this.a.e = componentName0;
            return this;
        }

        public Builder e() {
            this.a.j = true;
            return this;
        }

        public Builder f(Set set0) {
            ArraySet arraySet0 = new ArraySet();
            arraySet0.addAll(set0);
            this.a.l = arraySet0;
            return this;
        }

        public Builder g(CharSequence charSequence0) {
            this.a.h = charSequence0;
            return this;
        }

        public Builder h(int v) {
            this.a.B = v;
            return this;
        }

        public Builder i(PersistableBundle persistableBundle0) {
            this.a.p = persistableBundle0;
            return this;
        }

        public Builder j(IconCompat iconCompat0) {
            this.a.i = iconCompat0;
            return this;
        }

        public Builder k(Intent intent0) {
            return this.l(new Intent[]{intent0});
        }

        public Builder l(Intent[] arr_intent) {
            this.a.d = arr_intent;
            return this;
        }

        public Builder m() {
            this.b = true;
            return this;
        }

        public Builder n(LocusIdCompat locusIdCompat0) {
            this.a.m = locusIdCompat0;
            return this;
        }

        public Builder o(CharSequence charSequence0) {
            this.a.g = charSequence0;
            return this;
        }

        @Deprecated
        public Builder p() {
            this.a.n = true;
            return this;
        }

        public Builder q(boolean z) {
            this.a.n = z;
            return this;
        }

        public Builder r(Person person0) {
            return this.s(new Person[]{person0});
        }

        public Builder s(Person[] arr_person) {
            this.a.k = arr_person;
            return this;
        }

        public Builder t(int v) {
            this.a.o = v;
            return this;
        }

        public Builder u(CharSequence charSequence0) {
            this.a.f = charSequence0;
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public Builder v(Uri uri0) {
            this.e = uri0;
            return this;
        }

        @RestrictTo({Scope.c})
        public Builder w(Bundle bundle0) {
            this.a.q = (Bundle)Preconditions.l(bundle0);
            return this;
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Surface {
    }

    int A;
    int B;
    private static final String C = "extraPersonCount";
    private static final String D = "extraPerson_";
    private static final String E = "extraLocusId";
    private static final String F = "extraLongLived";
    private static final String G = "extraSliceUri";
    public static final int H = 1;
    Context a;
    String b;
    String c;
    Intent[] d;
    ComponentName e;
    CharSequence f;
    CharSequence g;
    CharSequence h;
    IconCompat i;
    boolean j;
    Person[] k;
    Set l;
    LocusIdCompat m;
    boolean n;
    int o;
    PersistableBundle p;
    Bundle q;
    long r;
    UserHandle s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    ShortcutInfoCompat() {
        this.y = true;
    }

    public boolean A() {
        return this.t;
    }

    public boolean B() {
        return this.w;
    }

    public boolean C() {
        return this.u;
    }

    public boolean D() {
        return this.y;
    }

    public boolean E(int v) {
        return (v & this.B) != 0;
    }

    public boolean F() {
        return this.x;
    }

    public boolean G() {
        return this.v;
    }

    @RequiresApi(25)
    public ShortcutInfo H() {
        ShortcutInfo.Builder shortcutInfo$Builder0 = k.a(this.a, this.b).setShortLabel(this.f).setIntents(this.d);
        IconCompat iconCompat0 = this.i;
        if(iconCompat0 != null) {
            shortcutInfo$Builder0.setIcon(iconCompat0.I(this.a));
        }
        if(!TextUtils.isEmpty(this.g)) {
            shortcutInfo$Builder0.setLongLabel(this.g);
        }
        if(!TextUtils.isEmpty(this.h)) {
            shortcutInfo$Builder0.setDisabledMessage(this.h);
        }
        ComponentName componentName0 = this.e;
        if(componentName0 != null) {
            shortcutInfo$Builder0.setActivity(componentName0);
        }
        Set set0 = this.l;
        if(set0 != null) {
            shortcutInfo$Builder0.setCategories(set0);
        }
        shortcutInfo$Builder0.setRank(this.o);
        PersistableBundle persistableBundle0 = this.p;
        if(persistableBundle0 != null) {
            shortcutInfo$Builder0.setExtras(persistableBundle0);
        }
        if(Build.VERSION.SDK_INT >= 29) {
            Person[] arr_person = this.k;
            if(arr_person != null && arr_person.length > 0) {
                android.app.Person[] arr_person1 = new android.app.Person[arr_person.length];
                for(int v = 0; v < arr_person.length; ++v) {
                    arr_person1[v] = this.k[v].k();
                }
                shortcutInfo$Builder0.setPersons(arr_person1);
            }
            LocusIdCompat locusIdCompat0 = this.m;
            if(locusIdCompat0 != null) {
                shortcutInfo$Builder0.setLocusId(locusIdCompat0.c());
            }
            shortcutInfo$Builder0.setLongLived(this.n);
        }
        else {
            shortcutInfo$Builder0.setExtras(this.b());
        }
        if(Build.VERSION.SDK_INT >= 33) {
            Api33Impl.a(shortcutInfo$Builder0, this.B);
        }
        return shortcutInfo$Builder0.build();
    }

    Intent a(Intent intent0) {
        Drawable drawable0 = null;
        intent0.putExtra("android.intent.extra.shortcut.INTENT", this.d[this.d.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f.toString());
        if(this.i != null) {
            if(this.j) {
                PackageManager packageManager0 = this.a.getPackageManager();
                ComponentName componentName0 = this.e;
                if(componentName0 != null) {
                    try {
                        drawable0 = packageManager0.getActivityIcon(componentName0);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                }
                if(drawable0 == null) {
                    drawable0 = this.a.getApplicationInfo().loadIcon(packageManager0);
                }
            }
            this.i.c(intent0, drawable0, this.a);
        }
        return intent0;
    }

    @RequiresApi(22)
    @RestrictTo({Scope.c})
    private PersistableBundle b() {
        if(this.p == null) {
            this.p = new PersistableBundle();
        }
        Person[] arr_person = this.k;
        if(arr_person != null && arr_person.length > 0) {
            this.p.putInt("extraPersonCount", arr_person.length);
            for(int v = 0; v < this.k.length; ++v) {
                this.p.putPersistableBundle("extraPerson_" + (v + 1), this.k[v].n());
            }
        }
        LocusIdCompat locusIdCompat0 = this.m;
        if(locusIdCompat0 != null) {
            this.p.putString("extraLocusId", locusIdCompat0.a());
        }
        this.p.putBoolean("extraLongLived", this.n);
        return this.p;
    }

    @RequiresApi(25)
    @RestrictTo({Scope.c})
    static List c(Context context0, List list0) {
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            list1.add(new Builder(context0, ((ShortcutInfo)object0)).c());
        }
        return list1;
    }

    public ComponentName d() {
        return this.e;
    }

    public Set e() {
        return this.l;
    }

    public CharSequence f() {
        return this.h;
    }

    public int g() {
        return this.A;
    }

    public int h() {
        return this.B;
    }

    public PersistableBundle i() {
        return this.p;
    }

    @RestrictTo({Scope.c})
    public IconCompat j() {
        return this.i;
    }

    public String k() {
        return this.b;
    }

    public Intent l() {
        return this.d[this.d.length - 1];
    }

    public Intent[] m() {
        return (Intent[])Arrays.copyOf(this.d, this.d.length);
    }

    public long n() {
        return this.r;
    }

    public LocusIdCompat o() {
        return this.m;
    }

    @RequiresApi(25)
    static LocusIdCompat p(ShortcutInfo shortcutInfo0) {
        if(Build.VERSION.SDK_INT >= 29) {
            return shortcutInfo0.getLocusId() == null ? null : LocusIdCompat.d(shortcutInfo0.getLocusId());
        }
        return ShortcutInfoCompat.q(shortcutInfo0.getExtras());
    }

    @RequiresApi(25)
    @RestrictTo({Scope.c})
    private static LocusIdCompat q(PersistableBundle persistableBundle0) {
        if(persistableBundle0 == null) {
            return null;
        }
        String s = persistableBundle0.getString("extraLocusId");
        return s == null ? null : new LocusIdCompat(s);
    }

    public CharSequence r() {
        return this.g;
    }

    @RequiresApi(25)
    @RestrictTo({Scope.c})
    @VisibleForTesting
    static boolean s(PersistableBundle persistableBundle0) {
        return persistableBundle0 == null || !persistableBundle0.containsKey("extraLongLived") ? false : persistableBundle0.getBoolean("extraLongLived");
    }

    public String t() {
        return this.c;
    }

    @RequiresApi(25)
    @RestrictTo({Scope.c})
    @VisibleForTesting
    static Person[] u(PersistableBundle persistableBundle0) {
        if(persistableBundle0 != null && persistableBundle0.containsKey("extraPersonCount")) {
            int v = persistableBundle0.getInt("extraPersonCount");
            Person[] arr_person = new Person[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_person[v1] = Person.c(persistableBundle0.getPersistableBundle("extraPerson_" + (v1 + 1)));
            }
            return arr_person;
        }
        return null;
    }

    public int v() {
        return this.o;
    }

    public CharSequence w() {
        return this.f;
    }

    @RestrictTo({Scope.c})
    public Bundle x() {
        return this.q;
    }

    public UserHandle y() {
        return this.s;
    }

    public boolean z() {
        return this.z;
    }
}

