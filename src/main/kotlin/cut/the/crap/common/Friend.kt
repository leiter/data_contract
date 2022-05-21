package cut.the.crap.common

import cut.the.crap.Model
import cut.the.crap.PersonData
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class Friend(
    @BsonId
    override val _id: String = ObjectId().toString(),
    override var displayName: String = "Susanne",
    override var firstName: String = "Susanne",
    override var lastName: String = "Kosanke",
    override var email: String = "kosnake@gmail.com",
    override var phoneNumber: String = "+491782884137",
    val chatId: String = "",
    ) : PersonData, Model