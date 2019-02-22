/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package org.wicketstuff.jqplot.lib.elements;

import java.util.ArrayList;
import java.util.Collection;

/**
 * DashedHorizontalLine object.  
 * 
 * DashedHorizontalLine properties can be set or overriden by the options passed in from the user.
 *
 * @author inaiat
 */
public class DashedHorizontalLine extends HorizontalLine {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7228237374262615669L;
    
    /** The dash pattern. */
    private Collection<Integer> dashPattern;
       
    /**
     * Instantiates a new dashed horizontal line.
     */
    public DashedHorizontalLine() {
    }

    /**
     * Instantiates a new dashed horizontal line.
     *
     * @param name the name
     */
    public DashedHorizontalLine(String name) {
        setName(name);
    }

	public Collection<Integer> dashPatternInstance() {
		if (this.dashPattern == null) {
			this.dashPattern = new ArrayList<Integer>();
		}
		return dashPattern;
	}

	/**
	 * Gets the dash pattern.
	 * 
	 * @return the dash pattern
	 */
	public Collection<Integer> getDashPattern() {
		return dashPattern;
	}

	/**
	 * Sets the dash pattern.
	 * 
	 * @param dashPattern
	 *            the new dash pattern
	 * @return DashedHorizontalLine
	 */
	public DashedHorizontalLine setDashPattern(Collection<Integer> dashPattern) {
		this.dashPattern = dashPattern;
		return this;
	}
}