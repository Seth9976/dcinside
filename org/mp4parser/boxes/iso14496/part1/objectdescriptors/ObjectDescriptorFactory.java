package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.mp4parser.tools.IsoTypeReader;
import org.slf4j.a;
import org.slf4j.b;

public class ObjectDescriptorFactory {
    protected static a LOG;
    protected static Map descriptorRegistry;

    static {
        ObjectDescriptorFactory.LOG = b.i(ObjectDescriptorFactory.class);
        ObjectDescriptorFactory.descriptorRegistry = new HashMap();
        HashSet hashSet0 = new HashSet();
        hashSet0.add(DecoderSpecificInfo.class);
        hashSet0.add(SLConfigDescriptor.class);
        hashSet0.add(BaseDescriptor.class);
        hashSet0.add(ExtensionDescriptor.class);
        hashSet0.add(ObjectDescriptorBase.class);
        hashSet0.add(ProfileLevelIndicationDescriptor.class);
        hashSet0.add(AudioSpecificConfig.class);
        hashSet0.add(ExtensionProfileLevelDescriptor.class);
        hashSet0.add(ESDescriptor.class);
        hashSet0.add(DecoderConfigDescriptor.class);
        for(Object object0: hashSet0) {
            Class class0 = (Class)object0;
            Descriptor descriptor0 = (Descriptor)class0.getAnnotation(Descriptor.class);
            int[] arr_v = descriptor0.tags();
            int v = descriptor0.objectTypeIndication();
            Map map0 = (Map)ObjectDescriptorFactory.descriptorRegistry.get(v);
            if(map0 == null) {
                map0 = new HashMap();
            }
            int v1 = arr_v.length;
            for(int v2 = 0; v2 < v1; ++v2) {
                map0.put(((int)arr_v[v2]), class0);
            }
            ObjectDescriptorFactory.descriptorRegistry.put(v, map0);
        }
    }

    public static BaseDescriptor createFrom(int v, ByteBuffer byteBuffer0) throws IOException {
        BaseDescriptor baseDescriptor0;
        int v1 = IsoTypeReader.readUInt8(byteBuffer0);
        Map map0 = (Map)ObjectDescriptorFactory.descriptorRegistry.get(v);
        if(map0 == null) {
            map0 = (Map)ObjectDescriptorFactory.descriptorRegistry.get(-1);
        }
        Class class0 = (Class)map0.get(v1);
        if(class0 == null || class0.isInterface() || Modifier.isAbstract(class0.getModifiers())) {
            if(ObjectDescriptorFactory.LOG.k()) {
                ObjectDescriptorFactory.LOG.N("No ObjectDescriptor found for objectTypeIndication {} and tag {} found: {}", new Object[]{Integer.toHexString(v), Integer.toHexString(v1), class0});
            }
            baseDescriptor0 = new UnknownDescriptor();
        }
        else {
            try {
                baseDescriptor0 = (BaseDescriptor)class0.newInstance();
            }
            catch(Exception exception0) {
                ObjectDescriptorFactory.LOG.f("Couldn\'t instantiate BaseDescriptor class " + class0 + " for objectTypeIndication " + v + " and tag " + v1, exception0);
                throw new RuntimeException(exception0);
            }
        }
        baseDescriptor0.parse(v1, byteBuffer0);
        return baseDescriptor0;
    }
}

