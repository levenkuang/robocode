/*******************************************************************************
 * Copyright (c) 2001, 2010 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/epl-v10.html
 *
 * Contributors:
 *     Pavel Savara
 *     - Initial implementation
 *******************************************************************************/
package net.sf.robocode.serialization;

/**
 * @author Pavel Savara (original)
 */
public class XmlSerializableOptions {
    public static XmlSerializableOptions ALL;
    public static XmlSerializableOptions NAMES;
    public static XmlSerializableOptions NONE;

    static {
        ALL = new XmlSerializableOptions(false);
        NONE = new XmlSerializableOptions(true);
        NAMES = new XmlSerializableOptions(false);
        NAMES.skipNames = false;
    }

    public boolean skipExploded;
    public boolean skipNames;
    public boolean skipVersion;
    public boolean skipDebug;
    public boolean skipTotal;
    public boolean trimPrecision;
    public boolean shortAttributes;

    public XmlSerializableOptions(XmlSerializableOptions src) {
        skipExploded = src.skipExploded ;
        skipNames = src.skipNames ;
        skipVersion = src.skipVersion ;
        skipDebug = src.skipDebug ;
        skipTotal = src.skipTotal ;
        trimPrecision = src.trimPrecision ;
        shortAttributes = src.shortAttributes ;
    }

    public XmlSerializableOptions(boolean skipAllDetails) {
        if (skipAllDetails) {
            skipExploded = true;
            skipNames = true;
            skipVersion = true;
            skipDebug = true;
            skipTotal = true;
            trimPrecision = true;
            shortAttributes = true;
        }
    }
}
