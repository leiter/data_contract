package cut.the.crap.common

import kotlinx.serialization.Serializable

@Serializable
data class Ride(
    val startPlace: Place = Place(),
    val endPlace: Place = Place(displayName = "Ernst-Reuther-Platz"),
    val departureForthTime: String = "12:15",
    val departureBackTime: String = "18:35",
    val bidirectional: Boolean = true,
    val oneTime: Boolean = true,
    val driverName: String = "Johannes",
    val driverId: String = "6346303",
    val passengers: List<String> = listOf("Marianne", "Frauke", "Matthias"),
    val id: String = "12342"
)