package x.app.common.account.exception

import x.app.common.AbstractException
import x.app.common.account.AccountIdentifier

/**
 *   @Project: account
 *   @Package: x.app.common.account.exception
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:41
 */
abstract class AbstractAccountException : AbstractException, AccountIdentifier {

    final override var accountId: String = ""

    constructor()

    constructor(accountId: String) : super(accountId) {
        this.accountId = accountId
    }

    constructor(accountId: String, message: String) : super(message = message) {
        this.accountId = accountId
    }

}