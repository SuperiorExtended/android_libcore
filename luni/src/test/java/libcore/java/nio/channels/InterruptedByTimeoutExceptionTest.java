/*
 * Copyright (C) 2016 The Android Open Source Project
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

package libcore.java.nio.channels;

import junit.framework.TestCase;

import java.io.IOException;
import java.nio.channels.InterruptedByTimeoutException;

public class InterruptedByTimeoutExceptionTest extends TestCase {

    /**
     * java.nio.channels.InterruptedByTimeoutException#InterruptedByTimeoutException()
     */
    public void test_empty() {
        InterruptedByTimeoutException e = new InterruptedByTimeoutException();
        assertTrue(e instanceof IOException);
        assertNull(e.getMessage());
        assertNull(e.getLocalizedMessage());
        assertNull(e.getCause());
    }
}
