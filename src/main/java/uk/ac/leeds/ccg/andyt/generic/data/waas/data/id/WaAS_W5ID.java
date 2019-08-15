/*
 * Copyright 2018 geoagdt.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.andyt.generic.data.waas.data.id;

/**
 *
 * @author geoagdt
 */
public class WaAS_W5ID extends WaAS_ID {

    public WaAS_W5ID(short CASEW5) {
        super(CASEW5);
    }

    @Override
    public String toString() {
        return "CASEW5 " + getID();
    }
    
    @Override
    public int compareTo(Object o) {
        if (o instanceof WaAS_W5ID) {
            return super.compareTo(o);
        }
        return -2;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (o instanceof WaAS_W5ID) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}