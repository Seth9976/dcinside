package org.mp4parser.aj.runtime.reflect;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import org.mp4parser.aj.lang.Signature;

abstract class SignatureImpl implements Signature {
    interface Cache {
        String get(int arg1);

        void set(int arg1, String arg2);
    }

    static final class CacheImpl implements Cache {
        private SoftReference toStringCacheRef;

        public CacheImpl() {
            this.makeCache();
        }

        private String[] array() {
            return (String[])this.toStringCacheRef.get();
        }

        @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl$Cache
        public String get(int v) {
            String[] arr_s = this.array();
            return arr_s == null ? null : arr_s[v];
        }

        private String[] makeCache() {
            String[] arr_s = new String[3];
            this.toStringCacheRef = new SoftReference(arr_s);
            return arr_s;
        }

        @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl$Cache
        public void set(int v, String s) {
            String[] arr_s = this.array();
            if(arr_s == null) {
                arr_s = this.makeCache();
            }
            arr_s[v] = s;
        }
    }

    static Class[] EMPTY_CLASS_ARRAY = null;
    static String[] EMPTY_STRING_ARRAY = null;
    static final String INNER_SEP = ":";
    static final char SEP = '-';
    Class declaringType;
    String declaringTypeName;
    ClassLoader lookupClassLoader;
    int modifiers;
    String name;
    Cache stringCache;
    private String stringRep;
    private static boolean useCache = true;

    static {
        SignatureImpl.EMPTY_STRING_ARRAY = new String[0];
        SignatureImpl.EMPTY_CLASS_ARRAY = new Class[0];
    }

    SignatureImpl(int v, String s, Class class0) {
        this.lookupClassLoader = null;
        this.modifiers = v;
        this.name = s;
        this.declaringType = class0;
    }

    public SignatureImpl(String s) {
        this.modifiers = -1;
        this.lookupClassLoader = null;
        this.stringRep = s;
    }

    void addFullTypeNames(StringBuffer stringBuffer0, Class[] arr_class) {
        for(int v = 0; v < arr_class.length; ++v) {
            if(v > 0) {
                stringBuffer0.append(", ");
            }
            stringBuffer0.append(this.fullTypeName(arr_class[v]));
        }
    }

    void addShortTypeNames(StringBuffer stringBuffer0, Class[] arr_class) {
        for(int v = 0; v < arr_class.length; ++v) {
            if(v > 0) {
                stringBuffer0.append(", ");
            }
            stringBuffer0.append(this.shortTypeName(arr_class[v]));
        }
    }

    void addTypeArray(StringBuffer stringBuffer0, Class[] arr_class) {
        this.addFullTypeNames(stringBuffer0, arr_class);
    }

    protected abstract String createToString(StringMaker arg1);

    int extractInt(int v) {
        return Integer.parseInt(this.extractString(v), 16);
    }

    String extractString(int v) {
        int v1 = this.stringRep.indexOf(45);
        int v2 = 0;
        while(v > 0) {
            v2 = v1 + 1;
            v1 = this.stringRep.indexOf(45, v2);
            --v;
        }
        if(v1 == -1) {
            v1 = this.stringRep.length();
        }
        return this.stringRep.substring(v2, v1);
    }

    String[] extractStrings(int v) {
        StringTokenizer stringTokenizer0 = new StringTokenizer(this.extractString(v), ":");
        int v1 = stringTokenizer0.countTokens();
        String[] arr_s = new String[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_s[v2] = stringTokenizer0.nextToken();
        }
        return arr_s;
    }

    Class extractType(int v) {
        return Factory.makeClass(this.extractString(v), this.getLookupClassLoader());
    }

    Class[] extractTypes(int v) {
        StringTokenizer stringTokenizer0 = new StringTokenizer(this.extractString(v), ":");
        int v1 = stringTokenizer0.countTokens();
        Class[] arr_class = new Class[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_class[v2] = Factory.makeClass(stringTokenizer0.nextToken(), this.getLookupClassLoader());
        }
        return arr_class;
    }

    String fullTypeName(Class class0) {
        if(class0 == null) {
            return "ANONYMOUS";
        }
        return class0.isArray() ? this.fullTypeName(class0.getComponentType()) + "[]" : class0.getName().replace('$', '.');
    }

    @Override  // org.mp4parser.aj.lang.Signature
    public Class getDeclaringType() {
        if(this.declaringType == null) {
            this.declaringType = this.extractType(2);
        }
        return this.declaringType;
    }

    @Override  // org.mp4parser.aj.lang.Signature
    public String getDeclaringTypeName() {
        if(this.declaringTypeName == null) {
            this.declaringTypeName = this.getDeclaringType().getName();
        }
        return this.declaringTypeName;
    }

    private ClassLoader getLookupClassLoader() {
        if(this.lookupClassLoader == null) {
            this.lookupClassLoader = this.getClass().getClassLoader();
        }
        return this.lookupClassLoader;
    }

    @Override  // org.mp4parser.aj.lang.Signature
    public int getModifiers() {
        if(this.modifiers == -1) {
            this.modifiers = this.extractInt(0);
        }
        return this.modifiers;
    }

    @Override  // org.mp4parser.aj.lang.Signature
    public String getName() {
        if(this.name == null) {
            this.name = this.extractString(1);
        }
        return this.name;
    }

    static boolean getUseCache() {
        return SignatureImpl.useCache;
    }

    public void setLookupClassLoader(ClassLoader classLoader0) {
        this.lookupClassLoader = classLoader0;
    }

    static void setUseCache(boolean z) {
        SignatureImpl.useCache = z;
    }

    String shortTypeName(Class class0) {
        if(class0 == null) {
            return "ANONYMOUS";
        }
        return class0.isArray() ? this.shortTypeName(class0.getComponentType()) + "[]" : this.stripPackageName(class0.getName()).replace('$', '.');
    }

    String stripPackageName(String s) {
        int v = s.lastIndexOf(46);
        return v == -1 ? s : s.substring(v + 1);
    }

    @Override  // org.mp4parser.aj.lang.Signature
    public final String toLongString() {
        return this.toString(StringMaker.longStringMaker);
    }

    @Override  // org.mp4parser.aj.lang.Signature
    public final String toShortString() {
        return this.toString(StringMaker.shortStringMaker);
    }

    @Override  // org.mp4parser.aj.lang.Signature
    public final String toString() {
        return this.toString(StringMaker.middleStringMaker);
    }

    String toString(StringMaker stringMaker0) {
        String s;
        if(SignatureImpl.useCache) {
            Cache signatureImpl$Cache0 = this.stringCache;
            if(signatureImpl$Cache0 == null) {
                try {
                    this.stringCache = new CacheImpl();
                }
                catch(Throwable unused_ex) {
                    SignatureImpl.useCache = false;
                }
                s = null;
            }
            else {
                s = signatureImpl$Cache0.get(stringMaker0.cacheOffset);
            }
        }
        else {
            s = null;
        }
        if(s == null) {
            s = this.createToString(stringMaker0);
        }
        if(SignatureImpl.useCache) {
            this.stringCache.set(stringMaker0.cacheOffset, s);
        }
        return s;
    }
}

