/* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.harmony.tests.java.nio.channels;

import java.nio.channels.CancelledKeyException;

import junit.framework.TestCase;

import org.apache.harmony.testframework.serialization.SerializationTest;

/**
 * Tests for CancelledKeyException
 */
public class CancelledKeyExceptionTest extends TestCase {
    
    /**
     * @tests {@link java.nio.channels.CancelledKeyException#CancelledKeyException()}
     */
    public void test_Constructor() {
        CancelledKeyException e = new CancelledKeyException();
        assertNull(e.getMessage());
        assertNull(e.getLocalizedMessage());
        assertNull(e.getCause());
    }

    /**
     * @tests serialization/deserialization compatibility.
     */
    public void testSerializationSelf() throws Exception {

        SerializationTest.verifySelf(new CancelledKeyException());
    }

    /**
     * @tests serialization/deserialization compatibility with RI.
     */
    public void testSerializationCompatibility() throws Exception {

        SerializationTest.verifyGolden(this, new CancelledKeyException());
    }
}
