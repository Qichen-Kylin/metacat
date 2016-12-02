/*
 *
 *  Copyright 2016 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.metacat.common.server.events;

import com.netflix.metacat.common.MetacatRequestContext;
import com.netflix.metacat.common.QualifiedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * Pre table rename event.
 */
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MetacatRenameTablePreEvent extends MetacatEvent {

    private final QualifiedName newName;

    /**
     * Constructor.
     * @param name name.
     * @param requestContext context
     * @param newName new name
     */
    public MetacatRenameTablePreEvent(
        @NotNull
        final QualifiedName name,
        @NotNull
        final MetacatRequestContext requestContext,
        @NotNull
        final QualifiedName newName
    ) {
        super(name, requestContext);
        this.newName = newName;
    }
}
