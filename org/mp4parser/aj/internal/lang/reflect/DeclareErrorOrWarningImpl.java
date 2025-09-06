package org.mp4parser.aj.internal.lang.reflect;

import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.DeclareErrorOrWarning;
import org.mp4parser.aj.lang.reflect.PointcutExpression;

public class DeclareErrorOrWarningImpl implements DeclareErrorOrWarning {
    private AjType declaringType;
    private boolean isError;
    private String msg;
    private PointcutExpression pc;

    public DeclareErrorOrWarningImpl(String s, String s1, boolean z, AjType ajType0) {
        this.pc = new PointcutExpressionImpl(s);
        this.msg = s1;
        this.isError = z;
        this.declaringType = ajType0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareErrorOrWarning
    public AjType getDeclaringType() {
        return this.declaringType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareErrorOrWarning
    public String getMessage() {
        return this.msg;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareErrorOrWarning
    public PointcutExpression getPointcutExpression() {
        return this.pc;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareErrorOrWarning
    public boolean isError() {
        return this.isError;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "declare " + (this.isError() ? "error : " : "warning : ") + this.getPointcutExpression().asString() + " : " + "\"" + this.getMessage() + "\"";
    }
}

