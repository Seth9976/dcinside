package kotlinx.coroutines.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.o;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,157:1\n73#1,5:158\n73#1,5:164\n127#1,13:179\n1#2:163\n1360#3:169\n1446#3,5:170\n1549#3:175\n1620#3,3:176\n1064#4,2:192\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n56#1:158,5\n57#1:164,5\n113#1:179,13\n95#1:169\n95#1:170,5\n97#1:175\n97#1:176,3\n149#1:192,2\n*E\n"})
public final class r {
    @l
    public static final r a = null;
    @l
    private static final String b = "META-INF/services/";

    static {
        r.a = new r();
    }

    private final MainDispatcherFactory a(Class class0, String s) {
        try {
            return (MainDispatcherFactory)class0.cast(Class.forName(s, true, class0.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }

    private final Object b(String s, ClassLoader classLoader0, Class class0) {
        Class class1 = Class.forName(s, false, classLoader0);
        if(!class0.isAssignableFrom(class1)) {
            throw new IllegalArgumentException(("Expected service of class " + class0 + ", but found " + class1).toString());
        }
        return class0.cast(class1.getDeclaredConstructor(null).newInstance(null));
    }

    private final List c(Class class0, ClassLoader classLoader0) {
        try {
            return this.e(class0, classLoader0);
        }
        catch(Throwable unused_ex) {
            return u.V5(ServiceLoader.load(class0, classLoader0));
        }
    }

    @l
    public final List d() {
        MainDispatcherFactory mainDispatcherFactory1;
        Class class0;
        try {
            class0 = MainDispatcherFactory.class;
            List list0 = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory0 = null;
            try {
                mainDispatcherFactory1 = null;
                mainDispatcherFactory1 = (MainDispatcherFactory)class0.cast(Class.forName("kotlinx.coroutines.android.a", true, class0.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            }
            catch(ClassNotFoundException unused_ex) {
            }
            if(mainDispatcherFactory1 != null) {
                ((ArrayList)list0).add(mainDispatcherFactory1);
            }
            try {
                mainDispatcherFactory0 = (MainDispatcherFactory)class0.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, class0.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            }
            catch(ClassNotFoundException unused_ex) {
            }
            if(mainDispatcherFactory0 != null) {
                ((ArrayList)list0).add(mainDispatcherFactory0);
                return list0;
            }
            return list0;
        }
        catch(Throwable unused_ex) {
            return this.c(class0, class0.getClassLoader());
        }
    }

    @l
    public final List e(@l Class class0, @l ClassLoader classLoader0) {
        ArrayList arrayList0 = Collections.list(classLoader0.getResources("META-INF/services/" + class0.getName()));
        L.o(arrayList0, "list(...)");
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            u.q0(arrayList1, r.a.f(((URL)object0)));
        }
        Set set0 = u.a6(arrayList1);
        if(set0.isEmpty()) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
        }
        List list0 = new ArrayList(u.b0(set0, 10));
        for(Object object1: set0) {
            list0.add(r.a.b(((String)object1), classLoader0, class0));
        }
        return list0;
    }

    private final List f(URL uRL0) {
        List list1;
        List list0;
        String s = uRL0.toString();
        if(v.v2(s, "jar", false, 2, null)) {
            String s1 = v.y5(v.r5(s, "jar:file:", null, 2, null), '!', null, 2, null);
            String s2 = v.r5(s, "!/", null, 2, null);
            JarFile jarFile0 = new JarFile(s1, false);
            try {
                BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(jarFile0.getInputStream(new ZipEntry(s2)), "UTF-8"));
                try {
                    list0 = r.a.g(bufferedReader0);
                }
                catch(Throwable throwable1) {
                    c.a(bufferedReader0, throwable1);
                    throw throwable1;
                }
                c.a(bufferedReader0, null);
            }
            catch(Throwable throwable0) {
                try {
                    jarFile0.close();
                }
                catch(Throwable throwable2) {
                    o.a(throwable0, throwable2);
                    throw throwable0;
                }
                throw throwable0;
            }
            jarFile0.close();
            return list0;
        }
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(uRL0)));
        try {
            list1 = r.a.g(bufferedReader1);
        }
        catch(Throwable throwable3) {
            c.a(bufferedReader1, throwable3);
            throw throwable3;
        }
        c.a(bufferedReader1, null);
        return list1;
    }

    private final List g(BufferedReader bufferedReader0) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        while(true) {
            String s = bufferedReader0.readLine();
            if(s == null) {
                return u.V5(linkedHashSet0);
            }
            String s1 = v.G5(v.z5(s, "#", null, 2, null)).toString();
            for(int v = 0; v < s1.length(); ++v) {
                int v1 = s1.charAt(v);
                if(v1 != 46 && !Character.isJavaIdentifierPart(((char)v1))) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + s1).toString());
                }
            }
            if(s1.length() > 0) {
                linkedHashSet0.add(s1);
            }
        }
    }

    private final Object h(JarFile jarFile0, Function1 function10) {
        Object object0;
        try {
            object0 = function10.invoke(jarFile0);
        }
        catch(Throwable throwable0) {
            try {
                jarFile0.close();
            }
            catch(Throwable throwable1) {
                o.a(throwable0, throwable1);
                throw throwable0;
            }
            throw throwable0;
        }
        jarFile0.close();
        return object0;
    }
}

