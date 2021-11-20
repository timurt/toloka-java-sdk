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

package ai.toloka.client.v1.pool.filter;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import ai.toloka.client.v1.FlexibleEnum;

public class DeviceCategory extends FlexibleEnum<DeviceCategory> {

    public static final DeviceCategory PERSONAL_COMPUTER = new DeviceCategory("PERSONAL_COMPUTER");
    public static final DeviceCategory SMARTPHONE = new DeviceCategory("SMARTPHONE");
    public static final DeviceCategory TABLET = new DeviceCategory("TABLET");

    private static final DeviceCategory[] VALUES = {PERSONAL_COMPUTER, TABLET, SMARTPHONE};
    private static final ConcurrentMap<String, DeviceCategory> DISCOVERED_VALUES = new ConcurrentHashMap<>();

    private DeviceCategory(String name) {
        super(name);
    }

    public static DeviceCategory[] values() {
        return values(VALUES, DISCOVERED_VALUES.values(), DeviceCategory.class);
    }

    public static DeviceCategory valueOf(String name) {
        return valueOf(VALUES, DISCOVERED_VALUES, name, new NewEnumCreator<DeviceCategory>() {
            @Override
            public DeviceCategory create(String name) {
                return new DeviceCategory(name);
            }
        });
    }
}
