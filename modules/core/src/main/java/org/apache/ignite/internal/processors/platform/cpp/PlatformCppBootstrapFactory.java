/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.processors.platform.cpp;

import org.apache.ignite.internal.processors.platform.PlatformBootstrap;
import org.apache.ignite.internal.processors.platform.PlatformBootstrapFactory;

/**
 * Platform .Net bootstrap factory.
 */
public class PlatformCppBootstrapFactory implements PlatformBootstrapFactory {
    /** Bootstrap ID. */
    public static final int ID = 2;

    /** {@inheritDoc} */
    @Override public int id() {
        return ID;
    }

    /** {@inheritDoc} */
    @Override public PlatformBootstrap create() {
        return new PlatformCppBootstrap();
    }
}
