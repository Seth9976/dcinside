package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import java.util.Iterator;

public class CLObject extends CLContainer implements Iterable {
    static class CLObjectIterator implements Iterator {
        CLObject a;
        int b;

        CLObjectIterator(CLObject cLObject0) {
            this.b = 0;
            this.a = cLObject0;
        }

        public CLKey a() {
            CLKey cLKey0 = (CLKey)this.a.h.get(this.b);
            ++this.b;
            return cLKey0;
        }

        @Override
        public boolean hasNext() {
            return this.b < this.a.size();
        }

        @Override
        public Object next() {
            return this.a();
        }
    }

    public CLObject(char[] arr_c) {
        super(arr_c);
    }

    @Override  // androidx.constraintlayout.core.parser.CLContainer
    @NonNull
    public CLContainer C() {
        return this.g0();
    }

    @Override  // androidx.constraintlayout.core.parser.CLContainer
    @NonNull
    public CLElement b() {
        return this.g0();
    }

    @Override  // androidx.constraintlayout.core.parser.CLContainer
    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return this.g0();
    }

    public static CLObject d0(char[] arr_c) {
        return new CLObject(arr_c);
    }

    @NonNull
    public CLObject g0() {
        return (CLObject)super.C();
    }

    public String h0() {
        return this.y(0, 0);
    }

    @Override
    public Iterator iterator() {
        return new CLObjectIterator(this);
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String y(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder("");
        stringBuilder0.append("{\n");
        boolean z = true;
        for(Object object0: this.h) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(",\n");
            }
            stringBuilder0.append(((CLElement)object0).y(CLElement.g + v, v1 - 1));
        }
        stringBuilder0.append("\n");
        this.a(stringBuilder0, v);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public String z() {
        StringBuilder stringBuilder0 = new StringBuilder("{ ");
        boolean z = true;
        Iterator iterator0 = this.h.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append("");
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }
}

