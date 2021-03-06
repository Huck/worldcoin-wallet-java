/**
 * Copyright 2011 wallet.org
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wallet.platform.builder.linux;

import org.wallet.platform.GenericApplicationSpecification;
import org.wallet.platform.builder.generic.DefaultApplication;

/**
 * <p>Builder to provide the following to {@link org.wallet.platform.GenericApplicationFactory}:</p>
 * <ul>
 * <li>Builds a particular variant of the {@link org.wallet.platform.GenericApplication} suitable for the current platform</li>
 * </ul>
 *
 * @since 0.2.0
 *         
 */
public class LinuxApplicationBuilder {

    public DefaultApplication build(GenericApplicationSpecification specification) {
        return new DefaultApplication();
    }
}
