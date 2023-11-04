package business.logic.layer.user

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class UserImplTest {
    val id = "abc"
    val name = "Mario"
    val surname = "Rossi"
    lateinit var user: User

    @BeforeEach
    fun setUp() {
        user = UserImpl(id, name, surname)
    }

    @Test
    fun testGetId() {
        assertEquals(id, user.id)
    }

    @Test
    fun testGetName() {
        assertEquals(name, user.name)
    }

    @Test
    fun testGetSurname() {
        assertEquals(surname, user.surname)
    }
}