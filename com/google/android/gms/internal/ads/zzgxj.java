package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzgxj {
    protected abstract zzgxb zza();

    static zzgxb zzb(Class class0) {
        zzgxj zzgxj0;
        String s;
        Class class1 = zzgxj.class;
        ClassLoader classLoader0 = class1.getClassLoader();
        if(class0.equals(zzgxb.class)) {
            s = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
            goto label_7;
        }
        if(class0.getPackage().equals(class1.getPackage())) {
            s = String.format("%s.BlazeGenerated%sLoader", class0.getPackage().getName(), class0.getSimpleName());
            try {
            label_7:
                Class class2 = Class.forName(s, true, classLoader0);
                try {
                    zzgxj0 = (zzgxj)class2.getConstructor(null).newInstance(null);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new IllegalStateException(noSuchMethodException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new IllegalStateException(instantiationException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new IllegalStateException(illegalAccessException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new IllegalStateException(invocationTargetException0);
                }
                return (zzgxb)class0.cast(zzgxj0.zza());
            }
            catch(ClassNotFoundException unused_ex) {
                Iterator iterator0 = ServiceLoader.load(class1, classLoader0).iterator();
                ArrayList arrayList0 = new ArrayList();
                while(iterator0.hasNext()) {
                    try {
                        Object object0 = iterator0.next();
                        arrayList0.add(((zzgxb)class0.cast(((zzgxj)object0).zza())));
                    }
                    catch(ServiceConfigurationError serviceConfigurationError0) {
                        Logger.getLogger("com.google.android.gms.internal.ads.zzgww").logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load " + class0.getSimpleName(), serviceConfigurationError0);
                    }
                }
                switch(arrayList0.size()) {
                    case 0: {
                        return null;
                    }
                    case 1: {
                        return (zzgxb)arrayList0.get(0);
                    }
                    default: {
                        try {
                            return (zzgxb)class0.getMethod("combine", Collection.class).invoke(null, arrayList0);
                        }
                        catch(NoSuchMethodException noSuchMethodException1) {
                            throw new IllegalStateException(noSuchMethodException1);
                        }
                        catch(IllegalAccessException illegalAccessException1) {
                            throw new IllegalStateException(illegalAccessException1);
                        }
                        catch(InvocationTargetException invocationTargetException1) {
                            throw new IllegalStateException(invocationTargetException1);
                        }
                    }
                }
            }
        }
        throw new IllegalArgumentException(class0.getName());
    }
}

