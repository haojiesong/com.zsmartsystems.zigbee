/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.basic;

import com.zsmartsystems.zigbee.zcl.ZclCommand;

/**
 * Reset to Factory Defaults Command value object class.
 * <p>
 * Cluster: <b>Basic</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Basic cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ResetToFactoryDefaultsCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public ResetToFactoryDefaultsCommand() {
        genericCommand = false;
        clusterId = 0;
        commandId = 0;
        commandDirection = true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(32);
        builder.append("ResetToFactoryDefaultsCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
