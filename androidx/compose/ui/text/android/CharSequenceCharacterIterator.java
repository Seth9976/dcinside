package androidx.compose.ui.text.android;

import java.text.CharacterIterator;
import kotlin.jvm.internal.L;
import y4.l;

public final class CharSequenceCharacterIterator implements CharacterIterator {
    @l
    private final CharSequence a;
    private final int b;
    private final int c;
    private int d;

    public CharSequenceCharacterIterator(@l CharSequence charSequence0, int v, int v1) {
        L.p(charSequence0, "charSequence");
        super();
        this.a = charSequence0;
        this.b = v;
        this.c = v1;
        this.d = v;
    }

    @Override
    @l
    public Object clone() {
        try {
            Object object0 = CharacterIterator.super.clone();
            L.o(object0, "{\n            @Suppress(…  super.clone()\n        }");
            return object0;
        }
        catch(CloneNotSupportedException unused_ex) {
            throw new InternalError();
        }
    }

    @Override
    public char current() {
        return this.d == this.c ? '\uFFFF' : this.a.charAt(this.d);
    }

    @Override
    public char first() {
        this.d = this.b;
        return this.current();
    }

    @Override
    public int getBeginIndex() {
        return this.b;
    }

    @Override
    public int getEndIndex() {
        return this.c;
    }

    @Override
    public int getIndex() {
        return this.d;
    }

    @Override
    public char last() {
        int v = this.c;
        if(this.b == v) {
            this.d = v;
            return '\uFFFF';
        }
        this.d = v - 1;
        return this.a.charAt(v - 1);
    }

    @Override
    public char next() {
        int v = this.d + 1;
        this.d = v;
        int v1 = this.c;
        if(v >= v1) {
            this.d = v1;
            return '\uFFFF';
        }
        return this.a.charAt(v);
    }

    @Override
    public char previous() {
        int v = this.d;
        if(v <= this.b) {
            return '\uFFFF';
        }
        this.d = v - 1;
        return this.a.charAt(v - 1);
    }

    @Override
    public char setIndex(int v) {
        if(v > this.c || this.b > v) {
            throw new IllegalArgumentException("invalid position");
        }
        this.d = v;
        return this.current();
    }
}

