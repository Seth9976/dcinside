package javassist.util;

import com.sun.tools.attach.VirtualMachine;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.management.ManagementFactory;
import java.util.jar.Attributes.Name;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import javassist.E;
import javassist.b;
import javassist.g;
import javassist.l;
import jeb.synthetic.TWR;

public class a {
    private static Instrumentation a;

    static {
    }

    public static void a(String s, Instrumentation instrumentation0) throws Throwable {
        if(!instrumentation0.isRedefineClassesSupported()) {
            throw new RuntimeException("this JVM does not support redefinition of classes");
        }
        a.a = instrumentation0;
    }

    public static File b(String s) throws IOException, b, E {
        return a.d(new File(s));
    }

    private static File c() throws IOException, b, E {
        File file0 = File.createTempFile("agent", ".jar");
        file0.deleteOnExit();
        return a.d(file0);
    }

    private static File d(File file0) throws IOException, b, E {
        Manifest manifest0 = new Manifest();
        Attributes attributes0 = manifest0.getMainAttributes();
        attributes0.put(Attributes.Name.MANIFEST_VERSION, "1.0");
        attributes0.put(new Attributes.Name("Premain-Class"), "javassist.util.a");
        attributes0.put(new Attributes.Name("Agent-Class"), "javassist.util.a");
        attributes0.put(new Attributes.Name("Can-Retransform-Classes"), "true");
        attributes0.put(new Attributes.Name("Can-Redefine-Classes"), "true");
        JarOutputStream jarOutputStream0 = null;
        try {
            jarOutputStream0 = new JarOutputStream(new FileOutputStream(file0), manifest0);
            jarOutputStream0.putNextEntry(new JarEntry("javassist/util/a.class"));
            jarOutputStream0.write(g.T().s("javassist.util.a").M0());
            jarOutputStream0.closeEntry();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(jarOutputStream0, throwable0);
            throw throwable0;
        }
        jarOutputStream0.close();
        return file0;
    }

    public Instrumentation e() {
        return a.a;
    }

    public static void f(String s, Instrumentation instrumentation0) throws Throwable {
        a.a(s, instrumentation0);
    }

    public static void g(Class class0, l l0) throws E, IOException, b {
        a.h(new Class[]{class0}, new l[]{l0});
    }

    public static void h(Class[] arr_class, l[] arr_l) throws E, IOException, b {
        a.i();
        ClassDefinition[] arr_classDefinition = new ClassDefinition[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_classDefinition[v] = new ClassDefinition(arr_class[v], arr_l[v].M0());
        }
        try {
            a.a.redefineClasses(arr_classDefinition);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new E(classNotFoundException0.getMessage(), classNotFoundException0);
        }
        catch(UnmodifiableClassException unmodifiableClassException0) {
            throw new b(unmodifiableClassException0.getMessage(), ((Throwable)unmodifiableClassException0));
        }
    }

    private static void i() throws E {
        if(a.a != null) {
            return;
        }
        try {
            File file0 = a.c();
            String s = ManagementFactory.getRuntimeMXBean().getName();
            VirtualMachine virtualMachine0 = VirtualMachine.attach(s.substring(0, s.indexOf(0x40)));
            virtualMachine0.loadAgent(file0.getAbsolutePath(), null);
            virtualMachine0.detach();
        }
        catch(Exception exception0) {
            throw new E("hotswap agent", exception0);
        }
        for(int v = 0; v < 10; ++v) {
            if(a.a != null) {
                return;
            }
            try {
                Thread.sleep(1000L);
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                if(true) {
                    break;
                }
            }
        }
        throw new E("hotswap agent (timeout)");
    }
}

