package org.mp4parser.aj.runtime.reflect;

import java.lang.reflect.Constructor;
import org.mp4parser.aj.lang.reflect.ConstructorSignature;

class ConstructorSignatureImpl extends CodeSignatureImpl implements ConstructorSignature {
    private Constructor constructor;

    ConstructorSignatureImpl(int v, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1) {
        super(v, "<init>", class0, arr_class, arr_s, arr_class1);
    }

    ConstructorSignatureImpl(String s) {
        super(s);
    }

    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append(stringMaker0.makeModifiersString(this.getModifiers()));
        stringBuffer0.append(stringMaker0.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()));
        stringMaker0.addSignature(stringBuffer0, this.getParameterTypes());
        stringMaker0.addThrows(stringBuffer0, this.getExceptionTypes());
        return stringBuffer0.toString();
    }

    @Override  // org.mp4parser.aj.lang.reflect.ConstructorSignature
    public Constructor getConstructor() {
        if(this.constructor == null) {
            try {
                this.constructor = this.getDeclaringType().getDeclaredConstructor(this.getParameterTypes());
            }
            catch(Exception unused_ex) {
            }
        }
        return this.constructor;
    }

    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl, org.mp4parser.aj.lang.Signature
    public String getName() {
        return "<init>";
    }
}

