package x.app.common.account.command

import x.app.common.AbstractCommand
import x.app.common.AbstractResult
import x.app.common.account.AccountIdentifier

/**
 *   @Project: account
 *   @Package: x.app.common.account.command
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:40
 */
abstract class AbstractAccountCommand<T : AbstractResult>(
        override val accountId: String
) : AbstractCommand<T>(), AccountIdentifier