package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

final class zzld {
    private static final char[] zza;

    static {
        char[] arr_c = new char[80];
        zzld.zza = arr_c;
        Arrays.fill(arr_c, ' ');
    }

    static String zza(zzlc zzlc0, String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("# ");
        stringBuilder0.append(s);
        zzld.zza(zzlc0, stringBuilder0, 0);
        return stringBuilder0.toString();
    }

    private static void zza(int v, StringBuilder stringBuilder0) {
        while(v > 0) {
            int v1 = v <= zzld.zza.length ? v : zzld.zza.length;
            stringBuilder0.append(zzld.zza, 0, v1);
            v -= v1;
        }
    }

    private static void zza(zzlc zzlc0, StringBuilder stringBuilder0, int v) {
        boolean z1;
        HashSet hashSet0 = new HashSet();
        HashMap hashMap0 = new HashMap();
        TreeMap treeMap0 = new TreeMap();
        Method[] arr_method = zzlc0.getClass().getDeclaredMethods();
        for(int v1 = 0; v1 < arr_method.length; ++v1) {
            Method method0 = arr_method[v1];
            if(!Modifier.isStatic(method0.getModifiers()) && method0.getName().length() >= 3) {
                if(method0.getName().startsWith("set")) {
                    hashSet0.add(method0.getName());
                }
                else if(Modifier.isPublic(method0.getModifiers()) && method0.getParameterTypes().length == 0) {
                    if(method0.getName().startsWith("has")) {
                        hashMap0.put(method0.getName(), method0);
                    }
                    else if(method0.getName().startsWith("get")) {
                        treeMap0.put(method0.getName(), method0);
                    }
                }
            }
        }
        for(Object object0: treeMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = ((String)map$Entry0.getKey()).substring(3);
            if(s.endsWith("List") && !s.endsWith("OrBuilderList") && !s.equals("List")) {
                Method method1 = (Method)map$Entry0.getValue();
                if(method1 != null && method1.getReturnType().equals(List.class)) {
                    zzld.zza(stringBuilder0, v, s.substring(0, s.length() - 4), zzjt.zza(method1, zzlc0, new Object[0]));
                    continue;
                }
            }
            if(s.endsWith("Map") && !s.equals("Map")) {
                Method method2 = (Method)map$Entry0.getValue();
                if(method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                    zzld.zza(stringBuilder0, v, s.substring(0, s.length() - 3), zzjt.zza(method2, zzlc0, new Object[0]));
                    continue;
                }
            }
            if(hashSet0.contains("set" + s) && (!s.endsWith("Bytes") || !treeMap0.containsKey("get" + s.substring(0, s.length() - 5)))) {
                Method method3 = (Method)map$Entry0.getValue();
                Method method4 = (Method)hashMap0.get("has" + s);
                if(method3 != null) {
                    boolean z = true;
                    Object object1 = zzjt.zza(method3, zzlc0, new Object[0]);
                    if(method4 == null) {
                        if(!(object1 instanceof Boolean)) {
                            if(!(object1 instanceof Integer)) {
                                if(!(object1 instanceof Float)) {
                                    if(!(object1 instanceof Double)) {
                                        if(object1 instanceof String) {
                                            z1 = object1.equals("");
                                        }
                                        else if(object1 instanceof zzik) {
                                            z1 = object1.equals(zzik.zza);
                                        }
                                        else if(!(object1 instanceof zzlc)) {
                                            if(object1 instanceof Enum && ((Enum)object1).ordinal() == 0) {
                                                z1 = true;
                                            }
                                        }
                                        else if(object1 == ((zzlc)object1).zzck()) {
                                            z1 = true;
                                        }
                                    }
                                    else if(Double.doubleToRawLongBits(((double)(((Double)object1)))) == 0L) {
                                        z1 = true;
                                    }
                                }
                                else if(Float.floatToRawIntBits(((float)(((Float)object1)))) == 0) {
                                    z1 = true;
                                }
                            }
                            else if(((int)(((Integer)object1))) == 0) {
                                z1 = true;
                            }
                        }
                        else if(!((Boolean)object1).booleanValue()) {
                            z1 = true;
                        }
                        else {
                            z1 = false;
                        }
                        if(z1) {
                            z = false;
                        }
                    }
                    else {
                        z = ((Boolean)zzjt.zza(method4, zzlc0, new Object[0])).booleanValue();
                    }
                    if(z) {
                        zzld.zza(stringBuilder0, v, s, object1);
                    }
                }
            }
        }
        if(zzlc0 instanceof zzd) {
            Iterator iterator1 = ((zzd)zzlc0).zzc.zzd();
            if(iterator1.hasNext()) {
                Object object2 = iterator1.next();
                zzc zzjt$zzc0 = (zzc)((Map.Entry)object2).getKey();
                throw new NoSuchMethodError();
            }
        }
        zzmj zzmj0 = ((zzjt)zzlc0).zzb;
        if(zzmj0 != null) {
            zzmj0.zza(stringBuilder0, v);
        }
    }

    static void zza(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 instanceof List) {
            for(Object object1: ((List)object0)) {
                zzld.zza(stringBuilder0, v, s, object1);
            }
            return;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                zzld.zza(stringBuilder0, v, s, ((Map.Entry)object2));
            }
            return;
        }
        stringBuilder0.append('\n');
        zzld.zza(v, stringBuilder0);
        if(!s.isEmpty()) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(Character.toLowerCase(s.charAt(0)));
            for(int v1 = 1; v1 < s.length(); ++v1) {
                int v2 = s.charAt(v1);
                if(Character.isUpperCase(((char)v2))) {
                    stringBuilder1.append("_");
                }
                stringBuilder1.append(Character.toLowerCase(((char)v2)));
            }
            s = stringBuilder1.toString();
        }
        stringBuilder0.append(s);
        if(object0 instanceof String) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(zzmg.zza(zzik.zza(((String)object0))));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof zzik) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(zzmg.zza(((zzik)object0)));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof zzjt) {
            stringBuilder0.append(" {");
            zzld.zza(((zzjt)object0), stringBuilder0, v + 2);
            stringBuilder0.append("\n");
            zzld.zza(v, stringBuilder0);
            stringBuilder0.append("}");
            return;
        }
        if(object0 instanceof Map.Entry) {
            stringBuilder0.append(" {");
            zzld.zza(stringBuilder0, v + 2, "key", ((Map.Entry)object0).getKey());
            zzld.zza(stringBuilder0, v + 2, "value", ((Map.Entry)object0).getValue());
            stringBuilder0.append("\n");
            zzld.zza(v, stringBuilder0);
            stringBuilder0.append("}");
            return;
        }
        stringBuilder0.append(": ");
        stringBuilder0.append(object0);
    }
}

