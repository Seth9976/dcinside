package org.mp4parser.aj.runtime.reflect;

import org.mp4parser.aj.lang.reflect.UnlockSignature;

class UnlockSignatureImpl extends SignatureImpl implements UnlockSignature {
    private Class parameterType;

    UnlockSignatureImpl(Class class0) {
        super(8, "unlock", class0);
        this.parameterType = class0;
    }

    UnlockSignatureImpl(String s) {
        super(s);
    }

    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker0) {
        if(this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return "unlock(" + stringMaker0.makeTypeName(this.parameterType) + ")";
    }

    public Class getParameterType() {
        if(this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return this.parameterType;
    }
}

