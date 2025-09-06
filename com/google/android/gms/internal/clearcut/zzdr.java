package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeSet;

final class zzdr {
    static String zza(zzdo zzdo0, String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("# ");
        stringBuilder0.append(s);
        zzdr.zza(zzdo0, stringBuilder0, 0);
        return stringBuilder0.toString();
    }

    private static void zza(zzdo zzdo0, StringBuilder stringBuilder0, int v) {
        boolean z1;
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        TreeSet treeSet0 = new TreeSet();
        Method[] arr_method = zzdo0.getClass().getDeclaredMethods();
        for(int v1 = 0; v1 < arr_method.length; ++v1) {
            Method method0 = arr_method[v1];
            hashMap1.put(method0.getName(), method0);
            if(method0.getParameterTypes().length == 0) {
                hashMap0.put(method0.getName(), method0);
                if(method0.getName().startsWith("get")) {
                    treeSet0.add(method0.getName());
                }
            }
        }
        for(Object object0: treeSet0) {
            String s = (String)object0;
            String s1 = "";
            String s2 = s.replaceFirst("get", "");
            boolean z = true;
            if(s2.endsWith("List") && !s2.endsWith("OrBuilderList") && !s2.equals("List")) {
                String s3 = s2.substring(0, 1).toLowerCase();
                String s4 = s2.substring(1, s2.length() - 4);
                String s5 = s4.length() == 0 ? new String(s3) : s3 + s4;
                Method method1 = (Method)hashMap0.get(s);
                if(method1 != null && method1.getReturnType().equals(List.class)) {
                    zzdr.zza(stringBuilder0, v, zzdr.zzj(s5), zzcg.zza(method1, zzdo0, new Object[0]));
                    continue;
                }
            }
            if(s2.endsWith("Map") && !s2.equals("Map")) {
                String s6 = s2.substring(0, 1).toLowerCase();
                String s7 = s2.substring(1, s2.length() - 3);
                String s8 = s7.length() == 0 ? new String(s6) : s6 + s7;
                Method method2 = (Method)hashMap0.get(s);
                if(method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                    zzdr.zza(stringBuilder0, v, zzdr.zzj(s8), zzcg.zza(method2, zzdo0, new Object[0]));
                    continue;
                }
            }
            if(((Method)hashMap1.get((s2.length() == 0 ? new String("set") : "set" + s2))) == null) {
            }
            else if(s2.endsWith("Bytes")) {
                String s9 = s2.substring(0, s2.length() - 5);
                if(!hashMap0.containsKey((s9.length() == 0 ? new String("get") : "get" + s9))) {
                    goto label_41;
                }
            }
            else {
            label_41:
                String s10 = s2.substring(0, 1).toLowerCase();
                String s11 = s2.substring(1);
                String s12 = s11.length() == 0 ? new String(s10) : s10 + s11;
                Method method3 = (Method)hashMap0.get((s2.length() == 0 ? new String("get") : "get" + s2));
                Method method4 = (Method)hashMap0.get((s2.length() == 0 ? new String("has") : "has" + s2));
                if(method3 != null) {
                    Object object1 = zzcg.zza(method3, zzdo0, new Object[0]);
                    if(method4 == null) {
                        if(object1 instanceof Boolean) {
                            z1 = ((Boolean)object1).booleanValue() ? false : true;
                        }
                        else if(object1 instanceof Integer) {
                            z1 = ((int)(((Integer)object1))) == 0;
                        }
                        else if(object1 instanceof Float) {
                            z1 = ((float)(((Float)object1))) == 0.0f;
                        }
                        else if(!(object1 instanceof Double)) {
                            if(!(object1 instanceof String)) {
                                if(object1 instanceof zzbb) {
                                    s1 = zzbb.zzfi;
                                }
                                else {
                                    if(!(object1 instanceof zzdo)) {
                                        if(object1 instanceof Enum && ((Enum)object1).ordinal() == 0) {
                                            z1 = true;
                                            goto label_87;
                                        }
                                    }
                                    else if(object1 == ((zzdo)object1).zzbe()) {
                                        z1 = true;
                                        goto label_87;
                                    }
                                    z1 = false;
                                    goto label_87;
                                }
                            }
                            z1 = object1.equals(s1);
                        }
                        else if(((double)(((Double)object1))) == 0.0) {
                            z1 = true;
                        }
                        else {
                            z1 = false;
                        }
                    label_87:
                        if(z1) {
                            z = false;
                        }
                    }
                    else {
                        z = ((Boolean)zzcg.zza(method4, zzdo0, new Object[0])).booleanValue();
                    }
                    if(z) {
                        zzdr.zza(stringBuilder0, v, zzdr.zzj(s12), object1);
                    }
                }
            }
        }
        if(zzdo0 instanceof zzd) {
            for(Object object2: ((zzd)zzdo0).zzjv) {
                zzdr.zza(stringBuilder0, v, "[" + ((zze)((Map.Entry)object2).getKey()).number + "]", ((Map.Entry)object2).getValue());
            }
        }
        zzey zzey0 = ((zzcg)zzdo0).zzjp;
        if(zzey0 != null) {
            zzey0.zza(stringBuilder0, v);
        }
    }

    static final void zza(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 instanceof List) {
            for(Object object1: ((List)object0)) {
                zzdr.zza(stringBuilder0, v, s, object1);
            }
            return;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                zzdr.zza(stringBuilder0, v, s, ((Map.Entry)object2));
            }
            return;
        }
        stringBuilder0.append('\n');
        for(int v2 = 0; v2 < v; ++v2) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append(s);
        if(object0 instanceof String) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(zzet.zzc(zzbb.zzf(((String)object0))));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof zzbb) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(zzet.zzc(((zzbb)object0)));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof zzcg) {
            stringBuilder0.append(" {");
            zzdr.zza(((zzcg)object0), stringBuilder0, v + 2);
            stringBuilder0.append("\n");
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append("}");
            return;
        }
        if(object0 instanceof Map.Entry) {
            stringBuilder0.append(" {");
            zzdr.zza(stringBuilder0, v + 2, "key", ((Map.Entry)object0).getKey());
            zzdr.zza(stringBuilder0, v + 2, "value", ((Map.Entry)object0).getValue());
            stringBuilder0.append("\n");
            while(v1 < v) {
                stringBuilder0.append(' ');
                ++v1;
            }
            stringBuilder0.append("}");
            return;
        }
        stringBuilder0.append(": ");
        stringBuilder0.append(object0.toString());
    }

    private static final String zzj(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(Character.isUpperCase(((char)v1))) {
                stringBuilder0.append("_");
            }
            stringBuilder0.append(Character.toLowerCase(((char)v1)));
        }
        return stringBuilder0.toString();
    }
}

