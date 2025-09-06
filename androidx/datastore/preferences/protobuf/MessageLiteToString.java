package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeSet;

final class MessageLiteToString {
    private static final String a = "List";
    private static final String b = "OrBuilderList";
    private static final String c = "Map";
    private static final String d = "Bytes";

    private static final String a(String s) {
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

    private static boolean b(Object object0) {
        if(object0 instanceof Boolean) {
            return !((Boolean)object0).booleanValue();
        }
        if(object0 instanceof Integer) {
            return ((int)(((Integer)object0))) == 0;
        }
        if(object0 instanceof Float) {
            return ((float)(((Float)object0))) == 0.0f;
        }
        if(object0 instanceof Double) {
            return ((double)(((Double)object0))) == 0.0;
        }
        if(object0 instanceof String) {
            return object0.equals("");
        }
        if(object0 instanceof ByteString) {
            return object0.equals(ByteString.e);
        }
        return object0 instanceof MessageLite ? object0 == ((MessageLite)object0).getDefaultInstanceForType() : object0 instanceof Enum && ((Enum)object0).ordinal() == 0;
    }

    static final void c(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 instanceof List) {
            for(Object object1: ((List)object0)) {
                MessageLiteToString.c(stringBuilder0, v, s, object1);
            }
            return;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                MessageLiteToString.c(stringBuilder0, v, s, ((Map.Entry)object2));
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
            stringBuilder0.append(TextFormatEscaper.e(((String)object0)));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof ByteString) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(TextFormatEscaper.a(((ByteString)object0)));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof GeneratedMessageLite) {
            stringBuilder0.append(" {");
            MessageLiteToString.d(((GeneratedMessageLite)object0), stringBuilder0, v + 2);
            stringBuilder0.append("\n");
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append("}");
            return;
        }
        if(object0 instanceof Map.Entry) {
            stringBuilder0.append(" {");
            MessageLiteToString.c(stringBuilder0, v + 2, "key", ((Map.Entry)object0).getKey());
            MessageLiteToString.c(stringBuilder0, v + 2, "value", ((Map.Entry)object0).getValue());
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

    private static void d(MessageLite messageLite0, StringBuilder stringBuilder0, int v) {
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        TreeSet treeSet0 = new TreeSet();
        Method[] arr_method = messageLite0.getClass().getDeclaredMethods();
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
            String s1 = s.replaceFirst("get", "");
            boolean z = true;
            if(s1.endsWith("List") && !s1.endsWith("OrBuilderList") && !s1.equals("List")) {
                String s2 = s1.substring(0, 1).toLowerCase() + s1.substring(1, s1.length() - 4);
                Method method1 = (Method)hashMap0.get(s);
                if(method1 != null && method1.getReturnType().equals(List.class)) {
                    MessageLiteToString.c(stringBuilder0, v, MessageLiteToString.a(s2), GeneratedMessageLite.g0(method1, messageLite0, new Object[0]));
                    continue;
                }
            }
            if(s1.endsWith("Map") && !s1.equals("Map")) {
                String s3 = s1.substring(0, 1).toLowerCase() + s1.substring(1, s1.length() - 3);
                Method method2 = (Method)hashMap0.get(s);
                if(method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                    MessageLiteToString.c(stringBuilder0, v, MessageLiteToString.a(s3), GeneratedMessageLite.g0(method2, messageLite0, new Object[0]));
                    continue;
                }
            }
            if(((Method)hashMap1.get("set" + s1)) != null && (!s1.endsWith("Bytes") || !hashMap0.containsKey("get" + s1.substring(0, s1.length() - 5)))) {
                String s4 = s1.substring(0, 1).toLowerCase() + s1.substring(1);
                Method method3 = (Method)hashMap0.get("get" + s1);
                Method method4 = (Method)hashMap0.get("has" + s1);
                if(method3 != null) {
                    Object object1 = GeneratedMessageLite.g0(method3, messageLite0, new Object[0]);
                    if(method4 != null) {
                        z = ((Boolean)GeneratedMessageLite.g0(method4, messageLite0, new Object[0])).booleanValue();
                    }
                    else if(MessageLiteToString.b(object1)) {
                        z = false;
                    }
                    if(z) {
                        MessageLiteToString.c(stringBuilder0, v, MessageLiteToString.a(s4), object1);
                    }
                }
            }
        }
        if(messageLite0 instanceof ExtendableMessage) {
            Iterator iterator1 = ((ExtendableMessage)messageLite0).extensions.H();
            while(iterator1.hasNext()) {
                Object object2 = iterator1.next();
                MessageLiteToString.c(stringBuilder0, v, "[" + ((ExtensionDescriptor)((Map.Entry)object2).getKey()).getNumber() + "]", ((Map.Entry)object2).getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)messageLite0).unknownFields;
        if(unknownFieldSetLite0 != null) {
            unknownFieldSetLite0.q(stringBuilder0, v);
        }
    }

    static String e(MessageLite messageLite0, String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("# ");
        stringBuilder0.append(s);
        MessageLiteToString.d(messageLite0, stringBuilder0, 0);
        return stringBuilder0.toString();
    }
}

