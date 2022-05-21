package cut.the.crap.common

import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val type: String = "Point",
    val location: List<Double> = emptyList()
)
