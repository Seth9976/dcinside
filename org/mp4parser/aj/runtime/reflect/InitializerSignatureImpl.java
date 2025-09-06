package org.mp4parser.aj.runtime.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.mp4parser.aj.lang.reflect.InitializerSignature;

class InitializerSignatureImpl extends CodeSignatureImpl implements InitializerSignature {
    private Constructor constructor;

    InitializerSignatureImpl(int v, Class class0) {
        super(v, (Modifier.isStatic(v) ? "<clinit>" : "<init>"), class0, SignatureImpl.EMPTY_CLASS_ARRAY, SignatureImpl.EMPTY_STRING_ARRAY, SignatureImpl.EMPTY_CLASS_ARRAY);
    }

    InitializerSignatureImpl(String s) {
        super(s);
    }

    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker0) {
        return stringMaker0.makeModifiersString(this.getModifiers()) + stringMaker0.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()) + "." + this.getName();
    }

    @Override  // org.mp4parser.aj.lang.reflect.InitializerSignature
    public Constructor getInitializer() {
        if(this.constructor == null) {
            try {
                this.constructor = this.getDeclaringType().getDeclaredConstructor(this.getParameterTypes());
            }
            catch(Exception unused_ex) {
            }
        }
        return this.constructor;
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl, org.mp4parser.aj.lang.Signature
    public String getName() {
        return Modifier.isStatic(this.getModifiers()) ? "<clinit>" : "<init>";
    }
}

