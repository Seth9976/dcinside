package com.google.android.gms.internal.vision;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zziz {
    private static final Logger zza;
    private static String zzb;

    static {
        zziz.zza = Logger.getLogger("com.google.android.gms.internal.vision.zzii");
        zziz.zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
    }

    static zzio zza(Class class0) {
        zziz zziz0;
        String s;
        Class class1 = zziz.class;
        ClassLoader classLoader0 = class1.getClassLoader();
        if(class0.equals(zzio.class)) {
            s = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
            goto label_7;
        }
        if(class0.getPackage().equals(class1.getPackage())) {
            s = String.format("%s.BlazeGenerated%sLoader", class0.getPackage().getName(), class0.getSimpleName());
            try {
            label_7:
                Class class2 = Class.forName(s, true, classLoader0);
                try {
                    zziz0 = (zziz)class2.getConstructor(null).newInstance(null);
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
                return (zzio)class0.cast(zziz0.zza());
            }
            catch(ClassNotFoundException unused_ex) {
                Iterator iterator0 = ServiceLoader.load(class1, classLoader0).iterator();
                ArrayList arrayList0 = new ArrayList();
                while(iterator0.hasNext()) {
                    try {
                        Object object0 = iterator0.next();
                        arrayList0.add(class0.cast(((zziz)object0).zza()));
                    }
                    catch(ServiceConfigurationError serviceConfigurationError0) {
                        String s1 = class0.getSimpleName();
                        zziz.zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", (s1.length() == 0 ? new String("Unable to load ") : "Unable to load " + s1), serviceConfigurationError0);
                    }
                }
                switch(arrayList0.size()) {
                    case 0: {
                        return null;
                    }
                    case 1: {
                        return (zzio)arrayList0.get(0);
                    }
                    default: {
                        try {
                            return (zzio)class0.getMethod("combine", Collection.class).invoke(null, arrayList0);
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

    protected abstract zzio zza();
}

