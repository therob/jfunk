/*
 * Copyright (c) 2014 mgm technology partners GmbH
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
package com.mgmtp.jfunk.core.scripting;

import javax.annotation.concurrent.NotThreadSafe;

import com.mgmtp.jfunk.common.config.ModuleScoped;
import com.mgmtp.jfunk.core.module.TestModule;

/**
 * Class for holding module meta data.
 * 
 * @author rnaegele
 * @since 3.1.0
 */
@ModuleScoped
@NotThreadSafe
public class ModuleMetaData extends ExecutionMetaData {

	private Class<? extends TestModule> moduleClass;
	private String moduleName;
	private ScriptMetaData scriptMetaData;

	/**
	 * @return the scriptMetaData
	 */
	public ScriptMetaData getScriptMetaData() {
		return scriptMetaData;
	}

	/**
	 * @param scriptMetaData
	 *            the scriptMetaData to set
	 */
	public void setScriptMetaData(final ScriptMetaData scriptMetaData) {
		this.scriptMetaData = scriptMetaData;
	}

	/**
	 * @return the moduleClass
	 */
	public Class<? extends TestModule> getModuleClass() {
		return moduleClass;
	}

	/**
	 * @param moduleClass
	 *            the moduleClass to set
	 */
	public void setModuleClass(final Class<? extends TestModule> moduleClass) {
		this.moduleClass = moduleClass;
	}

	/**
	 * @return the moduleName
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * @param moduleName
	 *            the moduleName to set
	 */
	public void setModuleName(final String moduleName) {
		this.moduleName = moduleName;
	}
}
