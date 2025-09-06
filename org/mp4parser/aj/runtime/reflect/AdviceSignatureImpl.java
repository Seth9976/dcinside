package org.mp4parser.aj.runtime.reflect;

import java.lang.reflect.Method;
import java.util.StringTokenizer;
import org.mp4parser.aj.lang.reflect.AdviceSignature;

class AdviceSignatureImpl extends CodeSignatureImpl implements AdviceSignature {
    private Method adviceMethod;
    Class returnType;

    AdviceSignatureImpl(int v, String s, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1, Class class1) {
        super(v, s, class0, arr_class, arr_s, arr_class1);
        this.adviceMethod = null;
        this.returnType = class1;
    }

    AdviceSignatureImpl(String s) {
        super(s);
        this.adviceMethod = null;
    }

    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        if(stringMaker0.includeArgs) {
            stringBuffer0.append(stringMaker0.makeTypeName(this.getReturnType()));
        }
        if(stringMaker0.includeArgs) {
            stringBuffer0.append(" ");
        }
        stringBuffer0.append(stringMaker0.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()));
        stringBuffer0.append(".");
        stringBuffer0.append(this.toAdviceName(this.getName()));
        stringMaker0.addSignature(stringBuffer0, this.getParameterTypes());
        stringMaker0.addThrows(stringBuffer0, this.getExceptionTypes());
        return stringBuffer0.toString();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AdviceSignature
    public Method getAdvice() {
        if(this.adviceMethod == null) {
            try {
                this.adviceMethod = this.getDeclaringType().getDeclaredMethod(this.getName(), this.getParameterTypes());
            }
            catch(Exception unused_ex) {
            }
        }
        return this.adviceMethod;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AdviceSignature
    public Class getReturnType() {
        if(this.returnType == null) {
            this.returnType = this.extractType(6);
        }
        return this.returnType;
    }

    private String toAdviceName(String s) {
        if(s.indexOf(36) == -1) {
            return s;
        }
        StringTokenizer stringTokenizer0 = new StringTokenizer(s, "$");
        while(stringTokenizer0.hasMoreTokens()) {
            String s1 = stringTokenizer0.nextToken();
            if(s1.startsWith("before") || s1.startsWith("after") || s1.startsWith("around")) {
                return s1;
            }
            if(false) {
                break;
            }
        }
        return s;
    }
}

