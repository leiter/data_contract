package cut.the.crap.common

import cut.the.crap.Model
import kotlinx.serialization.Serializable

@Serializable
data class ShoutOut(
    override val id: String,
    val text: String,
    val username: String = "",
    val timestamp: Long = System.currentTimeMillis(),

    ) : Model