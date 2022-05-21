package cut.the.crap.common


import cut.the.crap.Model
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId


@Serializable
data class User(
    @BsonId
    override val id: String = ObjectId().toString(),
    var isAnonymous: Boolean = true,
    var email: String = "",
    var displayName: String = "",
    var firstName: String = "",
    var lastName: String = "",
    var phoneNumber: String = "",
    val contacts: List<String> = emptyList(),
    val chatIds: List<String> = emptyList(),
    val deviceIds: List<String> = emptyList(),

    ) : Model
