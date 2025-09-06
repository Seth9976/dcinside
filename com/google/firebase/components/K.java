package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k {
    static class a {
    }

    static class b implements c {
        private final Class a;

        private b(Class class0) {
            this.a = class0;
        }

        b(Class class0, a k$a0) {
            this(class0);
        }

        @Override  // com.google.firebase.components.k$c
        public List a(Object object0) {
            return this.c(((Context)object0));
        }

        private Bundle b(Context context0) {
            try {
                PackageManager packageManager0 = context0.getPackageManager();
                if(packageManager0 == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, this.a), 0x80);
                if(serviceInfo0 == null) {
                    Log.w("ComponentDiscovery", this.a + " has no service info.");
                    return null;
                }
                return serviceInfo0.metaData;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        public List c(Context context0) {
            Bundle bundle0 = this.b(context0);
            if(bundle0 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            List list0 = new ArrayList();
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                if("com.google.firebase.components.ComponentRegistrar".equals(bundle0.get(s)) && s.startsWith("com.google.firebase.components:")) {
                    list0.add(s.substring(0x1F));
                }
            }
            return list0;
        }
    }

    @VisibleForTesting
    interface c {
        List a(Object arg1);
    }

    private final Object a;
    private final c b;
    static final String c = "ComponentDiscovery";
    private static final String d = "com.google.firebase.components.ComponentRegistrar";
    private static final String e = "com.google.firebase.components:";

    @VisibleForTesting
    k(Object object0, c k$c0) {
        this.a = object0;
        this.b = k$c0;
    }

    @Deprecated
    public List b() {
        List list0 = new ArrayList();
        for(Object object0: this.b.a(this.a)) {
            String s = (String)object0;
            try {
                ComponentRegistrar componentRegistrar0 = k.e(s);
                if(componentRegistrar0 == null) {
                    continue;
                }
                list0.add(componentRegistrar0);
            }
            catch(B b0) {
                Log.w("ComponentDiscovery", "Invalid component registrar.", b0);
            }
        }
        return list0;
    }

    public List c() {
        List list0 = new ArrayList();
        for(Object object0: this.b.a(this.a)) {
            list0.add(() -> {
                try {
                    Class class0 = Class.forName(((String)object0));
                    if(!ComponentRegistrar.class.isAssignableFrom(class0)) {
                        throw new B(String.format("Class %s is not an instance of %s", ((String)object0), "com.google.firebase.components.ComponentRegistrar"));
                    }
                    return (ComponentRegistrar)class0.getDeclaredConstructor(null).newInstance(null);
                }
                catch(ClassNotFoundException unused_ex) {
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new B(String.format("Could not instantiate %s.", ((String)object0)), illegalAccessException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new B(String.format("Could not instantiate %s.", ((String)object0)), instantiationException0);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new B(String.format("Could not instantiate %s", ((String)object0)), noSuchMethodException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new B(String.format("Could not instantiate %s", ((String)object0)), invocationTargetException0);
                }
                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", ((String)object0)));
                return null;
            });
        }
        return list0;
    }

    public static k d(Context context0, Class class0) {
        return new k(context0, new b(class0, null));
    }

    // 检测为 Lambda 实现
    @Nullable
    private static ComponentRegistrar e(String s) [...]
}

