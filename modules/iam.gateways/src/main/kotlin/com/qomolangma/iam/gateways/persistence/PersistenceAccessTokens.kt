package com.qomolangma.iam.gateways.persistence

import com.qomolangma.iam.domain.AccessToken
import com.qomolangma.iam.domain.AccessTokens
import org.springframework.stereotype.Component
import java.util.*

@Component
class PersistenceAccessTokens : AccessTokens {
    override fun optionalAccessTokenFor(id: String): Optional<AccessToken> {
        return Optional.of(TOKEN.asDomain())
    }

    override fun save(accessToken: AccessToken) {}
    override fun remove(accessToken: AccessToken) {}

    companion object {
        private val TOKEN = PersistenceAccessToken(
            "id", "userAccountId", "userAccountName",
            "userId", "userName", "tenantId", "tenantName", setOf("grantedAuthority")
        )
    }
}
