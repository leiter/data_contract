package cut.the.crap.response

import cut.the.crap.common.User
import kotlinx.serialization.Serializable

@Serializable
data class RegisterUserResponse(
    val tokenPair: TokenPairResponse,
    val internalUser: User
)