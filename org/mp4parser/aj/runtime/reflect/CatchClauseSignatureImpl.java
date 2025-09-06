package org.mp4parser.aj.runtime.reflect;

import org.mp4parser.aj.lang.reflect.CatchClauseSignature;

class CatchClauseSignatureImpl extends SignatureImpl implements CatchClauseSignature {
    String parameterName;
    Class parameterType;

    CatchClauseSignatureImpl(Class class0, Class class1, String s) {
        super(0, "catch", class0);
        this.parameterType = class1;
        this.parameterName = s;
    }

    CatchClauseSignatureImpl(String s) {
        super(s);
    }

    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker0) {
        return "catch(" + stringMaker0.makeTypeName(this.getParameterType()) + ")";
    }

    @Override  // org.mp4parser.aj.lang.reflect.CatchClauseSignature
    public String getParameterName() {
        if(this.parameterName == null) {
            this.parameterName = this.extractString(4);
        }
        return this.parameterName;
    }

    @Override  // org.mp4parser.aj.lang.reflect.CatchClauseSignature
    public Class getParameterType() {
        if(this.parameterType == null) {
            this.parameterType = this.extractType(3);
        }
        return this.parameterType;
    }
}

