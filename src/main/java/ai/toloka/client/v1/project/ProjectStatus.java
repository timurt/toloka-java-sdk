/*
 * Copyright 2021 YANDEX LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.toloka.client.v1.project;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.fasterxml.jackson.annotation.JsonCreator;

import ai.toloka.client.v1.FlexibleEnum;

public final class ProjectStatus extends FlexibleEnum<ProjectStatus> {

    private ProjectStatus(String name) {
        super(name);
    }

    public static final ProjectStatus ACTIVE = new ProjectStatus("ACTIVE");
    public static final ProjectStatus ARCHIVED = new ProjectStatus("ARCHIVED");

    private static final ProjectStatus[] VALUES = {ACTIVE, ARCHIVED};
    private static final ConcurrentMap<String, ProjectStatus> DISCOVERED_VALUES = new ConcurrentHashMap<>();

    public static ProjectStatus[] values() {
        return values(VALUES, DISCOVERED_VALUES.values(), ProjectStatus.class);
    }

    @JsonCreator
    public static ProjectStatus valueOf(String name) {
        return valueOf(VALUES, DISCOVERED_VALUES, name, new NewEnumCreator<ProjectStatus>() {
            @Override public ProjectStatus create(String name) {
                return new ProjectStatus(name);
            }
        });
    }

}
