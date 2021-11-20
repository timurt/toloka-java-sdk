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

package ai.toloka.client.v1.assignment;

import ai.toloka.client.v1.RangeParam;

public enum AssignmentRangeParam implements RangeParam {

    id(AssignmentSearchRequest.ID_PARAMETER),
    created(AssignmentSearchRequest.CREATED_PARAMETER),
    submitted(AssignmentSearchRequest.SUBMITTED_PARAMETER);

    private String parameter;

    AssignmentRangeParam(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String parameter() {
        return parameter;
    }
}
