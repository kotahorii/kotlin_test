import kotlin.reflect.KProperty

fun main() {
    var delegatePerson = DelegatePerson()
    delegatePerson.name = "Takehata"
    delegatePerson.address = "Tokyo"
    println(delegatePerson.name)
    println(delegatePerson.address)
}


class DelegatePerson {
    var name: String by DelegateWithMessage()
    var address: String by DelegateWithMessage()
}

class DelegateWithMessage<T> {
    private var value: T? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        println("${property.name}を取得します")
        return value!!
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        println("${property.name}を更新します")
        this.value = value
    }
}

class DelegateWithMessageString {
    private var value: String? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("${property.name}を取得します")
        return value!!
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("${property.name}を更新します")
        this.value = value
    }
}