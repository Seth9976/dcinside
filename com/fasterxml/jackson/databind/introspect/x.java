package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.util.h;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

class x {
    protected final b a;
    protected static final s[] b;
    protected static final Annotation[] c;

    static {
        x.b = new s[0];
        x.c = new Annotation[0];
    }

    protected x(b b0) {
        this.a = b0;
    }

    static s a() {
        return new s();
    }

    static s[] b(int v) {
        if(v == 0) {
            return x.b;
        }
        s[] arr_s = new s[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_s[v1] = x.a();
        }
        return arr_s;
    }

    // 去混淆评级： 低(20)
    protected static final boolean c(Annotation annotation0) {
        return annotation0 instanceof Target || annotation0 instanceof Retention;
    }

    protected final q d(q q0, Annotation[] arr_annotation) {
        for(int v = 0; v < arr_annotation.length; ++v) {
            Annotation annotation0 = arr_annotation[v];
            q0 = q0.a(annotation0);
            if(this.a.G0(annotation0)) {
                q0 = this.h(q0, annotation0);
            }
        }
        return q0;
    }

    protected final q e(Annotation[] arr_annotation) {
        q q0 = q.e();
        for(int v = 0; v < arr_annotation.length; ++v) {
            Annotation annotation0 = arr_annotation[v];
            q0 = q0.a(annotation0);
            if(this.a.G0(annotation0)) {
                q0 = this.h(q0, annotation0);
            }
        }
        return q0;
    }

    protected final q f(q q0, Annotation[] arr_annotation) {
        for(int v = 0; v < arr_annotation.length; ++v) {
            Annotation annotation0 = arr_annotation[v];
            if(!q0.h(annotation0)) {
                q0 = q0.a(annotation0);
                if(this.a.G0(annotation0)) {
                    q0 = this.g(q0, annotation0);
                }
            }
        }
        return q0;
    }

    protected final q g(q q0, Annotation annotation0) {
        Annotation[] arr_annotation = h.r(annotation0.annotationType());
        for(int v = 0; v < arr_annotation.length; ++v) {
            Annotation annotation1 = arr_annotation[v];
            if(!x.c(annotation1) && !q0.h(annotation1)) {
                q0 = q0.a(annotation1);
                if(this.a.G0(annotation1)) {
                    q0 = this.h(q0, annotation1);
                }
            }
        }
        return q0;
    }

    protected final q h(q q0, Annotation annotation0) {
        Annotation[] arr_annotation = h.r(annotation0.annotationType());
        for(int v = 0; v < arr_annotation.length; ++v) {
            Annotation annotation1 = arr_annotation[v];
            if(!x.c(annotation1)) {
                if(!this.a.G0(annotation1)) {
                    q0 = q0.a(annotation1);
                }
                else if(!q0.h(annotation1)) {
                    q0 = this.h(q0.a(annotation1), annotation1);
                }
            }
        }
        return q0;
    }
}

