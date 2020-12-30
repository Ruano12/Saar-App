package br.com.saar.person

import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "\"Person\"")
@EntityListeners(AuditingEntityListener::class)
class Person : Serializable {

    @Id
    @Column(name = "id", unique = true, nullable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id:UUID = UUID.randomUUID();

    @Column(name = "name")
    private var name:String? = null

    @Column(name = "document")
    private var document:String? = null

    @Column(name = "person_type")
    @Enumerated(EnumType.STRING)
    private  var personType:PersonTypeEnum? = null

    fun getId():UUID = this.id;

    fun setId(id:UUID){
        this.id = id
    }

    fun getName(): String? = this.name

    fun setName(name:String?){
        this.name = name
    }

    fun getDocument(): String? = this.document

    fun setDocument(document:String?){
        this.document = document
    }

    fun getPersonType(): PersonTypeEnum? = this.personType

    fun setPersonType(personType: PersonTypeEnum){
        this.personType = personType
    }
}