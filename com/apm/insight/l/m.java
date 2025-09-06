package com.apm.insight.l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m {
    public static final class a {
        public int a;
        public int b;

        public a(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public final JSONObject a() {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("start", this.a);
                jSONObject0.put("end", this.b);
            }
            catch(Throwable unused_ex) {
            }
            return jSONObject0;
        }
    }

    private static final StackTraceElement a;

    static {
        m.a = new StackTraceElement("", "", "", 0);
    }

    public static String a(String s) {
        BufferedReader bufferedReader0;
        Closeable closeable0 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        File file0 = new File(s);
        if(!file0.exists()) {
            return null;
        }
        LinkedList linkedList0 = new LinkedList();
        LinkedList linkedList1 = new LinkedList();
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        try {
            bufferedReader0 = new BufferedReader(new FileReader(file0));
            int v1 = 0;
            try {
                while(true) {
                    String s1 = bufferedReader0.readLine();
                    if(s1 == null) {
                        goto label_28;
                    }
                    if(v1 <= 0x100) {
                        linkedList0.add(s1);
                        stringBuilder0.append(s1);
                        stringBuilder0.append('\n');
                    }
                    else {
                        linkedList1.add(s1);
                        if(linkedList1.size() > 0x100) {
                            linkedList1.poll();
                            ++v;
                        }
                    }
                    ++v1;
                }
            }
            catch(Throwable unused_ex) {
                closeable0 = bufferedReader0;
            }
        }
        catch(Throwable unused_ex) {
        }
        com.apm.insight.a.a(closeable0);
        goto label_29;
    label_28:
        com.apm.insight.a.a(bufferedReader0);
    label_29:
        if(!linkedList1.isEmpty()) {
            if(v != 0) {
                stringBuilder0.append("\t... skip ");
                stringBuilder0.append(v);
                stringBuilder0.append(" lines\n");
            }
            for(Object object0: linkedList1) {
                stringBuilder0.append(((String)object0));
                stringBuilder0.append('\n');
            }
        }
        return stringBuilder0.toString();
    }

    @NonNull
    public static String a(@NonNull Throwable throwable0) {
        StringWriter stringWriter0 = new StringWriter();
        PrintWriter printWriter0 = new PrintWriter(stringWriter0);
        try {
            m.a(throwable0, printWriter0);
        }
        catch(Throwable unused_ex) {
            printWriter0.close();
            return "";
        }
        printWriter0.close();
        return stringWriter0.toString();
    }

    @NonNull
    public static String a(@NonNull Throwable throwable0, PrintStream printStream0, com.apm.insight.l.e.a e$a0) {
        MessageDigest messageDigest0 = null;
        try {
            messageDigest0 = MessageDigest.getInstance("MD5");
        }
        catch(Throwable unused_ex) {
        }
        e e0 = new e(printStream0, messageDigest0, e$a0);
        try {
            m.a(throwable0, e0);
        }
        catch(Throwable unused_ex) {
        }
        e0.close();
        if(messageDigest0 != null) {
            byte[] arr_b = messageDigest0.digest();
            if(arr_b != null && arr_b.length > 0) {
                char[] arr_c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                char[] arr_c1 = new char[arr_b.length << 1];
                int v1 = 0;
                for(int v = 0; v < arr_b.length; ++v) {
                    int v2 = arr_b[v];
                    int v3 = v1 + 1;
                    arr_c1[v1] = arr_c[v2 >>> 4 & 15];
                    v1 += 2;
                    arr_c1[v3] = arr_c[v2 & 15];
                }
                return new String(arr_c1);
            }
            return "";
        }
        return null;
    }

    public static String a(StackTraceElement[] arr_stackTraceElement) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            m.a(arr_stackTraceElement[v], stringBuilder0);
        }
        return stringBuilder0.toString();
    }

    public static StringBuilder a(StackTraceElement stackTraceElement0, StringBuilder stringBuilder0) {
        String s = stackTraceElement0.getClassName();
        stringBuilder0.append("  at ");
        stringBuilder0.append(s);
        stringBuilder0.append(".");
        stringBuilder0.append(stackTraceElement0.getMethodName());
        stringBuilder0.append("(");
        stringBuilder0.append(stackTraceElement0.getFileName());
        stringBuilder0.append(":");
        stringBuilder0.append(stackTraceElement0.getLineNumber());
        stringBuilder0.append(")\n");
        return stringBuilder0;
    }

    public static JSONArray a(StackTraceElement[] arr_stackTraceElement, String[] arr_s) {
        a m$a0 = new a(-1, -1);
        JSONArray jSONArray0 = new JSONArray();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            if(m$a0.a != -1) {
                if(!m.a(arr_stackTraceElement[v].getClassName(), arr_s)) {
                    m$a0.b = v;
                    jSONArray0.put(m$a0.a());
                    m$a0 = new a(-1, -1);
                }
            }
            else if(m.a(arr_stackTraceElement[v].getClassName(), arr_s)) {
                m$a0.a = v;
                m$a0.b = v;
            }
        }
        if(m$a0.a != -1) {
            m$a0.b = arr_stackTraceElement.length;
            jSONArray0.put(m$a0.a());
        }
        return jSONArray0;
    }

    public static JSONArray a(String[] arr_s, String[] arr_s1) {
        a m$a0 = new a(-1, -1);
        JSONArray jSONArray0 = new JSONArray();
        for(int v = 0; v < arr_s.length; ++v) {
            if(m$a0.a != -1) {
                if(!m.a(arr_s[v], arr_s1)) {
                    m$a0.b = v;
                    jSONArray0.put(m$a0.a());
                    m$a0 = new a(-1, -1);
                }
            }
            else if(m.a(arr_s[v], arr_s1)) {
                m$a0.a = v;
                m$a0.b = v;
            }
        }
        if(m$a0.a != -1) {
            m$a0.b = arr_s.length;
            jSONArray0.put(m$a0.a());
        }
        return jSONArray0;
    }

    private static void a(StackTraceElement stackTraceElement0, int v) {
        try {
            NativeImpl.a(v, "\tat ");
            NativeImpl.a(v, stackTraceElement0.getClassName());
            NativeImpl.a(v, ".");
            NativeImpl.a(v, stackTraceElement0.getMethodName());
            if(stackTraceElement0.isNativeMethod()) {
                NativeImpl.a(v, "(Native Method)");
            }
            else if(stackTraceElement0.getFileName() == null) {
                if(stackTraceElement0.getLineNumber() >= 0) {
                    NativeImpl.a(v, "(Unknown Source:");
                    NativeImpl.a(v, String.valueOf(stackTraceElement0.getLineNumber()));
                    NativeImpl.a(v, ")");
                }
                else {
                    NativeImpl.a(v, "(Unknown Source)");
                }
            }
            else if(stackTraceElement0.getLineNumber() >= 0) {
                NativeImpl.a(v, "(");
                NativeImpl.a(v, stackTraceElement0.getFileName());
                NativeImpl.a(v, ":");
                NativeImpl.a(v, String.valueOf(stackTraceElement0.getLineNumber()));
                NativeImpl.a(v, ")");
            }
            else {
                NativeImpl.a(v, "(");
                NativeImpl.a(v, stackTraceElement0.getFileName());
                NativeImpl.a(v, ")");
            }
            NativeImpl.a(v, "\n");
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void a(@NonNull Throwable throwable0, int v) {
        if(throwable0 != null && v > 0) {
            try {
                m.b(throwable0, v);
                StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
                for(int v2 = 0; v2 < arr_stackTraceElement.length; ++v2) {
                    m.a(arr_stackTraceElement[v2], v);
                }
                Throwable[] arr_throwable = throwable0.getSuppressed();
                for(int v1 = 0; v1 < arr_throwable.length; ++v1) {
                    m.a(arr_throwable[v1], v, "Suppressed: ", "\t");
                }
                Throwable throwable1 = throwable0.getCause();
                if(throwable1 != null) {
                    m.a(throwable1, v, "Caused by: ", "");
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private static void a(Throwable throwable0, int v, String s, String s1) {
        while(true) {
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            try {
                NativeImpl.a(v, s1);
                NativeImpl.a(v, s);
            }
            catch(Throwable unused_ex) {
            }
            m.b(throwable0, v);
            int v1 = arr_stackTraceElement.length;
            for(int v3 = 0; v3 < v1; ++v3) {
                m.a(arr_stackTraceElement[v3], v);
            }
            Throwable[] arr_throwable = throwable0.getSuppressed();
            for(int v2 = 0; v2 < arr_throwable.length; ++v2) {
                m.a(arr_throwable[v2], v, "Suppressed: ", s1 + "\t");
            }
            throwable0 = throwable0.getCause();
            if(throwable0 == null) {
                break;
            }
            s = "Caused by: ";
        }
    }

    private static void a(Throwable throwable0, PrintWriter printWriter0) {
        if(throwable0 == null) {
            return;
        }
        Set set0 = Collections.newSetFromMap(new IdentityHashMap());
        set0.add(throwable0);
        printWriter0.println(throwable0);
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        boolean z = arr_stackTraceElement.length > 0x180;
        int v1 = 0;
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            if(z && v1 > 0x100) {
                printWriter0.println("\t... skip " + (arr_stackTraceElement.length - v1 - 0x80) + " lines");
                break;
            }
            printWriter0.println("\tat " + stackTraceElement0);
            ++v1;
        }
        if(z) {
            for(int v2 = arr_stackTraceElement.length - 0x80; v2 < arr_stackTraceElement.length; ++v2) {
                printWriter0.println("\tat " + arr_stackTraceElement[v2]);
            }
        }
        Throwable[] arr_throwable = throwable0.getSuppressed();
        for(int v3 = 0; v3 < arr_throwable.length; ++v3) {
            m.a(arr_throwable[v3], printWriter0, "Suppressed: ", "\t", set0, 0x80);
        }
        Throwable throwable1 = throwable0.getCause();
        if(throwable1 != null) {
            m.a(throwable1, printWriter0, "Caused by: ", "", set0, 0x80);
        }
    }

    private static void a(Throwable throwable0, PrintWriter printWriter0, String s, String s1, Set set0, int v) {
        while(true) {
            if(set0.contains(throwable0)) {
                printWriter0.println("\t[CIRCULAR REFERENCE:" + throwable0 + "]");
                return;
            }
            set0.add(throwable0);
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            boolean z = arr_stackTraceElement.length > v;
            printWriter0.println(s1 + s + throwable0);
            int v3 = 0;
            for(int v2 = 0; v2 < arr_stackTraceElement.length; ++v2) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v2];
                if(z && v3 > v) {
                    printWriter0.println("\t... skip " + (arr_stackTraceElement.length - v3 - v / 2) + " lines");
                    break;
                }
                printWriter0.println("\tat " + stackTraceElement0);
                ++v3;
            }
            if(z) {
                for(int v4 = arr_stackTraceElement.length - v / 2; v4 < arr_stackTraceElement.length; ++v4) {
                    printWriter0.println("\tat " + arr_stackTraceElement[v4]);
                }
            }
            Throwable[] arr_throwable = throwable0.getSuppressed();
            for(int v1 = 0; v1 < arr_throwable.length; ++v1) {
                m.a(arr_throwable[v1], printWriter0, "Suppressed: ", s1 + "\t", set0, (v / 2 <= 10 ? 10 : v / 2));
            }
            throwable0 = throwable0.getCause();
            if(throwable0 == null) {
                break;
            }
            v /= 2;
            v = v > 10 ? v / 2 : 10;
            s = "Caused by: ";
        }
    }

    private static void a(Throwable throwable0, List list0) {
        if(throwable0 == null) {
            return;
        }
        Set set0 = Collections.newSetFromMap(new IdentityHashMap());
        set0.add(throwable0);
        list0.add(m.a);
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        boolean z = arr_stackTraceElement.length > 0x180;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
            if(z && v2 > 0x100) {
                list0.add(m.a);
                break;
            }
            list0.add(stackTraceElement0);
            ++v2;
        }
        if(z) {
            for(int v3 = arr_stackTraceElement.length - 0x80; v3 < arr_stackTraceElement.length; ++v3) {
                list0.add(arr_stackTraceElement[v3]);
            }
        }
        Throwable[] arr_throwable = throwable0.getSuppressed();
        for(int v = 0; v < arr_throwable.length; ++v) {
            m.a(arr_throwable[v], list0, "\t", set0, 0x80);
        }
        Throwable throwable1 = throwable0.getCause();
        if(throwable1 != null) {
            m.a(throwable1, list0, "", set0, 0x80);
        }
    }

    private static void a(Throwable throwable0, List list0, String s, Set set0, int v) {
        while(true) {
            if(set0.contains(throwable0)) {
                list0.add(m.a);
                return;
            }
            set0.add(throwable0);
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            boolean z = arr_stackTraceElement.length > v;
            list0.add(m.a);
            int v3 = 0;
            for(int v2 = 0; v2 < arr_stackTraceElement.length; ++v2) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v2];
                if(z && v3 > v) {
                    list0.add(m.a);
                    break;
                }
                list0.add(stackTraceElement0);
                ++v3;
            }
            if(z) {
                for(int v4 = arr_stackTraceElement.length - v / 2; v4 < arr_stackTraceElement.length; ++v4) {
                    list0.add(arr_stackTraceElement[v4]);
                }
            }
            Throwable[] arr_throwable = throwable0.getSuppressed();
            for(int v1 = 0; true; ++v1) {
                int v5 = 10;
                if(v1 >= arr_throwable.length) {
                    break;
                }
                Throwable throwable1 = arr_throwable[v1];
                if(v / 2 > 10) {
                    v5 = v / 2;
                }
                m.a(throwable1, list0, s + "\t", set0, v5);
            }
            throwable0 = throwable0.getCause();
            if(throwable0 == null) {
                break;
            }
            if(v / 2 > 10) {
                v /= 2;
            }
            else {
                v = 10;
            }
        }
    }

    private static boolean a(String s, String[] arr_s) {
        if(arr_s != null && !TextUtils.isEmpty(s)) {
            for(int v = 0; v < arr_s.length; ++v) {
                if(s.contains(arr_s[v])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public static JSONObject b(String s) {
        try {
            Map map0 = Thread.getAllStackTraces();
            JSONObject jSONObject0 = new JSONObject();
            if(map0 == null) {
                return null;
            }
            jSONObject0.put("thread_all_count", map0.size());
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                JSONObject jSONObject1 = new JSONObject();
                Thread thread0 = (Thread)map$Entry0.getKey();
                String s1 = thread0.getName();
                if(!m.c(s1) && (s == null || !s.equals(s1) && !s1.startsWith(s) && !s1.endsWith(s))) {
                    jSONObject1.put("thread_name", thread0.getName() + "(" + thread0.getId() + ")");
                    StackTraceElement[] arr_stackTraceElement = (StackTraceElement[])map$Entry0.getValue();
                    if(arr_stackTraceElement == null) {
                        jSONArray0.put(jSONObject1);
                    }
                    else {
                        JSONArray jSONArray1 = new JSONArray();
                        int v = arr_stackTraceElement.length;
                        for(int v1 = 0; v1 < v; ++v1) {
                            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
                            jSONArray1.put(stackTraceElement0.getClassName() + "." + stackTraceElement0.getMethodName() + "(" + stackTraceElement0.getLineNumber() + ")");
                        }
                        jSONObject1.put("thread_stack", jSONArray1);
                        if(jSONArray1.length() > 0) {
                            jSONArray0.put(jSONObject1);
                        }
                    }
                }
            }
            jSONObject0.put("thread_stacks", jSONArray0);
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static void b(Throwable throwable0, int v) {
        throwable0.getClass();
        String s = throwable0.getLocalizedMessage();
        try {
            NativeImpl.a(v, throwable0.getClass().getName());
            if(s != null) {
                NativeImpl.a(v, ": ");
                NativeImpl.a(v, s);
            }
            NativeImpl.a(v, "\n");
        }
        catch(Throwable unused_ex) {
        }
    }

    public static StackTraceElement[] b(@NonNull Throwable throwable0) {
        ArrayList arrayList0 = new ArrayList();
        try {
            m.a(throwable0, arrayList0);
        }
        catch(Throwable unused_ex) {
        }
        return (StackTraceElement[])arrayList0.toArray(new StackTraceElement[arrayList0.size()]);
    }

    private static boolean c(String s) {
        Set set0 = g.a();
        if(!set0.contains(s)) {
            for(Object object0: set0) {
                if(!TextUtils.isEmpty(s) && s.startsWith(((String)object0))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean c(Throwable throwable0) {
        if(throwable0 == null) {
            return false;
        }
        int v = 0;
        while(throwable0 != null) {
            if(throwable0 instanceof OutOfMemoryError) {
                return true;
            }
            if(v > 20) {
                return false;
            }
            try {
                ++v;
                throwable0 = throwable0.getCause();
                continue;
            }
            catch(Throwable unused_ex) {
            }
            break;
        }
        return false;
    }

    public static boolean d(Throwable throwable0) {
        if(throwable0 == null) {
            return false;
        }
        int v = 0;
        while(throwable0 != null) {
            try {
                if(throwable0 instanceof OutOfMemoryError && (throwable0.getMessage().contains("allocate") || throwable0.getMessage().contains("thrown"))) {
                    return true;
                }
                if(v > 20) {
                    return false;
                }
                ++v;
                throwable0 = throwable0.getCause();
            }
            catch(Throwable unused_ex) {
                return true;
            }
        }
        return false;
    }
}

