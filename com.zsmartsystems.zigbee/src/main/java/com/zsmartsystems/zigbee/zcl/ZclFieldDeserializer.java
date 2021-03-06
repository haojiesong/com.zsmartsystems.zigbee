/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl;

import java.util.ArrayList;
import java.util.List;

import com.zsmartsystems.zigbee.serialization.ZigBeeDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * ZCL field deserializer.
 *
 * @author Tommi S.E. Laukkanen
 * @author Chris Jackson
 */
public class ZclFieldDeserializer {

    /**
     * Delegate deserializer.
     */
    private ZigBeeDeserializer deserializer;

    /**
     * Constructor for setting the payload and start index.
     */
    public ZclFieldDeserializer(final ZigBeeDeserializer deserializer) {
        this.deserializer = deserializer;
    }

    /**
     * Checks if there are further bytes to be read
     * 
     * @return true if we are at the end of the input stream
     */
    public boolean isEndOfStream() {
        return deserializer.isEndOfStream();
    }

    /**
     * Deserializes a field.
     *
     * @param dataType the data type of the field.
     * @return the value
     */
    public Object deserialize(final ZclDataType dataType) {
        if (ZclListItemField.class.isAssignableFrom(dataType.getDataClass())) {
            final Class dataTypeClass = dataType.getDataClass();
            final List<ZclListItemField> list = new ArrayList<ZclListItemField>();
            while (deserializer.getSize() - deserializer.getPosition() > 0) {
                final ZclListItemField item;
                try {
                    item = (ZclListItemField) dataTypeClass.newInstance();
                } catch (final Exception e) {
                    throw new IllegalArgumentException("Error deserializing field: " + dataType.getLabel(), e);
                }
                item.deserialize(this.deserializer);
                list.add(item);
            }
            return list;
        }

        return deserializer.readZigBeeType(dataType);
    }

}
