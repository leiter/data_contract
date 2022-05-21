package cut.the.crap.common

import cut.the.crap.Model
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class Place(
    val location: Location = Location(),
    val street: String = "Hermannstraße",
    val streetNumber: String = "54",
    val zipCode: String = "12435",
    val description: String = "Treffen uns and der Bushaltestelle",
    val displayName: String = "Hermannstraße",
    @BsonId
    override val id: String = ObjectId().toString()
) : Model
