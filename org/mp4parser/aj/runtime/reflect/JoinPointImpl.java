package org.mp4parser.aj.runtime.reflect;

import org.mp4parser.aj.lang.JoinPoint.EnclosingStaticPart;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.ProceedingJoinPoint;
import org.mp4parser.aj.lang.Signature;
import org.mp4parser.aj.lang.reflect.SourceLocation;
import org.mp4parser.aj.runtime.internal.AroundClosure;

class JoinPointImpl implements ProceedingJoinPoint {
    static class EnclosingStaticPartImpl extends StaticPartImpl implements EnclosingStaticPart {
        public EnclosingStaticPartImpl(int v, String s, Signature signature0, SourceLocation sourceLocation0) {
            super(v, s, signature0, sourceLocation0);
        }
    }

    static class StaticPartImpl implements StaticPart {
        private int id;
        String kind;
        Signature signature;
        SourceLocation sourceLocation;

        public StaticPartImpl(int v, String s, Signature signature0, SourceLocation sourceLocation0) {
            this.kind = s;
            this.signature = signature0;
            this.sourceLocation = sourceLocation0;
            this.id = v;
        }

        @Override  // org.mp4parser.aj.lang.JoinPoint$StaticPart
        public int getId() {
            return this.id;
        }

        @Override  // org.mp4parser.aj.lang.JoinPoint$StaticPart
        public String getKind() {
            return this.kind;
        }

        @Override  // org.mp4parser.aj.lang.JoinPoint$StaticPart
        public Signature getSignature() {
            return this.signature;
        }

        @Override  // org.mp4parser.aj.lang.JoinPoint$StaticPart
        public SourceLocation getSourceLocation() {
            return this.sourceLocation;
        }

        @Override  // org.mp4parser.aj.lang.JoinPoint$StaticPart
        public final String toLongString() {
            return this.toString(StringMaker.longStringMaker);
        }

        @Override  // org.mp4parser.aj.lang.JoinPoint$StaticPart
        public final String toShortString() {
            return this.toString(StringMaker.shortStringMaker);
        }

        @Override  // org.mp4parser.aj.lang.JoinPoint$StaticPart
        public final String toString() {
            return this.toString(StringMaker.middleStringMaker);
        }

        String toString(StringMaker stringMaker0) {
            return stringMaker0.makeKindName(this.getKind()) + "(" + ((SignatureImpl)this.getSignature()).toString(stringMaker0) + ")";
        }
    }

    Object _this;
    private AroundClosure arc;
    Object[] args;
    StaticPart staticPart;
    Object target;

    public JoinPointImpl(StaticPart joinPoint$StaticPart0, Object object0, Object object1, Object[] arr_object) {
        this.staticPart = joinPoint$StaticPart0;
        this._this = object0;
        this.target = object1;
        this.args = arr_object;
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public Object[] getArgs() {
        if(this.args == null) {
            this.args = new Object[0];
        }
        Object[] arr_object = this.args;
        Object[] arr_object1 = new Object[arr_object.length];
        System.arraycopy(arr_object, 0, arr_object1, 0, arr_object.length);
        return arr_object1;
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public String getKind() {
        return this.staticPart.getKind();
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public Signature getSignature() {
        return this.staticPart.getSignature();
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public SourceLocation getSourceLocation() {
        return this.staticPart.getSourceLocation();
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public StaticPart getStaticPart() {
        return this.staticPart;
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public Object getTarget() {
        return this.target;
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public Object getThis() {
        return this._this;
    }

    @Override  // org.mp4parser.aj.lang.ProceedingJoinPoint
    public Object proceed() throws Throwable {
        return this.arc == null ? null : this.arc.run(this.arc.getState());
    }

    @Override  // org.mp4parser.aj.lang.ProceedingJoinPoint
    public Object proceed(Object[] arr_object) throws Throwable {
        int v4;
        AroundClosure aroundClosure0 = this.arc;
        if(aroundClosure0 == null) {
            return null;
        }
        int v = aroundClosure0.getFlags();
        int v1 = 0;
        boolean z = (0x10000 & v) != 0;
        int v2 = (v & 0x1000) == 0 ? 0 : 1;
        int v3 = (v & 0x100) == 0 ? 0 : 1;
        boolean z1 = (v & 16) != 0;
        boolean z2 = (v & 1) != 0;
        Object[] arr_object1 = this.arc.getState();
        if(v2 == 0 || v3 == 0) {
            v4 = 0;
        }
        else {
            arr_object1[0] = arr_object[0];
            v4 = 1;
        }
        if(z1 && z2) {
            if(z) {
                v4 = v3 + 1;
                arr_object1[0] = arr_object[v3];
            }
            else {
                if(z1 && z2) {
                    v1 = 1;
                }
                arr_object1[v2] = arr_object[(v2 == 0 || v3 == 0 ? 0 : 1)];
                v4 = (v2 == 0 || v3 == 0 ? 0 : 1) + v1;
            }
        }
        for(int v5 = v4; v5 < arr_object.length; ++v5) {
            arr_object1[v5 - v4 + ((!z1 || z ? 0 : 1) + v2)] = arr_object[v5];
        }
        return this.arc.run(arr_object1);
    }

    @Override  // org.mp4parser.aj.lang.ProceedingJoinPoint
    public void set$AroundClosure(AroundClosure aroundClosure0) {
        this.arc = aroundClosure0;
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public final String toLongString() {
        return this.staticPart.toLongString();
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public final String toShortString() {
        return this.staticPart.toShortString();
    }

    @Override  // org.mp4parser.aj.lang.JoinPoint
    public final String toString() {
        return this.staticPart.toString();
    }
}

