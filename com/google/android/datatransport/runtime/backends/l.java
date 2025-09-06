package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r3.f;

@f
class l implements e {
    static class a {
        private final Context a;
        private Map b;

        a(Context context0) {
            this.b = null;
            this.a = context0;
        }

        private Map a(Context context0) {
            Bundle bundle0 = a.d(context0);
            if(bundle0 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            Map map0 = new HashMap();
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                Object object1 = bundle0.get(s);
                if(object1 instanceof String && s.startsWith("backend:")) {
                    String[] arr_s = ((String)object1).split(",", -1);
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s1 = arr_s[v].trim();
                        if(!s1.isEmpty()) {
                            map0.put(s1, s.substring(8));
                        }
                    }
                }
            }
            return map0;
        }

        @Nullable
        d b(String s) {
            String s1 = (String)this.c().get(s);
            if(s1 == null) {
                return null;
            }
            try {
                return (d)Class.forName(s1).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", s1), classNotFoundException0);
                return null;
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", s1), illegalAccessException0);
                return null;
            }
            catch(InstantiationException instantiationException0) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", s1), instantiationException0);
                return null;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", s1), noSuchMethodException0);
                return null;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", s1), invocationTargetException0);
                return null;
            }
        }

        private Map c() {
            if(this.b == null) {
                this.b = this.a(this.a);
            }
            return this.b;
        }

        private static Bundle d(Context context0) {
            try {
                PackageManager packageManager0 = context0.getPackageManager();
                if(packageManager0 == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, TransportBackendDiscovery.class), 0x80);
                if(serviceInfo0 == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo0.metaData;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }
    }

    private final a a;
    private final j b;
    private final Map c;
    private static final String d = "BackendRegistry";
    private static final String e = "backend:";

    @r3.a
    l(Context context0, j j0) {
        this(new a(context0), j0);
    }

    l(a l$a0, j j0) {
        this.c = new HashMap();
        this.a = l$a0;
        this.b = j0;
    }

    @Override  // com.google.android.datatransport.runtime.backends.e
    @Nullable
    public n get(String s) {
        synchronized(this) {
            if(this.c.containsKey(s)) {
                return (n)this.c.get(s);
            }
            d d0 = this.a.b(s);
            if(d0 == null) {
                return null;
            }
            n n1 = d0.create(this.b.a(s));
            this.c.put(s, n1);
            return n1;
        }
    }
}

