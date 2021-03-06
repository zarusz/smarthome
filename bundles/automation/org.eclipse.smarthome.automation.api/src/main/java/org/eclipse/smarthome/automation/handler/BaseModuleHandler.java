/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.automation.handler;

import org.eclipse.smarthome.automation.Module;

/**
 * This is a base class that can be used by any ModuleHandler implementation
 *
 * @author Kai Kreuzer - Initial Contribution
 */
public class BaseModuleHandler<T extends Module> implements ModuleHandler {

    protected T module;

    public BaseModuleHandler(T module) {
        this.module = module;
    }

    @Override
    public void dispose() {
        // can be overridden
    }

}
