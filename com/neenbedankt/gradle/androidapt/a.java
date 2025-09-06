package com.neenbedankt.gradle.androidapt;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class a implements GroovyObject {
    private final Object a;
    private Object b;
    private Object c;
    private Object d;
    private transient MetaClass e;
    private static ClassInfo f;
    public static transient boolean g;
    public static long h;
    public static long i;
    private static SoftReference j;

    static {
        a.e();
        a.i = 0L;
        a.h = 0x14FF0639C9FL;
    }

    public a() {
        this.a = a.c()[0].callConstructor(c.class);
        this.c = ScriptBytecodeAdapter.createList(new Object[0]);
        this.d = Boolean.FALSE;
        this.e = this.d();
    }

    public void A() {
        super.wait();
    }

    public void B(long v) {
        super.wait(v);
    }

    public void C(long v, int v1) {
        super.wait(v, v1);
    }

    public Object D(String s) {
        a.c();
        String s1 = ShortTypeHandling.castToString(new GStringImpl(new Object[]{s}, new String[]{"", ""}));
        return ScriptBytecodeAdapter.getGroovyObjectProperty(a.class, this, s1);
    }

    public Object E(String s, Object object0) {
        a.c();
        String s1 = ShortTypeHandling.castToString(new GStringImpl(new Object[]{s}, new String[]{"", ""}));
        Object[] arr_object = ScriptBytecodeAdapter.despreadList(new Object[0], new Object[]{object0}, new int[]{0});
        return ScriptBytecodeAdapter.invokeMethodOnCurrentN(a.class, this, s1, arr_object);
    }

    public void F(String s, Object object0) {
        a.c();
        String s1 = ShortTypeHandling.castToString(new GStringImpl(new Object[]{s}, new String[]{"", ""}));
        ScriptBytecodeAdapter.setGroovyObjectProperty(object0, a.class, this, s1);
    }

    private static CallSiteArray a() {
        String[] arr_s = new String[7];
        a.b(arr_s);
        return new CallSiteArray(a.class, arr_s);
    }

    private static void b(String[] arr_s) {
        arr_s[0] = "<$constructor$>";
        arr_s[1] = "DELEGATE_FIRST";
        arr_s[2] = "leftShift";
        arr_s[3] = "join";
        arr_s[4] = "clear";
        arr_s[5] = "arguments";
        arr_s[6] = "arguments";
    }

    private static CallSite[] c() {
        CallSiteArray callSiteArray0;
        SoftReference softReference0 = a.j;
        if(softReference0 == null) {
            callSiteArray0 = a.a();
            a.j = new SoftReference(callSiteArray0);
        }
        else {
            callSiteArray0 = (CallSiteArray)softReference0.get();
            if(callSiteArray0 == null) {
                callSiteArray0 = a.a();
                a.j = new SoftReference(callSiteArray0);
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
        a.j = null;
    }

    public Object f() {
        CallSite[] arr_callSite = a.c();
        arr_callSite[4].call(arr_callSite[5].callGetProperty(this.a));
        if(DefaultTypeTransformation.booleanUnbox(this.b)) {
            ScriptBytecodeAdapter.invokeClosure(this.b, new Object[0]);
        }
        return arr_callSite[6].callGetProperty(this.a);
    }

    public Object g(Closure closure0) {
        ScriptBytecodeAdapter.setGroovyObjectProperty(a.c()[1].callGetProperty(Closure.class), a.class, ((GroovyObject)closure0), "resolveStrategy");
        ScriptBytecodeAdapter.setGroovyObjectProperty(this.a, a.class, ((GroovyObject)closure0), "delegate");
        this.b = closure0;
        return closure0;
    }

    static Class h(String s) {
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new NoClassDefFoundError(classNotFoundException0.getMessage());
        }
    }

    public Object i() {
        a.c();
        return this.d;
    }

    public Object j(boolean z) {
        a.c();
        this.d = Boolean.valueOf(z);
        return Boolean.valueOf(z);
    }

    public final Object k() {
        return this.a;
    }

    public MetaClass l() {
        MetaClass metaClass0 = this.e;
        if(metaClass0 != null) {
            return metaClass0;
        }
        MetaClass metaClass1 = this.d();
        this.e = metaClass1;
        return metaClass1;
    }

    public Object m(String s) {
        return this.l().getProperty(this, s);
    }

    public Object n(String s, Object object0) {
        return this.l().invokeMethod(this, s, object0);
    }

    public Object o(Object object0) {
        return a.c()[2].call(this.c, object0);
    }

    public Object p() {
        return a.c()[3].call(this.c, ",");
    }

    public void q(MetaClass metaClass0) {
        this.e = metaClass0;
    }

    public void r(String s, Object object0) {
        this.l().setProperty(this, s, object0);
    }

    public Object s() {
        return super.clone();
    }

    public boolean t(Object object0) {
        return super.equals(object0);
    }

    public void u() {
        super.finalize();
    }

    public Class v() {
        return super.getClass();
    }

    public int w() {
        return super.hashCode();
    }

    public void x() {
        super.notify();
    }

    public void y() {
        super.notifyAll();
    }

    public String z() {
        return super.toString();
    }
}

