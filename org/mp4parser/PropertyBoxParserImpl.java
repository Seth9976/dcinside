package org.mp4parser;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mp4parser.tools.Hex;

public class PropertyBoxParserImpl extends AbstractBoxParser {
    static Properties BOX_MAP_CACHE;
    static String[] EMPTY_STRING_ARRAY;
    StringBuilder buildLookupStrings;
    ThreadLocal clazzName;
    Pattern constuctorPattern;
    Properties mapping;
    ThreadLocal param;

    static {
        PropertyBoxParserImpl.EMPTY_STRING_ARRAY = new String[0];
    }

    public PropertyBoxParserImpl(Properties properties0) {
        this.constuctorPattern = Pattern.compile("(.*)\\((.*?)\\)");
        this.buildLookupStrings = new StringBuilder();
        this.clazzName = new ThreadLocal();
        this.param = new ThreadLocal();
        this.mapping = properties0;
    }

    public PropertyBoxParserImpl(String[] arr_s) {
        InputStream inputStream1;
        Enumeration enumeration0;
        this.constuctorPattern = Pattern.compile("(.*)\\((.*?)\\)");
        this.buildLookupStrings = new StringBuilder();
        this.clazzName = new ThreadLocal();
        this.param = new ThreadLocal();
        if(PropertyBoxParserImpl.BOX_MAP_CACHE != null) {
            this.mapping = new Properties(PropertyBoxParserImpl.BOX_MAP_CACHE);
            return;
        }
        InputStream inputStream0 = this.getClass().getResourceAsStream("/isoparser2-default.properties");
        try {
            Properties properties0 = new Properties();
            this.mapping = properties0;
            try {
                properties0.load(inputStream0);
                ClassLoader classLoader0 = Thread.currentThread().getContextClassLoader();
                if(classLoader0 == null) {
                    classLoader0 = ClassLoader.getSystemClassLoader();
                }
                enumeration0 = classLoader0.getResources("isoparser-custom.properties");
                while(true) {
                label_17:
                    if(!enumeration0.hasMoreElements()) {
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            String s = arr_s[v1];
                            this.mapping.load(this.getClass().getResourceAsStream(s));
                        }
                        PropertyBoxParserImpl.BOX_MAP_CACHE = this.mapping;
                        break;
                    }
                    goto label_32;
                }
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            return;
            try {
            label_32:
                inputStream1 = FirebasePerfUrlConnection.openStream(((URL)enumeration0.nextElement()));
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
            try {
                this.mapping.load(inputStream1);
                goto label_39;
            }
            catch(Throwable throwable0) {
                try {
                    inputStream1.close();
                    throw throwable0;
                label_39:
                    inputStream1.close();
                    goto label_17;
                }
                catch(IOException iOException0) {
                }
            }
        }
        finally {
            try {
                inputStream0.close();
            }
            catch(IOException iOException1) {
                iOException1.printStackTrace();
            }
        }
        throw new RuntimeException(iOException0);
    }

    @Override  // org.mp4parser.AbstractBoxParser
    public ParsableBox createBox(String s, byte[] arr_b, String s1) {
        this.invoke(s, arr_b, s1);
        String[] arr_s = (String[])this.param.get();
        try {
            Class class0 = Class.forName(((String)this.clazzName.get()));
            if(arr_s.length > 0) {
                Class[] arr_class = new Class[arr_s.length];
                Object[] arr_object = new Object[arr_s.length];
                int v;
                for(v = 0; true; ++v) {
                    if(v >= arr_s.length) {
                        return (ParsableBox)class0.getConstructor(arr_class).newInstance(arr_object);
                    }
                    if("userType".equals(arr_s[v])) {
                        arr_object[v] = arr_b;
                        arr_class[v] = byte[].class;
                    }
                    else {
                        Class class1 = String.class;
                        if("type".equals(arr_s[v])) {
                            arr_object[v] = s;
                        }
                        else {
                            if(!"parent".equals(arr_s[v])) {
                                break;
                            }
                            arr_object[v] = s1;
                        }
                        arr_class[v] = class1;
                    }
                }
                throw new InternalError("No such param: " + arr_s[v]);
            }
            return (ParsableBox)class0.newInstance();
        }
        catch(ClassNotFoundException classNotFoundException0) {
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException(instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
        throw new RuntimeException(classNotFoundException0);
    }

    public void invoke(String s, byte[] arr_b, String s1) {
        String s2;
        if(arr_b == null) {
            s2 = this.mapping.getProperty(s);
            if(s2 == null) {
                StringBuilder stringBuilder0 = this.buildLookupStrings;
                stringBuilder0.append(s1);
                stringBuilder0.append('-');
                stringBuilder0.append(s);
                this.buildLookupStrings.setLength(0);
                s2 = this.mapping.getProperty(stringBuilder0.toString());
            }
        }
        else {
            if(!"uuid".equals(s)) {
                throw new RuntimeException("we have a userType but no uuid box type. Something\'s wrong");
            }
            s2 = this.mapping.getProperty("uuid[" + Hex.encodeHex(arr_b).toUpperCase() + "]");
            if(s2 == null) {
                s2 = this.mapping.getProperty(s1 + "-uuid[" + Hex.encodeHex(arr_b).toUpperCase() + "]");
            }
            if(s2 == null) {
                s2 = this.mapping.getProperty("uuid");
            }
        }
        if(s2 == null) {
            s2 = this.mapping.getProperty("default");
        }
        if(s2 == null) {
            throw new RuntimeException("No box object found for " + s);
        }
        if(!s2.endsWith(")")) {
            this.param.set(PropertyBoxParserImpl.EMPTY_STRING_ARRAY);
            this.clazzName.set(s2);
            return;
        }
        Matcher matcher0 = this.constuctorPattern.matcher(s2);
        if(!matcher0.matches()) {
            throw new RuntimeException("Cannot work with that constructor: " + s2);
        }
        this.clazzName.set(matcher0.group(1));
        if(matcher0.group(2).length() == 0) {
            this.param.set(PropertyBoxParserImpl.EMPTY_STRING_ARRAY);
            return;
        }
        this.param.set((matcher0.group(2).length() <= 0 ? new String[0] : matcher0.group(2).split(",")));
    }
}

