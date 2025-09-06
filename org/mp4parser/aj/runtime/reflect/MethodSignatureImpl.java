package org.mp4parser.aj.runtime.reflect;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import org.mp4parser.aj.lang.reflect.MethodSignature;

class MethodSignatureImpl extends CodeSignatureImpl implements MethodSignature {
    private Method method;
    Class returnType;

    MethodSignatureImpl(int v, String s, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, Class class1) {
        super(v, s, class0, arr_class, arr_s, arr_class1);
        this.returnType = class1;
    }

    MethodSignatureImpl(String s) {
        super(s);
    }

    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append(stringMaker0.makeModifiersString(this.getModifiers()));
        if(stringMaker0.includeArgs) {
            stringBuffer0.append(stringMaker0.makeTypeName(this.getReturnType()));
        }
        if(stringMaker0.includeArgs) {
            stringBuffer0.append(" ");
        }
        stringBuffer0.append(stringMaker0.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()));
        stringBuffer0.append(".");
        stringBuffer0.append(this.getName());
        stringMaker0.addSignature(stringBuffer0, this.getParameterTypes());
        stringMaker0.addThrows(stringBuffer0, this.getExceptionTypes());
        return stringBuffer0.toString();
    }

    @Override  // org.mp4parser.aj.lang.reflect.MethodSignature
    public Method getMethod() {
        if(this.method == null) {
            Class class0 = this.getDeclaringType();
            try {
                this.method = class0.getDeclaredMethod(this.getName(), this.getParameterTypes());
                return this.method;
            }
            catch(NoSuchMethodException unused_ex) {
                HashSet hashSet0 = new HashSet();
                hashSet0.add(class0);
                this.method = this.search(class0, this.getName(), this.getParameterTypes(), hashSet0);
            }
        }
        return this.method;
    }

    @Override  // org.mp4parser.aj.lang.reflect.MethodSignature
    public Class getReturnType() {
        if(this.returnType == null) {
            this.returnType = this.extractType(6);
        }
        return this.returnType;
    }

    private Method search(Class class0, String s, Class[] arr_class, Set set0) {
        if(class0 == null) {
            return null;
        }
        if(!set0.contains(class0)) {
            set0.add(class0);
            try {
                return class0.getDeclaredMethod(s, arr_class);
            }
            catch(NoSuchMethodException unused_ex) {
            }
        }
        Method method0 = this.search(class0.getSuperclass(), s, arr_class, set0);
        if(method0 != null) {
            return method0;
        }
        Class[] arr_class1 = class0.getInterfaces();
        if(arr_class1 != null) {
            for(int v = 0; v < arr_class1.length; ++v) {
                Method method1 = this.search(arr_class1[v], s, arr_class, set0);
                if(method1 != null) {
                    return method1;
                }
            }
        }
        return null;
    }
}

