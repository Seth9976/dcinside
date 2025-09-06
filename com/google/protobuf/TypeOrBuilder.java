package com.google.protobuf;

import java.util.List;

public interface TypeOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    Field getFields(int arg1);

    int getFieldsCount();

    List getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int arg1);

    ByteString getOneofsBytes(int arg1);

    int getOneofsCount();

    List getOneofsList();

    Option getOptions(int arg1);

    int getOptionsCount();

    List getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}

