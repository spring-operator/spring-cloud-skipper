/*
 * Copyright 2019 the original author or authors.
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
package org.springframework.cloud.skipper.server.db.migration.oracle;

import org.springframework.cloud.skipper.server.db.migration.AbstractBaselineCallback;

/**
 * Baselining schema setup for {@code oracle}.
 *
 * @author Janne Valkealahti
 *
 */
public class OracleBeforeBaseline extends AbstractBaselineCallback {

	/**
	 * Instantiates a new oracle before baseline.
	 */
	public OracleBeforeBaseline() {
		super(new V1__Initial_Setup());
	}
}
