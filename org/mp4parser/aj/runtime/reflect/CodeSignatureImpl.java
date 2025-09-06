package org.mp4parser.aj.runtime.reflect;

import org.mp4parser.aj.lang.reflect.CodeSignature;

abstract class CodeSignatureImpl extends MemberSignatureImpl implements CodeSignature {
    Class[] exceptionTypes;
    String[] parameterNames;
    Class[] parameterTypes;

    CodeSignatureImpl(int v, String s, Class class0, Class[] arr_class, String[] arr_s, Class[] arr_class1) {
        super(v, s, class0);
        this.parameterTypes = arr_class;
        this.parameterNames = arr_s;
        this.exceptionTypes = arr_class1;
    }

    CodeSignatureImpl(String s) {
        super(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.CodeSignature
    public Class[] getExceptionTypes() {
        if(this.exceptionTypes == null) {
            this.exceptionTypes = this.extractTypes(5);
        }
        return this.exceptionTypes;
    }

    @Override  // org.mp4parser.aj.lang.reflect.CodeSignature
    public String[] getParameterNames() {
        if(this.parameterNames == null) {
            this.parameterNames = this.extractStrings(4);
        }
        return this.parameterNames;
    }

    @Override  // org.mp4parser.aj.lang.reflect.CodeSignature
    public Class[] getParameterTypes() {
        if(this.parameterTypes == null) {
            this.parameterTypes = this.extractTypes(3);
        }
        return this.parameterTypes;
    }
}

