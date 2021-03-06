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
package com.mgmtp.jfunk.core.mail;

import com.google.common.base.Predicate;

/**
 * Base step for e-mail validation. The {@link #execute()} method does nothing if mail-checking is
 * disabled by setting the property {@code mail.check.active} to {@code false}.
 * 
 * @author rnaegele
 * @since 3.1.0
 */
public abstract class BaseSingleMessageStep extends BaseEmailStep {

	/**
	 * @param dataSetKey
	 *            the data set key
	 * @param accountReservationKey
	 *            the key under which the mail account to use was reserved
	 */
	public BaseSingleMessageStep(final String dataSetKey, final String accountReservationKey) {
		super(dataSetKey, accountReservationKey);
	}

	/**
	 * Retrieves an e-mail matching the patterns specified in the constructor. If the message is
	 * successfully retrieved, it is passed to {@link #validateMessage(MailMessage)} for further
	 * validation.
	 */
	@Override
	protected void doExecute() {
		Predicate<MailMessage> condition = createMessagePredicate();
		MailMessage message = mailService.findMessage(accountReservationKey, condition);
		validateMessage(message);
	}

	protected abstract void validateMessage(MailMessage messages);
}