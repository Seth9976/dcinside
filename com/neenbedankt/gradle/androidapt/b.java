package com.neenbedankt.gradle.androidapt;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.ProjectConfigurationException;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.tasks.compile.GroovyCompile;

public class b implements GroovyObject, Plugin {
    private transient MetaClass a;
    private static ClassInfo b;
    public static transient boolean c;
    public static long d;
    public static long e;
    private static SoftReference f;

    static {
        b.e();
        b.e = 0L;
        b.d = 0x14FF0639CE1L;
    }

    public b() {
        b.c();
        this.a = this.d();
    }

    public Object A(String s, Object object0) {
        b.c();
        String s1 = ShortTypeHandling.castToString(new GStringImpl(new Object[]{s}, new String[]{"", ""}));
        Object[] arr_object = ScriptBytecodeAdapter.despreadList(new Object[0], new Object[]{object0}, new int[]{0});
        return ScriptBytecodeAdapter.invokeMethodOnCurrentN(b.class, this, s1, arr_object);
    }

    public void B(String s, Object object0) {
        b.c();
        String s1 = ShortTypeHandling.castToString(new GStringImpl(new Object[]{s}, new String[]{"", ""}));
        ScriptBytecodeAdapter.setGroovyObjectProperty(object0, b.class, this, s1);
    }

    private static CallSiteArray a() {
        String[] arr_s = new String[90];
        b.b(arr_s);
        return new CallSiteArray(b.class, arr_s);
    }

    private static void b(String[] arr_s) {
        arr_s[0] = "findPlugin";
        arr_s[1] = "plugins";
        arr_s[2] = "findPlugin";
        arr_s[3] = "plugins";
        arr_s[4] = "findPlugin";
        arr_s[5] = "plugins";
        arr_s[6] = "findPlugin";
        arr_s[7] = "plugins";
        arr_s[8] = "findPlugin";
        arr_s[9] = "plugins";
        arr_s[10] = "<$constructor$>";
        arr_s[11] = "extendsFrom";
        arr_s[12] = "create";
        arr_s[13] = "configurations";
        arr_s[14] = "compile";
        arr_s[15] = "configurations";
        arr_s[16] = "provided";
        arr_s[17] = "configurations";
        arr_s[18] = "extendsFrom";
        arr_s[19] = "create";
        arr_s[20] = "configurations";
        arr_s[21] = "getByName";
        arr_s[22] = "configurations";
        arr_s[23] = "getByName";
        arr_s[24] = "configurations";
        arr_s[25] = "extendsFrom";
        arr_s[26] = "create";
        arr_s[27] = "configurations";
        arr_s[28] = "getByName";
        arr_s[29] = "configurations";
        arr_s[30] = "getByName";
        arr_s[0x1F] = "configurations";
        arr_s[0x20] = "create";
        arr_s[33] = "extensions";
        arr_s[34] = "afterEvaluate";
        arr_s[35] = "empty";
        arr_s[36] = "info";
        arr_s[37] = "logger";
        arr_s[38] = "name";
        arr_s[39] = "file";
        arr_s[40] = "<$constructor$>";
        arr_s[41] = "buildDir";
        arr_s[42] = "<$constructor$>";
        arr_s[43] = "dirName";
        arr_s[44] = "hasProperty";
        arr_s[45] = "javaCompiler";
        arr_s[46] = "javaCompile";
        arr_s[0x2F] = "addJavaSourceFoldersToModel";
        arr_s[0x30] = "asPath";
        arr_s[49] = "plus";
        arr_s[50] = "classpath";
        arr_s[51] = "buildDependencies";
        arr_s[52] = "plus";
        arr_s[53] = "dependsOn";
        arr_s[54] = "processors";
        arr_s[55] = "plus";
        arr_s[56] = "compilerArgs";
        arr_s[57] = "options";
        arr_s[58] = "options";
        arr_s[59] = "plus";
        arr_s[60] = "compilerArgs";
        arr_s[61] = "options";
        arr_s[62] = "options";
        arr_s[0x3F] = "disableDiscovery";
        arr_s[0x40] = "plus";
        arr_s[65] = "compilerArgs";
        arr_s[66] = "options";
        arr_s[67] = "options";
        arr_s[68] = "aptArguments";
        arr_s[69] = "aptArguments";
        arr_s[70] = "android";
        arr_s[71] = "aptArguments";
        arr_s[72] = "plus";
        arr_s[73] = "compilerArgs";
        arr_s[74] = "options";
        arr_s[75] = "arguments";
        arr_s[76] = "options";
        arr_s[77] = "doFirst";
        arr_s[78] = "finalizedBy";
        arr_s[0x4F] = "getDependencies";
        arr_s[80] = "iterator";
        arr_s[81] = "hasProperty";
        arr_s[82] = "groovyOptions";
        arr_s[83] = "plus";
        arr_s[84] = "compilerArgs";
        arr_s[85] = "options";
        arr_s[86] = "compilerArgs";
        arr_s[87] = "options";
        arr_s[88] = "options";
        arr_s[89] = "groovyOptions";
    }

    private static CallSite[] c() {
        CallSiteArray callSiteArray0;
        SoftReference softReference0 = b.f;
        if(softReference0 == null) {
            callSiteArray0 = b.a();
            b.f = new SoftReference(callSiteArray0);
        }
        else {
            callSiteArray0 = (CallSiteArray)softReference0.get();
            if(callSiteArray0 == null) {
                callSiteArray0 = b.a();
                b.f = new SoftReference(callSiteArray0);
                return callSiteArray0.array;
            }
        }
        return callSiteArray0.array;
    }

    protected MetaClass d() {
        if(this.getClass() != b.class) {
            return ScriptBytecodeAdapter.initMetaClass(this);
        }
        ClassInfo classInfo0 = b.b;
        if(classInfo0 == null) {
            classInfo0 = ClassInfo.getClassInfo(this.getClass());
            b.b = classInfo0;
        }
        return classInfo0.getMetaClass();
    }

    public static void e() {
        b.c();
        b.f = null;
    }

    public void f(Object object0) {
        this.g(((Project)object0));
    }

    public void g(Project project0) {
        class a extends Closure implements GeneratedClosure {
            private Reference a;
            private Reference b;
            private Reference c;
            private Reference d;
            private Reference e;
            private static ClassInfo f;
            public static transient boolean g;
            private static SoftReference h;

            static {
                a.e();
            }

            public a(Object object0, Object object1, Reference reference0, Reference reference1, Reference reference2, Reference reference3, Reference reference4) {
                a.c();
                super(object0, object1);
                this.a = reference0;
                this.b = reference1;
                this.c = reference2;
                this.d = reference3;
                this.e = reference4;
            }

            private static CallSiteArray a() {
                String[] arr_s = new String[8];
                a.b(arr_s);
                return new CallSiteArray(a.class, arr_s);
            }

            private static void b(String[] arr_s) {
                arr_s[0] = "disableDiscovery";
                arr_s[1] = "apt";
                arr_s[2] = "processors";
                arr_s[3] = "apt";
                arr_s[4] = "<$constructor$>";
                arr_s[5] = "all";
                arr_s[6] = "getAt";
                arr_s[7] = "android";
            }

            private static CallSite[] c() {
                CallSiteArray callSiteArray0;
                SoftReference softReference0 = a.h;
                if(softReference0 == null) {
                    callSiteArray0 = a.a();
                    a.h = new SoftReference(callSiteArray0);
                }
                else {
                    callSiteArray0 = (CallSiteArray)softReference0.get();
                    if(callSiteArray0 == null) {
                        callSiteArray0 = a.a();
                        a.h = new SoftReference(callSiteArray0);
                        return callSiteArray0.array;
                    }
                }
                return callSiteArray0.array;
            }

            protected MetaClass d() {
                if(this.getClass() != a.class) {
                    return ScriptBytecodeAdapter.initMetaClass(this);
                }
                ClassInfo classInfo0 = a.f;
                if(classInfo0 == null) {
                    classInfo0 = ClassInfo.getClassInfo(this.getClass());
                    a.f = classInfo0;
                }
                return classInfo0.getMetaClass();
            }

            public static void e() {
                a.c();
                a.h = null;
            }

            static Class f(String s) {
                try {
                    return Class.forName(s);
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    throw new NoClassDefFoundError(classNotFoundException0.getMessage());
                }
            }

            public Object g() {
                a.c();
                return this.h(null);
            }

            public Object h(Object object0) {
                class com.neenbedankt.gradle.androidapt.b.a.a extends Closure implements GeneratedClosure {
                    private Reference a;
                    private Reference b;
                    private Reference c;
                    private Reference d;
                    private static ClassInfo e;
                    public static transient boolean f;
                    private static SoftReference g;

                    static {
                        com.neenbedankt.gradle.androidapt.b.a.a.e();
                    }

                    public com.neenbedankt.gradle.androidapt.b.a.a(Object object0, Object object1, Reference reference0, Reference reference1, Reference reference2, Reference reference3) {
                        com.neenbedankt.gradle.androidapt.b.a.a.c();
                        super(object0, object1);
                        this.a = reference0;
                        this.b = reference1;
                        this.c = reference2;
                        this.d = reference3;
                    }

                    private static CallSiteArray a() {
                        String[] arr_s = new String[10];
                        com.neenbedankt.gradle.androidapt.b.a.a.b(arr_s);
                        return new CallSiteArray(com.neenbedankt.gradle.androidapt.b.a.a.class, arr_s);
                    }

                    private static void b(String[] arr_s) {
                        arr_s[0] = "configureVariant";
                        arr_s[1] = "apt";
                        arr_s[2] = "testVariant";
                        arr_s[3] = "configureVariant";
                        arr_s[4] = "testVariant";
                        arr_s[5] = "apt";
                        arr_s[6] = "hasProperty";
                        arr_s[7] = "configureVariant";
                        arr_s[8] = "unitTestVariant";
                        arr_s[9] = "apt";
                    }

                    private static CallSite[] c() {
                        CallSiteArray callSiteArray0;
                        SoftReference softReference0 = com.neenbedankt.gradle.androidapt.b.a.a.g;
                        if(softReference0 == null) {
                            callSiteArray0 = com.neenbedankt.gradle.androidapt.b.a.a.a();
                            com.neenbedankt.gradle.androidapt.b.a.a.g = new SoftReference(callSiteArray0);
                        }
                        else {
                            callSiteArray0 = (CallSiteArray)softReference0.get();
                            if(callSiteArray0 == null) {
                                callSiteArray0 = com.neenbedankt.gradle.androidapt.b.a.a.a();
                                com.neenbedankt.gradle.androidapt.b.a.a.g = new SoftReference(callSiteArray0);
                                return callSiteArray0.array;
                            }
                        }
                        return callSiteArray0.array;
                    }

                    protected MetaClass d() {
                        if(this.getClass() != com.neenbedankt.gradle.androidapt.b.a.a.class) {
                            return ScriptBytecodeAdapter.initMetaClass(this);
                        }
                        ClassInfo classInfo0 = com.neenbedankt.gradle.androidapt.b.a.a.e;
                        if(classInfo0 == null) {
                            classInfo0 = ClassInfo.getClassInfo(this.getClass());
                            com.neenbedankt.gradle.androidapt.b.a.a.e = classInfo0;
                        }
                        return classInfo0.getMetaClass();
                    }

                    public static void e() {
                        com.neenbedankt.gradle.androidapt.b.a.a.c();
                        com.neenbedankt.gradle.androidapt.b.a.a.g = null;
                    }

                    static Class f(String s) {
                        try {
                            return Class.forName(s);
                        }
                        catch(ClassNotFoundException classNotFoundException0) {
                            throw new NoClassDefFoundError(classNotFoundException0.getMessage());
                        }
                    }

                    public Object g(Object object0) {
                        CallSite[] arr_callSite = com.neenbedankt.gradle.androidapt.b.a.a.c();
                        arr_callSite[0].callCurrent(((GroovyObject)this), this.c.get(), object0, this.a.get(), arr_callSite[1].callGetProperty(this.c.get()));
                        if(DefaultTypeTransformation.booleanUnbox(arr_callSite[2].callGetProperty(object0)) && DefaultTypeTransformation.booleanUnbox(this.d.get())) {
                            arr_callSite[3].callCurrent(((GroovyObject)this), this.c.get(), arr_callSite[4].callGetProperty(object0), this.d.get(), arr_callSite[5].callGetProperty(this.c.get()));
                        }
                        return !DefaultTypeTransformation.booleanUnbox(arr_callSite[6].call(object0, "unitTestVariant")) || !DefaultTypeTransformation.booleanUnbox(this.b.get()) ? null : arr_callSite[7].callCurrent(((GroovyObject)this), this.c.get(), arr_callSite[8].callGetProperty(object0), this.b.get(), arr_callSite[9].callGetProperty(this.c.get()));
                    }

                    public Object h() {
                        com.neenbedankt.gradle.androidapt.b.a.a.c();
                        return this.a.get();
                    }

                    public Object i() {
                        com.neenbedankt.gradle.androidapt.b.a.a.c();
                        return this.d.get();
                    }

                    public Object j() {
                        com.neenbedankt.gradle.androidapt.b.a.a.c();
                        return this.b.get();
                    }

                    public Project k() {
                        com.neenbedankt.gradle.androidapt.b.a.a.c();
                        return (Project)ScriptBytecodeAdapter.castToType(this.c.get(), Project.class);
                    }
                }

                CallSite[] arr_callSite = a.c();
                if(DefaultTypeTransformation.booleanUnbox(arr_callSite[0].call(arr_callSite[1].callGetProperty(this.c.get()))) && !DefaultTypeTransformation.booleanUnbox(arr_callSite[2].call(arr_callSite[3].callGetProperty(this.c.get())))) {
                    throw (Throwable)arr_callSite[4].callConstructor(ProjectConfigurationException.class, "android-apt configuration error: disableDiscovery may only be enabled in the apt configuration when there\'s at least one processor configured", null);
                }
                return arr_callSite[5].call(arr_callSite[6].call(arr_callSite[7].callGetProperty(this.c.get()), this.d.get()), new com.neenbedankt.gradle.androidapt.b.a.a(this, this.getThisObject(), this.a, this.b, this.c, this.e));
            }

            public Object i() {
                a.c();
                return this.a.get();
            }

            public Object j() {
                a.c();
                return this.e.get();
            }

            public Object k() {
                a.c();
                return this.b.get();
            }

            public Project l() {
                a.c();
                return (Project)ScriptBytecodeAdapter.castToType(this.c.get(), Project.class);
            }

            public Object m() {
                a.c();
                return this.d.get();
            }
        }

        Reference reference0 = new Reference(project0);
        CallSite[] arr_callSite = b.c();
        Reference reference1 = new Reference(null);
        if(DefaultTypeTransformation.booleanUnbox(arr_callSite[0].call(arr_callSite[1].callGetProperty(((Project)reference0.get())), "com.android.application")) || DefaultTypeTransformation.booleanUnbox(arr_callSite[2].call(arr_callSite[3].callGetProperty(((Project)reference0.get())), "android")) || DefaultTypeTransformation.booleanUnbox(arr_callSite[4].call(arr_callSite[5].callGetProperty(((Project)reference0.get())), "com.android.test"))) {
            reference1.set("applicationVariants");
        }
        else {
            if(!DefaultTypeTransformation.booleanUnbox(arr_callSite[6].call(arr_callSite[7].callGetProperty(((Project)reference0.get())), "com.android.library")) && !DefaultTypeTransformation.booleanUnbox(arr_callSite[8].call(arr_callSite[9].callGetProperty(((Project)reference0.get())), "android-library"))) {
                throw (Throwable)arr_callSite[10].callConstructor(ProjectConfigurationException.class, "The android or android-library plugin must be applied to the project", null);
            }
            reference1.set("libraryVariants");
        }
        Reference reference2 = new Reference(arr_callSite[11].call(arr_callSite[12].call(arr_callSite[13].callGetProperty(((Project)reference0.get())), "apt"), arr_callSite[14].callGetProperty(arr_callSite[15].callGetProperty(((Project)reference0.get()))), arr_callSite[16].callGetProperty(arr_callSite[17].callGetProperty(((Project)reference0.get())))));
        Reference reference3 = new Reference(null);
        try {
            reference3.set(arr_callSite[18].call(arr_callSite[19].call(arr_callSite[20].callGetProperty(((Project)reference0.get())), "androidTestApt"), arr_callSite[21].call(arr_callSite[22].callGetProperty(((Project)reference0.get())), "androidTestCompile"), arr_callSite[23].call(arr_callSite[24].callGetProperty(((Project)reference0.get())), "androidTestProvided")));
        }
        catch(UnknownConfigurationException unused_ex) {
        }
        Reference reference4 = new Reference(null);
        reference4.get();
        try {
            reference4.set(arr_callSite[25].call(arr_callSite[26].call(arr_callSite[27].callGetProperty(((Project)reference0.get())), "testApt"), arr_callSite[28].call(arr_callSite[29].callGetProperty(((Project)reference0.get())), "testCompile"), arr_callSite[30].call(arr_callSite[0x1F].callGetProperty(((Project)reference0.get())), "testProvided")));
        }
        catch(UnknownConfigurationException unused_ex) {
        }
        arr_callSite[0x20].call(arr_callSite[33].callGetProperty(((Project)reference0.get())), "apt", com.neenbedankt.gradle.androidapt.a.class);
        arr_callSite[34].call(((Project)reference0.get()), new a(this, this, reference2, reference4, reference0, reference1, reference3));
    }

    static Class h(String s) {
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new NoClassDefFoundError(classNotFoundException0.getMessage());
        }
    }

    public static void i(Object object0, Object object1, Object object2, Object object3) {
        class com.neenbedankt.gradle.androidapt.b.b extends Closure implements GeneratedClosure {
            private Reference a;
            private static ClassInfo b;
            public static transient boolean c;
            private static SoftReference d;

            static {
                com.neenbedankt.gradle.androidapt.b.b.e();
            }

            public com.neenbedankt.gradle.androidapt.b.b(Object object0, Object object1, Reference reference0) {
                com.neenbedankt.gradle.androidapt.b.b.c();
                super(object0, object1);
                this.a = reference0;
            }

            private static CallSiteArray a() {
                String[] arr_s = new String[1];
                com.neenbedankt.gradle.androidapt.b.b.b(arr_s);
                return new CallSiteArray(com.neenbedankt.gradle.androidapt.b.b.class, arr_s);
            }

            private static void b(String[] arr_s) {
                arr_s[0] = "mkdirs";
            }

            private static CallSite[] c() {
                CallSiteArray callSiteArray0;
                SoftReference softReference0 = com.neenbedankt.gradle.androidapt.b.b.d;
                if(softReference0 == null) {
                    callSiteArray0 = com.neenbedankt.gradle.androidapt.b.b.a();
                    com.neenbedankt.gradle.androidapt.b.b.d = new SoftReference(callSiteArray0);
                }
                else {
                    callSiteArray0 = (CallSiteArray)softReference0.get();
                    if(callSiteArray0 == null) {
                        callSiteArray0 = com.neenbedankt.gradle.androidapt.b.b.a();
                        com.neenbedankt.gradle.androidapt.b.b.d = new SoftReference(callSiteArray0);
                        return callSiteArray0.array;
                    }
                }
                return callSiteArray0.array;
            }

            protected MetaClass d() {
                if(this.getClass() != com.neenbedankt.gradle.androidapt.b.b.class) {
                    return ScriptBytecodeAdapter.initMetaClass(this);
                }
                ClassInfo classInfo0 = com.neenbedankt.gradle.androidapt.b.b.b;
                if(classInfo0 == null) {
                    classInfo0 = ClassInfo.getClassInfo(this.getClass());
                    com.neenbedankt.gradle.androidapt.b.b.b = classInfo0;
                }
                return classInfo0.getMetaClass();
            }

            public static void e() {
                com.neenbedankt.gradle.androidapt.b.b.c();
                com.neenbedankt.gradle.androidapt.b.b.d = null;
            }

            static Class f(String s) {
                try {
                    return Class.forName(s);
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    throw new NoClassDefFoundError(classNotFoundException0.getMessage());
                }
            }

            public Object g() {
                com.neenbedankt.gradle.androidapt.b.b.c();
                return this.h(null);
            }

            public Object h(Object object0) {
                return com.neenbedankt.gradle.androidapt.b.b.c()[0].call(this.a.get());
            }

            public Object i() {
                com.neenbedankt.gradle.androidapt.b.b.c();
                return this.a.get();
            }
        }

        CallSite[] arr_callSite = b.c();
        if(DefaultTypeTransformation.booleanUnbox(arr_callSite[35].callGetProperty(object2))) {
            arr_callSite[36].call(arr_callSite[37].callGetProperty(object0), new GStringImpl(new Object[]{arr_callSite[38].callGetProperty(object2)}, new String[]{"No apt dependencies for configuration ", ""}));
            return;
        }
        CallSite callSite0 = arr_callSite[39];
        CallSite callSite1 = arr_callSite[40];
        Object object4 = arr_callSite[41].callGetProperty(object0);
        Object object5 = callSite0.call(object0, callSite1.callConstructor(File.class, object4, "generated/source/apt"));
        CallSite callSite2 = arr_callSite[42];
        Object object6 = arr_callSite[43].callGetProperty(object1);
        Reference reference0 = new Reference(callSite2.callConstructor(File.class, object5, object6));
        Object object7 = (DefaultTypeTransformation.booleanUnbox(arr_callSite[44].call(object1, "javaCompiler")) ? arr_callSite[45] : arr_callSite[46]).callGetProperty(object1);
        arr_callSite[0x2F].call(object1, reference0.get());
        Object object8 = arr_callSite[0x30].callGetProperty(arr_callSite[49].call(object2, arr_callSite[50].callGetProperty(object7)));
        Object object9 = arr_callSite[51].callGetProperty(object2);
        if(DefaultTypeTransformation.booleanUnbox(object9)) {
            ScriptBytecodeAdapter.setProperty(arr_callSite[52].call(arr_callSite[53].callGetProperty(object7), object9), null, object7, "dependsOn");
        }
        Object object10 = arr_callSite[54].call(object3);
        ScriptBytecodeAdapter.setProperty(arr_callSite[55].call(arr_callSite[56].callGetProperty(arr_callSite[57].callGetProperty(object7)), ScriptBytecodeAdapter.createList(new Object[]{"-s", reference0.get()})), null, arr_callSite[58].callGetProperty(object7), "compilerArgs");
        if(DefaultTypeTransformation.booleanUnbox(object10)) {
            ScriptBytecodeAdapter.setProperty(arr_callSite[59].call(arr_callSite[60].callGetProperty(arr_callSite[61].callGetProperty(object7)), ScriptBytecodeAdapter.createList(new Object[]{"-processor", object10})), null, arr_callSite[62].callGetProperty(object7), "compilerArgs");
        }
        if(!DefaultTypeTransformation.booleanUnbox(object10) || !DefaultTypeTransformation.booleanUnbox(arr_callSite[0x3F].call(object3))) {
            ScriptBytecodeAdapter.setProperty(arr_callSite[0x40].call(arr_callSite[65].callGetProperty(arr_callSite[66].callGetProperty(object7)), ScriptBytecodeAdapter.createList(new Object[]{"-processorpath", object8})), null, arr_callSite[67].callGetProperty(object7), "compilerArgs");
        }
        ScriptBytecodeAdapter.setProperty(object1, null, arr_callSite[68].callGetProperty(object3), "variant");
        ScriptBytecodeAdapter.setProperty(object0, null, arr_callSite[69].callGetProperty(object3), "project");
        ScriptBytecodeAdapter.setProperty(arr_callSite[70].callGetProperty(object0), null, arr_callSite[71].callGetProperty(object3), "android");
        ScriptBytecodeAdapter.setProperty(arr_callSite[72].call(arr_callSite[73].callGetProperty(arr_callSite[74].callGetProperty(object7)), arr_callSite[75].call(object3)), null, arr_callSite[76].callGetProperty(object7), "compilerArgs");
        arr_callSite[77].call(object7, new com.neenbedankt.gradle.androidapt.b.b(b.class, b.class, reference0));
        Object object11 = arr_callSite[78].callGetProperty(object7);
        Object object12 = arr_callSite[0x4F].call(object11, object7);
        Iterator iterator0 = (Iterator)ScriptBytecodeAdapter.castToType(arr_callSite[80].call(object12), Iterator.class);
        while(iterator0.hasNext()) {
            Object object13 = iterator0.next();
            if(object13 instanceof GroovyCompile && DefaultTypeTransformation.booleanUnbox(arr_callSite[81].call(arr_callSite[82].callGetProperty(object13), "javaAnnotationProcessing"))) {
                ScriptBytecodeAdapter.setProperty(arr_callSite[83].call(arr_callSite[84].callGetProperty(arr_callSite[85].callGetProperty(object13)), arr_callSite[86].callGetProperty(arr_callSite[87].callGetProperty(object7))), null, arr_callSite[88].callGetProperty(object13), "compilerArgs");
                Object object14 = arr_callSite[89].callGetProperty(object13);
                ScriptBytecodeAdapter.setProperty(Boolean.TRUE, null, object14, "javaAnnotationProcessing");
            }
        }
    }

    public MetaClass j() {
        MetaClass metaClass0 = this.a;
        if(metaClass0 != null) {
            return metaClass0;
        }
        MetaClass metaClass1 = this.d();
        this.a = metaClass1;
        return metaClass1;
    }

    public Object k(String s) {
        return this.j().getProperty(this, s);
    }

    public Object l(String s, Object object0) {
        return this.j().invokeMethod(this, s, object0);
    }

    public void m(MetaClass metaClass0) {
        this.a = metaClass0;
    }

    public void n(String s, Object object0) {
        this.j().setProperty(this, s, object0);
    }

    public Object o() {
        return super.clone();
    }

    public boolean p(Object object0) {
        return super.equals(object0);
    }

    public void q() {
        super.finalize();
    }

    public Class r() {
        return super.getClass();
    }

    public int s() {
        return super.hashCode();
    }

    public void t() {
        super.notify();
    }

    public void u() {
        super.notifyAll();
    }

    public String v() {
        return super.toString();
    }

    public void w() {
        super.wait();
    }

    public void x(long v) {
        super.wait(v);
    }

    public void y(long v, int v1) {
        super.wait(v, v1);
    }

    public Object z(String s) {
        b.c();
        String s1 = ShortTypeHandling.castToString(new GStringImpl(new Object[]{s}, new String[]{"", ""}));
        return ScriptBytecodeAdapter.getGroovyObjectProperty(b.class, this, s1);
    }
}

