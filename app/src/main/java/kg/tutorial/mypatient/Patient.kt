package kg.tutorial.mypatient

data class Patient(
    val id: Long?,
    val name: String?,
    val dateOfBirth: String?,
    val diagnosis: String?,
    val complaints: String?,
    val surveyData: String?,
    val treatmentMethod: String?,
    val phoneNumber: Int?
)
