package org.mp4parser.aj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.DeclareAnnotation.Kind;
import org.mp4parser.aj.lang.reflect.DeclareAnnotation;
import org.mp4parser.aj.lang.reflect.SignaturePattern;
import org.mp4parser.aj.lang.reflect.TypePattern;

public class DeclareAnnotationImpl implements DeclareAnnotation {
    private String annText;
    private AjType declaringType;
    private Kind kind;
    private SignaturePattern signaturePattern;
    private Annotation theAnnotation;
    private TypePattern typePattern;

    public DeclareAnnotationImpl(AjType ajType0, String s, String s1, Annotation annotation0, String s2) {
        this.declaringType = ajType0;
        if(s.equals("at_type")) {
            this.kind = Kind.Type;
        }
        else {
            if(s.equals("at_field")) {
                this.kind = Kind.Field;
                goto label_13;
            }
            if(s.equals("at_method")) {
                this.kind = Kind.Method;
            }
            else if(s.equals("at_constructor")) {
                this.kind = Kind.Constructor;
            }
            else {
                throw new IllegalStateException("Unknown declare annotation kind: " + s);
            }
        }
    label_13:
        if(this.kind == Kind.Type) {
            this.typePattern = new TypePatternImpl(s1);
        }
        else {
            this.signaturePattern = new SignaturePatternImpl(s1);
        }
        this.theAnnotation = annotation0;
        this.annText = s2;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareAnnotation
    public Annotation getAnnotation() {
        return this.theAnnotation;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareAnnotation
    public String getAnnotationAsText() {
        return this.annText;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareAnnotation
    public AjType getDeclaringType() {
        return this.declaringType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareAnnotation
    public Kind getKind() {
        return this.kind;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareAnnotation
    public SignaturePattern getSignaturePattern() {
        return this.signaturePattern;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareAnnotation
    public TypePattern getTypePattern() {
        return this.typePattern;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("declare @");
        switch(this.getKind()) {
            case 1: {
                stringBuffer0.append("type : ");
                stringBuffer0.append(this.getTypePattern().asString());
                break;
            }
            case 2: {
                stringBuffer0.append("method : ");
                stringBuffer0.append(this.getSignaturePattern().asString());
                break;
            }
            case 3: {
                stringBuffer0.append("field : ");
                stringBuffer0.append(this.getSignaturePattern().asString());
                break;
            }
            case 4: {
                stringBuffer0.append("constructor : ");
                stringBuffer0.append(this.getSignaturePattern().asString());
            }
        }
        stringBuffer0.append(" : ");
        stringBuffer0.append(this.getAnnotationAsText());
        return stringBuffer0.toString();
    }
}

