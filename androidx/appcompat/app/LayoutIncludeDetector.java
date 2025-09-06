package androidx.appcompat.app;

import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class LayoutIncludeDetector {
    @NonNull
    private final Deque a;

    LayoutIncludeDetector() {
        this.a = new ArrayDeque();
    }

    boolean a(@NonNull AttributeSet attributeSet0) {
        if(attributeSet0 instanceof XmlPullParser && ((XmlPullParser)attributeSet0).getDepth() == 1) {
            XmlPullParser xmlPullParser0 = LayoutIncludeDetector.c(this.a);
            WeakReference weakReference0 = new WeakReference(((XmlPullParser)attributeSet0));
            this.a.push(weakReference0);
            return LayoutIncludeDetector.d(((XmlPullParser)attributeSet0), xmlPullParser0);
        }
        return false;
    }

    private static boolean b(@Nullable XmlPullParser xmlPullParser0) {
        if(xmlPullParser0 != null) {
            try {
                switch(xmlPullParser0.getEventType()) {
                    case 1: 
                    case 3: {
                        break;
                    }
                    default: {
                        return false;
                    }
                }
            }
            catch(XmlPullParserException unused_ex) {
            }
        }
        return true;
    }

    @Nullable
    private static XmlPullParser c(@NonNull Deque deque0) {
        while(!deque0.isEmpty()) {
            XmlPullParser xmlPullParser0 = (XmlPullParser)((WeakReference)deque0.peek()).get();
            if(LayoutIncludeDetector.b(xmlPullParser0)) {
                deque0.pop();
                continue;
            }
            return xmlPullParser0;
        }
        return null;
    }

    private static boolean d(@NonNull XmlPullParser xmlPullParser0, @Nullable XmlPullParser xmlPullParser1) {
        if(xmlPullParser1 != null && xmlPullParser0 != xmlPullParser1) {
            try {
                return xmlPullParser1.getEventType() == 2 ? "include".equals(xmlPullParser1.getName()) : false;
            }
            catch(XmlPullParserException unused_ex) {
            }
        }
        return false;
    }
}

