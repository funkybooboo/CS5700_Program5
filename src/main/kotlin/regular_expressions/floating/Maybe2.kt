package regular_expressions.floating

import regular_expressions.Invalid
import regular_expressions.State

class Maybe2: State {
    override fun next(char: String): State {
        if (char in "0123456789") return Valid()
        return Invalid()
    }
}