package com.neenbedankt.gradle.androidapt;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class c implements GroovyObject {
    private Object a;
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
        c.e();
        c.i = 0L;
        c.h = 0x14FF0639D0CL;
    }

    public c() {
        c.c();
        this.a = ScriptBytecodeAdapter.createList(new Object[0]);
        this.e = this.d();
    }

    public void A() {
        super.notify();
    }

    public void B() {
        super.notifyAll();
    }

    public String C() {
        return super.toString();
    }

    public void D() {
        super.wait();
    }

    public void E(long v) {
        super.wait(v);
    }

    public void F(long v, int v1) {
        super.wait(v, v1);
    }

    public Object G(String s) {
        c.c();
        String s1 = ShortTypeHandling.castToString(new GStringImpl(new Object[]{s}, new String[]{"", ""}));
        return ScriptBytecodeAdapter.getGroovyObjectProperty(c.class, this, s1);
    }

    public Object H(String s, Object object0) {
        c.c();
        String s1 = ShortTypeHandling.castToString(new GStringImpl(new Object[]{s}, new String[]{"", ""}));
        Object[] arr_object = ScriptBytecodeAdapter.despreadList(new Object[0], new Object[]{object0}, new int[]{0});
        return ScriptBytecodeAdapter.invokeMethodOnCurrentN(c.class, this, s1, arr_object);
    }

    public void I(String s, Object object0) {
        c.c();
        String s1 = ShortTypeHandling.castToString(new GStringImpl(new Object[]{s}, new String[]{"", ""}));
        ScriptBytecodeAdapter.setGroovyObjectProperty(object0, c.class, this, s1);
    }

    private static CallSiteArray a() {
        String[] arr_s = new String[5];
        c.b(arr_s);
        return new CallSiteArray(c.class, arr_s);
    }

    private static void b(String[] arr_s) {
        arr_s[0] = "length";
        arr_s[1] = "leftShift";
        arr_s[2] = "leftShift";
        arr_s[3] = "join";
        arr_s[4] = "getAt";
    }

    private static CallSite[] c() {
        CallSiteArray callSiteArray0;
        SoftReference softReference0 = c.j;
        if(softReference0 == null) {
            callSiteArray0 = c.a();
            c.j = new SoftReference(callSiteArray0);
        }
        else {
            callSiteArray0 = (CallSiteArray)softReference0.get();
            if(callSiteArray0 == null) {
                callSiteArray0 = c.a();
                c.j = new SoftReference(callSiteArray0);
                return callSiteArray0.array;
            }
        }
        return callSiteArray0.array;
    }

    protected MetaClass d() {
        if(this.getClass() != c.class) {
            return ScriptBytecodeAdapter.initMetaClass(this);
        }
        ClassInfo classInfo0 = c.f;
        if(classInfo0 == null) {
            classInfo0 = ClassInfo.getClassInfo(this.getClass());
            c.f = classInfo0;
        }
        return classInfo0.getMetaClass();
    }

    public static void e() {
        c.c();
        c.j = null;
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
        return this.d;
    }

    public Object h() {
        return this.a;
    }

    public MetaClass i() {
        MetaClass metaClass0 = this.e;
        if(metaClass0 != null) {
            return metaClass0;
        }
        MetaClass metaClass1 = this.d();
        this.e = metaClass1;
        return metaClass1;
    }

    public Object j() {
        return this.b;
    }

    public Object k(String s) {
        return this.i().getProperty(this, s);
    }

    public Object l() {
        return this.c;
    }

    public Object m(String s, Object object0) {
        return this.i().invokeMethod(this, s, object0);
    }

    public Object n(String s, Object object0) {
        CallSite[] arr_callSite = c.c();
        return ScriptBytecodeAdapter.compareEqual(arr_callSite[0].callGetProperty(object0), 0) ? arr_callSite[1].call(this.a, new GStringImpl(new Object[]{s}, new String[]{"-A", ""})) : arr_callSite[2].call(this.a, new GStringImpl(new Object[]{s, arr_callSite[3].call(object0, " ")}, new String[]{"-A", "=", ""}));
    }

    public Object o(String s) {
        return c.c()[4].call(this.b, s);
    }

    public void p(Object object0) {
        this.d = object0;
    }

    public void q(Object object0) {
        this.a = object0;
    }

    public void r(MetaClass metaClass0) {
        this.e = metaClass0;
    }

    public void s(Object object0) {
        this.b = object0;
    }

    public void t(String s, Object object0) {
        this.i().setProperty(this, s, object0);
    }

    public void u(Object object0) {
        this.c = object0;
    }

    public Object v() {
        return super.clone();
    }

    public boolean w(Object object0) {
        return super.equals(object0);
    }

    public void x() {
        super.finalize();
    }

    public Class y() {
        return super.getClass();
    }

    public int z() {
        return super.hashCode();
    }
}

