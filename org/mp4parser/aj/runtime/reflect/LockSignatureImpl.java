package org.mp4parser.aj.runtime.reflect;

import org.mp4parser.aj.lang.reflect.LockSignature;

class LockSignatureImpl extends SignatureImpl implements LockSignature {
    private Class parameterType;

    LockSignatureImpl(Class class0) {
        super(8, "lock", class0);
        this.parameterType = class0;
    }

    LockSignatureImpl(String s) {
        super(s);
    }

    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker0) {
        if(this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return "lock(" + stringMaker0.makeTypeName(this.parameterType) + ")";
    }

    public Class getParameterType() {
        if(this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return this.parameterType;
    }
}

