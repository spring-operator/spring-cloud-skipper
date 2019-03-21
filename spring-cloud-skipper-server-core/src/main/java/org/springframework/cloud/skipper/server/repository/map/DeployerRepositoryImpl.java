/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.skipper.server.repository.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.skipper.SkipperException;
import org.springframework.cloud.skipper.domain.Deployer;

/**
 * @author Mark Pollack
 */
public class DeployerRepositoryImpl implements DeployerRepositoryCustom {

	@Autowired
	private DeployerRepository deployerRepository;

	@Override
	public Deployer findByNameRequired(String name) {
		Deployer deployer = deployerRepository.findByName(name);
		if (deployer == null) {
			throw new SkipperException(String.format("No deployer named '%s'", name));
		}
		return deployer;
	}
}
