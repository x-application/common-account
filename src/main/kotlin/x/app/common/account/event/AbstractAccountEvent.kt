package x.app.common.account.event

import x.app.common.AbstractEvent
import x.app.common.account.AccountIdentifier

/**
 *   @Project: account
 *   @Package: x.app.common.account.event
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:41
 */
abstract class AbstractAccountEvent(
        override val accountId: String,
        time: Long
) : AbstractEvent(time), AccountIdentifier