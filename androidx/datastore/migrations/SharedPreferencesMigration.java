package androidx.datastore.migrations;

import A3.a;
import A3.o;
import A3.p;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;
import z3.n;

public final class SharedPreferencesMigration implements DataMigration {
    @RequiresApi(24)
    static final class Api24Impl {
        @l
        public static final Api24Impl a;

        static {
            Api24Impl.a = new Api24Impl();
        }

        @DoNotInline
        @n
        public static final boolean a(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "name");
            return context0.deleteSharedPreferences(s);
        }
    }

    @l
    private final o a;
    @l
    private final p b;
    @m
    private final Context c;
    @m
    private final String d;
    @l
    private final D e;
    @m
    private final Set f;

    static {
    }

    @j
    public SharedPreferencesMigration(@l a a0, @l p p0) {
        L.p(a0, "produceSharedPreferences");
        L.p(p0, "migrate");
        this(a0, null, null, p0, 6, null);
    }

    @j
    public SharedPreferencesMigration(@l a a0, @l Set set0, @l o o0, @l p p0) {
        L.p(a0, "produceSharedPreferences");
        L.p(set0, "keysToMigrate");
        L.p(o0, "shouldRunMigration");
        L.p(p0, "migrate");
        this(a0, set0, o0, p0, null, null);
    }

    public SharedPreferencesMigration(a a0, Set set0, o o0, p p0, int v, w w0) {
        if((v & 2) != 0) {
            set0 = SharedPreferencesMigrationKt.a();
        }
        if((v & 4) != 0) {
            o0 = new o() {
                int k;

                {
                    super(2, d0);
                }

                @m
                public final Object a(Object object0, @m d d0) {
                    return ((androidx.datastore.migrations.SharedPreferencesMigration.2)this.create(object0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.datastore.migrations.SharedPreferencesMigration.2(d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(object0, ((d)object1));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    return b.a(true);
                }
            };
        }
        this(a0, set0, o0, p0);
    }

    private SharedPreferencesMigration(a a0, Set set0, o o0, p p0, Context context0, String s) {
        this.a = o0;
        this.b = p0;
        this.c = context0;
        this.d = s;
        this.e = E.a(a0);
        this.f = set0 == SharedPreferencesMigrationKt.a() ? null : u.Z5(set0);
    }

    SharedPreferencesMigration(a a0, Set set0, o o0, p p0, Context context0, String s, int v, w w0) {
        if((v & 4) != 0) {
            o0 = new o() {
                int k;

                {
                    super(2, d0);
                }

                @m
                public final Object a(Object object0, @m d d0) {
                    return ((androidx.datastore.migrations.SharedPreferencesMigration.1)this.create(object0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.datastore.migrations.SharedPreferencesMigration.1(d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(object0, ((d)object1));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    return b.a(true);
                }
            };
        }
        this(a0, set0, o0, p0, context0, s);
    }

    @j
    public SharedPreferencesMigration(@l a a0, @l Set set0, @l p p0) {
        L.p(a0, "produceSharedPreferences");
        L.p(set0, "keysToMigrate");
        L.p(p0, "migrate");
        this(a0, set0, null, p0, 4, null);
    }

    @j
    public SharedPreferencesMigration(@l Context context0, @l String s, @l p p0) {
        L.p(context0, "context");
        L.p(s, "sharedPreferencesName");
        L.p(p0, "migrate");
        this(context0, s, null, null, p0, 12, null);
    }

    @j
    public SharedPreferencesMigration(@l Context context0, @l String s, @l Set set0, @l o o0, @l p p0) {
        L.p(context0, "context");
        L.p(s, "sharedPreferencesName");
        L.p(set0, "keysToMigrate");
        L.p(o0, "shouldRunMigration");
        L.p(p0, "migrate");
        this(new a(s) {
            final Context e;
            final String f;

            {
                this.e = context0;
                this.f = s;
                super(0);
            }

            @l
            public final SharedPreferences b() {
                SharedPreferences sharedPreferences0 = this.e.getSharedPreferences(this.f, 0);
                L.o(sharedPreferences0, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
                return sharedPreferences0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }, set0, o0, p0, context0, s);
    }

    public SharedPreferencesMigration(Context context0, String s, Set set0, o o0, p p0, int v, w w0) {
        if((v & 4) != 0) {
            set0 = SharedPreferencesMigrationKt.a();
        }
        if((v & 8) != 0) {
            o0 = new o() {
                int k;

                {
                    super(2, d0);
                }

                @m
                public final Object a(Object object0, @m d d0) {
                    return ((androidx.datastore.migrations.SharedPreferencesMigration.3)this.create(object0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.datastore.migrations.SharedPreferencesMigration.3(d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(object0, ((d)object1));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    return b.a(true);
                }
            };
        }
        this(context0, s, set0, o0, p0);
    }

    @j
    public SharedPreferencesMigration(@l Context context0, @l String s, @l Set set0, @l p p0) {
        L.p(context0, "context");
        L.p(s, "sharedPreferencesName");
        L.p(set0, "keysToMigrate");
        L.p(p0, "migrate");
        this(context0, s, set0, null, p0, 8, null);
    }

    private final void a(Context context0, String s) {
        if(Build.VERSION.SDK_INT < 24) {
            File file0 = this.d(context0, s);
            File file1 = this.c(file0);
            file0.delete();
            file1.delete();
        }
        else if(!Api24Impl.a(context0, s)) {
            throw new IOException("Unable to delete SharedPreferences: " + s);
        }
    }

    private final SharedPreferences b() {
        return (SharedPreferences)this.e.getValue();
    }

    private final File c(File file0) {
        return new File(L.C(file0.getPath(), ".bak"));
    }

    @Override  // androidx.datastore.core.DataMigration
    @m
    public Object cleanUp(@l d d0) throws IOException {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.b().edit();
        Set set0 = this.f;
        if(set0 == null) {
            sharedPreferences$Editor0.clear();
        }
        else {
            for(Object object0: set0) {
                sharedPreferences$Editor0.remove(((String)object0));
            }
        }
        if(!sharedPreferences$Editor0.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if(this.b().getAll().isEmpty()) {
            Context context0 = this.c;
            if(context0 != null) {
                String s = this.d;
                if(s != null) {
                    this.a(context0, s);
                }
            }
        }
        Set set1 = this.f;
        if(set1 == null) {
            return null == kotlin.coroutines.intrinsics.b.l() ? null : S0.a;
        }
        set1.clear();
        return S0.a == kotlin.coroutines.intrinsics.b.l() ? S0.a : S0.a;
    }

    private final File d(Context context0, String s) {
        return new File(new File(context0.getApplicationInfo().dataDir, "shared_prefs"), s + ".xml");
    }

    @Override  // androidx.datastore.core.DataMigration
    @m
    public Object migrate(Object object0, @l d d0) {
        SharedPreferencesView sharedPreferencesView0 = new SharedPreferencesView(this.b(), this.f);
        return this.b.invoke(sharedPreferencesView0, object0, d0);
    }

    @Override  // androidx.datastore.core.DataMigration
    @m
    public Object shouldMigrate(Object object0, @l d d0) {
        SharedPreferencesMigration sharedPreferencesMigration0;
        androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate.1 sharedPreferencesMigration$shouldMigrate$10;
        if(d0 instanceof androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate.1) {
            sharedPreferencesMigration$shouldMigrate$10 = (androidx.datastore.migrations.SharedPreferencesMigration.shouldMigrate.1)d0;
            int v = sharedPreferencesMigration$shouldMigrate$10.n;
            if((v & 0x80000000) == 0) {
                sharedPreferencesMigration$shouldMigrate$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.shouldMigrate(null, this);
                    }
                };
            }
            else {
                sharedPreferencesMigration$shouldMigrate$10.n = v ^ 0x80000000;
            }
        }
        else {
            sharedPreferencesMigration$shouldMigrate$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.shouldMigrate(null, this);
                }
            };
        }
        Object object1 = sharedPreferencesMigration$shouldMigrate$10.l;
        Object object2 = kotlin.coroutines.intrinsics.b.l();
        switch(sharedPreferencesMigration$shouldMigrate$10.n) {
            case 0: {
                f0.n(object1);
                sharedPreferencesMigration$shouldMigrate$10.k = this;
                sharedPreferencesMigration$shouldMigrate$10.n = 1;
                object1 = this.a.invoke(object0, sharedPreferencesMigration$shouldMigrate$10);
                if(object1 == object2) {
                    return object2;
                }
                sharedPreferencesMigration0 = this;
                break;
            }
            case 1: {
                sharedPreferencesMigration0 = (SharedPreferencesMigration)sharedPreferencesMigration$shouldMigrate$10.k;
                f0.n(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!((Boolean)object1).booleanValue()) {
            return b.a(false);
        }
        Set set0 = sharedPreferencesMigration0.f;
        if(set0 == null) {
            Map map0 = sharedPreferencesMigration0.b().getAll();
            L.o(map0, "sharedPrefs.all");
            return map0.isEmpty() ? b.a(false) : b.a(true);
        }
        SharedPreferences sharedPreferences0 = sharedPreferencesMigration0.b();
        if(!(set0 instanceof Collection) || !set0.isEmpty()) {
            for(Object object3: set0) {
                if(b.a(sharedPreferences0.contains(((String)object3))).booleanValue()) {
                    return b.a(true);
                }
                if(false) {
                    break;
                }
            }
        }
        return b.a(false);
    }
}

