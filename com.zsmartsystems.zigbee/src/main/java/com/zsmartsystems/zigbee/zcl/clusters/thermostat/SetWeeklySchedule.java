/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.thermostat;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Set Weekly Schedule value object class.
 * <p>
 * The set weekly schedule command is used to update the thermostat weekly set point schedule from a management system.
 * If the thermostat already has a weekly set point schedule programmed then it SHOULD replace each daily set point set
 * as it receives the updates from the management system. For example if the thermostat has 4 set points for every day of
 * the week and is sent a Set Weekly Schedule command with one set point for Saturday then the thermostat SHOULD remove
 * all 4 set points for Saturday and replace those with the updated set point but leave all other days unchanged.
 * <br>
 * If the schedule is larger than what fits in one ZigBee frame or contains more than 10 transitions, the schedule SHALL
 * then be sent using multipleSet Weekly Schedule Commands.
 * <p>
 * Cluster: <b>Thermostat</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Thermostat cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class SetWeeklySchedule extends ZclCommand {
    /**
     * Number of Transitions command message field.
     */
    private Integer numberOfTransitions;

    /**
     * Day of Week command message field.
     */
    private Integer dayOfWeek;

    /**
     * Mode command message field.
     */
    private Integer mode;

    /**
     * Transition command message field.
     */
    private Integer transition;

    /**
     * Heat Set command message field.
     */
    private Integer heatSet;

    /**
     * Cool Set command message field.
     */
    private Integer coolSet;

    /**
     * Default constructor.
     */
    public SetWeeklySchedule() {
        genericCommand = false;
        clusterId = 513;
        commandId = 1;
        commandDirection = true;
    }

    /**
     * Gets Number of Transitions.
     *
     * @return the Number of Transitions
     */
    public Integer getNumberOfTransitions() {
        return numberOfTransitions;
    }

    /**
     * Sets Number of Transitions.
     *
     * @param numberOfTransitions the Number of Transitions
     */
    public void setNumberOfTransitions(final Integer numberOfTransitions) {
        this.numberOfTransitions = numberOfTransitions;
    }

    /**
     * Gets Day of Week.
     *
     * @return the Day of Week
     */
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets Day of Week.
     *
     * @param dayOfWeek the Day of Week
     */
    public void setDayOfWeek(final Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * Gets Mode.
     *
     * @return the Mode
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * Sets Mode.
     *
     * @param mode the Mode
     */
    public void setMode(final Integer mode) {
        this.mode = mode;
    }

    /**
     * Gets Transition.
     *
     * @return the Transition
     */
    public Integer getTransition() {
        return transition;
    }

    /**
     * Sets Transition.
     *
     * @param transition the Transition
     */
    public void setTransition(final Integer transition) {
        this.transition = transition;
    }

    /**
     * Gets Heat Set.
     *
     * @return the Heat Set
     */
    public Integer getHeatSet() {
        return heatSet;
    }

    /**
     * Sets Heat Set.
     *
     * @param heatSet the Heat Set
     */
    public void setHeatSet(final Integer heatSet) {
        this.heatSet = heatSet;
    }

    /**
     * Gets Cool Set.
     *
     * @return the Cool Set
     */
    public Integer getCoolSet() {
        return coolSet;
    }

    /**
     * Sets Cool Set.
     *
     * @param coolSet the Cool Set
     */
    public void setCoolSet(final Integer coolSet) {
        this.coolSet = coolSet;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(numberOfTransitions, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(dayOfWeek, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(mode, ZclDataType.ENUMERATION_8_BIT);
        serializer.serialize(transition, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(heatSet, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(coolSet, ZclDataType.UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        numberOfTransitions = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        dayOfWeek = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        mode = (Integer) deserializer.deserialize(ZclDataType.ENUMERATION_8_BIT);
        transition = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        heatSet = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        coolSet = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(196);
        builder.append("SetWeeklySchedule [");
        builder.append(super.toString());
        builder.append(", numberOfTransitions=");
        builder.append(numberOfTransitions);
        builder.append(", dayOfWeek=");
        builder.append(dayOfWeek);
        builder.append(", mode=");
        builder.append(mode);
        builder.append(", transition=");
        builder.append(transition);
        builder.append(", heatSet=");
        builder.append(heatSet);
        builder.append(", coolSet=");
        builder.append(coolSet);
        builder.append(']');
        return builder.toString();
    }

}
