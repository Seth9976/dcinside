package org.mp4parser.aj.runtime.reflect;

import org.mp4parser.aj.lang.reflect.MemberSignature;

abstract class MemberSignatureImpl extends SignatureImpl implements MemberSignature {
    MemberSignatureImpl(int v, String s, Class class0) {
        super(v, s, class0);
    }

    public MemberSignatureImpl(String s) {
        super(s);
    }
}

