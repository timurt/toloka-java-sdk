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

package ai.toloka.client.v1.task;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KnownSolution {

    @JsonProperty("output_values")
    private Map<String, Object> outputValues;

    @JsonProperty("correctness_weight")
    private Double correctnessWeight;

    @JsonCreator
    public KnownSolution(@JsonProperty("output_values") Map<String, Object> outputValues,
                         @JsonProperty("correctness_weight") Double correctnessWeight) {

        this.outputValues = outputValues;
        this.correctnessWeight = correctnessWeight;
    }

    public Map<String, Object> getOutputValues() {
        return outputValues;
    }

    public Double getCorrectnessWeight() {
        return correctnessWeight;
    }
}
