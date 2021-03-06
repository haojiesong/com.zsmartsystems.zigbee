/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.thermostat;

import com.zsmartsystems.zigbee.zcl.ZclCommand;

/**
 * Clear Weekly Schedule value object class.
 * <p>
 * Cluster: <b>Thermostat</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Thermostat cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ClearWeeklySchedule extends ZclCommand {
    /**
     * Default constructor.
     */
    public ClearWeeklySchedule() {
        genericCommand = false;
        clusterId = 513;
        commandId = 3;
        commandDirection = true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(22);
        builder.append("ClearWeeklySchedule [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
