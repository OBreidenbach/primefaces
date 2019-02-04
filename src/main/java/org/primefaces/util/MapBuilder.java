/**
 * Copyright 2009-2019 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Fluent builder for {@link Map}'s
 *
 * @param <K> key type
 * @param <V> value type
 */
public final class MapBuilder<K, V> {

    private final Map<K, V> map;

    private MapBuilder(Map<K, V> map) {
        this.map = map;
    }

    public static <K, V> MapBuilder<K, V> builder(Map<K, V> map) {
        return new MapBuilder<>(map);
    }

    public static <K, V> MapBuilder<K, V> builder() {
        return new MapBuilder<>(new HashMap<K, V>());
    }

    public MapBuilder<K, V> put(K key, V value) {
        map.put(key, value);
        return this;
    }

    public Map<K, V> build() {
        return map;
    }
}
