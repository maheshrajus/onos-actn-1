/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.yangutils.utils.builtindatatype;

import java.util.Objects;

import com.google.common.base.MoreObjects;

/**
 * Represents bits data type.
 */
public class YangBits {

    private byte[] byteArray;

    /**
     * Creates an instance of YANG bits.
     */
    private YangBits() {
    }

    /**
     * Creates an instance of YANG bits.
     *
     * @param bytes byte array
     */
    public YangBits(byte[] bytes) {
        this.byteArray = bytes;
    }

    /**
     * Returns object of YANG bits.
     *
     * @param bytes byte array
     * @return object of YANG bits
     */
    public static YangBits of(byte[] bytes) {
        return new YangBits(bytes);
    }

    /**
     * Returns byte array.
     *
     * @return byte array
     */
    public byte[] byteArray() {
        return byteArray;
    }

    @Override
    public int hashCode() {
        return Objects.hash(byteArray);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YangBits) {
            YangBits other = (YangBits) obj;
            return Objects.equals(byteArray, other.byteArray);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
                .omitNullValues()
                .add("byteArray", byteArray)
                .toString();
    }

    /**
     * Returns the object of YANG bits fromString input String.
     *
     * @param valInString input String
     * @return Object of YANG bits
     */
    public static YangBits fromString(String valInString) {
        try {
            byte[] tmpVal = valInString.getBytes();
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }

}
