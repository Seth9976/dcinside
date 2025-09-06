package org.mp4parser.aj.runtime.reflect;

import java.lang.reflect.Field;
import org.mp4parser.aj.lang.reflect.FieldSignature;

public class FieldSignatureImpl extends MemberSignatureImpl implements FieldSignature {
    private Field field;
    Class fieldType;

    FieldSignatureImpl(int v, String s, Class class0, Class class1) {
        super(v, s, class0);
        this.fieldType = class1;
    }

    FieldSignatureImpl(String s) {
        super(s);
    }

    @Override  // org.mp4parser.aj.runtime.reflect.SignatureImpl
    protected String createToString(StringMaker stringMaker0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append(stringMaker0.makeModifiersString(this.getModifiers()));
        if(stringMaker0.includeArgs) {
            stringBuffer0.append(stringMaker0.makeTypeName(this.getFieldType()));
        }
        if(stringMaker0.includeArgs) {
            stringBuffer0.append(" ");
        }
        stringBuffer0.append(stringMaker0.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()));
        stringBuffer0.append(".");
        stringBuffer0.append(this.getName());
        return stringBuffer0.toString();
    }

    @Override  // org.mp4parser.aj.lang.reflect.FieldSignature
    public Field getField() {
        if(this.field == null) {
            try {
                this.field = this.getDeclaringType().getDeclaredField(this.getName());
            }
            catch(Exception unused_ex) {
            }
        }
        return this.field;
    }

    @Override  // org.mp4parser.aj.lang.reflect.FieldSignature
    public Class getFieldType() {
        if(this.fieldType == null) {
            this.fieldType = this.extractType(3);
        }
        return this.fieldType;
    }
}

