package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AppInitializer {
    @NonNull
    final Map a;
    @NonNull
    final Set b;
    @NonNull
    final Context c;
    private static final String d = "Startup";
    private static volatile AppInitializer e;
    private static final Object f;

    static {
        AppInitializer.f = new Object();
    }

    AppInitializer(@NonNull Context context0) {
        this.c = context0.getApplicationContext();
        this.b = new HashSet();
        this.a = new HashMap();
    }

    void a() {
        try {
            Trace.c("Startup");
            ComponentName componentName0 = new ComponentName("com.dcinside.app.android", "androidx.startup.InitializationProvider");
            this.b(this.c.getPackageManager().getProviderInfo(componentName0, 0x80).metaData);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            throw new StartupException(packageManager$NameNotFoundException0);
        }
        finally {
            Trace.f();
        }
    }

    void b(@Nullable Bundle bundle0) {
        String s = this.c.getString(string.androidx_startup);
        if(bundle0 == null) {
            return;
        }
        else {
            try {
                HashSet hashSet0 = new HashSet();
                for(Object object0: bundle0.keySet()) {
                    String s1 = (String)object0;
                    if(s.equals(bundle0.getString(s1, null))) {
                        Class class0 = Class.forName(s1);
                        if(Initializer.class.isAssignableFrom(class0)) {
                            this.b.add(class0);
                        }
                    }
                }
                for(Object object1: this.b) {
                    this.d(((Class)object1), hashSet0);
                }
                return;
            }
            catch(ClassNotFoundException classNotFoundException0) {
            }
        }
        throw new StartupException(classNotFoundException0);
    }

    @NonNull
    Object c(@NonNull Class class0) {
        synchronized(AppInitializer.f) {
            Object object1 = this.a.get(class0);
            if(object1 == null) {
                object1 = this.d(class0, new HashSet());
            }
            return object1;
        }
    }

    @NonNull
    private Object d(@NonNull Class class0, @NonNull Set set0) {
        Object object1;
        boolean z = !Trace.i();
        try {
            if(!z) {
                Trace.c(class0.getSimpleName());
            }
            if(!set0.contains(class0)) {
                if(this.a.containsKey(class0)) {
                    object1 = this.a.get(class0);
                }
                else {
                    set0.add(class0);
                    try {
                        Initializer initializer0 = (Initializer)class0.getDeclaredConstructor(null).newInstance(null);
                        List list0 = initializer0.dependencies();
                        if(!list0.isEmpty()) {
                            for(Object object0: list0) {
                                Class class1 = (Class)object0;
                                if(!this.a.containsKey(class1)) {
                                    this.d(class1, set0);
                                }
                            }
                        }
                        object1 = initializer0.create(this.c);
                        set0.remove(class0);
                        this.a.put(class0, object1);
                        return object1;
                    }
                    catch(Throwable throwable0) {
                    }
                    throw new StartupException(throwable0);
                }
                return object1;
            }
        }
        finally {
            Trace.f();
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", class0.getName()));
    }

    @NonNull
    public static AppInitializer e(@NonNull Context context0) {
        if(AppInitializer.e == null) {
            Object object0 = AppInitializer.f;
            synchronized(object0) {
                if(AppInitializer.e == null) {
                    AppInitializer.e = new AppInitializer(context0);
                }
            }
        }
        return AppInitializer.e;
    }

    @NonNull
    public Object f(@NonNull Class class0) {
        return this.c(class0);
    }

    public boolean g(@NonNull Class class0) {
        return this.b.contains(class0);
    }

    static void h(@NonNull AppInitializer appInitializer0) {
        synchronized(AppInitializer.f) {
            AppInitializer.e = appInitializer0;
        }
    }
}

