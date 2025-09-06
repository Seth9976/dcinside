package org.mp4parser.aj.runtime.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.mp4parser.aj.lang.JoinPoint.EnclosingStaticPart;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.lang.Signature;
import org.mp4parser.aj.lang.reflect.AdviceSignature;
import org.mp4parser.aj.lang.reflect.CatchClauseSignature;
import org.mp4parser.aj.lang.reflect.ConstructorSignature;
import org.mp4parser.aj.lang.reflect.FieldSignature;
import org.mp4parser.aj.lang.reflect.InitializerSignature;
import org.mp4parser.aj.lang.reflect.LockSignature;
import org.mp4parser.aj.lang.reflect.MethodSignature;
import org.mp4parser.aj.lang.reflect.SourceLocation;
import org.mp4parser.aj.lang.reflect.UnlockSignature;

public final class Factory {
    private static Object[] NO_ARGS;
    private static final String[] NO_STRINGS;
    private static final Class[] NO_TYPES;
    static Class class$java$lang$ClassNotFoundException;
    int count;
    String filename;
    Class lexicalClass;
    ClassLoader lookupClassLoader;
    static Hashtable prims;

    static {
        Factory.NO_TYPES = new Class[0];
        Factory.NO_STRINGS = new String[0];
        Hashtable hashtable0 = new Hashtable();
        Factory.prims = hashtable0;
        hashtable0.put("void", Void.TYPE);
        Factory.prims.put("boolean", Boolean.TYPE);
        Factory.prims.put("byte", Byte.TYPE);
        Factory.prims.put("char", Character.TYPE);
        Factory.prims.put("short", Short.TYPE);
        Factory.prims.put("int", Integer.TYPE);
        Factory.prims.put("long", Long.TYPE);
        Factory.prims.put("float", Float.TYPE);
        Factory.prims.put("double", Double.TYPE);
        Factory.NO_ARGS = new Object[0];
    }

    public Factory(String s, Class class0) {
        this.filename = s;
        this.lexicalClass = class0;
        this.count = 0;
        this.lookupClassLoader = class0.getClassLoader();
    }

    static Class class$(String s) {
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new NoClassDefFoundError(classNotFoundException0.getMessage());
        }
    }

    public EnclosingStaticPart makeAdviceESJP(String s, int v, String s1, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, Class class1, int v1) {
        AdviceSignatureImpl adviceSignatureImpl0 = new AdviceSignatureImpl(v, s1, class0, (arr_class == null ? Factory.NO_TYPES : arr_class), (arr_s == null ? Factory.NO_STRINGS : arr_s), (arr_class1 == null ? Factory.NO_TYPES : arr_class1), (class1 == null ? Void.TYPE : class1));
        int v2 = this.count;
        this.count = v2 + 1;
        return new EnclosingStaticPartImpl(v2, s, adviceSignatureImpl0, this.makeSourceLoc(v1, -1));
    }

    public StaticPart makeAdviceSJP(String s, int v, String s1, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, Class class1, int v1) {
        AdviceSignatureImpl adviceSignatureImpl0 = new AdviceSignatureImpl(v, s1, class0, (arr_class == null ? Factory.NO_TYPES : arr_class), (arr_s == null ? Factory.NO_STRINGS : arr_s), (arr_class1 == null ? Factory.NO_TYPES : arr_class1), (class1 == null ? Void.TYPE : class1));
        int v2 = this.count;
        this.count = v2 + 1;
        return new StaticPartImpl(v2, s, adviceSignatureImpl0, this.makeSourceLoc(v1, -1));
    }

    public AdviceSignature makeAdviceSig(int v, String s, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, Class class1) {
        AdviceSignature adviceSignature0 = new AdviceSignatureImpl(v, s, class0, arr_class, arr_s, arr_class1, class1);
        ((SignatureImpl)adviceSignature0).setLookupClassLoader(this.lookupClassLoader);
        return adviceSignature0;
    }

    public AdviceSignature makeAdviceSig(String s) {
        AdviceSignature adviceSignature0 = new AdviceSignatureImpl(s);
        ((SignatureImpl)adviceSignature0).setLookupClassLoader(this.lookupClassLoader);
        return adviceSignature0;
    }

    public AdviceSignature makeAdviceSig(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        int v = Integer.parseInt(s, 16);
        Class class0 = Factory.makeClass(s2, this.lookupClassLoader);
        StringTokenizer stringTokenizer0 = new StringTokenizer(s3, ":");
        int v1 = stringTokenizer0.countTokens();
        Class[] arr_class = new Class[v1];
        for(int v3 = 0; v3 < v1; ++v3) {
            arr_class[v3] = Factory.makeClass(stringTokenizer0.nextToken(), this.lookupClassLoader);
        }
        StringTokenizer stringTokenizer1 = new StringTokenizer(s4, ":");
        int v4 = stringTokenizer1.countTokens();
        String[] arr_s = new String[v4];
        for(int v5 = 0; v5 < v4; ++v5) {
            arr_s[v5] = stringTokenizer1.nextToken();
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(s5, ":");
        int v6 = stringTokenizer2.countTokens();
        Class[] arr_class1 = new Class[v6];
        for(int v2 = 0; v2 < v6; ++v2) {
            arr_class1[v2] = Factory.makeClass(stringTokenizer2.nextToken(), this.lookupClassLoader);
        }
        AdviceSignature adviceSignature0 = new AdviceSignatureImpl(v, s1, class0, arr_class, arr_s, arr_class1, Factory.makeClass(s6, this.lookupClassLoader));
        ((SignatureImpl)adviceSignature0).setLookupClassLoader(this.lookupClassLoader);
        return adviceSignature0;
    }

    public EnclosingStaticPart makeCatchClauseESJP(String s, Class class0, Class class1, String s1, int v) {
        if(s1 == null) {
            s1 = "";
        }
        CatchClauseSignatureImpl catchClauseSignatureImpl0 = new CatchClauseSignatureImpl(class0, class1, s1);
        int v1 = this.count;
        this.count = v1 + 1;
        return new EnclosingStaticPartImpl(v1, s, catchClauseSignatureImpl0, this.makeSourceLoc(v, -1));
    }

    public StaticPart makeCatchClauseSJP(String s, Class class0, Class class1, String s1, int v) {
        if(s1 == null) {
            s1 = "";
        }
        CatchClauseSignatureImpl catchClauseSignatureImpl0 = new CatchClauseSignatureImpl(class0, class1, s1);
        int v1 = this.count;
        this.count = v1 + 1;
        return new StaticPartImpl(v1, s, catchClauseSignatureImpl0, this.makeSourceLoc(v, -1));
    }

    public CatchClauseSignature makeCatchClauseSig(Class class0, Class class1, String s) {
        CatchClauseSignature catchClauseSignature0 = new CatchClauseSignatureImpl(class0, class1, s);
        ((SignatureImpl)catchClauseSignature0).setLookupClassLoader(this.lookupClassLoader);
        return catchClauseSignature0;
    }

    public CatchClauseSignature makeCatchClauseSig(String s) {
        CatchClauseSignature catchClauseSignature0 = new CatchClauseSignatureImpl(s);
        ((SignatureImpl)catchClauseSignature0).setLookupClassLoader(this.lookupClassLoader);
        return catchClauseSignature0;
    }

    public CatchClauseSignature makeCatchClauseSig(String s, String s1, String s2) {
        CatchClauseSignature catchClauseSignature0 = new CatchClauseSignatureImpl(Factory.makeClass(s, this.lookupClassLoader), Factory.makeClass(new StringTokenizer(s1, ":").nextToken(), this.lookupClassLoader), new StringTokenizer(s2, ":").nextToken());
        ((SignatureImpl)catchClauseSignature0).setLookupClassLoader(this.lookupClassLoader);
        return catchClauseSignature0;
    }

    static Class makeClass(String s, ClassLoader classLoader0) {
        if(s.equals("*")) {
            return null;
        }
        Class class0 = (Class)Factory.prims.get(s);
        if(class0 != null) {
            return class0;
        }
        try {
            return classLoader0 == null ? Class.forName(s) : Class.forName(s, false, classLoader0);
        }
        catch(ClassNotFoundException unused_ex) {
            Class class1 = Factory.class$java$lang$ClassNotFoundException;
            if(class1 == null) {
                class1 = Factory.class$("java.lang.ClassNotFoundException");
                Factory.class$java$lang$ClassNotFoundException = class1;
            }
            return class1;
        }
    }

    public EnclosingStaticPart makeConstructorESJP(String s, int v, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, int v1) {
        if(arr_class == null) {
            arr_class = Factory.NO_TYPES;
        }
        if(arr_s == null) {
            arr_s = Factory.NO_STRINGS;
        }
        if(arr_class1 == null) {
            arr_class1 = Factory.NO_TYPES;
        }
        ConstructorSignatureImpl constructorSignatureImpl0 = new ConstructorSignatureImpl(v, class0, arr_class, arr_s, arr_class1);
        int v2 = this.count;
        this.count = v2 + 1;
        return new EnclosingStaticPartImpl(v2, s, constructorSignatureImpl0, this.makeSourceLoc(v1, -1));
    }

    public StaticPart makeConstructorSJP(String s, int v, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, int v1) {
        if(arr_class == null) {
            arr_class = Factory.NO_TYPES;
        }
        if(arr_s == null) {
            arr_s = Factory.NO_STRINGS;
        }
        if(arr_class1 == null) {
            arr_class1 = Factory.NO_TYPES;
        }
        ConstructorSignatureImpl constructorSignatureImpl0 = new ConstructorSignatureImpl(v, class0, arr_class, arr_s, arr_class1);
        int v2 = this.count;
        this.count = v2 + 1;
        return new StaticPartImpl(v2, s, constructorSignatureImpl0, this.makeSourceLoc(v1, -1));
    }

    public ConstructorSignature makeConstructorSig(int v, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1) {
        ConstructorSignature constructorSignature0 = new ConstructorSignatureImpl(v, class0, arr_class, arr_s, arr_class1);
        ((SignatureImpl)constructorSignature0).setLookupClassLoader(this.lookupClassLoader);
        return constructorSignature0;
    }

    public ConstructorSignature makeConstructorSig(String s) {
        ConstructorSignature constructorSignature0 = new ConstructorSignatureImpl(s);
        ((SignatureImpl)constructorSignature0).setLookupClassLoader(this.lookupClassLoader);
        return constructorSignature0;
    }

    public ConstructorSignature makeConstructorSig(String s, String s1, String s2, String s3, String s4) {
        int v = Integer.parseInt(s, 16);
        Class class0 = Factory.makeClass(s1, this.lookupClassLoader);
        StringTokenizer stringTokenizer0 = new StringTokenizer(s2, ":");
        int v1 = stringTokenizer0.countTokens();
        Class[] arr_class = new Class[v1];
        for(int v3 = 0; v3 < v1; ++v3) {
            arr_class[v3] = Factory.makeClass(stringTokenizer0.nextToken(), this.lookupClassLoader);
        }
        StringTokenizer stringTokenizer1 = new StringTokenizer(s3, ":");
        int v4 = stringTokenizer1.countTokens();
        String[] arr_s = new String[v4];
        for(int v5 = 0; v5 < v4; ++v5) {
            arr_s[v5] = stringTokenizer1.nextToken();
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(s4, ":");
        int v6 = stringTokenizer2.countTokens();
        Class[] arr_class1 = new Class[v6];
        for(int v2 = 0; v2 < v6; ++v2) {
            arr_class1[v2] = Factory.makeClass(stringTokenizer2.nextToken(), this.lookupClassLoader);
        }
        ConstructorSignature constructorSignature0 = new ConstructorSignatureImpl(v, class0, arr_class, arr_s, arr_class1);
        ((SignatureImpl)constructorSignature0).setLookupClassLoader(this.lookupClassLoader);
        return constructorSignature0;
    }

    public EnclosingStaticPart makeESJP(String s, Signature signature0, int v) {
        int v1 = this.count;
        this.count = v1 + 1;
        return new EnclosingStaticPartImpl(v1, s, signature0, this.makeSourceLoc(v, -1));
    }

    public EnclosingStaticPart makeESJP(String s, Signature signature0, int v, int v1) {
        int v2 = this.count;
        this.count = v2 + 1;
        return new EnclosingStaticPartImpl(v2, s, signature0, this.makeSourceLoc(v, v1));
    }

    public EnclosingStaticPart makeESJP(String s, Signature signature0, SourceLocation sourceLocation0) {
        int v = this.count;
        this.count = v + 1;
        return new EnclosingStaticPartImpl(v, s, signature0, sourceLocation0);
    }

    public static StaticPart makeEncSJP(Member member0) {
        if(member0 instanceof Method) {
            return new EnclosingStaticPartImpl(-1, "method-execution", new MethodSignatureImpl(((Method)member0).getModifiers(), ((Method)member0).getName(), ((Method)member0).getDeclaringClass(), ((Method)member0).getParameterTypes(), new String[((Method)member0).getParameterTypes().length], ((Method)member0).getExceptionTypes(), ((Method)member0).getReturnType()), null);
        }
        if(!(member0 instanceof Constructor)) {
            throw new IllegalArgumentException("member must be either a method or constructor");
        }
        return new EnclosingStaticPartImpl(-1, "constructor-execution", new ConstructorSignatureImpl(((Constructor)member0).getModifiers(), ((Constructor)member0).getDeclaringClass(), ((Constructor)member0).getParameterTypes(), new String[((Constructor)member0).getParameterTypes().length], ((Constructor)member0).getExceptionTypes()), null);
    }

    public EnclosingStaticPart makeFieldESJP(String s, int v, String s1, Class class0, Class class1, int v1) {
        FieldSignatureImpl fieldSignatureImpl0 = new FieldSignatureImpl(v, s1, class0, class1);
        int v2 = this.count;
        this.count = v2 + 1;
        return new EnclosingStaticPartImpl(v2, s, fieldSignatureImpl0, this.makeSourceLoc(v1, -1));
    }

    public StaticPart makeFieldSJP(String s, int v, String s1, Class class0, Class class1, int v1) {
        FieldSignatureImpl fieldSignatureImpl0 = new FieldSignatureImpl(v, s1, class0, class1);
        int v2 = this.count;
        this.count = v2 + 1;
        return new StaticPartImpl(v2, s, fieldSignatureImpl0, this.makeSourceLoc(v1, -1));
    }

    public FieldSignature makeFieldSig(int v, String s, Class class0, Class class1) {
        FieldSignature fieldSignature0 = new FieldSignatureImpl(v, s, class0, class1);
        ((SignatureImpl)fieldSignature0).setLookupClassLoader(this.lookupClassLoader);
        return fieldSignature0;
    }

    public FieldSignature makeFieldSig(String s) {
        FieldSignature fieldSignature0 = new FieldSignatureImpl(s);
        ((SignatureImpl)fieldSignature0).setLookupClassLoader(this.lookupClassLoader);
        return fieldSignature0;
    }

    public FieldSignature makeFieldSig(String s, String s1, String s2, String s3) {
        FieldSignature fieldSignature0 = new FieldSignatureImpl(Integer.parseInt(s, 16), s1, Factory.makeClass(s2, this.lookupClassLoader), Factory.makeClass(s3, this.lookupClassLoader));
        ((SignatureImpl)fieldSignature0).setLookupClassLoader(this.lookupClassLoader);
        return fieldSignature0;
    }

    public EnclosingStaticPart makeInitializerESJP(String s, int v, Class class0, int v1) {
        InitializerSignatureImpl initializerSignatureImpl0 = new InitializerSignatureImpl(v, class0);
        int v2 = this.count;
        this.count = v2 + 1;
        return new EnclosingStaticPartImpl(v2, s, initializerSignatureImpl0, this.makeSourceLoc(v1, -1));
    }

    public StaticPart makeInitializerSJP(String s, int v, Class class0, int v1) {
        InitializerSignatureImpl initializerSignatureImpl0 = new InitializerSignatureImpl(v, class0);
        int v2 = this.count;
        this.count = v2 + 1;
        return new StaticPartImpl(v2, s, initializerSignatureImpl0, this.makeSourceLoc(v1, -1));
    }

    public InitializerSignature makeInitializerSig(int v, Class class0) {
        InitializerSignature initializerSignature0 = new InitializerSignatureImpl(v, class0);
        ((SignatureImpl)initializerSignature0).setLookupClassLoader(this.lookupClassLoader);
        return initializerSignature0;
    }

    public InitializerSignature makeInitializerSig(String s) {
        InitializerSignature initializerSignature0 = new InitializerSignatureImpl(s);
        ((SignatureImpl)initializerSignature0).setLookupClassLoader(this.lookupClassLoader);
        return initializerSignature0;
    }

    public InitializerSignature makeInitializerSig(String s, String s1) {
        InitializerSignature initializerSignature0 = new InitializerSignatureImpl(Integer.parseInt(s, 16), Factory.makeClass(s1, this.lookupClassLoader));
        ((SignatureImpl)initializerSignature0).setLookupClassLoader(this.lookupClassLoader);
        return initializerSignature0;
    }

    public static JoinPoint makeJP(StaticPart joinPoint$StaticPart0, Object object0, Object object1) {
        return new JoinPointImpl(joinPoint$StaticPart0, object0, object1, Factory.NO_ARGS);
    }

    public static JoinPoint makeJP(StaticPart joinPoint$StaticPart0, Object object0, Object object1, Object object2) {
        return new JoinPointImpl(joinPoint$StaticPart0, object0, object1, new Object[]{object2});
    }

    public static JoinPoint makeJP(StaticPart joinPoint$StaticPart0, Object object0, Object object1, Object object2, Object object3) {
        return new JoinPointImpl(joinPoint$StaticPart0, object0, object1, new Object[]{object2, object3});
    }

    public static JoinPoint makeJP(StaticPart joinPoint$StaticPart0, Object object0, Object object1, Object[] arr_object) {
        return new JoinPointImpl(joinPoint$StaticPart0, object0, object1, arr_object);
    }

    public EnclosingStaticPart makeLockESJP(String s, Class class0, int v) {
        LockSignatureImpl lockSignatureImpl0 = new LockSignatureImpl(class0);
        int v1 = this.count;
        this.count = v1 + 1;
        return new EnclosingStaticPartImpl(v1, s, lockSignatureImpl0, this.makeSourceLoc(v, -1));
    }

    public StaticPart makeLockSJP(String s, Class class0, int v) {
        LockSignatureImpl lockSignatureImpl0 = new LockSignatureImpl(class0);
        int v1 = this.count;
        this.count = v1 + 1;
        return new StaticPartImpl(v1, s, lockSignatureImpl0, this.makeSourceLoc(v, -1));
    }

    public LockSignature makeLockSig() {
        LockSignature lockSignature0 = new LockSignatureImpl(Factory.makeClass("Ljava/lang/Object;", this.lookupClassLoader));
        ((SignatureImpl)lockSignature0).setLookupClassLoader(this.lookupClassLoader);
        return lockSignature0;
    }

    public LockSignature makeLockSig(Class class0) {
        LockSignature lockSignature0 = new LockSignatureImpl(class0);
        ((SignatureImpl)lockSignature0).setLookupClassLoader(this.lookupClassLoader);
        return lockSignature0;
    }

    public LockSignature makeLockSig(String s) {
        LockSignature lockSignature0 = new LockSignatureImpl(s);
        ((SignatureImpl)lockSignature0).setLookupClassLoader(this.lookupClassLoader);
        return lockSignature0;
    }

    public EnclosingStaticPart makeMethodESJP(String s, int v, String s1, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, Class class1, int v1) {
        MethodSignature methodSignature0 = this.makeMethodSig(v, s1, class0, (arr_class == null ? Factory.NO_TYPES : arr_class), (arr_s == null ? Factory.NO_STRINGS : arr_s), (arr_class1 == null ? Factory.NO_TYPES : arr_class1), (class1 == null ? Void.TYPE : class1));
        int v2 = this.count;
        this.count = v2 + 1;
        return new EnclosingStaticPartImpl(v2, s, methodSignature0, this.makeSourceLoc(v1, -1));
    }

    public StaticPart makeMethodSJP(String s, int v, String s1, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, Class class1, int v1) {
        MethodSignature methodSignature0 = this.makeMethodSig(v, s1, class0, (arr_class == null ? Factory.NO_TYPES : arr_class), (arr_s == null ? Factory.NO_STRINGS : arr_s), (arr_class1 == null ? Factory.NO_TYPES : arr_class1), (class1 == null ? Void.TYPE : class1));
        int v2 = this.count;
        this.count = v2 + 1;
        return new StaticPartImpl(v2, s, methodSignature0, this.makeSourceLoc(v1, -1));
    }

    public MethodSignature makeMethodSig(int v, String s, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, Class class1) {
        MethodSignature methodSignature0 = new MethodSignatureImpl(v, s, class0, (arr_class == null ? Factory.NO_TYPES : arr_class), arr_s, (arr_class1 == null ? Factory.NO_TYPES : arr_class1), class1);
        ((SignatureImpl)methodSignature0).setLookupClassLoader(this.lookupClassLoader);
        return methodSignature0;
    }

    public MethodSignature makeMethodSig(String s) {
        MethodSignature methodSignature0 = new MethodSignatureImpl(s);
        ((SignatureImpl)methodSignature0).setLookupClassLoader(this.lookupClassLoader);
        return methodSignature0;
    }

    public MethodSignature makeMethodSig(String s, String s1, Class class0, String s2, String s3, String s4, String s5) {
        int v = Integer.parseInt(s, 16);
        StringTokenizer stringTokenizer0 = new StringTokenizer(s2, ":");
        int v1 = stringTokenizer0.countTokens();
        Class[] arr_class = new Class[v1];
        for(int v3 = 0; v3 < v1; ++v3) {
            arr_class[v3] = Factory.makeClass(stringTokenizer0.nextToken(), this.lookupClassLoader);
        }
        StringTokenizer stringTokenizer1 = new StringTokenizer(s3, ":");
        int v4 = stringTokenizer1.countTokens();
        String[] arr_s = new String[v4];
        for(int v5 = 0; v5 < v4; ++v5) {
            arr_s[v5] = stringTokenizer1.nextToken();
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(s4, ":");
        int v6 = stringTokenizer2.countTokens();
        Class[] arr_class1 = new Class[v6];
        for(int v2 = 0; v2 < v6; ++v2) {
            arr_class1[v2] = Factory.makeClass(stringTokenizer2.nextToken(), this.lookupClassLoader);
        }
        return new MethodSignatureImpl(v, s1, class0, arr_class, arr_s, arr_class1, Factory.makeClass(s5, this.lookupClassLoader));
    }

    public MethodSignature makeMethodSig(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        return this.makeMethodSig(s, s1, Factory.makeClass(s2, this.lookupClassLoader), s3, s4, s5, s6);
    }

    public StaticPart makeSJP(String s, String s1, String s2, String s3, String s4, String s5, String s6, int v) {
        MethodSignature methodSignature0 = this.makeMethodSig(s1, s2, s3, s4, s5, "", s6);
        int v1 = this.count;
        this.count = v1 + 1;
        return new StaticPartImpl(v1, s, methodSignature0, this.makeSourceLoc(v, -1));
    }

    public StaticPart makeSJP(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v) {
        MethodSignature methodSignature0 = this.makeMethodSig(s1, s2, s3, s4, s5, s6, s7);
        int v1 = this.count;
        this.count = v1 + 1;
        return new StaticPartImpl(v1, s, methodSignature0, this.makeSourceLoc(v, -1));
    }

    public StaticPart makeSJP(String s, Signature signature0, int v) {
        int v1 = this.count;
        this.count = v1 + 1;
        return new StaticPartImpl(v1, s, signature0, this.makeSourceLoc(v, -1));
    }

    public StaticPart makeSJP(String s, Signature signature0, int v, int v1) {
        int v2 = this.count;
        this.count = v2 + 1;
        return new StaticPartImpl(v2, s, signature0, this.makeSourceLoc(v, v1));
    }

    public StaticPart makeSJP(String s, Signature signature0, SourceLocation sourceLocation0) {
        int v = this.count;
        this.count = v + 1;
        return new StaticPartImpl(v, s, signature0, sourceLocation0);
    }

    public SourceLocation makeSourceLoc(int v, int v1) {
        return new SourceLocationImpl(this.lexicalClass, this.filename, v);
    }

    public EnclosingStaticPart makeUnlockESJP(String s, Class class0, int v) {
        UnlockSignatureImpl unlockSignatureImpl0 = new UnlockSignatureImpl(class0);
        int v1 = this.count;
        this.count = v1 + 1;
        return new EnclosingStaticPartImpl(v1, s, unlockSignatureImpl0, this.makeSourceLoc(v, -1));
    }

    public StaticPart makeUnlockSJP(String s, Class class0, int v) {
        UnlockSignatureImpl unlockSignatureImpl0 = new UnlockSignatureImpl(class0);
        int v1 = this.count;
        this.count = v1 + 1;
        return new StaticPartImpl(v1, s, unlockSignatureImpl0, this.makeSourceLoc(v, -1));
    }

    public UnlockSignature makeUnlockSig() {
        UnlockSignature unlockSignature0 = new UnlockSignatureImpl(Factory.makeClass("Ljava/lang/Object;", this.lookupClassLoader));
        ((SignatureImpl)unlockSignature0).setLookupClassLoader(this.lookupClassLoader);
        return unlockSignature0;
    }

    public UnlockSignature makeUnlockSig(Class class0) {
        UnlockSignature unlockSignature0 = new UnlockSignatureImpl(class0);
        ((SignatureImpl)unlockSignature0).setLookupClassLoader(this.lookupClassLoader);
        return unlockSignature0;
    }

    public UnlockSignature makeUnlockSig(String s) {
        UnlockSignature unlockSignature0 = new UnlockSignatureImpl(s);
        ((SignatureImpl)unlockSignature0).setLookupClassLoader(this.lookupClassLoader);
        return unlockSignature0;
    }
}

