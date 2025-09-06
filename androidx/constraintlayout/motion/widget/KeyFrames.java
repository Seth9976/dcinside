package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class KeyFrames {
    private HashMap a;
    public static final int b = -1;
    private static final String c = "CustomMethod";
    private static final String d = "CustomAttribute";
    static HashMap e = null;
    private static final String f = "KeyFrames";

    static {
        HashMap hashMap0 = new HashMap();
        KeyFrames.e = hashMap0;
        try {
            hashMap0.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            KeyFrames.e.put("KeyPosition", KeyPosition.class.getConstructor(null));
            KeyFrames.e.put("KeyCycle", KeyCycle.class.getConstructor(null));
            KeyFrames.e.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            KeyFrames.e.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            Log.e("KeyFrames", "unable to load", noSuchMethodException0);
        }
    }

    public KeyFrames() {
        this.a = new HashMap();
    }

    // This method was un-flattened
    public KeyFrames(Context context0, XmlPullParser xmlPullParser0) {
        KeyAttributes keyAttributes1;
        this.a = new HashMap();
        try {
            int v = xmlPullParser0.getEventType();
            KeyAttributes keyAttributes0 = null;
            while(true) {
                if(v == 1) {
                    return;
                }
                switch(v) {
                    case 2: {
                        String s = xmlPullParser0.getName();
                        if(KeyFrames.e.containsKey(s)) {
                            switch(s) {
                                case "KeyAttribute": {
                                    keyAttributes1 = new KeyAttributes();
                                    break;
                                }
                                case "KeyCycle": {
                                    keyAttributes1 = new KeyCycle();
                                    break;
                                }
                                case "KeyPosition": {
                                    keyAttributes1 = new KeyPosition();
                                    break;
                                }
                                case "KeyTimeCycle": {
                                    keyAttributes1 = new KeyTimeCycle();
                                    break;
                                }
                                case "KeyTrigger": {
                                    keyAttributes1 = new KeyTrigger();
                                    break;
                                }
                                default: {
                                    throw new NullPointerException("Key " + s + " not found");
                                }
                            }
                            keyAttributes1.f(context0, Xml.asAttributeSet(xmlPullParser0));
                            this.c(keyAttributes1);
                            keyAttributes0 = keyAttributes1;
                        }
                        else if(!s.equalsIgnoreCase("CustomAttribute")) {
                            if(s.equalsIgnoreCase("CustomMethod") && keyAttributes0 != null) {
                                HashMap hashMap1 = keyAttributes0.e;
                                if(hashMap1 != null) {
                                    ConstraintAttribute.q(context0, xmlPullParser0, hashMap1);
                                }
                            }
                        }
                        else if(keyAttributes0 != null) {
                            HashMap hashMap0 = keyAttributes0.e;
                            if(hashMap0 != null) {
                                ConstraintAttribute.q(context0, xmlPullParser0, hashMap0);
                            }
                        }
                        break;
                    }
                    case 3: {
                        if("KeyFrameSet".equals(xmlPullParser0.getName())) {
                            return;
                        }
                    }
                }
                v = xmlPullParser0.next();
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("KeyFrames", "Error parsing XML resource", iOException0);
            return;
        }
        Log.e("KeyFrames", "Error parsing XML resource", xmlPullParserException0);
    }

    public void a(MotionController motionController0) {
        ArrayList arrayList0 = (ArrayList)this.a.get(-1);
        if(arrayList0 != null) {
            motionController0.b(arrayList0);
        }
    }

    public void b(MotionController motionController0) {
        ArrayList arrayList0 = (ArrayList)this.a.get(motionController0.c);
        if(arrayList0 != null) {
            motionController0.b(arrayList0);
        }
        ArrayList arrayList1 = (ArrayList)this.a.get(-1);
        if(arrayList1 != null) {
            for(Object object0: arrayList1) {
                Key key0 = (Key)object0;
                if(key0.g(((LayoutParams)motionController0.b.getLayoutParams()).c0)) {
                    motionController0.a(key0);
                }
            }
        }
    }

    public void c(Key key0) {
        if(!this.a.containsKey(key0.b)) {
            this.a.put(key0.b, new ArrayList());
        }
        ArrayList arrayList0 = (ArrayList)this.a.get(key0.b);
        if(arrayList0 != null) {
            arrayList0.add(key0);
        }
    }

    public ArrayList d(int v) {
        return (ArrayList)this.a.get(v);
    }

    public Set e() {
        return this.a.keySet();
    }

    static String f(int v, Context context0) {
        return context0.getResources().getResourceEntryName(v);
    }
}

