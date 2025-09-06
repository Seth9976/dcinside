package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class w {
    private static final String a = "entry";
    private static final String b = "key";
    private static final String c = "value";

    // This method was un-flattened
    public static Map a(Context context0, int v) {
        Map map0 = new HashMap();
        try {
            Resources resources0 = context0.getResources();
            if(resources0 == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
                return map0;
            }
            XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
            int v1 = xmlResourceParser0.getEventType();
            String s = null;
            String s1 = null;
            String s2 = null;
            while(true) {
                switch(v1) {
                    case 1: {
                        return map0;
                    }
                    case 2: {
                        s = xmlResourceParser0.getName();
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    case 3: {
                        if(xmlResourceParser0.getName().equals("entry")) {
                            if(s1 == null || s2 == null) {
                                Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                            }
                            else {
                                map0.put(s1, s2);
                            }
                            s1 = null;
                            s2 = null;
                        }
                        s = null;
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    case 4: {
                        if(s != null) {
                            switch(s) {
                                case "key": {
                                    s1 = xmlResourceParser0.getText();
                                    break;
                                }
                                case "value": {
                                    s2 = xmlResourceParser0.getText();
                                    break;
                                }
                                default: {
                                    Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                                }
                            }
                        }
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    default: {
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
        }
        catch(XmlPullParserException | IOException xmlPullParserException0) {
        }
        Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", xmlPullParserException0);
        return map0;
    }
}

