package javassist.util.proxy;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.MethodHandles.Lookup;
import java.security.ProtectionDomain;
import javassist.b;
import javassist.bytecode.k;

public class g {
    public static final Class[] a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final int[] f;

    static {
        g.a = new Class[]{Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};
        g.b = new String[]{"java.lang.Boolean", "java.lang.Byte", "java.lang.Character", "java.lang.Short", "java.lang.Integer", "java.lang.Long", "java.lang.Float", "java.lang.Double", "java.lang.Void"};
        g.c = new String[]{"(Z)V", "(B)V", "(C)V", "(S)V", "(I)V", "(J)V", "(F)V", "(D)V"};
        g.d = new String[]{"booleanValue", "byteValue", "charValue", "shortValue", "intValue", "longValue", "floatValue", "doubleValue"};
        g.e = new String[]{"()Z", "()B", "()C", "()S", "()I", "()J", "()F", "()D"};
        g.f = new int[]{1, 1, 1, 1, 1, 2, 1, 2};
    }

    private static byte[] a(k k0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0)) {
            k0.U(dataOutputStream0);
            return byteArrayOutputStream0.toByteArray();
        }
    }

    public static Class b(k k0, Class class0, ClassLoader classLoader0, ProtectionDomain protectionDomain0) throws b {
        try {
            byte[] arr_b = g.a(k0);
            return javassist.util.proxy.k.o ? c.e(k0.t(), arr_b) : c.c(k0.t(), class0, classLoader0, protectionDomain0, arr_b);
        }
        catch(IOException iOException0) {
        }
        throw new b(iOException0);
    }

    public static Class c(k k0, ClassLoader classLoader0) throws b {
        return g.b(k0, null, classLoader0, null);
    }

    public static Class d(k k0, ClassLoader classLoader0, ProtectionDomain protectionDomain0) throws b {
        return g.b(k0, null, classLoader0, protectionDomain0);
    }

    public static Class e(k k0, MethodHandles.Lookup methodHandles$Lookup0) throws b {
        try {
            return c.d(methodHandles$Lookup0, g.a(k0));
        }
        catch(IOException iOException0) {
            throw new b(iOException0);
        }
    }

    public static final int f(Class class0) {
        for(int v = 0; true; ++v) {
            Class[] arr_class = g.a;
            if(v >= arr_class.length) {
                break;
            }
            if(arr_class[v] == class0) {
                return v;
            }
        }
        throw new RuntimeException("bad type:" + class0.getName());
    }

    public static void g(k k0, String s) throws b {
        try {
            g.h(k0, s);
        }
        catch(IOException iOException0) {
            throw new b(iOException0);
        }
    }

    private static void h(k k0, String s) throws b, IOException {
        int v = File.separatorChar;
        String s1 = s + ((char)v) + k0.t().replace('.', ((char)v)) + ".class";
        int v1 = s1.lastIndexOf(v);
        if(v1 > 0) {
            String s2 = s1.substring(0, v1);
            if(!s2.equals(".")) {
                new File(s2).mkdirs();
            }
        }
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(s1)))) {
            try {
                k0.U(dataOutputStream0);
            }
            catch(IOException iOException0) {
                throw iOException0;
            }
        }
    }
}

